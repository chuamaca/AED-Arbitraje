package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Model.MDemanda;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class AceptarDemanda extends javax.swing.JPanel {

    boolean editar = false;
    MDemanda demandaEditar;

    public AceptarDemanda() {
        initComponents();
    
       
       
        
        // CargarCuentaBancoCMB();
    }
    public void CargarEstado() {
        DefaultComboBoxModel<String> comboBoxAsigArbi= new DefaultComboBoxModel<>();

        // Agregar elementos al modelo del ComboBox
        comboBoxAsigArbi.addElement("unico");
        comboBoxAsigArbi.addElement("tribunal arbitral");

       cmbAsigArbi.setModel(comboBoxAsigArbi);

    }
        
        
        

    
    
    //Sobreescritura


//    public void CargarCuentaBancoCMB() {
//        cmbCuentaBanco.removeAllItems();
//        UtilitariosJDBC utilJdbc = new UtilitariosJDBC();
//        List<Poldat> cuentasList = utilJdbc.SelectCuentasBancosCmb();
//        System.out.println("Cargar Combo: " + cuentasList);
////
////        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(cuentasList.toArray(new String[0]));
////        cmbCuentaBanco.setModel(model);
//
//        for (Poldat poldat : cuentasList) {
//            System.out.println("Llenando Combo: " + poldat.rtstr1);
//            cmbCuentaBanco.addItem(poldat.rtstr1);
//        }
//    }
//    public void Mostrar(MDemanda objMDemanda) {
//
//        //CargarCuentaBancoCMB();
//
//        System.out.println("Mostrar Cuenta!!!! ");
//
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Cliente");
//        modelo.addColumn("Documento");
//        modelo.addColumn("Total");
//        modelo.addColumn("Pago Inicial");
//        modelo.addColumn("D. Cancelada");
//        modelo.addColumn("#N. Cuotas");
//
//        jTableCuentaCabecera.setModel(modelo);
//
//        DDemanda dDemanda = new DDemanda();
//        MDemanda mDemandaList = dDemanda.SelectByDocument(objCuenta);
//        System.out.println(" Traer datos " + cuentaCobrarList);
//
//        String cuentasForTable[] = new String[6];
//
//        /*
//    cliente, numerodocumento, total, pagoinicial, pagos, coutas
//    
//    idMovimiento, ruc, cliente, documento, deudacancelada, saldo, deudatotal, usuario, glosa, numerocuotas, fecharegistro
//         */
//        cuentasForTable[0] = mDemandaList.getCliente();
//        cuentasForTable[1] = mDemandaList.getDocumento();
//        cuentasForTable[2] = "" + mDemandaList.getDeudatotal();
//        cuentasForTable[3] = "";
//        cuentasForTable[4] = "" + mDemandaList.getDeudacancelada();
//        cuentasForTable[5] = "" + mDemandaList.getNumerocuotas();
//
//        double imputDeuda = (mDemandaList.getDeudatotal() - mDemandaList.getDeudacancelada());
//
//        txtDeudaPendiente.setText("" + imputDeuda);
//
//        modelo.addRow(cuentasForTable);
//
//        jTableCuentaCabecera.setModel(modelo);
//
//    }
//    public void MostrarListaCuentaDetalle(CuentaDetalle objCuentaDetalle) {
//
//        System.out.println("Mostrar Cuenta Detalle !!!! ");
//
//        /*
//        numerodocumento, nrocuotadet, ingresodet, saldodet, cuentabancodet, glosadet, fechapagodet
//         */
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Documento");
//        modelo.addColumn("#N. Cuota");
//        modelo.addColumn("Pago Realizado");
//        modelo.addColumn("Saldo");
//        modelo.addColumn("Cuenta Banco");
//        modelo.addColumn("Glosa");
//        modelo.addColumn("F.Pago");
//
//        jTableCuentaDetalle.setModel(modelo);
//
//        CuentaDetalleJDBC cuentaDet = new CuentaDetalleJDBC();
//
//        List<domain.CuentaDetalle> cuentaDetalleList = cuentaDet.SelectByDocumentList(objCuentaDetalle);
//
//        String cuentasForTable[] = new String[7];
//
//        for (domain.CuentaDetalle item : cuentaDetalleList) {
//            cuentasForTable[0] = item.getDocumento();
//            cuentasForTable[1] = "" + item.getNrocuotadet();
//            cuentasForTable[2] = "" + item.getIngresodet();
//            cuentasForTable[3] = "" + item.getSaldodet();
//            cuentasForTable[4] = item.getCuentabancodet();
//            cuentasForTable[5] = item.getGlosadet();
//            cuentasForTable[6] = item.getFechapagodet();
//
//            modelo.addRow(cuentasForTable);
//
//        }
//        jTableCuentaDetalle.setModel(modelo);
//
//    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoneLbl5 = new javax.swing.JLabel();
        phoneLbl8 = new javax.swing.JLabel();
        bgGround = new javax.swing.JPanel();
        txtEstDemanda = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        txtInfArbitro = new javax.swing.JTextField();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbAsigArbi = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        phoneLbl6 = new javax.swing.JLabel();
        cmbArbitros = new javax.swing.JComboBox<>();
        phoneLbl7 = new javax.swing.JLabel();
        phoneLbl9 = new javax.swing.JLabel();
        txtExpediente = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnNegar = new javax.swing.JButton();

        phoneLbl5.setText("Cuantia:");

        phoneLbl8.setText("Nro de Expediente:");

        setBackground(new java.awt.Color(255, 255, 255));

        bgGround.setBackground(new java.awt.Color(255, 255, 255));

        txtEstDemanda.setToolTipText("");

        phoneLbl.setText("Asignación de arbitro:");

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aceptar Demanda");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cmbAsigArbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAsigArbiActionPerformed(evt);
            }
        });

        phoneLbl6.setText("Arbitros:");

        cmbArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArbitrosActionPerformed(evt);
            }
        });

        phoneLbl7.setText("Nro de Expediente:");

        phoneLbl9.setText("Estado de demanda:");

        txtExpediente.setToolTipText("");

        btnAceptar.setBackground(new java.awt.Color(18, 90, 173));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar ");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnNegar.setBackground(new java.awt.Color(255, 51, 0));
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

        javax.swing.GroupLayout bgGroundLayout = new javax.swing.GroupLayout(bgGround);
        bgGround.setLayout(bgGroundLayout);
        bgGroundLayout.setHorizontalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addComponent(phoneLbl7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneLbl9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgGroundLayout.createSequentialGroup()
                                        .addComponent(phoneLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgGroundLayout.createSequentialGroup()
                                        .addComponent(phoneLbl)
                                        .addGap(34, 34, 34)
                                        .addComponent(cmbAsigArbi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNegar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(txtInfArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        bgGroundLayout.setVerticalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAsigArbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(txtInfArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnNegar))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

        // int NroExpediente = demandaEditar.getNroExpediente();

       
        }
        //        } else {
        //            obj.setIdlc(lineaCreditoEditar.getIdlc());
        //
        //            int rta = lineaCreditoJDBC.updateLineaCredito(obj);
        //
        //            if (rta == 1) {
            //                Dashboard.ShowJPanel(new LineaCreditoLista());
            //                JOptionPane.showMessageDialog(null, "Se Modifico correctamente");
            //            }
        //        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cmbAsigArbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAsigArbiActionPerformed
       
    }//GEN-LAST:event_cmbAsigArbiActionPerformed

    private void cmbArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArbitrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbArbitrosActionPerformed

    private void btnNegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnNegarActionPerformed

    private void LimpiarTexto() {
        //  txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
      //  txtPeticion.setText(null);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgGround;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnNegar;
    private javax.swing.JComboBox<String> cmbArbitros;
    private javax.swing.JComboBox<String> cmbAsigArbi;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneLbl5;
    private javax.swing.JLabel phoneLbl6;
    private javax.swing.JLabel phoneLbl7;
    private javax.swing.JLabel phoneLbl8;
    private javax.swing.JLabel phoneLbl9;
    private javax.swing.JTextField txtEstDemanda;
    private javax.swing.JTextField txtExpediente;
    private javax.swing.JTextField txtInfArbitro;
    // End of variables declaration//GEN-END:variables
}
