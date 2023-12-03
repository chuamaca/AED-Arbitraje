package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MRepoDrcn;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DReportDuracion {

    private static final String SQL_SELECT = "SELECT NroExpediente,FechaDemanda AS FechaRegistroExpediente, FechaAprobacion, Estado, DATEDIFF(DAY, FechaDemanda, GETDATE()) AS DiasTranscurridos FROM     Demanda where NroExpediente=? and FechaDemanda=?";

    public List<MRepoDrcn> ListaRepoDrcn(int numeroExpediente, LocalDate fechaRegistro1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MRepoDrcn mReportd = null;
        List<MRepoDrcn> listRepo = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, numeroExpediente); // Establecer el valor del parámetro
            Date fechaRegistroSql = Date.valueOf(fechaRegistro1);
            stmt.setDate(2, fechaRegistroSql);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int NroExpediente = rs.getInt("NroExpediente");
                java.sql.Date FechaDemanda = rs.getDate("FechaRegistroExpediente");
                java.sql.Date FechaAprobacion = rs.getDate("FechaAprobacion");
                String Estado = rs.getString("Estado");
                int NrodiasTrans = rs.getInt("DiasTranscurridos");

                mReportd = new MRepoDrcn();
                mReportd.setNroExpediente(NroExpediente);
                mReportd.setFechaDemanda(FechaDemanda);
                mReportd.setFechaAprobacion(FechaAprobacion);
                mReportd.setEstado(Estado);
                mReportd.setDiasTranscurridos(NrodiasTrans);

                listRepo.add(mReportd);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listRepo;
    }

}
