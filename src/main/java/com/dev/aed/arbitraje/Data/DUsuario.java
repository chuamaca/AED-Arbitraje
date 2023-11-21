/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MUsuario;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class DUsuario {

    private static final String SQL_UPDATE_login = "UPDATE usuario SET nro_intentos=? WHERE nombre_usuario = ?";
    private static final String SQL_UPDATE_Bloqueo = "UPDATE usuario SET estado=? WHERE nombre_usuario = ?";
    private static final String SQL_VALIDATE = "SELECT nombre_usuario, contrasena  FROM usuario WHERE nombre_usuario=? and contrasena=? and estado=1";
    private static final String SQL_NRO_INTENTOS = "SELECT id_usuario, nombre_usuario, contrasena, id_rol, estado, nro_intentos  FROM usuario WHERE nombre_usuario=?";
    private static final String SQL_CREAR_USUARIO = "INSERT INTO usuario (nombre_usuario,contrasena,id_rol,estado,nro_intentos,fecha_caducidad) VALUES (?,?,?,?,?,?)";

    public boolean validarUsuario(MUsuario user) {
        try {

            /*
            SELECT id_usuario, nombre_usuario, contrasena, 
            id_rol, estado, nro_intentos  FROM usuario WHERE nombre_usuario=?
            
             */
            Connection conn = ConexionJDBC.getConexion();
            //  String query = "SELECT id_rol FROM usuario WHERE nombre_usuario = ? AND contrasena = ?";
            PreparedStatement stmt = conn.prepareStatement(SQL_VALIDATE);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            ResultSet rs = stmt.executeQuery();
            System.out.println("resulado: " + rs.toString());
            boolean usuarioValido = rs.next(); // Verificar si se encontró un usuario con el nombre y contraseña proporcionados.

            rs.close();
            stmt.close();
            conn.close();

            return usuarioValido;
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones (registros de errores, etc.)
            return false; // En caso de error en la base de datos.
        }
    }

    public String obtenerTipoDeUsuario(String nombreUsuario, String contrasena) {
        // Realiza una consulta a la base de datos para obtener el tipo de usuario
        String tipoUsuario = null; // Inicializamos como nulo en caso de que no se encuentre el usuario

        try {
            Connection conn = ConexionJDBC.getConexion();
            String query = "SELECT tipo_usuario FROM usuario WHERE nombre_usuario = ? AND contrasena = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, contrasena);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                tipoUsuario = rs.getString("tipo_usuario");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoUsuario;
    }

    public int LoginInvalido(MUsuario usuario) {
        System.out.println("LoginInvalido" + usuario);

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ConexionJDBC.getConexion();
            System.out.println("ejecutando query: " + SQL_UPDATE_login);
            stmt = conn.prepareStatement(SQL_UPDATE_login);
              stmt.setInt(1, usuario.getNro_intentos()+ 1);
            stmt.setString(2, usuario.getUsername());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return rows;
    }

    public int bloqueoUsuario(MUsuario usuario) {
        System.out.println("LoginInvalido" + usuario);

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ConexionJDBC.getConexion();
            System.out.println("ejecutando query: " + SQL_UPDATE_Bloqueo);
            stmt = conn.prepareStatement(SQL_UPDATE_Bloqueo);
            stmt.setBoolean(1, false);
            stmt.setString(2, usuario.getUsername());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return rows;
    }

    public boolean validarUsuario2(MUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int contador = 0;
        Boolean validacion = false;
        try {

            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_VALIDATE);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            rs = stmt.executeQuery();
            while (rs.next()) {
                contador++;
            }

            System.out.println("Contado: " + contador);

            if (contador >= 1) {

                validacion = true;
            }

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        return validacion;
    }

    public List<MUsuario> selectPorUsuario(MUsuario objUser) {

        System.out.println("selectPorUsuario");
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MUsuario usuario = null;
        
        List<MUsuario> usuarios = new ArrayList<MUsuario>();
        
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_NRO_INTENTOS);
            stmt.setString(1, objUser.getUsername());
            
            System.out.println("setString" + objUser.getUsername());
            rs = stmt.executeQuery();

            while (rs.next()) {

                /*
                SELECT id_usuario, nombre_usuario, 
                contrasena, id_rol, estado,
                nro_intentos  FROM usuario WHERE nombre_usuario=?
                
                */
                int id_usuario = rs.getInt("id_usuario");
                String username = rs.getString("nombre_usuario");
                String password = rs.getString("contrasena");
                boolean flag_estado = rs.getBoolean("estado");
                int nrointentos = rs.getInt("nro_intentos");
                
                System.out.println("miuser: " + username + " " + nrointentos);
                
                usuario = new MUsuario();
                usuario.setId_usuario(id_usuario);
                usuario.setUsername(username);
                usuario.setPassword(password);
                usuario.setFlag_estado(flag_estado);
                usuario.setNro_intentos(nrointentos);

                usuarios.add(usuario);
                System.out.println("DATOS USUARIO:" + usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return usuarios;
    }
    
    
    
    public int CrearUsuario(MUsuario usuario) {
        System.out.println("InserDemanda " + usuario);

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        java.util.Date fechaActual = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaDemanda = formato.format(fechaActual);

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_CREAR_USUARIO);
            stmt.setString(1,usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, "1");
            stmt.setBoolean(4, usuario.isFlag_estado());
            stmt.setString(5, "0");
            stmt.setString(6, usuario.getFechaCaducidad());

            System.out.println("ejecutando query:" + SQL_CREAR_USUARIO);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error SQL " + ex.toString());
        } finally {
            //  ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return rows;
    }
     
}
