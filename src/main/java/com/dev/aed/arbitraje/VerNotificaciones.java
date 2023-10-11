/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DNotificacion;
import com.dev.aed.arbitraje.Model.MNotificacion;
import com.dev.aed.arbitraje.Utils.EstadoNotificacionRenderer;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.tree.CaseTree;

/**
 *
 * @author Cesar
 */
public class VerNotificaciones extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public VerNotificaciones() {
        initComponents();
        InitStyles();
        Mostrar();
    }

    private void InitStyles() {
//        title.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
//        title.setForeground(Color.black);

    }

    public void Mostrar() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Notificacion");
        modelo.addColumn("Expediente");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha Notificacion");
        //  modelo.addColumn("Fecha Visualizacion");
        // modelo.addColumn("Estado");
        jTableHeaderNotificacion.setModel(modelo);

        // AccesoJDBC accesoJDBC= new AccesoJDBC();
        DNotificacion notificacion = new DNotificacion();
        List<MNotificacion> listNotificacion = notificacion.Select();

        String LNotificacionForTable[] = new String[6];
        for (MNotificacion item : listNotificacion) {
            LNotificacionForTable[0] = "" + item.getIdNotificacion();
            LNotificacionForTable[1] = item.getNroExpediente(); // Suponiendo que el segundo elemento es el número de expediente
            LNotificacionForTable[2] = item.getEstadoNotificacion(); // Suponiendo que el tercer elemento es el estado de notificación
            LNotificacionForTable[3] = item.getFechaNotificacion().toString(); // Suponiendo que el cuarto elemento es la fecha de notificación
//            LNotificacionForTable[4] = item.getFechaVisualizacion().toString(); // Suponiendo que el quinto elemento es la fecha de visualización
//            LNotificacionForTable[5] = item.getColorEstado(); // Suponiendo que el sexto elemento es el color de estado
//            
            String valor= item.getEstadoNotificacion();
            
           lblEstado.setText(valor);


            modelo.addRow(LNotificacionForTable);
        }
        jTableHeaderNotificacion.setModel(modelo);

        jTableHeaderNotificacion.getColumnModel().getColumn(2).setCellRenderer(new EstadoNotificacionRenderer());
        
        
    }
  
    
        
//        JFrame frame = new JFrame("Stepper Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 100);
//
//        JPanel stepperPanel = new JPanel();
//        stepperPanel.setLayout(new FlowLayout());
//
//        Map<String, JLabel> stepLabels = new HashMap<>();
//        stepLabels.put("Iniciado", new JLabel("Paso 1: Iniciado"));
//        stepLabels.put("En Proceso", new JLabel("Paso 2: En Proceso"));
//        stepLabels.put("Finalizado", new JLabel("Paso 3: Finalizado"));
//
//        // Inicialmente, mostramos el paso "Iniciado"
//        showStep(stepLabels, "Iniciado");
//
//        JButton siguienteButton = new JButton("Siguiente Paso");
//        siguienteButton.addActionListener(e -> {
//            String estadoActual = getCurrentStep(stepLabels);
//            if (estadoActual != null) {
//                // Determina el siguiente estado
//                String siguienteEstado = getNextStep(estadoActual);
//                if (siguienteEstado != null) {
//                    // Muestra el siguiente paso
//                    showStep(stepLabels, siguienteEstado);
//                }
//            }
//        });
//
//        stepperPanel.add(stepLabels.get("Iniciado"));
//        stepperPanel.add(stepLabels.get("En Proceso"));
//        stepperPanel.add(stepLabels.get("Finalizado"));
//        stepperPanel.add(siguienteButton);
//
//        frame.add(stepperPanel);
//        frame.setVisible(true);
//
//    }
    
//    private static void showStep(Map<String, JLabel> stepLabels, String estado) {
//        for (String key : stepLabels.keySet()) {
//            stepLabels.get(key).setVisible(key.equals(estado));
//        }
//    }
//
//    private static String getCurrentStep(Map<String, JLabel> stepLabels) {
//        for (String key : stepLabels.keySet()) {
//            if (stepLabels.get(key).isVisible()) {
//                return key;
//            }
//        }
//        return null;
//    }
//
//    private static String getNextStep(String estadoActual) {
//        if ("Iniciado".equals(estadoActual)) {
//            return "En Proceso";
//        } else if ("En Proceso".equals(estadoActual)) {
//            return "Finalizado";
//        } else {
//            return null;
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHeaderNotificacion = new javax.swing.JTable();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarDocumento = new javax.swing.JTextField();
        btnVerReporte = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jTableHeaderNotificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableHeaderNotificacion.setGridColor(new java.awt.Color(255, 255, 255));
        jTableHeaderNotificacion.setRowSorter(jTableHeaderNotificacion.getRowSorter());
        jScrollPane2.setViewportView(jTableHeaderNotificacion);

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bandeja De Notificaciones");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnVerReporte.setBackground(new java.awt.Color(0, 204, 204));
        btnVerReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnVerReporte.setText("Reporte Documento");
        btnVerReporte.setBorderPainted(false);
        btnVerReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReporteActionPerformed(evt);
            }
        });

        lblEstado.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerReporte))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(lblEstado))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addComponent(lblEstado)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addComponent(jScrollPane2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnVerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReporteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnVerReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnVerReporte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableHeaderNotificacion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField txtBuscarDocumento;
    // End of variables declaration//GEN-END:variables
}
