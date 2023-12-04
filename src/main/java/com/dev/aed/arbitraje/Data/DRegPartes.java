/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MRegPartes;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class DRegPartes {
    
     private static final String SQL_SELECT_Partes = "SELECT RP.NumDoc , RP.Nombres ,rp.Apellidos  FROM RegPartes rp\n" +
"where rp.NumDoc is not null or rp.NumDoc=''";
     
     private static final String SQL_SELECT_Arbitros = "SELECT RP.NumDoc , RP.Nombres ,rp.Apellidos  FROM RegPartes rp where rp.RegistroA='Arbitro' and rp.NumDoc is not null or rp.NumDoc=''";
     
      private static final String SQL_SELECT_Arbitros_BY = "SELECT RP.NumDoc , RP.Nombres ,rp.Apellidos  FROM RegPartes rp where rp.RegistroA='Arbitro' and (rp.NumDoc is not null or rp.NumDoc='') and rp.NumDoc=? ";
     
     
     public List<MRegPartes> SelectPartes() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MRegPartes objPartes = null;
        List<MRegPartes> regPartes = new ArrayList<MRegPartes>();
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_Partes);
            rs = stmt.executeQuery();
            System.out.println("SQL_SELECT_Partes: " + SQL_SELECT_Partes);

            while (rs.next()) {

                String documento = rs.getString("NumDoc");
                String Nombres = rs.getString("Nombres");
                String Apellidos = rs.getString("Apellidos");
                
             //   String NombreCompleto = rs.getString("NombreCompleto");
              
             //   System.out.println("print  " + documento + " " + NombreCompleto );

                objPartes = new MRegPartes();

              //  objPartes.setNombreCompleto(Nombres,Apellidos);
                objPartes.setNumDoc(documento);
                objPartes.setApellidos(Apellidos);
                objPartes.setNombres(Nombres);

                regPartes.add(objPartes);

                System.out.println("JDBC->  " + regPartes + "  ---- >>>>");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return regPartes;
    }

      public List<MRegPartes> SelectArbitros() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MRegPartes objPartes = null;
        List<MRegPartes> regPartes = new ArrayList<MRegPartes>();
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_Arbitros);
            rs = stmt.executeQuery();
            System.out.println("SQL_SELECT_Partes: " + SQL_SELECT_Arbitros);

            while (rs.next()) {

                String documento = rs.getString("NumDoc");
                String Nombres = rs.getString("Nombres");
                String Apellidos = rs.getString("Apellidos");
                
             //   String NombreCompleto = rs.getString("NombreCompleto");
              
             //   System.out.println("print  " + documento + " " + NombreCompleto );

                objPartes = new MRegPartes();

              //  objPartes.setNombreCompleto(Nombres,Apellidos);
                objPartes.setNumDoc(documento);
                objPartes.setApellidos(Apellidos);
                objPartes.setNombres(Nombres);

                regPartes.add(objPartes);

                System.out.println("JDBC->  " + regPartes + "  ---- >>>>");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return regPartes;
    }

       public List<MRegPartes> SelectArbitrosBY_Document(MRegPartes mRegpartes) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MRegPartes objPartes = null;
        List<MRegPartes> regPartes = new ArrayList<MRegPartes>();
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_Arbitros_BY);
            stmt.setString(1, mRegpartes.getNumDoc());
            rs = stmt.executeQuery();
            System.out.println("SQL_SELECT_Arbitros_BY: " + SQL_SELECT_Arbitros_BY);

            while (rs.next()) {

                String documento = rs.getString("NumDoc");
                String Nombres = rs.getString("Nombres");
                String Apellidos = rs.getString("Apellidos");
               
                objPartes = new MRegPartes();

              //  objPartes.setNombreCompleto(Nombres,Apellidos);
                objPartes.setNumDoc(documento);
                objPartes.setApellidos(Apellidos);
                objPartes.setNombres(Nombres);

                regPartes.add(objPartes);

                System.out.println("JDBC->  " + regPartes + "  ---- >>>>");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return regPartes;
    }

    
    
}
