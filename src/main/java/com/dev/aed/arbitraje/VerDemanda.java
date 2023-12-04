/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.aed.arbitraje;

import static com.dev.aed.arbitraje.Dashboard.ShowJPanel;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Model.MDemanda;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.tree.CaseTree;

/**
 *
 * @author Cesar
 */
public class VerDemanda extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public VerDemanda() {
        initComponents();
        InitStyles();
        MostrarDemanda();

    }

    public void MostrarDemanda() {

        /*
                	 cliente	
                numerodocumento	 fechaventa	
                diascredito	 numerocuotas	 total
                totalpagado	 saldoAFavor	
                siguiente_fecha_pago	
                numero_cuota_pendiente	 monto_cuota

         */
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Expediente");
        modelo.addColumn("Fecha");
        modelo.addColumn("Demandante");
        modelo.addColumn("Demandado");
        modelo.addColumn("Ubigeo");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Cuantia");
        modelo.addColumn("Anexos");
        modelo.addColumn("Resumen");
        modelo.addColumn("Peticion");
        modelo.addColumn("Arbitro");
        modelo.addColumn("Compromiso");
        modelo.addColumn("Estado");
        modelo.addColumn("Desicion Final");
        modelo.addColumn("MotivoAnulacion");
        modelo.addColumn("Sustento Anulacion");
        modelo.addColumn("Fecha Aprobacion");
        modelo.addColumn("Usuario Aprobador");
        modelo.addColumn("Usuario");

        jTableVerDemandas.setModel(modelo);

        DDemanda dDemanda = new DDemanda();
        List<MDemanda> mDemandaList = dDemanda.Select();

        // double total = 0;
        //   jLabelDeudaTotal.setText("");
        String cuentasForTable[] = new String[19];
        for (MDemanda item : mDemandaList) {
            cuentasForTable[0] = "" + item.getNroExpediente();
            cuentasForTable[1] = "" + item.getFechaDemanda();
            cuentasForTable[2] = item.getDemandanteID();
            cuentasForTable[3] = item.getDemandadoID();
            cuentasForTable[4] = "" + item.getUbigeo();
            cuentasForTable[5] = "" + item.getEspecialidad();
            cuentasForTable[6] = "" + item.getCuantia();
            cuentasForTable[7] = "" + item.getIdAnexo();
            cuentasForTable[8] = "" + item.getResumenControversia();
            cuentasForTable[9] = "" + item.getResumenPeticiones();
            cuentasForTable[10] = "" + item.getDesignacionArbitro();
            cuentasForTable[11] = "" + item.getDeclaracionesCompromiso();
            cuentasForTable[12] = "" + item.getEstado();
            cuentasForTable[13] = "" + item.getDecisionFinal();
            cuentasForTable[14] = "" + item.getMotivoAnulacion();
            cuentasForTable[15] = "" + item.getSustentoAnulacion();
            cuentasForTable[16] = "" + item.getFechaAprobacion();
            cuentasForTable[17] = "" + item.getUsuarioAprobador();
            cuentasForTable[18] = "" + item.getUsuario();

            // total+=item.getSaldo_favor();
            //   jLabelDeudaTotal.setText("" +total );

            /*
                	 cliente	
                numerodocumento	 fechaventa	
                diascredito	 numerocuotas	 total
                totalpagado	 saldoAFavor	
                siguiente_fecha_pago	
                numero_cuota_pendiente	 monto_cuota

             */
            modelo.addRow(cuentasForTable);

        }
        jTableVerDemandas.setModel(modelo);

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
        txtBuscar = new javax.swing.JTextField();
        btnDemandar = new javax.swing.JButton();
        jRadioButtonRuc = new javax.swing.JRadioButton();
        jRadioButtonComprobante = new javax.swing.JRadioButton();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRechazar = new javax.swing.JButton();
        btnRegistrarAudiencia = new javax.swing.JButton();
        btnAnularDemanda = new javax.swing.JButton();

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

        btnDemandar.setBackground(new java.awt.Color(18, 90, 173));
        btnDemandar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDemandar.setForeground(new java.awt.Color(255, 255, 255));
        btnDemandar.setText("Demandar");
        btnDemandar.setBorderPainted(false);
        btnDemandar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDemandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemandarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonRuc);
        jRadioButtonRuc.setText("DOCUMENTO");

        buttonGroup1.add(jRadioButtonComprobante);
        jRadioButtonComprobante.setSelected(true);
        jRadioButtonComprobante.setText("NRO EXPEDIENTE");

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ver Demandas");

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

        btnRechazar.setBackground(new java.awt.Color(18, 90, 173));
        btnRechazar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRechazar.setForeground(new java.awt.Color(255, 255, 255));
        btnRechazar.setText("Rechazar");
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        btnRegistrarAudiencia.setBackground(new java.awt.Color(18, 90, 173));
        btnRegistrarAudiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarAudiencia.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAudiencia.setText("Registrar Audiencia");
        btnRegistrarAudiencia.setBorderPainted(false);
        btnRegistrarAudiencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAudiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAudienciaActionPerformed(evt);
            }
        });

        btnAnularDemanda.setBackground(new java.awt.Color(18, 90, 173));
        btnAnularDemanda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAnularDemanda.setForeground(new java.awt.Color(255, 255, 255));
        btnAnularDemanda.setText("Anular Demanda");
        btnAnularDemanda.setBorderPainted(false);
        btnAnularDemanda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnularDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularDemandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(btnDemandar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnularDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarAudiencia)
                        .addGap(18, 18, 18)
                        .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPorDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(txtBuscar)
                                .addGap(154, 154, 154)
                                .addComponent(jRadioButtonComprobante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonRuc))
                            .addComponent(header, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonComprobante)
                    .addComponent(jRadioButtonRuc))
                .addGap(44, 44, 44)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRechazar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDemandar)
                        .addComponent(btnRegistrarAudiencia)
                        .addComponent(btnAnularDemanda)
                        .addComponent(btnBuscarPorDocumento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPorDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorDocumentoActionPerformed


    }//GEN-LAST:event_btnBuscarPorDocumentoActionPerformed


    private void btnDemandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemandarActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Demanda());

    }//GEN-LAST:event_btnDemandarActionPerformed

    private void jTableVerDemandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVerDemandasMouseClicked

        
         if (jTableVerDemandas.getSelectedRow() > -1) {

            String valor_NroExpediente = (String) jTableVerDemandas
                    .getValueAt(jTableVerDemandas.getSelectedRow(), 0);
            
            System.out.println("String IdDocumento >>< " + valor_NroExpediente);
            
            txtBuscar.setText(valor_NroExpediente);
//            CuentaJDBC cuentaJdbc = new CuentaJDBC();
//            Cuenta cuenta = new Cuenta();
//            cuenta.setDocumento(idDocumento);



           // Dashboard.ShowJPanel(new AnularDemanda(valor_NroExpediente));

            //JOptionPane.showMessageDialog(null, "Documento A Cobrar: " + cuenta.getDocumento());
        }
        
        

    }//GEN-LAST:event_jTableVerDemandasMouseClicked

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
        // Obtiene el modelo de la tabla

        //        DefaultTableModel modelo = (DefaultTableModel) jTableVerDemandas.getModel();
        //        // Obtiene la fila seleccionada
        //        int filaSeleccionada = jTableVerDemandas.getSelectedRow();
        //        // Verifica si se ha seleccionado alguna fila
        //        if (filaSeleccionada != -1) {
            //            // Obtiene el valor del número de expediente en la columna 0 (ajusta según la posición de la columna)
            //            String numeroExpedienteSeleccionado = modelo.getValueAt(filaSeleccionada, 0).toString();
            //            // Muestra el número de expediente en un JTextField (ajusta el nombre de tu JTextField)
            //            txtNroExpediente.setText(numeroExpedienteSeleccionado);
            //            // Abre la ventana RechazarDemanda y pasa el número de expediente
            //            RechazarDemanda rechazarDemanda = new RechazarDemanda(numeroExpedienteSeleccionado);
            //            ShowJPanel(rechazarDemanda);

            ShowJPanel(new RechazarDemanda());

    }//GEN-LAST:event_btnRechazarActionPerformed

    private void btnRegistrarAudienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAudienciaActionPerformed
        // TODO add your handling code here:
           ShowJPanel(new RegistrarAudiencia(txtBuscar.getText()));
    }//GEN-LAST:event_btnRegistrarAudienciaActionPerformed

    private void btnAnularDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularDemandaActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new AnularDemanda(txtBuscar.getText()));
    }//GEN-LAST:event_btnAnularDemandaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAnularDemanda;
    private javax.swing.JButton btnBuscarPorDocumento;
    private javax.swing.JButton btnDemandar;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JButton btnRegistrarAudiencia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonComprobante;
    private javax.swing.JRadioButton jRadioButtonRuc;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVerDemandas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
