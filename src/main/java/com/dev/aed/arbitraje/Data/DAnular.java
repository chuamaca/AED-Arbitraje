/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class DAnular {
    public  void insertarAnular(JTextField txtExpediente, JTextField txt_fecha, JTextField txtMotivo, JTextField txtJustificacion) {
        // Configurar la conexión a la base de datos
       String conexionServer = "jdbc:sqlserver://LAPTOP-8LNNUON2;"
                + "database=AEDArbitraje;"
                +"user=sa;"
                +"password=12345678;"
                +"loginTimeout=30;"
                 +"encrypt=true;"+
                "trustServerCertificate=True;";
       try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(conexionServer);

            // Definir la consulta SQL con parámetros
            String sql = "INSERT INTO dbo.Anular (NroExpediente, Fecha, Motivo, Justificacion) VALUES (?, ?, ?, ?)";

            // Crear una sentencia preparada
            PreparedStatement statement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros
            statement.setString(1, txtExpediente.getText());
            statement.setString(2, txt_fecha.getText());
            statement.setString(3, txtMotivo.getText());
            statement.setString(4, txtJustificacion.getText());
            
            // Ejecutar la sentencia
            int filasInsertadas = statement.executeUpdate();

            // Verificar si los datos fueron insertados correctamente
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "La anulacion fue insertada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar la anulacion.");
            }

            // Cerrar la conexión y liberar los recursos
            statement.close();
            conexion.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar la anulacion: " + ex.getMessage());
        }
    }
}


