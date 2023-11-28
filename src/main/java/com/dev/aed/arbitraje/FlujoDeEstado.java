/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev.aed.arbitraje;

import static com.dev.aed.arbitraje.Dashboard.ShowJPanel;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Data.DRechazarDemanda;
import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MRechazarDemanda;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.tree.CaseTree;

public class FlujoDeEstado extends javax.swing.JPanel {
    boolean editar = false;
  
    public FlujoDeEstado() {
        initComponents();
        MostrarDemanda();
        InitStyles();
    }
    public FlujoDeEstado(MDemanda mDemandaEdit) {
        System.out.println("Inicializando Cuenta CRUD" + mDemandaEdit);
        initComponents();
        //editar = true;
        //this.demandaEditar = mDemandaEdit;
        InitStyles();
        //  Mostrar(mDemandaEdit);

    }


    private void InitStyles() {


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

        jTableDemandas.setModel(modelo);

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
        jTableDemandas.setModel(modelo);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        btnGuardarDe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDemandas = new javax.swing.JTable();
        btnNegar = new javax.swing.JButton();

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seguimiento por flujo de estado");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label1.setText("Demanda:");

        btnGuardarDe.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardarDe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarDe.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDe.setText("Guardar");
        btnGuardarDe.setBorderPainted(false);
        btnGuardarDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDeActionPerformed(evt);
            }
        });

        jTableDemandas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDemandas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableDemandas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDemandasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDemandas);

        btnNegar.setBackground(new java.awt.Color(18, 90, 173));
        btnNegar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNegar.setForeground(new java.awt.Color(255, 255, 255));
        btnNegar.setText("Negar");
        btnNegar.setBorderPainted(false);
        btnNegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnGuardarDe, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNegar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDe)
                    .addComponent(btnNegar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDeActionPerformed
       
    }//GEN-LAST:event_btnGuardarDeActionPerformed

    private void jTableDemandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDemandasMouseClicked
        if (jTableDemandas.getSelectedRow() > -1) {

            String valor_NroExpediente = (String) jTableDemandas
                    .getValueAt(jTableDemandas.getSelectedRow(), 0);
            
            System.out.println("String IdDocumento >>< " + valor_NroExpediente);
            
            
//            CuentaJDBC cuentaJdbc = new CuentaJDBC();
//            Cuenta cuenta = new Cuenta();
//            cuenta.setDocumento(idDocumento);



           // Dashboard.ShowJPanel(new AnularDemanda(valor_NroExpediente));

            //JOptionPane.showMessageDialog(null, "Documento A Cobrar: " + cuenta.getDocumento());
        }
        
    }//GEN-LAST:event_jTableDemandasMouseClicked

    private void btnNegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegarActionPerformed
        MRechazarDemanda objDemandaRechazad= new MRechazarDemanda();
        
        DRechazarDemanda dRDemanda = new DRechazarDemanda();

      System.out.println("Estado Editar " + editar );
        if (editar == false) {
            System.out.println("Editar Falso");
            int rta = dRDemanda.insertRechazo(objDemandaRechazad);

            if (rta == 1) {
               // Dashboard.ShowJPanel(new Demanda());
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente");
            }
        }
    }//GEN-LAST:event_btnNegarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDe;
    private javax.swing.JButton btnNegar;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDemandas;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
