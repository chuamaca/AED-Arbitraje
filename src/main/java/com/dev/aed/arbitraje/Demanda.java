package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DAnexo;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Data.DNotificacion;
import com.dev.aed.arbitraje.Data.DRegPartes;
import com.dev.aed.arbitraje.Data.Tabla_PdfVO;
import com.dev.aed.arbitraje.Model.MAnexo;
import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MNotificacion;
import com.dev.aed.arbitraje.Model.MRegPartes;
import com.dev.aed.arbitraje.Model.MRol;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Demanda extends javax.swing.JPanel {

    boolean editar = false;
    MDemanda demandaEditar;

    String ruta_archivo = "";
    Tabla_PdfVO tpdf = new Tabla_PdfVO();
    int id = -1;

    public Demanda() {
        initComponents();
        InitStyles();
        CargarCombos();
        generarCorrelativoExpediente();
        btnGuardarAdjunto.setEnabled(false);
        txtRefMotivo.setEnabled(false);
        
    }

    private void generarCorrelativoExpediente() {

        MDemanda objDemanda = new MDemanda();
        DDemanda dDemanda = new DDemanda();
        String nro_expediente = dDemanda.GenerarNroExpediente();
        txtNroExpediente.setText("" + nro_expediente);
    }

    public void CargarCombos() {

        DRegPartes dregpartes = new DRegPartes();
        List<MRegPartes> partesDemandante = dregpartes.SelectPartes();
        for (MRegPartes parte : partesDemandante) {
            cmbDemandante.addItem(parte.getDNI());
        }

        List<MRegPartes> partes = dregpartes.SelectPartes();
        for (MRegPartes parte : partes) {
            cmbDemandado.addItem(parte.getDNI());
        }

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
        txtCuantia = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePDF = new javax.swing.JTable();
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
        btnSeleccionarArchivo = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        btnGuardarDemanda = new javax.swing.JButton();
        txtNroExpediente = new javax.swing.JTextField();
        phoneLbl6 = new javax.swing.JLabel();
        txtRefMotivo = new javax.swing.JTextField();
        domLbl2 = new javax.swing.JLabel();
        txtRefExpediente1 = new javax.swing.JTextField();
        domLbl3 = new javax.swing.JLabel();
        btnGuardarAdjunto = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bgGround.setBackground(new java.awt.Color(255, 255, 255));

        txtCuantia.setToolTipText("");

        phoneLbl.setText("Nro Expediente");

        jTablePDF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePDF.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePDFMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePDF);

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

        btnSeleccionarArchivo.setText("Cargar Archivo");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(0, 204, 0));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorderPainted(false);
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

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

        phoneLbl6.setText("Demandante");

        domLbl2.setText("Referencia");

        domLbl3.setText("Motivo Referencia");

        btnGuardarAdjunto.setBackground(new java.awt.Color(0, 51, 255));
        btnGuardarAdjunto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarAdjunto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAdjunto.setText("Adjuntar");
        btnGuardarAdjunto.setBorderPainted(false);
        btnGuardarAdjunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAdjuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgGroundLayout = new javax.swing.GroupLayout(bgGround);
        bgGround.setLayout(bgGroundLayout);
        bgGroundLayout.setHorizontalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(phoneLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addComponent(phoneLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276))
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202))))
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(domLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgGroundLayout.createSequentialGroup()
                                        .addComponent(txtRefExpediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRefMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPeticion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgGroundLayout.createSequentialGroup()
                                    .addComponent(phoneLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtResumenControversia))
                                .addComponent(domLbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgGroundLayout.createSequentialGroup()
                                    .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(bgGroundLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(133, 133, 133))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgGroundLayout.createSequentialGroup()
                                            .addComponent(txtNroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbDemandante, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbDemandado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addComponent(domLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(317, 317, 317)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        bgGroundLayout.setVerticalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDemandante)
                    .addComponent(cmbDemandado)
                    .addComponent(txtNroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl3)
                    .addComponent(txtResumenControversia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(domLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domLbl2)
                    .addComponent(domLbl3))
                .addGap(12, 12, 12)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRefMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRefExpediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarAdjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgGround, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarTexto() {
        //  txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
        //  txtPeticion.setText(null);

    }

    public static boolean validarNumeroEntero(String numero) {
        // Verificar si el número no está vacío y contiene solo dígitos
        return numero != null && !numero.isEmpty() && numero.matches("^\\d+$");
    }

    public static boolean validarNumeroDecimalMayorQueCero(String numero) {
        // Verificar si el número no está vacío, contiene un formato decimal válido y es mayor que 0
        return numero != null && !numero.isEmpty() && numero.matches("^\\d+(\\.\\d+)?$") && Double.parseDouble(numero) > 0;
    }

    private void btnGuardarDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDemandaActionPerformed
        // TODO add your handling code here:
        boolean validdarcampos = false;
        // int NroExpediente = demandaEditar.getNroExpediente();
        // System.out.println("validarNumeroDecimalMayorQueCero(txtCuantia.getText()) :" + validarNumeroDecimalMayorQueCero(txtCuantia.getText()));
        String exp = txtNroExpediente.getText();
        String res = txtResumenControversia.getText();
        String peti = txtPeticion.getText();
        String cuantiaTexto = txtCuantia.getText();
         String refMotivoTexto = txtRefMotivo.getText();

        if (exp.isBlank() || exp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de número de expediente es obligatorio");
            System.out.println("Valida exp");
            validdarcampos = true;
        }

        if (peti.isBlank() || peti.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de peticiones es obligatorio");
            validdarcampos = true;
        }

        if (res.isBlank() || res.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de resumen de controversia es obligatorio");
            validdarcampos = true;
        }

        if (cuantiaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de cuantía es obligatorio");
            validdarcampos = true;
        }
        else {
            try {
                Double cuantiad = Double.parseDouble(cuantiaTexto);

                if (cuantiad < 1) {
                    JOptionPane.showMessageDialog(null, "El campo de cuantía debe ser mayor o igual a 1");
                    validdarcampos = true;
                } else {
                    // El valor de cuantia es válido, puedes continuar con tu lógica
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo de cuantía debe ser un número válido");
            }
        }

        if (validdarcampos != true) {
            System.out.println("Documento Guardar Demanda: " + cmbDemandante.getSelectedItem());

            MDemanda objDemanda = new MDemanda();
            objDemanda.setNroExpediente(txtNroExpediente.getText());
            objDemanda.setDemandanteID((String) cmbDemandante.getSelectedItem());
            objDemanda.setDemandadoID((String) cmbDemandado.getSelectedItem());
            objDemanda.setUbigeo((String) cmbUbigeo.getSelectedItem());
            objDemanda.setEspecialidad((String) cmbEspecialidad.getSelectedItem());
            objDemanda.setCuantia(Double.parseDouble(txtCuantia.getText()));
            objDemanda.setResumenControversia(txtResumenControversia.getText());
            objDemanda.setResumenPeticiones(txtPeticion.getText());
            objDemanda.setRefNroexpediente(txtRefExpediente1.getText());
            objDemanda.setRefMotivo(txtRefMotivo.getText());

            objDemanda.setEstado("Registrado");

            DDemanda dDemanda = new DDemanda();

            System.out.println("Estado Editar " + editar);
            if (editar == false) {
                System.out.println("Editar Falso");
                int rta = dDemanda.insertDemanda(objDemanda);

                if (rta == 1) {
                    // Dashboard.ShowJPanel(new Demanda());

                    java.util.Date fechaActual = new java.util.Date();
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    String fecha = formato.format(fechaActual);

                    DNotificacion notifica = new DNotificacion();
                    MNotificacion notificacion = new MNotificacion();
                    notificacion.NroExpediente = objDemanda.getNroExpediente();
                    notificacion.EstadoNotificacion = "Iniciado";
                    notificacion.FechaNotificacion = Date.valueOf(fecha);
                    notificacion.Observaciones = "Demanda Registrada";
                    notificacion.Leida = 0;
                    notificacion.Observaciones = "Rojo";
                    notificacion.idUsuario = "chuamanic";

                    int valor = notifica.AgregarNotificacion(notificacion);

                    JOptionPane.showMessageDialog(null, "Se Agrego correctamente");

                    btnGuardarDemanda.setEnabled(false);

                }
            }
        }


    }//GEN-LAST:event_btnGuardarDemandaActionPerformed

    private boolean validarCampos() {
        boolean respuesta = false;

        if (txtNroExpediente.getText().isEmpty() || Double.parseDouble(txtCuantia.getText()) < 1 || txtResumenControversia.getText().isEmpty() || txtPeticion.getText().isEmpty()) {
            System.out.println("Rtsaa ");
            return respuesta = true;

        }
        return respuesta = false;

    }

    public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnSeleccionarArchivo.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

            if (ruta_archivo.length() > 0) {
                btnGuardarAdjunto.setEnabled(true);
                System.out.println("this.btnSeleccionarArchivo.enable(true): ");
            }

        } else {
        }
    }


    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        seleccionar_pdf();
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        DDemanda ddemanda = new DDemanda();
        List<MDemanda> buscaDemanda = new ArrayList<>();
        MDemanda objDemanda = new MDemanda();

        String numeroExp = txtRefExpediente1.getText();
        objDemanda.setNroExpediente(numeroExp);

        if (!numeroExp.isBlank() || !numeroExp.isEmpty()) {

            buscaDemanda = ddemanda.SelectByNroExpediente(objDemanda);
            buscaDemanda.size();

            if (buscaDemanda.size() > 0) {
                JOptionPane.showMessageDialog(null, "Se hizo la Referencia al Expediente N° "+ numeroExp+" de manera correcta");
                txtRefMotivo.setEnabled(true);
                //txtRefMotivo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No Existe Numero Expediente");
            }
        }

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jTablePDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePDFMouseClicked
        // TODO add your handling code here:
        int column = jTablePDF.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTablePDF.getRowHeight();

        if (row < jTablePDF.getRowCount() && row >= 0 && column < jTablePDF.getColumnCount() && column >= 0) {
            id = (int) jTablePDF.getValueAt(row, 0);
            Object value = jTablePDF.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    DAnexo pd = new DAnexo();
                    System.out.println("ejecutar_archivoPDF: " + id);
                    pd.ejecutar_archivoPDF(id);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }

            } else {
                String name = "" + jTablePDF.getValueAt(row, 1);
//                txtname.setText(name);
            }
        }
    }//GEN-LAST:event_jTablePDFMouseClicked

    private void btnGuardarAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAdjuntoActionPerformed
        // TODO add your handling code here:
        String nroExpediente = txtNroExpediente.getText();

        File ruta = new File(ruta_archivo);
        if (nroExpediente.trim().length() != 0 && ruta_archivo.trim().length() != 0) {
            guardar_pdf(nroExpediente, ruta_archivo.trim(), ruta);
            tpdf.visualizar_PdfVO(jTablePDF, nroExpediente);
            ruta_archivo = "";
            this.btnSeleccionarArchivo.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
    }//GEN-LAST:event_btnGuardarAdjuntoActionPerformed

    public void guardar_pdf(String NroExpediente, String nombredocumento, File ruta) {

        MAnexo po = new MAnexo();
        DAnexo danexo = new DAnexo();
        po.setNroExpediente(NroExpediente);
        po.setNombreDocumento(nombredocumento);
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            po.setArchivopdf(pdf);
        } catch (IOException ex) {
            po.setArchivopdf(null);
            //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
        }
        danexo.insertAnexo(po);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JPanel bgGround;
    private javax.swing.JButton btnGuardarAdjunto;
    private javax.swing.JButton btnGuardarDemanda;
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JComboBox<String> cmbDemandado;
    private javax.swing.JComboBox<String> cmbDemandante;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbUbigeo;
    private javax.swing.JLabel domLbl1;
    private javax.swing.JLabel domLbl2;
    private javax.swing.JLabel domLbl3;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePDF;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneLbl1;
    private javax.swing.JLabel phoneLbl2;
    private javax.swing.JLabel phoneLbl3;
    private javax.swing.JLabel phoneLbl4;
    private javax.swing.JLabel phoneLbl5;
    private javax.swing.JLabel phoneLbl6;
    private javax.swing.JTextField txtCuantia;
    private javax.swing.JTextField txtNroExpediente;
    private javax.swing.JTextField txtPeticion;
    private javax.swing.JTextField txtRefExpediente1;
    private javax.swing.JTextField txtRefMotivo;
    private javax.swing.JTextField txtResumenControversia;
    // End of variables declaration//GEN-END:variables
}
