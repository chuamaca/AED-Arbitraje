package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DCriterioAceptacion;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Model.MCriterioAceptacion;
import com.dev.aed.arbitraje.Model.MDemanda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CriterioAceptacion extends javax.swing.JPanel {

    public CriterioAceptacion() {
        initComponents();
        MostrarCriterios();
    }
  
     public void MostrarCriterios() {
            
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_cuestionario");
        modelo.addColumn("pregunta");
        modelo.addColumn("descripcion");
        modelo.addColumn("respuesta");
        modelo.addColumn("criterio");
        modelo.addColumn("estado");
        

        jTableVerDemandas.setModel(modelo);

        DCriterioAceptacion dCriterio = new DCriterioAceptacion();
        List<MCriterioAceptacion> mCriteriosList = dCriterio.Select();

        // double total = 0;
        //   jLabelDeudaTotal.setText("");
        String cuentasForTable[] = new String[19];
        for (MCriterioAceptacion item : mCriteriosList) {
            cuentasForTable[0] = "" + item.getId_cuestionario();
            cuentasForTable[1] = "" + item.getPregunta();
            cuentasForTable[2] = item.getDescripcion();
            cuentasForTable[3] = item.getRespuesta();
            cuentasForTable[4] = "" + item.getObligatorio();
            cuentasForTable[5] = "" + item.getEstado();

            modelo.addRow(cuentasForTable);
        }
        jTableVerDemandas.setModel(modelo);

    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pregunta = new javax.swing.JTextField();
        Grabar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        rdeseable = new javax.swing.JComboBox<>();
        creterio = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVerDemandas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(271, 482));

        jPanel1.setBackground(new java.awt.Color(98, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Criterios Aprobación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setText("Pregunta");

        pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaActionPerformed(evt);
            }
        });

        Grabar.setBackground(new java.awt.Color(18, 90, 173));
        Grabar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Grabar.setText("Grabar");
        Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrabarActionPerformed(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        jLabel3.setText("Descripción");

        jLabel4.setText("Respuesta Deseable");

        jLabel5.setText("Obligatorio");

        jLabel6.setText("Estado");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        rdeseable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        creterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        creterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creterioActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(jTableVerDemandas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                        .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdeseable, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creterio, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rdeseable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(creterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(Grabar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrabarActionPerformed
        // TODO add your handling code here:
 DCriterioAceptacion dcriterioAceptacion = new DCriterioAceptacion(); // Inicializa la instancia de DCriterioAceptacion

        // Agrega un manejador de eventos al botón "Grabar"
        Grabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Captura los datos del formulario
                String preguntaText = pregunta.getText();
                String descripcionText = descripcion.getText();
                String respuestaText = rdeseable.getSelectedItem().toString();
                System.out.println("campo espuesta"+respuestaText);
                String obligatorioText = creterio.getSelectedItem().toString();
                String EstadoText = estado.getSelectedItem().toString();

                // Llama al método para insertar en la base de datos
                boolean exito = dcriterioAceptacion.registrarFormulario(preguntaText, descripcionText, respuestaText, obligatorioText, EstadoText);

                if (exito) {
                    // El registro se realizó con éxito, puedes mostrar un mensaje de confirmación.
                    System.out.println("Formulario registrado con éxito");
                } else {
                    // Ocurrió un error, muestra un mensaje de error o realiza la acción apropiada.
                    System.out.println("Error al registrar el formulario");
                }
            }
        });
        
        MostrarCriterios();
    }//GEN-LAST:event_GrabarActionPerformed

    private void creterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creterioActionPerformed

    private void preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preguntaActionPerformed

    private void jTableVerDemandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVerDemandasMouseClicked

//        if (jTableVerDemandas.getSelectedRow() > -1) {
//
//            String valor_NroExpediente = (String) jTableVerDemandas
//            .getValueAt(jTableVerDemandas.getSelectedRow(), 0);
//
//            System.out.println("String IdDocumento >>< " + valor_NroExpediente);
//
//            txtBuscar.setText(valor_NroExpediente);
//  
//        }

    }//GEN-LAST:event_jTableVerDemandasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Grabar;
    private javax.swing.JComboBox<String> creterio;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableVerDemandas;
    private javax.swing.JTextField pregunta;
    private javax.swing.JComboBox<String> rdeseable;
    // End of variables declaration//GEN-END:variables
}
