/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Model.MAnexo;
import com.dev.aed.arbitraje.Model.MNotificacion;
import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
public class DAnexo {
    
     private static final String SQL_INSERT = "INSERT INTO AEDArbitraje.dbo.Anexo\n" +
"( NroExpediente, TipoDocumento, NombreDocumento, Formato, FechaCarga, EstadoCarga, Usuario, archivopdf)\n" +
"VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
     
     private static final String SQL_SELECT = "SELECT\n" +
"	IdAnexo,\n" +
"	NroExpediente,\n" +
"	TipoDocumento,\n" +
"	NombreDocumento,\n" +
"	Formato,\n" +
"	FechaCarga,\n" +
"	EstadoCarga,\n" +
"	Usuario,\n" +
"	archivopdf \n" +
"FROM\n" +
"	Anexo where NroExpediente=?";
     
     
      private static final String SQL_SELECT_ID = "SELECT\n" +
"	archivopdf \n" +
"FROM\n" +
"	Anexo\n" +
"	where IdAnexo =?";
     
    
 
      public int insertAnexo(MAnexo anexo) {
        System.out.println("InserDemanda");

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        java.util.Date fechaActual = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fechaCarga = formato.format(fechaActual);

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, anexo.getNroExpediente());
            stmt.setString(2, anexo.getTipoDocumento());
            stmt.setString(3, anexo.getNombreDocumento());
            stmt.setString(4, anexo.getFormato());
            stmt.setString(5, fechaCarga);
            stmt.setInt(6, anexo.getEstadoCarga());
            stmt.setString(7, anexo.getUsuario());
            stmt.setBytes(8, anexo.getArchivopdf());
            
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
      
    
     public List<MAnexo> SelectAnexoPorExpediente(String nro_expediente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MAnexo anexo = null;
        List<MAnexo> lisAnexo = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setString(1, ""+nro_expediente);
            //stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int idNotificacion = rs.getInt("IdAnexo");
                String NroExpediente = rs.getString("NroExpediente");
                String TipoDocumento = rs.getString("TipoDocumento");
                String NombreDocumento = rs.getString("NombreDocumento");
                String Formato = rs.getString("Formato");
                Date FechaCarga = rs.getDate("FechaCarga");
                int EstadoCarga = rs.getInt("EstadoCarga");
                String Usuario = rs.getString("Usuario");
                byte[]  archivopdf = rs.getBytes("archivopdf");
                
                
            
                anexo = new MAnexo();
               
                anexo.setIdAnexo(idNotificacion);
                anexo.setNroExpediente(NroExpediente);
                anexo.setTipoDocumento(TipoDocumento);
                anexo.setNombreDocumento(NombreDocumento);
                anexo.setFormato(Formato);
                anexo.setFechaCarga(FechaCarga);
                anexo.setEstadoCarga(EstadoCarga);
                anexo.setUsuario(Usuario);
                anexo.setArchivopdf(archivopdf);

                lisAnexo.add(anexo);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }
        return lisAnexo;
    }
     
     public void ejecutar_archivoPDF(int id) {

                Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        byte[] b = null;

        try {
            
             conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, id);
            System.out.println("ejecutar_archivoPDF: "+ id);
            rs = stmt.executeQuery();
            

            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
           

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }
    }
 
     


}
