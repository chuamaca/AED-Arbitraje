/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Cesar
 */
public class EstadoNotificacionRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String estado = (String) table.getModel().getValueAt(row, 2); // Suponemos que la columna 2 contiene el estado

        // Cambiar el color según el estado
        if ("Iniciado".equals(estado)) {
            c.setBackground(Color.MAGENTA);
        }else if ("Anulado".equals(estado)) {
            c.setBackground(Color.RED);
        } else if ("En Proceso".equals(estado)) {
            c.setBackground(Color.ORANGE);
        } else if ("Finalizado".equals(estado)) {
            c.setBackground(Color.GREEN);
        } else {
            // Restablecer el fondo predeterminado si no se cumple ninguna condición
            c.setBackground(table.getBackground());
        }

        return c;
    }

}
