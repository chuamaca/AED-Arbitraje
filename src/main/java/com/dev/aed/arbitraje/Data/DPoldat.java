/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MPoldat;
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
public class DPoldat {
    
        private static final String SQL_SELECT_CONFIG = "select srtseq, rtstr1, rtstr2, rtnum1 from poldat\n"
            + "where polcod=?\n"
            + "and polvar=?\n"
            + "and polval=?\n"
            + "and rtstr1=?\n"
            + "and rtnum2=1";
        
    // Clase para la conexiones, Metodos de busqueda, Ordenamiento
     public List<MPoldat> ListaConfiguracion(MPoldat poldat) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MPoldat objPoldat = null;
        List<MPoldat> poldatList = new ArrayList<MPoldat>();
        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_CONFIG);
            stmt.setString(1, poldat.getPolcod());
            stmt.setString(2, poldat.getPolvar());
            stmt.setString(3, poldat.getPolval());
            stmt.setString(4, poldat.getRtstr1());
            rs = stmt.executeQuery();
            System.out.println("SQL_SELECT_CONFIG: " + SQL_SELECT_CONFIG);

            while (rs.next()) {

                /*srtseq, rtstr1, rtstr2, rtnum1*/
                int v_srtseq = rs.getInt("srtseq");
                String v_rtstr1 = rs.getString("rtstr1");
                String v_rtstr2 = rs.getString("rtstr2");
                int v_rtnum1 = rs.getInt("rtnum1");
                System.out.println("print  " + v_srtseq + " " + v_rtstr1 + " " + v_rtstr2 + " " + v_rtnum1);

                objPoldat = new MPoldat();

                objPoldat.setSrtseq(v_srtseq);
                objPoldat.setRtstr1(v_rtstr1);
                objPoldat.setRtstr2(v_rtstr2);
                objPoldat.setRtnum1(v_rtnum1);

                poldatList.add(objPoldat);

                System.out.println("JDBC->  " + objPoldat + "  ---- >>>>");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
          
        }

        return poldatList;
    }
}
