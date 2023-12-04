package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MExpediente;
import com.dev.aed.arbitraje.Model.MRechazarDemanda;
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
public class DRechazarDemanda {

    private static final String SQL_INSERT = "INSERT INTO RechazarDemanda( NroExpediente, Motivo, Fecha, Arbitro, instancia)VALUES( ?, ?, ?, ?, ?)";
  private static final String SQL_UPDATE = "Update Demanda set Estado=? where NroExpediente=?";
  
  public int insertRechazo(MRechazarDemanda demandaRechaza) {
            Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
 
            stmt.setInt(1, demandaRechaza.getNroExpediente());
            stmt.setString(2, demandaRechaza.getMotivo());
            stmt.setString(3, demandaRechaza.getFecha());
            stmt.setString(4, demandaRechaza.getArbitro());
            stmt.setString(5, demandaRechaza.getInstancia());
            

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
  
   public int ActualizarRechazoDemanda( MRechazarDemanda demandaRechaza1) {
            Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, demandaRechaza1.getEstado());
            stmt.setInt(2, demandaRechaza1.getNroExpediente());
            
            System.out.println("ejecutando query:" + SQL_UPDATE);
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
public List<String> obtenerArbitro() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    List<String> docu = new ArrayList<>();

    try {
        conn = ConexionJDBC.getConexion();
        String sql = "select DISTINCT DesignacionArbitro from [dbo].[Demanda] ";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        while (rs.next()) {
            String doc = rs.getString("DesignacionArbitro");
            docu.add(doc);
        }

    } catch (SQLException ex) {
        ex.printStackTrace(System.out);
    } finally {
        ConexionJDBC.close(rs);
        ConexionJDBC.close(stmt);
        ConexionJDBC.close(conn);
    }

    return docu;}
}
