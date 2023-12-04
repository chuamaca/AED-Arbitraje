package com.dev.aed.arbitraje;

import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Data.DAceptarDemanda;
import com.dev.aed.arbitraje.Data.DNotificacion;
import com.dev.aed.arbitraje.Data.DRegPartes;
import com.dev.aed.arbitraje.Data.DUsuario;
import com.dev.aed.arbitraje.Data.DVerExpediente;
import com.dev.aed.arbitraje.Data.Tabla_PdfVO;
import static com.dev.aed.arbitraje.Demanda.validarNumeroDecimalMayorQueCero;
import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Model.MAceptarDemanda;
import com.dev.aed.arbitraje.Model.MExpediente;
import com.dev.aed.arbitraje.Model.MUsuario;
import com.dev.aed.arbitraje.Data.DRegistros;
import com.dev.aed.arbitraje.Model.MNotificacion;
import com.dev.aed.arbitraje.Model.MRegPartes;
import com.dev.aed.arbitraje.Utils.SesionManager;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AceptarDemanda extends javax.swing.JPanel {

    boolean editar = false;
    MDemanda demandaEditar;

    public AceptarDemanda() {
        initComponents();
        InitStyles();
    }

    public AceptarDemanda(MDemanda mDemandaEdit) {
        System.out.println("Inicializando Cuenta CRUD" + mDemandaEdit);
        initComponents();
        editar = true;
        this.demandaEditar = mDemandaEdit;
        InitStyles();
        cargarComboArbitro();
        CargarAsignacionDeArbitro();
        CargarComboEstadoDemanda();
        mostrarCamposDemanda(mDemandaEdit);
    }

    public void CargarAsignacionDeArbitro() {
        DefaultComboBoxModel<String> comboBoxAsignacionArbitro = new DefaultComboBoxModel<>();
        // Agregar elementos al modelo del ComboBox
        comboBoxAsignacionArbitro.addElement("Arbitro Unico");
        comboBoxAsignacionArbitro.addElement("Tribunal Arbitral");
        cmbAsignacionArbitro.setModel(comboBoxAsignacionArbitro);
    }

    public void CargarComboEstadoDemanda() {
        DefaultComboBoxModel<String> comboBoxEstado = new DefaultComboBoxModel<>();
        // Agregar elementos al modelo del ComboBox
        comboBoxEstado.addElement("En Proceso");
        comboBoxEstado.addElement("Finalizado");
        cmdEstadoDemanda.setModel(comboBoxEstado);
    }

    private void cargarComboArbitro() {
        DRegPartes dregpartes = new DRegPartes();
        List<MRegPartes> partesDemandante = dregpartes.SelectArbitros();
        for (MRegPartes parte : partesDemandante) {
            cmbArbitro1.addItem(parte.getNumDoc());
        }
    }

    private void mostrarCamposDemanda(MDemanda obj) {

        txtNroExpediente.setText(obj.getNroExpediente());
    }

    public void MostrarInformacion() {
        String ArbitroSeleccionado = (String) cmbArbitro1.getSelectedItem();

        if (ArbitroSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Elegir los Arbitros o el Arbitro");
            return;
        }

        String Arbitro = (String) cmbArbitro1.getSelectedItem();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombres");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");

        jTableInformacionDeArbitro.setModel(modelo);

    }

    private void InitStyles() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbArbitro = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        bgGround = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        phoneLbl = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNroExpediente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmdEstadoDemanda = new javax.swing.JComboBox<>();
        phoneLbl4 = new javax.swing.JLabel();
        txtCuantia = new javax.swing.JTextField();
        phoneLbl1 = new javax.swing.JLabel();
        cmbAsignacionArbitro = new javax.swing.JComboBox<>();
        domLbl1 = new javax.swing.JLabel();
        cmbArbitro1 = new javax.swing.JComboBox<>();
        domLbl2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInformacionDeArbitro = new javax.swing.JTable();
        phoneLbl3 = new javax.swing.JLabel();
        txtInstancia = new javax.swing.JTextField();
        btnAceptarDemanda = new javax.swing.JButton();
        header2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        bgGround.setBackground(new java.awt.Color(255, 255, 255));

        phoneLbl.setText("Nro Expediente");

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aceptar Demanda");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setText("Estado");

        cmdEstadoDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEstadoDemandaActionPerformed(evt);
            }
        });

        phoneLbl4.setText("Cuantia");

        txtCuantia.setToolTipText("");

        phoneLbl1.setText("Asignacion de Arbitro");

        domLbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        domLbl1.setText("Arbitro");

        cmbArbitro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArbitro1ActionPerformed(evt);
            }
        });

        domLbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        domLbl2.setText("Informacion de Arbitro");

        jTableInformacionDeArbitro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableInformacionDeArbitro.setGridColor(new java.awt.Color(255, 255, 255));
        jTableInformacionDeArbitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInformacionDeArbitroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableInformacionDeArbitro);

        phoneLbl3.setText("Instancia de Aceptacion");

        txtInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstanciaActionPerformed(evt);
            }
        });

        btnAceptarDemanda.setBackground(new java.awt.Color(18, 90, 173));
        btnAceptarDemanda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptarDemanda.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarDemanda.setText("Aceptar");
        btnAceptarDemanda.setBorderPainted(false);
        btnAceptarDemanda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptarDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarDemandaActionPerformed(evt);
            }
        });

        header2.setBackground(new java.awt.Color(25, 118, 210));
        header2.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");

        lblEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Nombres");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo");

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(116, 116, 116)
                .addComponent(jLabel5)
                .addGap(124, 124, 124))
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lblEstado))
                .addContainerGap())
        );

        javax.swing.GroupLayout bgGroundLayout = new javax.swing.GroupLayout(bgGround);
        bgGround.setLayout(bgGroundLayout);
        bgGroundLayout.setHorizontalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgGroundLayout.createSequentialGroup()
                                .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                                .addComponent(phoneLbl4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(phoneLbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdEstadoDemanda, 0, 157, Short.MAX_VALUE)
                            .addComponent(cmbAsignacionArbitro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgGroundLayout.createSequentialGroup()
                        .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnAceptarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgGroundLayout.createSequentialGroup()
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgGroundLayout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addComponent(domLbl1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbArbitro1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgGroundLayout.createSequentialGroup()
                            .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bgGroundLayout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(domLbl2)
                                    .addGap(16, 16, 16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(phoneLbl3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        bgGroundLayout.setVerticalGroup(
            bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgGroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(cmdEstadoDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAsignacionArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArbitro1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domLbl1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(domLbl2)
                    .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(bgGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLbl3)
                    .addComponent(txtInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnAceptarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEstadoDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEstadoDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdEstadoDemandaActionPerformed

    private void jTableInformacionDeArbitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInformacionDeArbitroMouseClicked


    }//GEN-LAST:event_jTableInformacionDeArbitroMouseClicked

    private void txtInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstanciaActionPerformed

    private void btnAceptarDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarDemandaActionPerformed

        MDemanda objDemandaAceptara = new MDemanda();
        objDemandaAceptara.setNroExpediente(txtNroExpediente.getText());
        objDemandaAceptara.setEstado((String) cmdEstadoDemanda.getSelectedItem());
        objDemandaAceptara.setDesignacionArbitro((String) cmbArbitro1.getSelectedItem());
        objDemandaAceptara.setDeclaracionesCompromiso(txtInstancia.getText());

        DDemanda dRDemanda = new DDemanda();

        System.out.println("Estado Editar " + editar);
        if (editar != false) {
            System.out.println("Editar Falso");
            int rta = dRDemanda.AsignarArbitro(objDemandaAceptara);

            if (rta == 1) {
                
                 java.util.Date fechaActual = new java.util.Date();
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                        String fecha = formato.format(fechaActual);
                        String sesion = SesionManager.cargarSesion("usuariosesion");

                        DNotificacion notifica = new DNotificacion();
                        MNotificacion notificacion = new MNotificacion();
                        notificacion.NroExpediente = objDemandaAceptara.getNroExpediente();
                        notificacion.EstadoNotificacion = (String) cmdEstadoDemanda.getSelectedItem();
                        notificacion.FechaNotificacion = Date.valueOf(fecha);
                        notificacion.Observaciones = txtInstancia.getText();
                        notificacion.Leida = 0;
                        notificacion.idUsuario = sesion;

                        int valor = notifica.AgregarNotificacion(notificacion);
                
                // Dashboard.ShowJPanel(new Demanda());
                JOptionPane.showMessageDialog(null, "Se Acepto Correctamente la Demanda");
            }
        }

    }//GEN-LAST:event_btnAceptarDemandaActionPerformed

    private void cmbArbitro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArbitro1ActionPerformed
        // TODO add your handling code here:
        String ArbitroSeleccionado = (String) cmbArbitro1.getSelectedItem();
        System.out.println("Arbitro seleccionado " + ArbitroSeleccionado);

        DRegPartes dregpartes = new DRegPartes();
        MRegPartes mireg = new MRegPartes();
        mireg.setNumDoc(ArbitroSeleccionado);

        List<MRegPartes> listRegpartes = new ArrayList<>();

        listRegpartes = dregpartes.SelectArbitrosBY_Document(mireg);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombres");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");

        jTableInformacionDeArbitro.setModel(modelo);

        String LArbritroForTable[] = new String[6];
        for (MRegPartes item : listRegpartes) {

            /*
             objPartes.setNumDoc(documento);
                objPartes.setApellidos(Apellidos);
                objPartes.setNombres(Nombres);
             */
            LArbritroForTable[0] = "" + item.getNumDoc();
            LArbritroForTable[1] = item.getApellidos();
            LArbritroForTable[2] = item.getNombres();

            //String valor = item.getEstadoNotificacion();
            modelo.addRow(LArbritroForTable);
        }

        jTableInformacionDeArbitro.setModel(modelo);


    }//GEN-LAST:event_cmbArbitro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgGround;
    private javax.swing.JButton btnAceptarDemanda;
    private javax.swing.JComboBox<String> cmbArbitro;
    private javax.swing.JComboBox<String> cmbArbitro1;
    private javax.swing.JComboBox<String> cmbAsignacionArbitro;
    private javax.swing.JComboBox<String> cmdEstadoDemanda;
    private javax.swing.JLabel domLbl1;
    private javax.swing.JLabel domLbl2;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableInformacionDeArbitro;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneLbl1;
    private javax.swing.JLabel phoneLbl3;
    private javax.swing.JLabel phoneLbl4;
    private javax.swing.JTextField txtCuantia;
    private javax.swing.JTextField txtInstancia;
    private javax.swing.JTextField txtNroExpediente;
    // End of variables declaration//GEN-END:variables
}
