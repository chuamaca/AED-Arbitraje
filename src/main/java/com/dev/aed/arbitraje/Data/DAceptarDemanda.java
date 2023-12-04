
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MExpediente;
import com.dev.aed.arbitraje.Model.MAceptarDemanda;
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


public class DAceptarDemanda {
    private static final String SQL_INSERT = "INSERT INTO AceptarDemanda( NroExpediente, Estado, Cuantia, AsignacionArbitro, Arbitro1, instancia, InformacionDeArbitro)VALUES( ?, ?, ?, ?, ?, ?, ? )";
    
    public int insertAceptar(MAceptarDemanda demandaAceptar) {
            Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
 
            stmt.setInt(1, demandaAceptar.getNroExpediente());
            stmt.setString(2, demandaAceptar.getEstado());
            stmt.setDouble(3, demandaAceptar.getCuantia());
            stmt.setString(4, demandaAceptar.getAsignacionArbitro());
            stmt.setString(5, demandaAceptar.getArbitro1());
            stmt.setString(6, demandaAceptar.getInstancia());
            stmt.setString(7, demandaAceptar.getInformacionDeArbitro());
            
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
    public List<String> obtenerArbitro() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    List<String> docu = new ArrayList<>();

    try {
        conn = ConexionJDBC.getConexion();
        String sql = "select DesignacionArbitro from [dbo].[Demanda] ";
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
