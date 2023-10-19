package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MCriterioAceptacion;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DCriterioAceptacion {

    private static final String SQL_INSERT_FORMULARIO = "INSERT INTO Caceptacion (pregunta, descripcion, respuesta, criterio, estado) VALUES (?, ?, ?, ?, ?)";

    public boolean registrarFormulario(String preguntaText, String descripcionText, String respuestaText, String obligatorioText, String EstadoText) {
        try {
            Connection conn = ConexionJDBC.getConexion();
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT_FORMULARIO);
            stmt.setString(1, preguntaText);
            stmt.setString(2, descripcionText);
            stmt.setString(3, respuestaText);
            stmt.setString(4, obligatorioText);
            stmt.setString(5, EstadoText);
            int rowsAffected = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return rowsAffected > 0; // Retorna true si se registró con éxito.
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de error en la base de datos.
        }
    }

   

}
