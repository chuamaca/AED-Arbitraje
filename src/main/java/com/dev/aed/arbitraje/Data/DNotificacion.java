/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MNotificacion;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import jdk.jshell.execution.Util;

/**
 *
 * @author Cesar
 */
public class DNotificacion {

    private static final String SQL_SELECT = "WITH NotificacionesEnumeradas AS (\n"
            + "    SELECT\n"
            + "        IdNotificacion,\n"
            + "        NroExpediente,\n"
            + "        EstadoNotificacion,\n"
            + "        FechaNotificacion,\n"
            + "        FechaVisualizacion,\n"
            + "        ColorEstado,\n"
            + "        Observaciones,\n"
            + "        Leida,\n"
            + "        idUsuario,\n"
            + "        ROW_NUMBER() OVER (PARTITION BY NroExpediente ORDER BY IdNotificacion DESC) AS RowNum\n"
            + "    FROM Notificacion\n"
            + ")\n"
            + "SELECT\n"
            + "    IdNotificacion,\n"
            + "    NroExpediente,\n"
            + "    EstadoNotificacion,\n"
            + "    FechaNotificacion,\n"
            + "    FechaVisualizacion,\n"
            + "    ColorEstado,\n"
            + "    Observaciones,\n"
            + "    Leida,\n"
            + "    idUsuario\n"
            + "FROM NotificacionesEnumeradas\n"
            + "WHERE RowNum = 1\n"
            + "order by FechaNotificacion desc";

    private static final String SQL_SELECT_DETALLE = "SELECT d.NroExpediente, n.EstadoNotificacion,d.SustentoAnulacion, n.Observaciones  FROM Demanda d  left join Notificacion n\n"
            + "on n.NroExpediente = d.NroExpediente\n"
            + "where d.NroExpediente = ?\n"
            + "order by n.IdNotificacion, D.NroExpediente  DESC";

    private static final String SQL_UPDATE_Notificacion = "UPDATE usuario SET nro_intentos=? WHERE nombre_usuario = ?";
    private static final String SQL_VALIDATE = "SELECT nombre_usuario, contrasena  FROM usuario WHERE nombre_usuario=? and contrasena=? and estado=1";
    private static final String SQL_NRO_INTENTOS = "SELECT id_usuario, nombre_usuario, contrasena, id_rol, estado, nro_intentos  FROM usuario WHERE nombre_usuario=?";

    private static final String SQL_INSERT = "INSERT INTO AEDArbitraje.dbo.Notificacion\n"
            + "( NroExpediente, EstadoNotificacion, FechaNotificacion, FechaVisualizacion, ColorEstado, Observaciones, Leida, idUsuario)\n"
            + "VALUES( ?, ?, ?, ?, ?, ?,?, ?);";

    public List<MNotificacion> Select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MNotificacion notificacion = null;
        List<MNotificacion> lisNotificacion = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                /*
                 public int NroExpediente;
    public java.sql.Date FechaDemanda;
    public int DemandanteID;
    public int DemandadoID;
    public String Ubigeo;
    public String Especialidad;
    public Double Cuantia;
    public int IdAnexo;
    public String ResumenControversia;
    public String ResumenPeticiones;
    public String DesignacionArbitro;
    public String DeclaracionesCompromiso;
    public String Estado;
    public String Decision_Final;
    public String MotivoAnulacion;
    public String SustentoAnulacion;
    public java.sql.Date FechaAprobacion;
    public int UsuarioAprobador;
    public String usuario;
                
                
                 */
                int idNotificacion = rs.getInt("IdNotificacion");
                String NroExpediente = rs.getString("NroExpediente");
                String estadoNotificacion = rs.getString("EstadoNotificacion");
                Date fechaNotificacion = rs.getDate("FechaNotificacion");
                Date fechaVisualizacion = rs.getDate("FechaVisualizacion");
                String colorEstado = rs.getString("ColorEstado");
                String observaciones = rs.getString("Observaciones");
                int leida = rs.getInt("Leida");
                String idUsuario = rs.getString("idUsuario");

                notificacion = new MNotificacion();
                notificacion.setIdNotificacion(idNotificacion);
                notificacion.setNroExpediente(NroExpediente);
                notificacion.setEstadoNotificacion(estadoNotificacion);
                notificacion.setFechaNotificacion(fechaNotificacion);
                notificacion.setFechaVisualizacion(fechaVisualizacion);
                notificacion.setColorEstado(colorEstado);
                notificacion.setObservaciones(observaciones);
                notificacion.setLeida(leida);
                notificacion.setIdUsuario(idUsuario);

                lisNotificacion.add(notificacion);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }
        return lisNotificacion;
    }

    public List<MNotificacion> SelectNotificacionDetalle(MNotificacion mNotificacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MNotificacion notificacion = null;
        List<MNotificacion> lisNotificacion = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_DETALLE);
            stmt.setString(1, mNotificacion.getSustentoAnulacion_DTO());
            rs = stmt.executeQuery();
            while (rs.next()) {

                String NroExpediente = rs.getString("NroExpediente");
                String estadoNotificacion = rs.getString("EstadoNotificacion");

                String sustentoAnulacion = rs.getString("SustentoAnulacion");
                String observaciones = rs.getString("Observaciones");

                notificacion = new MNotificacion();

                notificacion.setNroExpediente(NroExpediente);
                notificacion.setEstadoNotificacion(estadoNotificacion);
                notificacion.setSustentoAnulacion_DTO(sustentoAnulacion);
                notificacion.setObservaciones(observaciones);

                lisNotificacion.add(notificacion);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }
        return lisNotificacion;
    }

    public int AgregarNotificacion(MNotificacion notificacion) {
        System.out.println("I Notif " + notificacion);

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        java.util.Date fechaActual = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(fechaActual);

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, notificacion.getNroExpediente());
            stmt.setString(2, notificacion.getEstadoNotificacion());
            stmt.setDate(3, notificacion.getFechaNotificacion());
            stmt.setDate(4, notificacion.getFechaVisualizacion());
            stmt.setString(5, notificacion.getColorEstado());
            stmt.setString(6, notificacion.getObservaciones());
            stmt.setInt(7, notificacion.getLeida());
            stmt.setString(8, notificacion.getIdUsuario());

            System.out.println("ejecutando query:" + SQL_INSERT);
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
