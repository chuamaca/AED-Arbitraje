/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioshelshort;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuamani
 */
class ShellSortDatabase {
    
  public static Connection getConexion(){
        
        String conexionServer = "jdbc:sqlserver://RLPT1177\\SQLEXPRESS;"
                + "database=AEDArbitraje;"
                +"user=sa;"
                +"password=BANKpower9719;"
                +"loginTimeout=30;"
                 +"encrypt=true;"+
                "trustServerCertificate=True;";

        try{
            Connection  con = DriverManager.getConnection(conexionServer);
            return con;
            
        } catch(SQLException ex){
            
             System.out.println(ex.toString());
            return null;
        
        }
    }
    
    public static void close(ResultSet rs) {
        
        try {
             rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
       
        
    }
    public static void close(Statement smtn)  {
        try {
             smtn.close();
        } catch (SQLException e) {
             e.printStackTrace(System.out);
        }
       
    }
    
    public static void close(PreparedStatement smtn)  {
        try {
            smtn.close();
        } catch (SQLException e) {
              e.printStackTrace(System.out);
        }
        
    }
    
    public static void close(Connection conn)  {
        try {
            conn.close();
        } catch (SQLException e) {
              e.printStackTrace(System.out);
        }
        
    }
    
     

    
    
}
