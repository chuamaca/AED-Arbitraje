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

    public int registrarFormulario(MCriterioAceptacion objCaceptacion){

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT_FORMULARIO);
            stmt.setString(1, objCaceptacion.getPregunta());
            stmt.setString(2, objCaceptacion.getdescripcion());
            System.out.println("criterio descripcion  "+objCaceptacion.getdescripcion());
            stmt.setString(3, objCaceptacion.getRespuesta());
            stmt.setString(4, objCaceptacion.getObligatorio());
            stmt.setString(5, objCaceptacion.getEstado());

           System.out.println("ejecutando query:" + SQL_INSERT_FORMULARIO);
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
                mCriterio.setdescripcion(descripcion);
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
