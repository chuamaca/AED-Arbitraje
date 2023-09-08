/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class ConexionJDBC {
    
    
     public static Connection getConexion(){
        
        String conexionServer = "jdbc:sqlserver://DCODE\\SQLEXPRESS01;"
                + "database=AEDArbitraje;"
                +"user=sa;"
                +"password=sa;"
                +"loginTimeout=30;"
                 +"encrypt=true;"+
                "trustServerCertificate=True;";
        /*
          String connectionUrl = "jdbc:sqlserver://DCODE;user=sa;password=BANKpower9719;"
                  + "database=AEDArbitraje;encrypt=true; trustServerCertificate=True;";
*/
        
        try{
            Connection  con = DriverManager.getConnection(conexionServer);
            return con;
            
        } catch(SQLException ex){
            
             JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        
        }
    }
    
    public static void close(ResultSet rs) throws SQLException {
        
        rs.close();
        
    }
    public static void close(Statement smtn) throws SQLException {
        smtn.close();
    }
    
    public static void close(PreparedStatement smtn) throws SQLException {
        smtn.close();
    }
    
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
