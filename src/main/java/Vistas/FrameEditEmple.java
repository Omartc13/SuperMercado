package Vistas;

import control.ConexionBD;
import Modelo.Empleado;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ModeloDAO.EmpleadoDAO;

/**
 *
 * @author Omar Tc
 */
public class FrameEditEmple extends javax.swing.JFrame {

    Empleado emple;
    EmpleadoDAO empled;
    Connection con;
    ConexionBD cn = new ConexionBD();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;

    public FrameEditEmple() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApePa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboArea = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboTurno = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtApeMa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateFecIngre = new com.toedter.calendar.JDateChooser();
        txtCargo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnEditarDNI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DNI:");

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 0, 0));
        txtDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRE:");

        txtApePa.setBackground(new java.awt.Color(255, 255, 255));
        txtApePa.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        txtApePa.setForeground(new java.awt.Color(0, 0, 0));
        txtApePa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtApePa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApePaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APELLIDO PATERNO:");

        jLabel5.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AREA:");

        jComboArea.setBackground(new java.awt.Color(255, 255, 255));
        jComboArea.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jComboArea.setForeground(new java.awt.Color(0, 0, 0));
        jComboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "RECEPCIÓN", "CAJAS", "LIMPIEZA", "SEGURIDAD", "ALMACEN", "COMIDAS", "PISO", "ADUANAS", "FRUTAS Y VERDURAS", "CARNICERÍA", "PANADERÍA" }));
        jComboArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtSueldo.setBackground(new java.awt.Color(255, 255, 255));
        txtSueldo.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(0, 0, 0));
        txtSueldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SUELDO:");

        jComboTurno.setBackground(new java.awt.Color(255, 255, 255));
        jComboTurno.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jComboTurno.setForeground(new java.awt.Color(0, 0, 0));
        jComboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mañana", "Tarde", "Noche" }));
        jComboTurno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TURNO:");

        btnEditar.setBackground(new java.awt.Color(153, 0, 0));
        btnEditar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setForeground(new java.awt.Color(153, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconBuscar.png"))); // NOI18N
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("STXinwei", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Empleado");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("STXinwei", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("APELLIDO MATERNO:");

        txtApeMa.setBackground(new java.awt.Color(255, 255, 255));
        txtApeMa.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        txtApeMa.setForeground(new java.awt.Color(0, 0, 0));
        txtApeMa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtApeMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeMaKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("FECHA DE INGRESO:");

        jDateFecIngre.setBackground(new java.awt.Color(255, 255, 255));
        jDateFecIngre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jDateFecIngre.setForeground(new java.awt.Color(0, 0, 0));
        jDateFecIngre.setDateFormatString("YYYY MM dd");
        jDateFecIngre.setEnabled(false);

        txtCargo.setBackground(new java.awt.Color(255, 255, 255));
        txtCargo.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(0, 0, 0));
        txtCargo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CARGO:");

        btnEditarDNI.setBackground(new java.awt.Color(153, 0, 0));
        btnEditarDNI.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnEditarDNI.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDNI.setText("Editar DNI");
        btnEditarDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEditarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApePa, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateFecIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtApeMa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEditarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboArea, 0, 237, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtSueldo)
                                    .addComponent(jLabel9)
                                    .addComponent(txtCargo))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApePa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateFecIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese DNI");
        } else {
            emple = new Empleado();

            int dni = Integer.parseInt(txtDNI.getText());
            emple = emple.BuscEmpleado(dni);

            if (emple != null) {
                txtNombres.setText(emple.getNombres());
                txtApePa.setText(emple.getApellidoP());
                txtApeMa.setText(emple.getApellidoM());
                TurnoEmple(emple.getTurno());
                txtSueldo.setText(String.valueOf(emple.getSueldoBase()));
                jDateFecIngre.setDate(emple.getFechaIngreso());
                AreaEmple(emple.getArea());
                txtCargo.setText(emple.getCargo());
            } else {
                LimpFrame();
                JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (CamposVacios()) {

        } else {
            int DNIant = Integer.parseInt(txtDNI.getText());
            emple.setDNI(String.valueOf(DNIant));
            emple.setNombres(txtNombres.getText());
            emple.setApellidoP(txtApePa.getText());
            emple.setApellidoM(txtApeMa.getText());
            emple.setTurno(jComboTurno.getSelectedItem().toString());
            emple.setSueldoBase(Double.parseDouble(txtSueldo.getText()));
            emple.setArea(jComboArea.getSelectedItem().toString());
            emple.setCargo(txtCargo.getText());

            //Recoge datos del JOption
            String usu = JOptionPane.showInputDialog("Escriba su usuario");
            String con = JOptionPane.showInputDialog("Escriba su contraseña");

            //Guarda Estado De ValidaciónAdmin
            boolean estAd = empled.validarAdmin(usu, con);

            //Verifica el usuario y contraseña del admin
            if (estAd) {

                boolean estado = emple.EditarEmple(DNIant);
                if (estado == true) {
                    JOptionPane.showMessageDialog(rootPane, "Datos Actualizados");
                    LimpFrame();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ocurrio un Error");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDNIActionPerformed

        if (CamposVacios()) {

        } else {
            int o = JOptionPane.showConfirmDialog(null, "¿Editar DNI del empleado?", "Actualizar DNI", JOptionPane.YES_NO_OPTION);
            if (o == 0) {
                boolean dniValido = false;
                do {
                    try {
                        //Obtiene dato de JOption
                        String DNINuevo = JOptionPane.showInputDialog("Ingrese DNI nuevo");
                        //Pasa a numero el valor ingresado
                        int nuevoDNI = Integer.parseInt(DNINuevo);

                        String sql = "UPDATE trabajador SET DNI=" + nuevoDNI + " Where DNI=" + txtDNI.getText();
                        con = cn.conectar();
                        ps = con.prepareStatement(sql);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "DNI actualizado a: " + nuevoDNI);

                        dniValido = true;

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error al actualizar DNI");
                    } catch (SQLException ex) {
                        Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } while (!dniValido && o != 0);
            }
        }
    }//GEN-LAST:event_btnEditarDNIActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        if (txtDNI.getText().length() >= 8) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApePaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApePaKeyTyped

    private void txtApeMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeMaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApeMaKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || c == '.' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    evt.consume(); // Ignorar la tecla si no es un dígito numérico o "."
                }
                if (c == '.' && txtSueldo.getText().contains(".")) {
                    evt.consume(); // Ignorar la tecla si ya hay un "." en el campo
                }
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void txtCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCargoKeyTyped

    //Metodo para colocar JcomboTurnoEmpleado
    public void TurnoEmple(String turn) {
        switch (turn) {
            case "Mañana" ->
                jComboTurno.setSelectedIndex(1);
            case "Tarde" ->
                jComboTurno.setSelectedIndex(2);
            case "Noche" ->
                jComboTurno.setSelectedIndex(3);
        }
    }

    //Metodo para colocar JcomboAreaEmpledo    
    public void AreaEmple(String Area) {
        switch (Area) {
            case "GERENCIA" ->
                jComboArea.setSelectedIndex(1);
            case "ADMINISTRACIÓN" ->
                jComboArea.setSelectedIndex(2);
            case "RECEPCIÓN" ->
                jComboArea.setSelectedIndex(3);
            case "CAJAS" ->
                jComboArea.setSelectedIndex(4);
            case "LIMPIEZA" ->
                jComboArea.setSelectedIndex(5);
            case "SEGURIDAD" ->
                jComboArea.setSelectedIndex(6);
            case "ALMACEN" ->
                jComboArea.setSelectedIndex(7);
            case "COMIDAS" ->
                jComboArea.setSelectedIndex(8);
            case "PISO" ->
                jComboArea.setSelectedIndex(9);
            case "ADUANAS" ->
                jComboArea.setSelectedIndex(10);
            case "FRUTAS Y VERDURAS" ->
                jComboArea.setSelectedIndex(11);
            case "CARNICERÍA" ->
                jComboArea.setSelectedIndex(12);
            case "PANADERÍA" ->
                jComboArea.setSelectedIndex(13);
        }
    }

    public void LimpFrame() {
        txtNombres.setText("");
        txtApePa.setText("");
        txtApeMa.setText("");
        txtDNI.setText("");
        txtSueldo.setText("");
        txtCargo.setText("");
        jComboArea.setSelectedIndex(0);
        jComboTurno.setSelectedIndex(0);
        jDateFecIngre.setDate(null);
    }

    public boolean CamposVacios() {

        if (txtDNI.getText().isEmpty() || txtNombres.getText().isEmpty() || txtApePa.getText().isEmpty() || txtApeMa.getText().isEmpty()
                || jComboTurno.getSelectedIndex() == 0 || txtSueldo.getText().isEmpty() || jComboArea.getSelectedIndex() == 0 || txtCargo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Complete los datos");
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameEditEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEditEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEditEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEditEmple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEditEmple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarDNI;
    private javax.swing.JComboBox<String> jComboArea;
    private javax.swing.JComboBox<String> jComboTurno;
    private com.toedter.calendar.JDateChooser jDateFecIngre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApeMa;
    private javax.swing.JTextField txtApePa;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
