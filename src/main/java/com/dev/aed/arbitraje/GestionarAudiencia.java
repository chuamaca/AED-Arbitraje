package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DAudiencia;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Data.DGestionarAudiencia;
import static com.dev.aed.arbitraje.Demanda.validarNumeroDecimalMayorQueCero;
import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MGestionarDemanda;
import javax.swing.JOptionPane;

public class GestionarAudiencia extends javax.swing.JPanel {

    public GestionarAudiencia() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCuentaCabecera1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        txtLugar1 = new javax.swing.JTextField();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        txtExpediente = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        ddlEstado = new javax.swing.JComboBox<>();
        ddlResultado = new javax.swing.JComboBox<>();

        jTableCuentaCabecera1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCuentaCabecera1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jTableCuentaCabecera1);

        btnGuardar.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Audiencia");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        label1.setText("Nro expediente:");

        txtExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpedienteActionPerformed(evt);
            }
        });

        label4.setText("Resultado:");

        label5.setText("Estado:");

        label6.setText("Fecha:");

        btnGuardar1.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        txtFecha.setText("00/00/2023");

        ddlEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancelado", "Realizado", "Postergado", "Programado" }));

        ddlResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acuerdo Total", "Acuerdo Parcial" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(29, 29, 29)
                                .addComponent(ddlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4)
                                    .addComponent(label6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnGuardar1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        String estadoAudiencia = (String) ddlEstado.getSelectedItem();
        String resultadoAudiencia = (String) ddlResultado.getSelectedItem();
        String fechaAudiencia = txtFecha.getText();
        String numeroExpediente =txtExpediente.getText();

        MGestionarDemanda objaudi = new MGestionarDemanda();
        objaudi.setEstadoAudiencia(estadoAudiencia);
        objaudi.setResultadoAudiencia(resultadoAudiencia);
        objaudi.setFechaAudiencia(fechaAudiencia);

        DGestionarAudiencia dGestionarAu = new DGestionarAudiencia();
        int filasAfectadas = dGestionarAu.GestionarAudiencia(objaudi, numeroExpediente);

          if (filasAfectadas > 0) {
        // Actualización exitosa, puedes mostrar un mensaje o realizar otras acciones necesarias
        JOptionPane.showMessageDialog(this, "Audiencia actualizada correctamente.");
    } else {
        // La actualización falló, muestra un mensaje de error o toma otras acciones necesarias
        JOptionPane.showMessageDialog(this, "Error al actualizar la audiencia.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpedienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox<String> ddlEstado;
    private javax.swing.JComboBox<String> ddlResultado;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCuentaCabecera1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JTextField txtExpediente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLugar1;
    // End of variables declaration//GEN-END:variables
}
