package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MGestionarDemanda;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DGestionarAudiencia {

    private static final String SQL_UPDATE = "Update Audiencia set EstadoAudiencia=? , ResultadoAudiencia=? , FechaAudiencia=?";

    public int GestionarAudiencia(MGestionarDemanda audi, String txtExpediente) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

       try {
        conn = ConexionJDBC.getConexion();
        stmt = conn.prepareStatement(SQL_UPDATE + " WHERE NumerodeExpediente = ?");
        stmt.setString(1, audi.getEstadoAudiencia());
        stmt.setString(2, audi.getResultadoAudiencia());
        stmt.setString(3, audi.getFechaAudiencia());
        stmt.setString(4, txtExpediente);

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

}
