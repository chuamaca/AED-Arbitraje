/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Data;

import com.dev.aed.arbitraje.Utils.ConexionJDBC;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class DRegistros {

    public void BuscarPorNombre(JTextField Busqueda, JTextField NombresRES, JTextField ApellidosRES, JTextField NumeroDocRES, JTextField CorreoRES, JTextField TelefonoRES) {
        String consulta = "select Nombres,Apellidos,DNI,Correo,Telefono from dbo.Registros where dbo.Registros.Nombres=(?);";

        ConexionJDBC objetoConexion = new ConexionJDBC();
        try {
            CallableStatement cs = objetoConexion.getConexion().prepareCall(consulta);
            cs.setString(1, Busqueda.getText());
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Registro encontrado");
                NombresRES.setText(rs.getString("Nombres"));
                ApellidosRES.setText(rs.getString("Apellidos"));
                NumeroDocRES.setText(rs.getString("DNI"));
                CorreoRES.setText(rs.getString("Correo"));
                TelefonoRES.setText(rs.getString("Telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
                NombresRES.setText("");
                ApellidosRES.setText("");
                NumeroDocRES.setText("");
                CorreoRES.setText("");
                TelefonoRES.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex.toString());
        }

    }
}
