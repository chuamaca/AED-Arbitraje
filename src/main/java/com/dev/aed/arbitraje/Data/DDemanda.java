/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MDemanda;
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
public class DDemanda {

    private static final String SQL_SELECT = "SELECT NroExpediente, FechaDemanda, DemandanteID, DemandadoID, Ubigeo, Especialidad, Cuantia, IdAnexo, ResumenControversia, ResumenPeticiones, DesignacionArbitro, DeclaracionesCompromiso, Estado, Decision_Final, MotivoAnulacion, SustentoAnulacion, FechaAprobacion, UsuarioAprobador, usuario\n"
            + "FROM Demanda";
    private static final String SQL_INSERT = "INSERT INTO Demanda\n"
            + "( FechaDemanda, DemandanteID, DemandadoID, Ubigeo, Especialidad, Cuantia, IdAnexo, ResumenControversia, ResumenPeticiones, DesignacionArbitro, DeclaracionesCompromiso, Estado, Decision_Final, MotivoAnulacion, SustentoAnulacion, FechaAprobacion, UsuarioAprobador, usuario)\n"
            + "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_BY_ID = "SELECT idlc, nombre_cliente, ruc_cliente, fecha_registro, dias_credito, monto_maximo, moneda, usuario_registro, riesgo_crediticio FROM lineacreditomst where idlc=?";
    private static final String SQL_UPDATE = "UPDATE lineacreditomst SET nombre_cliente = ?, ruc_cliente = ?, fecha_registro = ?, dias_credito = ?,  monto_maximo= ?, moneda= ?, usuario_registro= ?, riesgo_crediticio= ? WHERE idlc = ?";

    public List<MDemanda> Select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MDemanda mDemanda = null;
        List<MDemanda> listDemanda = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int NroExpediente = rs.getInt("NroExpediente");
                java.sql.Date FechaDemanda = rs.getDate("FechaDemanda");
                String DemandanteID = rs.getString("DemandanteID");
                String DemandadoID = rs.getString("DemandadoID");
                String Ubigeo = rs.getString("Ubigeo");
                String Especialidad = rs.getString("Especialidad");
                Double Cuantia = rs.getDouble("Cuantia");
                int IdAnexo = rs.getInt("IdAnexo");
                String ResumenControversia = rs.getString("ResumenControversia");
                String ResumenPeticiones = rs.getString("ResumenPeticiones");
                String DesignacionArbitro = rs.getString("DesignacionArbitro");
                String DeclaracionesCompromiso = rs.getString("DeclaracionesCompromiso");
                String Estado = rs.getString("Estado");
                String DecisionFinal = rs.getString("Decision_Final");
                String MotivoAnulacion = rs.getString("MotivoAnulacion");
                String SustentoAnulacion = rs.getString("SustentoAnulacion");
                java.sql.Date FechaAprobacion = rs.getDate("FechaAprobacion");
                int UsuarioAprobador = rs.getInt("UsuarioAprobador");
                String usuario = rs.getString("usuario");

                mDemanda = new MDemanda();
                mDemanda.setNroExpediente(NroExpediente);
                mDemanda.setFechaDemanda(FechaDemanda);
                mDemanda.setDemandanteID(DemandanteID);
                mDemanda.setDemandadoID(DemandadoID);
                mDemanda.setUbigeo(Ubigeo);
                mDemanda.setEspecialidad(Especialidad);
                mDemanda.setCuantia(Cuantia);
                mDemanda.setIdAnexo(IdAnexo);
                mDemanda.setResumenControversia(ResumenControversia);
                mDemanda.setResumenPeticiones(ResumenPeticiones);
                mDemanda.setDesignacionArbitro(DesignacionArbitro);
                mDemanda.setDeclaracionesCompromiso(DeclaracionesCompromiso);
                mDemanda.setEstado(Estado);
                mDemanda.setDecisionFinal(DecisionFinal);
                mDemanda.setMotivoAnulacion(MotivoAnulacion);
                mDemanda.setSustentoAnulacion(SustentoAnulacion);
                mDemanda.setFechaAprobacion(FechaAprobacion);
                mDemanda.setUsuarioAprobador(UsuarioAprobador);
                mDemanda.setUsuario(usuario);

                listDemanda.add(mDemanda);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listDemanda;
    }

//    public LineaCredito SelectById(LineaCredito lineacredito) {
//        System.out.println("Ingresa a SelectById");
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        LineaCredito lineaCredito = null;
//
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
//            stmt.setInt(1, lineacredito.getIdlc());
//            System.out.println("OBtner ID: -->>> " + lineacredito.getIdlc());
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//
//                int idlc = rs.getInt("idlc");
//                String nombre_cliente = rs.getString("nombre_cliente");
//                String ruc_cliente = rs.getString("ruc_cliente");
//                Date fecha_registro = rs.getDate("fecha_registro");
//                int dias_credito = rs.getInt("dias_credito");
//                double monto_maximo = rs.getDouble("monto_maximo");
//                String moneda = rs.getString("moneda");
//                String usuario_registro = rs.getString("usuario_registro");
//                String riesgo_crediticio = rs.getString("riesgo_crediticio");
//
//                lineaCredito = new LineaCredito();
//                lineaCredito.setIdlc(idlc);
//                lineaCredito.setNombre_cliente(nombre_cliente);
//                lineaCredito.setRuc_cliente(ruc_cliente);
//                lineaCredito.setFecha_registro(fecha_registro);
//                lineaCredito.setDias_credito(dias_credito);
//                lineaCredito.setMonto_maximo(monto_maximo);
//                lineaCredito.setMoneda(moneda);
//                lineaCredito.setUsuario_registro(usuario_registro);
//                lineaCredito.setRiesgo_crediticio(riesgo_crediticio);
//
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(rs);
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        return lineaCredito;
//    }

    /*
     private int idlc, dias_credito;
    private String nombre_cliente, ruc_cliente, moneda, usuario_registro, riesgo_crediticio;
    private double monto_maximo;
    private Date fecha_registro;

    nombre_cliente, ruc_cliente, fecha_registro, dias_credito, monto_maximo, moneda, usuario_registro, riesgo_crediticio
    
     */
    public int insertDemanda(MDemanda demanda) {
        System.out.println("InserDemanda");

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        java.util.Date fechaActual = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaDemanda = formato.format(fechaActual);

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, fechaDemanda);
//            stmt.setInt(2, demanda.getDemandanteID());
//            stmt.setInt(3, demanda.getDemandadoID());

            stmt.setString(2, demanda.getDemandanteID());
            stmt.setString(3, demanda.getDemandadoID());
            stmt.setString(4, demanda.getUbigeo());
            stmt.setString(5, demanda.getEspecialidad());
            stmt.setDouble(6, demanda.getCuantia());
            stmt.setInt(7, demanda.getIdAnexo());
            stmt.setString(8, demanda.getResumenControversia());
            stmt.setString(9, demanda.getResumenPeticiones());
            stmt.setString(10, demanda.getDesignacionArbitro());
            stmt.setString(11, demanda.getDeclaracionesCompromiso());
            stmt.setString(12, demanda.getEstado());
            stmt.setString(13, demanda.getDecisionFinal());
            stmt.setString(14, demanda.getMotivoAnulacion());
            stmt.setString(15, demanda.getSustentoAnulacion());
            stmt.setString(16, fechaDemanda);
            stmt.setInt(17, demanda.getUsuarioAprobador());
            stmt.setString(18, demanda.getUsuario());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            //  ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return rows;
    }

//    public int updateLineaCredito(LineaCredito lineacredito) {
//        java.util.Date fechaActual = new java.util.Date();
//        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
//        String fechaFormateada = formato.format(fechaActual);
//
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//        try {
//            conn = Conexion.getConnection();
//            System.out.println("ejecutando query: " + SQL_UPDATE);
//            stmt = conn.prepareStatement(SQL_UPDATE);
//            stmt.setString(1, lineacredito.getNombre_cliente());
//            stmt.setString(2, lineacredito.getRuc_cliente());
//            stmt.setString(3, fechaFormateada);
//            stmt.setInt(4, lineacredito.getDias_credito());
//            stmt.setDouble(5, lineacredito.getMonto_maximo());
//            stmt.setString(6, lineacredito.getMoneda());
//            stmt.setString(7, lineacredito.getUsuario_registro());
//            stmt.setString(8, lineacredito.getRiesgo_crediticio());
//             stmt.setInt(9, lineacredito.getIdlc());
//
//            rows = stmt.executeUpdate();
//            System.out.println("Registros actualizado:" + rows);
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//
//        return rows;
//    }
//    
}