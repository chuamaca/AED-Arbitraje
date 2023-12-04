package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MGestionarAudiencia;
import com.dev.aed.arbitraje.Model.MGestionarDemanda;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DGestionarAudiencia {

    private static final String SQL_UPDATE = "Update Audiencia set EstadoAudiencia=? , ResultadoAudiencia=? , FechaAudiencia=?";
    private static final String SQL_SELECT = "select idAudiencia, NumerodeExpediente, FechadeProgramacion,LugardeAudiencia,Arbitro, d.Estado, EstadoAudiencia,ResultadoAudiencia,FechaAudiencia  from [dbo].[Audiencia] A Join Demanda d on a.NumerodeExpediente= d.NroExpediente Where NumerodeExpediente=?";

    public int GestionarAudiencia(MGestionarAudiencia audi, String idAudiencia) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

       try {
        conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE + " WHERE idAudiencia = ?");
        stmt.setString(1, audi.getEstadoAudiencia());
        stmt.setString(2, audi.getResultadoAudiencia());
        stmt.setString(3, audi.getFechaAudiencia());
            stmt.setString(4, idAudiencia);

        System.out.println("ejecutando query:" + SQL_UPDATE);
        rows = stmt.executeUpdate();
        System.out.println("Registros afectados:" + rows);
    } catch (SQLException ex) {
        ex.printStackTrace(System.out);
    } finally {
        ConexionJDBC.close(stmt);
        ConexionJDBC.close(conn);
    }

    return rows;
    }

    public List<MGestionarAudiencia> ListarAudiencia(String numeroExpediente) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MGestionarAudiencia mAudiencia = null;
        List<MGestionarAudiencia> listAudiencia = new ArrayList<>();
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setString(1, numeroExpediente); 
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idAudiencia = rs.getString("idAudiencia");
                String NumerodeExpediente = rs.getString("NumerodeExpediente");
                String FechadeProgramacion = rs.getString("FechadeProgramacion");
                String LugardeAudiencia = rs.getString("LugardeAudiencia");
                String Arbitro = rs.getString("Arbitro");
                String Estado = rs.getString("Estado");
                String EstadoAudiencia = rs.getString("EstadoAudiencia");
                String ResultadoAudiencia = rs.getString("ResultadoAudiencia");
                String FechaAudiencia = rs.getString("FechaAudiencia");

                mAudiencia = new MGestionarAudiencia();

                mAudiencia.setIdAudiencia(idAudiencia);
                mAudiencia.setNumerodeExpediente(NumerodeExpediente);
                mAudiencia.setFechadeProgramacion(FechadeProgramacion);
                mAudiencia.setLugardeAudiencia(LugardeAudiencia);
                mAudiencia.setArbitro(Arbitro);
                mAudiencia.setEstado(Estado);
                mAudiencia.setEstadoAudiencia(EstadoAudiencia);
                mAudiencia.setResultadoAudiencia(ResultadoAudiencia);
                mAudiencia.setFechaAudiencia(FechaAudiencia);

                listAudiencia.add(mAudiencia);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listAudiencia;
    }

}
