package com.dev.aed.arbitraje;


import com.dev.aed.arbitraje.Data.DAnexo;
import com.dev.aed.arbitraje.Data.DDemanda;
import com.dev.aed.arbitraje.Model.MAnexo;
import com.dev.aed.arbitraje.Model.MDemanda;
import com.dev.aed.arbitraje.Data.Tabla_PdfVO;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CargarArchivo extends javax.swing.JPanel {

    boolean editar = false;
    MDemanda demandaEditar;
     String ruta_archivo = "";
     Tabla_PdfVO tpdf = new Tabla_PdfVO();
       int id = -1;

    public CargarArchivo() {
        initComponents();
        InitStyles();
        setLayout(new java.awt.FlowLayout());
        
        
//        JFrame frame = new JFrame("File Chooser Example");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create a file chooser
//        JFileChooser chooser = new JFileChooser();
//
//        // Set the selection mode
//        chooser.setMultiSelectionEnabled(true);
//
//        // Show the file chooser
//        int result = chooser.showOpenDialog(frame);
//
//        // Process the result
//        if (result == JFileChooser.APPROVE_OPTION) {
//            // Get the selected files
//            File[] files = chooser.getSelectedFiles();
//
//            // Do something with the files
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }

    }
    //Sobreescritura

    public CargarArchivo(MDemanda mDemandaEdit) {
        System.out.println("Inicializando Cuenta CRUD" + mDemandaEdit);
        initComponents();
        editar = true;
        this.demandaEditar = mDemandaEdit;
        InitStyles();
      //  Mostrar(mDemandaEdit);

    }


    private void InitStyles() {

        if (demandaEditar != null) {

            System.out.println("InitStyles >>> " + demandaEditar);
        }
    }
    
    
    private void cargarArchivos() {
        JFileChooser fileChooser = new JFileChooser();
        
        // Configurar para permitir la selección múltiple
        fileChooser.setMultiSelectionEnabled(true);

        // Muestra el diálogo de selección de archivo
        int resultado = fileChooser.showOpenDialog(this);

        // Verifica si el usuario seleccionó archivos
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File[] archivosSeleccionados = fileChooser.getSelectedFiles();

            // Procesa los archivos seleccionados (en este caso, muestra las rutas)
            StringBuilder mensaje = new StringBuilder("Archivos seleccionados:\n");
            for (File archivo : archivosSeleccionados) {
                mensaje.append(archivo.getAbsolutePath()).append("\n");
            }
            JOptionPane.showMessageDialog(this, mensaje.toString());
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

        bg = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        txtNroExpediente = new javax.swing.JTextField();
        btnGuardarAdjunto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePDF = new javax.swing.JTable();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSeleccionarArchivo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setText("Numero De Expediente");

        btnGuardarAdjunto.setBackground(new java.awt.Color(18, 90, 173));
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
        jLabel2.setText("Cargar Anexos");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnSeleccionarArchivo.setText("Cargar Archivo");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardarAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAdjunto)
                    .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarTexto() {
       // txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
        //txtGlosa.setText(null);

    }

    private void btnGuardarAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAdjuntoActionPerformed
  
         String nroExpediente = txtNroExpediente.getText();

        File ruta = new File(ruta_archivo);
        if (nroExpediente.trim().length() != 0 && ruta_archivo.trim().length() != 0) {
            guardar_pdf(nroExpediente, ruta_archivo.trim(), ruta);
            tpdf.visualizar_PdfVO(jTablePDF, nroExpediente);
            ruta_archivo = "";
           
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
        

    }//GEN-LAST:event_btnGuardarAdjuntoActionPerformed

       public void guardar_pdf(String NroExpediente, String nombredocumento, File ruta) {
          
        MAnexo po = new MAnexo();
           DAnexo danexo= new DAnexo();
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
    
    
    
    
    
    
    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        // TODO add your handling code here:
         seleccionar_pdf();
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

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

     public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnSeleccionarArchivo.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardarAdjunto;
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePDF;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField txtNroExpediente;
    // End of variables declaration//GEN-END:variables
}
