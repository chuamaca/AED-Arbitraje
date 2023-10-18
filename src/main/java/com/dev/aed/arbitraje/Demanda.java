package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Model.MDemanda;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Demanda extends javax.swing.JPanel {

    boolean editar = false;
    MDemanda demandaEditar;

    public Demanda() {
        initComponents();
        InitStyles();
        
        CargarCombos();
        
        // CargarCuentaBancoCMB();
    }
    
    public void CargarCombos(){
        
        
        //JComboBox<String> comboBox = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        // Agregar elementos al modelo del ComboBox
        comboBoxModel.addElement("74967395");
        comboBoxModel.addElement("24567689");
        comboBoxModel.addElement("12122343");
        comboBoxModel.addElement("12122314");

        // Establecer el modelo en el ComboBox
        cmbDemandante.setModel(comboBoxModel);
        
        
        DefaultComboBoxModel<String> comboBoxModelDemandado = new DefaultComboBoxModel<>();

        // Agregar elementos al modelo del ComboBox
        comboBoxModelDemandado.addElement("12967395");
        comboBoxModelDemandado.addElement("23567689");
        comboBoxModelDemandado.addElement("11122343");
        comboBoxModelDemandado.addElement("15122314");
        
        cmbDemandado.setModel(comboBoxModelDemandado);
        
        
         DefaultComboBoxModel<String> comboBoxModelUbigeo = new DefaultComboBoxModel<>();

        // Agregar elementos al modelo del ComboBox
        comboBoxModelUbigeo.addElement("157689");
        comboBoxModelUbigeo.addElement("156543");
        comboBoxModelUbigeo.addElement("143556");
        comboBoxModelUbigeo.addElement("123454");
        
        cmbUbigeo.setModel(comboBoxModelUbigeo);
        
         DefaultComboBoxModel<String> comboBoxModelEspecialidad = new DefaultComboBoxModel<>();

        // Agregar elementos al modelo del ComboBox
        comboBoxModelEspecialidad.addElement("Comercial");
        comboBoxModelEspecialidad.addElement("Negocios");
        comboBoxModelEspecialidad.addElement("Otros");
        
        cmbEspecialidad.setModel(comboBoxModelEspecialidad);
        
        
        
        
        
    }
    
    
    //Sobreescritura

    public Demanda(MDemanda mDemandaEdit) {
        System.out.println("Inicializando Cuenta CRUD" + mDemandaEdit);
        initComponents();
        editar = true;
        this.demandaEditar = mDemandaEdit;
        InitStyles();
        //  Mostrar(mDemandaEdit);

    }

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
    

    private void InitStyles() {

        if (demandaEditar != null) {

            //Mostrar(cuentaEditar);
            System.out.println("InitStyles >>> " + demandaEditar);

            //   txtFactura.setText(demandaEditar.getDocumento());
            // txtDeudaPendiente.setEnabled(false);
            //     String doc = cuentaEditar.getDocumento();
            //   CuentaDetalle cuentaDet = new CuentaDetalle();
            // cuentaDet.setDocumento(doc);
            //MostrarListaCuentaDetalle(cuentaDet);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGround = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCuantia = new javax.swing.JTextField();
        btnGuardarDemanda = new javax.swing.JButton();
        phoneLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCuentaDetalle = new javax.swing.JTable();
        txtPeticion = new javax.swing.JTextField();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbDemandante = new javax.swing.JComboBox<>();
        cmbUbigeo = new javax.swing.JComboBox<>();
        phoneLbl1 = new javax.swing.JLabel();
        cmbDemandado = new javax.swing.JComboBox<>();
        phoneLbl2 = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        phoneLbl3 = new javax.swing.JLabel();
        phoneLbl4 = new javax.swing.JLabel();
        phoneLbl5 = new javax.swing.JLabel();
        txtResumenControversia = new javax.swing.JTextField();
        domLbl1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bgGround.setBackground(new java.awt.Color(255, 255, 255));

        txtCuantia.setToolTipText("");

        btnGuardarDemanda.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardarDemanda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarDemanda.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDemanda.setText("Registrar");
        btnGuardarDemanda.setBorderPainted(false);
        btnGuardarDemanda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDemandaActionPerformed(evt);
            }
        });

        phoneLbl.setText("Demandante");

        jTableCuentaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCuentaDetalle.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTableCuentaDetalle);

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Demanda");

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

        phoneLbl1.setText("Demandado");

        phoneLbl2.setText("Ubigeo");

        phoneLbl3.setText("Controversia");

        phoneLbl4.setText("Cuantia");

        phoneLbl5.setText("Especialidad");

        domLbl1.setText("Peticion De Demanda");

        javax.swing.GroupLayout bgGroundLayout = new javax.swing.GroupLayout(bgGround);
        bgGround.setLayout(bgGroundLayout);
        bgGroundLayout.setHorizontalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDemandante, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(phoneLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDemandado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(domLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResumenControversia, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgGroundLayout.setVerticalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDemandante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDemandado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(phoneLbl3)
                .addGap(18, 18, 18)
                .addComponent(txtResumenControversia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(domLbl1)
                .addGap(18, 18, 18)
                .addComponent(txtPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarDemanda)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgGround, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarTexto() {
        //  txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
      //  txtPeticion.setText(null);

    }

    private void btnGuardarDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDemandaActionPerformed
        // TODO add your handling code here:

       // int NroExpediente = demandaEditar.getNroExpediente();

        System.out.println("Documento Guardar Demanda: " + cmbDemandante.getSelectedItem() );

        MDemanda objDemanda= new MDemanda();
        objDemanda.setDemandanteID((String) cmbDemandante.getSelectedItem());
        objDemanda.setDemandadoID( (String) cmbDemandado.getSelectedItem());
        objDemanda.setUbigeo((String) cmbUbigeo.getSelectedItem());
        objDemanda.setEspecialidad((String) cmbEspecialidad.getSelectedItem());
        objDemanda.setCuantia(Double.parseDouble(txtCuantia.getText()));
        objDemanda.setResumenControversia(txtResumenControversia.getText());
        objDemanda.setResumenPeticiones(txtPeticion.getText());
        objDemanda.setEstado("Registrado");

        DDemanda dDemanda = new DDemanda();
        
        System.out.println("Estado Editar " + editar );
        if (editar == false) {
            System.out.println("Editar Falso");
            int rta = dDemanda.insertDemanda(objDemanda);

            if (rta == 1) {
                Dashboard.ShowJPanel(new Demanda());
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente");
            }
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


    }//GEN-LAST:event_btnGuardarDemandaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgGround;
    private javax.swing.JButton btnGuardarDemanda;
    private javax.swing.JComboBox<String> cmbDemandado;
    private javax.swing.JComboBox<String> cmbDemandante;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbUbigeo;
    private javax.swing.JLabel domLbl1;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableCuentaDetalle;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneLbl1;
    private javax.swing.JLabel phoneLbl2;
    private javax.swing.JLabel phoneLbl3;
    private javax.swing.JLabel phoneLbl4;
    private javax.swing.JLabel phoneLbl5;
    private javax.swing.JTextField txtCuantia;
    private javax.swing.JTextField txtPeticion;
    private javax.swing.JTextField txtResumenControversia;
    // End of variables declaration//GEN-END:variables
}
