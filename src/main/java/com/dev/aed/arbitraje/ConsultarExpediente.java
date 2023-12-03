/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.aed.arbitraje;

import static com.dev.aed.arbitraje.Dashboard.ShowJPanel;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Data.DVerExpediente;
import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MExpediente;
import com.dev.aed.arbitraje.Model.MVerExpediente;
import com.dev.aed.arbitraje.Model.Persona_VerExpediente;
import com.microsoft.sqlserver.jdbc.StringUtils;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.tree.CaseTree;

public class ConsultarExpediente extends javax.swing.JPanel {

    public ConsultarExpediente() {
        initComponents();
        InitStyles();
        llenarComboDemandante();
        CargarEstado();

    }

    public void CargarEstado2() {
        DefaultComboBoxModel<String> comboBoxModelEstado = new DefaultComboBoxModel<>();
        // Agregar elementos al modelo del ComboBox
        comboBoxModelEstado.addElement("Registrado");
        comboBoxModelEstado.addElement("Aprobado");
        comboBoxModelEstado.addElement("inactivo");

        ddlEstado.setModel(comboBoxModelEstado);

    }
    
    private void CargarEstado() {
        DVerExpediente dVerExpediente = new DVerExpediente();
        List<String> estado = dVerExpediente.obtenerestado();

        for (String cod : estado) {
            ddlEstado.addItem(cod);
  
        }
    }

//        Persona_VerExpediente personaSeleccionada = (Persona_VerExpediente) cmbDemandante.getSelectedItem();
//        String dniSeleccionado = personaSeleccionada.getDemandanteID();
    private void llenarComboDemandante() {
        DVerExpediente dVerExpediente = new DVerExpediente();
        List<String> nrodoc = dVerExpediente.obtenerDNI();

        for (String cod : nrodoc) {
            cmbDemandante.addItem(cod);
        }
    }

    public void MostrarExpediente() {

        String numeroExpedienteStr = txt_NroExp.getText();
        String demandanteSeleccionado = (String) cmbDemandante.getSelectedItem();
        String estadoSeleccionado = (String) ddlEstado.getSelectedItem();
        String fechaSeleccionado = (String) txtfecha.getText();

        if (StringUtils.isNumeric(numeroExpedienteStr) && numeroExpedienteStr.length() <=10 ) {
            if (fechaSeleccionado.isEmpty() || fechaSeleccionado.length() >10) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");
            } else {
               

            int numeroExpediente = Integer.parseInt(numeroExpedienteStr);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Expediente");
            modelo.addColumn("Fecha_Registro");
            modelo.addColumn("Demandante");
            modelo.addColumn("Demandado");
            modelo.addColumn("Especialidad");
            modelo.addColumn("Cuantia");
            modelo.addColumn("Resumen");
            modelo.addColumn("Peticion");
            modelo.addColumn("Arbitro");
            modelo.addColumn("Compromiso");
            modelo.addColumn("Estado");
            modelo.addColumn("Desicion Final");

            jTableVerDemandas.setModel(modelo);
            DVerExpediente vexpediente = new DVerExpediente();
            List<MExpediente> mExpedienteList = vexpediente.ListaExpediente(numeroExpediente, demandanteSeleccionado, estadoSeleccionado, fechaSeleccionado);

            String cuentasForTable[] = new String[19];
            for (MExpediente item : mExpedienteList) {
                cuentasForTable[0] = "" + item.getNroExpediente();
                cuentasForTable[1] = "" + item.getFechaDemanda();
                cuentasForTable[2] = item.getDemandanteID();
                cuentasForTable[3] = item.getDemandadoID();
                cuentasForTable[4] = "" + item.getEspecialidad();
                cuentasForTable[5] = "" + item.getCuantia();
                cuentasForTable[6] = "" + item.getResumenControversia();
                cuentasForTable[7] = "" + item.getResumenPeticiones();
                cuentasForTable[8] = "" + item.getDesignacionArbitro();
                cuentasForTable[9] = "" + item.getDeclaracionesCompromiso();
                cuentasForTable[10] = "" + item.getEstado();
                cuentasForTable[11] = "" + item.getDecisionFinal();

                modelo.addRow(cuentasForTable);
            }
            jTableVerDemandas.setModel(modelo);
            
            if (mExpedienteList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe resultado para la búsqueda");
            }}
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número de expediente válido");
        }
    }

    private void InitStyles() {
//        title.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
//        title.setForeground(Color.black);

    }

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
        jTableVerDemandas = new javax.swing.JTable();
        btnBuscarPorDocumento = new javax.swing.JButton();
        txt_NroExp = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ddlEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbDemandante = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jTableVerDemandas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableVerDemandas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableVerDemandas.setRowSorter(jTableVerDemandas.getRowSorter());
        jTableVerDemandas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVerDemandasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVerDemandas);

        btnBuscarPorDocumento.setBackground(new java.awt.Color(18, 90, 173));
        btnBuscarPorDocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarPorDocumento.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPorDocumento.setText("Buscar");
        btnBuscarPorDocumento.setBorderPainted(false);
        btnBuscarPorDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarPorDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorDocumentoActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultar Expediente");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("Nro Experiencia");

        jLabel3.setText("Estado");

        ddlEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlEstadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Demandante");

        cmbDemandante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDemandanteActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        txtfecha.setText("2023-12-05");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(60, 60, 60)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NroExp, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(ddlEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDemandante, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBuscarPorDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NroExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cmbDemandante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ddlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnBuscarPorDocumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addGap(92, 92, 92))
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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPorDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorDocumentoActionPerformed

        MostrarExpediente();

    }//GEN-LAST:event_btnBuscarPorDocumentoActionPerformed


    private void jTableVerDemandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVerDemandasMouseClicked


    }//GEN-LAST:event_jTableVerDemandasMouseClicked

    private void cmbDemandanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDemandanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDemandanteActionPerformed

    private void ddlEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBuscarPorDocumento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDemandante;
    private javax.swing.JComboBox<String> ddlEstado;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVerDemandas;
    private javax.swing.JTextField txt_NroExp;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
