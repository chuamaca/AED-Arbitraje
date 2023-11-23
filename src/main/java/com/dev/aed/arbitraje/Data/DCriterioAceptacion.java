package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MCriterioAceptacion;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DCriterioAceptacion {

    private static final String SQL_INSERT_FORMULARIO = "INSERT INTO Caceptacion (pregunta, descripcion, respuesta, criterio, estado) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_SELECT = "select id_cuestionario, pregunta,descripcion,respuesta, criterio,estado from Caceptacion";

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

    public List<MCriterioAceptacion> Select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MCriterioAceptacion mCriterio = null;
        List<MCriterioAceptacion> listCriterio = new ArrayList<>();
   
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int id_cuestionario= rs.getInt("id_cuestionario");
                String pregunta = rs.getString("pregunta");
                String descripcion = rs.getString("descripcion");
                String respuesta = rs.getString("respuesta");
                String criterio = rs.getString("criterio");
                String estado = rs.getString("estado");

                mCriterio = new MCriterioAceptacion();
                mCriterio.setId_cuestionario(id_cuestionario);
                mCriterio.setPregunta(pregunta);
                mCriterio.setDescripcion(descripcion);
                mCriterio.setRespuesta(respuesta);
                mCriterio.setObligatorio(criterio);
                mCriterio.setEstado(estado);

                listCriterio.add(mCriterio);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listCriterio;
    }

}
