/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

/**
 *
 * @author andre
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class DAudiencia {

    public  void insertarAudiencia(JTextField txtIdAudiencia, JTextField txtExpediente, JTextField txtFecha, JTextField txtLugar, JTextField txtArbitro, JTextField txtEstadoExpe, JTextField txtFecha1, JTextArea atInformacion) {
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
            String sql = "INSERT INTO dbo.Audiencia (IdAudiencia, NumerodeExpediente, FechadeRegistro, LugardeAudiencia, Arbitro, EstadoExpediente, Fechadeprogramacion, InformacionAdicional) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            // Crear una sentencia preparada
            PreparedStatement statement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros
            statement.setInt(1, Integer.parseInt(txtIdAudiencia.getText()));
            statement.setString(2, txtExpediente.getText());
            statement.setString(3, txtFecha.getText());
            statement.setString(4, txtLugar.getText());
            statement.setString(5, txtArbitro.getText());
            statement.setString(6, txtEstadoExpe.getText());
            statement.setString(7, txtFecha1.getText());
            statement.setString(8, atInformacion.getText());

            // Ejecutar la sentencia
            int filasInsertadas = statement.executeUpdate();

            // Verificar si los datos fueron insertados correctamente
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "La audiencia fue insertada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar la audiencia.");
            }

            // Cerrar la conexión y liberar los recursos
            statement.close();
            conexion.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar la audiencia: " + ex.getMessage());
        }
    }
}