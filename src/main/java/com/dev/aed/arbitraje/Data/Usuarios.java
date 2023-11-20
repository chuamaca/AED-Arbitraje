/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class Usuarios {
        String nombreUsuario;
        String contraseña;
        int estado;
        String fechaCaducidad;

        public String getNombreUsuario() {
            return nombreUsuario;
        }

        public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public int getEstado() {
            return estado;
        }

        public void setEstado(int estado) {
            this.estado = estado;
        }

        public String getFechaCaducidad() {
            return fechaCaducidad;
        }

        public void setFechaCaducidad(String fechaCaducidad) {
            this.fechaCaducidad = fechaCaducidad;
        }
    
        public void InsertarUsuario(JTextField txtUsuario, JTextField txtContraseña, JTextField txtEstado, JTextField txtCaducidad) {
            setNombreUsuario(txtUsuario.getText());
            setContraseña(txtContraseña.getText());
            setEstado(Integer.parseInt(txtEstado.getText()));
            setFechaCaducidad(txtCaducidad.getText());

            ConexionJDBC objetoConexion = new ConexionJDBC();

            String consulta = "SET IDENTITY_INSERT dbo.usuario ON;\n"
                    + "INSERT INTO dbo.usuario (id_usuario,nombre_usuario,contrasena,id_rol,estado,nro_intentos,fecha_caducidad) VALUES (?,?,?,?,?,?,?)\n"
                    + "SET IDENTITY_INSERT dbo.usuario OFF;";
            try {
                CallableStatement cs = objetoConexion.getConexion().prepareCall(consulta);
                
                cs.setString(1,getNombreUsuario());
                cs.setString(2,getContraseña());
                cs.setInt(4, getEstado());
                cs.setString(7, getFechaCaducidad());
                
                cs.close();
                objetoConexion.getConexion().close();
                
                JOptionPane.showMessageDialog(null,"Se guardo correctamente el usuario");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se inserto de manera correcta,error: "+e.toString());
            }
        }
    }
    
     
    

  