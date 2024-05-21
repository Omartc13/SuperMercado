package Vistas;

import Modelo.Empleado;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luismps
 */
public class FrameGestionarPersonal extends javax.swing.JFrame {


    public FrameGestionarPersonal() {
        initComponents();
        setLocationRelativeTo(null);
        txtMin.setEditable(false);
        txtMax.setEditable(false);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboArea = new javax.swing.JComboBox<>();
        jComboTrabajadores = new javax.swing.JComboBox<>();
        btnCambiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtMax = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECCIONAR AREA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 35));

        jLabel3.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TRABAJADORES POR TURNO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 310, 35));

        jLabel5.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MÍNIMO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 35));

        jComboArea.setBackground(new java.awt.Color(255, 255, 255));
        jComboArea.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jComboArea.setForeground(new java.awt.Color(0, 0, 0));
        jComboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "RECEPCIÓN", "CAJAS", "LIMPIEZA", "SEGURIDAD", "ALMACEN", "COMIDAS", "PISO", "ADUANAS", "FRUTAS Y VERDURAS", "CARNICERÍA", "PANADERÍA" }));
        jComboArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jComboArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 210, 38));

        jComboTrabajadores.setBackground(new java.awt.Color(255, 255, 255));
        jComboTrabajadores.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        jComboTrabajadores.setForeground(new java.awt.Color(0, 0, 0));
        jComboTrabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboTrabajadores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jComboTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 210, 38));

        btnCambiar.setBackground(new java.awt.Color(153, 0, 0));
        btnCambiar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnCambiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiar.setText("Cambiar");
        btnCambiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, 39));

        jLabel1.setFont(new java.awt.Font("STXinwei", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR PERSONAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 550, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 449, 13));

        txtMin.setBackground(new java.awt.Color(255, 255, 255));
        txtMin.setFont(new java.awt.Font("STXinwei", 0, 36)); // NOI18N
        txtMin.setForeground(new java.awt.Color(0, 0, 0));
        txtMin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinKeyTyped(evt);
            }
        });
        jPanel1.add(txtMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, 60));

        jLabel9.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MÁXIMO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 35));

        btnGuardar.setBackground(new java.awt.Color(153, 0, 0));
        btnGuardar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 170, 39));

        btnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 170, 39));

        txtMax.setBackground(new java.awt.Color(255, 255, 255));
        txtMax.setFont(new java.awt.Font("STXinwei", 0, 36)); // NOI18N
        txtMax.setForeground(new java.awt.Color(0, 0, 0));
        txtMax.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaxKeyTyped(evt);
            }
        });
        jPanel1.add(txtMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 60));

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 170, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        try {
            // Obtener el número de trabajadores seleccionado
            int numTrabajadores = Integer.parseInt(jComboTrabajadores.getSelectedItem().toString());

            // Calcular los nuevos valores de PersonalMin y PersonalMax
            int nuevoMin = numTrabajadores * 3 + 3;
            int nuevoMax = numTrabajadores * 3 + 6;

            // Mostrar los nuevos valores en los campos de texto
            txtMin.setText(Integer.toString(nuevoMin));
            txtMax.setText(Integer.toString(nuevoMax));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Selecciona un número de trabajadores válido");
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void txtMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinKeyTyped

    }//GEN-LAST:event_txtMinKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            // Obtener el nombre del área seleccionada
            String nombreArea = jComboArea.getSelectedItem().toString();

            // Obtener los nuevos valores de PersonalMin y PersonalMax
            int nuevoMin = Integer.parseInt(txtMin.getText());
            int nuevoMax = Integer.parseInt(txtMax.getText());

            // Conectar a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", "root", "");

            // Actualizar los valores en la base de datos
            String queryUpdate = "UPDATE areas SET PersonalMin = ?, PersonalMax = ? WHERE Nombre = ?";
            PreparedStatement pstmtUpdate = conn.prepareStatement(queryUpdate);
            pstmtUpdate.setInt(1, nuevoMin);
            pstmtUpdate.setInt(2, nuevoMax);
            pstmtUpdate.setString(3, nombreArea);
            int rowsAffected = pstmtUpdate.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Cambios guardados exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar los cambios");
            }

            conn.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar los cambios");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            // Obtener el nombre del área seleccionada
            String nombreArea = jComboArea.getSelectedItem().toString();

            // Conectar a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", "root", "");

            // Consulta para obtener los datos del área
            String query = "SELECT PersonalMin, PersonalMax FROM areas WHERE Nombre = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombreArea);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Mostrar los valores en los campos de texto
                txtMin.setText(Integer.toString(rs.getInt("PersonalMin")));
                txtMax.setText(Integer.toString(rs.getInt("PersonalMax")));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el área especificada");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void LimpFrame() {

    }


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
            java.util.logging.Logger.getLogger(FrameGestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGestionarPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboArea;
    private javax.swing.JComboBox<String> jComboTrabajadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
