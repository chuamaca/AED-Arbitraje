package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MExpediente;
import com.dev.aed.arbitraje.Model.MVerExpediente;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.Date;
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
public class DVerExpediente {

    private static final String SQL_SELECT = "SELECT NroExpediente, DemandanteID, DemandadoID,DesignacionArbitro, Estado\n"
            + "FROM Demanda WHERE NroExpediente = ?";
    private static final String SQL_SELECT1 = "SELECT NroExpediente, FechaDemanda, DemandanteID, DemandadoID, Especialidad, Cuantia, ResumenControversia, ResumenPeticiones, DesignacionArbitro, DeclaracionesCompromiso, Estado, Decision_Final\n"
            + "FROM Demanda WHERE NroExpediente = ? and DemandanteID=? and Estado=?";

    public List<MVerExpediente> Select(int numeroExpediente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MVerExpediente vDemanda = null;
        List<MVerExpediente> listexpediente = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, numeroExpediente);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int NroExpediente = rs.getInt("NroExpediente");
                String DemandanteID = rs.getString("DemandanteID");
                String DemandadoID = rs.getString("DemandadoID");
                String DesignacionArbitro = rs.getString("DesignacionArbitro");
                String Estado = rs.getString("Estado");

                vDemanda = new MVerExpediente();
                vDemanda.setNroExpediente(NroExpediente);
                vDemanda.setDemandanteID(DemandanteID);
                vDemanda.setDemandadoID(DemandadoID);
                vDemanda.setDesignacionArbitro(DesignacionArbitro);
                vDemanda.setEstado(Estado);

                listexpediente.add(vDemanda);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listexpediente;
    }

    public List<MExpediente> ListaExpediente(int numeroExpediente, String demandanteID, String estado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MExpediente mExpediente = null;
        List<MExpediente> listExpe = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT1);
            stmt.setInt(1, numeroExpediente); // Establecer el valor del parámetro
            stmt.setString(2, demandanteID);
            stmt.setString(3, estado);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int NroExpediente = rs.getInt("NroExpediente");
                java.sql.Date FechaDemanda = rs.getDate("FechaDemanda");
                String DemandanteID = rs.getString("DemandanteID");
                String DemandadoID = rs.getString("DemandadoID");
                String Especialidad = rs.getString("Especialidad");
                Double Cuantia = rs.getDouble("Cuantia");
                String ResumenControversia = rs.getString("ResumenControversia");
                String ResumenPeticiones = rs.getString("ResumenPeticiones");
                String DesignacionArbitro = rs.getString("DesignacionArbitro");
                String DeclaracionesCompromiso = rs.getString("DeclaracionesCompromiso");
                String Estado = rs.getString("Estado");
                String DecisionFinal = rs.getString("Decision_Final");

                mExpediente = new MExpediente();
                mExpediente.setNroExpediente(NroExpediente);
                mExpediente.setFechaDemanda(FechaDemanda);
                mExpediente.setDemandanteID(DemandanteID);
                mExpediente.setDemandadoID(DemandadoID);
                mExpediente.setEspecialidad(Especialidad);
                mExpediente.setCuantia(Cuantia);
                mExpediente.setResumenControversia(ResumenControversia);
                mExpediente.setResumenPeticiones(ResumenPeticiones);
                mExpediente.setDesignacionArbitro(DesignacionArbitro);
                mExpediente.setDeclaracionesCompromiso(DeclaracionesCompromiso);
                mExpediente.setEstado(Estado);
                mExpediente.setDecisionFinal(DecisionFinal);

                listExpe.add(mExpediente);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listExpe;
    }

    public List<String> obtenerDNI() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<String> docu = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            // Asumiendo que la tabla se llama Persona y el campo con los nombres es "Nombre"
            String sql = "select DNI from [dbo].[RegPartes]";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String doc = rs.getString("DNI");
                docu.add(doc);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return docu;
    }
}
