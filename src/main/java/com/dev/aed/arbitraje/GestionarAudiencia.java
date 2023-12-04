package com.dev.aed.arbitraje;

import static com.dev.aed.arbitraje.Dashboard.ShowJPanel;
import com.dev.aed.arbitraje.Data.DGestionarAudiencia;
import com.dev.aed.arbitraje.Model.MGestionarAudiencia;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GestionarAudiencia extends javax.swing.JPanel {

    public GestionarAudiencia(String NroExpedienteUp) {
        initComponents();
        txtExpediente.setText(NroExpedienteUp);
        MostrarAudiencia(txtExpediente.getText());

    }

    private void MostrarAudiencia(String txtExpedientes) {
        //String txtExpedientes = txtExpediente.getText();
        String numeroExpediente = String.valueOf(txtExpedientes);

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Codigo Audiencia");
        modelo.addColumn("NumerodeExpediente");
        modelo.addColumn("FechadeProgramacion");
        modelo.addColumn("Lugar");
        modelo.addColumn("Arbitro");
        modelo.addColumn("Estado");
        modelo.addColumn("EstadoAudiencia");
        modelo.addColumn("Resultado");
        modelo.addColumn("FechaAudiencia");
        jTableVerDemandas.setModel(modelo);
        DGestionarAudiencia dAudiencia = new DGestionarAudiencia();
        List<MGestionarAudiencia> mAudienciaList = dAudiencia.ListarAudiencia(numeroExpediente);

        String cuentasForTable[] = new String[10];
        for (MGestionarAudiencia item : mAudienciaList) {
            cuentasForTable[0] = "" + item.getIdAudiencia();
            cuentasForTable[1] = "" + item.getNumerodeExpediente();
            cuentasForTable[2] = item.getFechadeProgramacion();
            cuentasForTable[3] = item.getLugardeAudiencia();
            cuentasForTable[4] = "" + item.getArbitro();
            cuentasForTable[5] = "" + item.getEstado();
            cuentasForTable[6] = "" + item.getEstadoAudiencia();
            cuentasForTable[7] = "" + item.getResultadoAudiencia();
            cuentasForTable[8] = "" + item.getFechaAudiencia();
            modelo.addRow(cuentasForTable);
        }

        jTableVerDemandas.setModel(modelo);

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVerDemandas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodaudiencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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
                .addGap(340, 340, 340))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        label1.setText("Nro expediente:");

        txtExpediente.setEditable(false);
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

        txtFecha.setText("2023/12/00");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        ddlEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancelado", "Realizado", "Postergado", "Programado" }));

        ddlResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acuerdo Total", "Acuerdo Parcial" }));

        jTableVerDemandas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableVerDemandas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableVerDemandas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVerDemandasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVerDemandas);

        jLabel1.setText("Codigo Audiencia:");

        txtCodaudiencia.setEditable(false);

        jButton1.setBackground(new java.awt.Color(18, 90, 173));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(26, 26, 26)
                                .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4)
                                .addGap(53, 53, 53)
                                .addComponent(ddlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(label6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodaudiencia)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ddlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ddlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodaudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed

        String estadoAudiencia = (String) ddlEstado.getSelectedItem();
        String resultadoAudiencia = (String) ddlResultado.getSelectedItem();
        String fechaAudienciaStr = txtFecha.getText();
        String idAudiencia = txtCodaudiencia.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        try {
            LocalDate fechaAudiencia = LocalDate.parse(fechaAudienciaStr, formatter);

            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Comparar las fechas
            if (fechaAudiencia.isBefore(fechaActual)|| fechaAudiencia.isEqual(fechaActual)) {
                MGestionarAudiencia objaudi = new MGestionarAudiencia();
                objaudi.setEstadoAudiencia(estadoAudiencia);
                objaudi.setResultadoAudiencia(resultadoAudiencia);
                objaudi.setFechaAudiencia(fechaAudienciaStr);

                DGestionarAudiencia dGestionarAu = new DGestionarAudiencia();
                int filasAfectadas = dGestionarAu.GestionarAudiencia(objaudi, idAudiencia);

                if (filasAfectadas > 0) {
                    // Actualización exitosa, puedes mostrar un mensaje o realizar otras acciones necesarias
                    JOptionPane.showMessageDialog(this, "Audiencia actualizada correctamente.");
                } else {
                    // La actualización falló, muestra un mensaje de error o toma otras acciones necesarias
                    JOptionPane.showMessageDialog(this, "Error al actualizar la audiencia.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                MostrarAudiencia(txtExpediente.getText());
            } else {
                // La fecha de audiencia es anterior a la fecha actual
                JOptionPane.showMessageDialog(null, "La fecha de audiencia debe ser igual o anterior a la fecha actual.");
            }
        } catch (DateTimeParseException e) {
            // Ocurrió un error al tratar de convertir la cadena a LocalDate
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Utiliza el formato yyyy/MM/dd.");
        }


    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpedienteActionPerformed

    private void jTableVerDemandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVerDemandasMouseClicked

        if (jTableVerDemandas.getSelectedRow() > -1) {
            String idAudiencia = (String) jTableVerDemandas.getValueAt(jTableVerDemandas.getSelectedRow(), 0);
            System.out.println("String IdDocumento >>< " + idAudiencia);
            txtCodaudiencia.setText(idAudiencia);
            // Resto del código...
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila antes de continuar.");
        }

    }//GEN-LAST:event_jTableVerDemandasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new RegistrarAudiencia());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox<String> ddlEstado;
    private javax.swing.JComboBox<String> ddlResultado;
    private javax.swing.JPanel header1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCuentaCabecera1;
    private javax.swing.JTable jTableVerDemandas;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JTextField txtCodaudiencia;
    private javax.swing.JTextField txtExpediente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLugar1;
    // End of variables declaration//GEN-END:variables
}
