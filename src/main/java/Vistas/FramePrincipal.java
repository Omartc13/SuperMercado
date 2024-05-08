/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import VistasInternas.AsignaciónHorarios;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author luism
 */
public class FramePrincipal extends javax.swing.JFrame {

    private JDesktopPane desktopPane;

    public FramePrincipal() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        desktopPane = new JDesktopPane();
        getContentPane().add(desktopPane);
        // Cambiar el color de fondo del menú
        UIManager.put("Menu.background", new javax.swing.plaf.ColorUIResource(255, 0, 0));
        // Cambiar el color de texto del menú
        UIManager.put("Menu.foreground", new javax.swing.plaf.ColorUIResource(255, 255, 255));
        // Volver a pintar el menú para que se reflejen los cambios
        jMenuBar1.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHorarios = new javax.swing.JMenu();
        jMItemAsigHorarios = new javax.swing.JMenuItem();
        jMItemInfoHorarios = new javax.swing.JMenuItem();
        jMenuPagos = new javax.swing.JMenu();
        jMItemGestPagos = new javax.swing.JMenuItem();
        jMItemVerPagos = new javax.swing.JMenuItem();
        jMenuEmpleados = new javax.swing.JMenu();
        jMItemGestEmple = new javax.swing.JMenuItem();
        jMenuAsistencia = new javax.swing.JMenu();
        jMItemVerAsistencias = new javax.swing.JMenuItem();
        jMItemRegistrarAsistencias = new javax.swing.JMenuItem();
        jMenuMitienda = new javax.swing.JMenu();
        jMItemMiTienda = new javax.swing.JMenuItem();
        jMenuCerrarSesion = new javax.swing.JMenu();
        jMItemCerrar1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 64, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("STXinwei", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ANUNCIO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("STXinwei", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ANUNCIO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 204, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("STXinwei", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ANUNCIO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 386, 318, -1));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 20, 785, 530));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoLogin.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setAlignmentX(2.5F);

        jMenuHorarios.setBackground(new java.awt.Color(255, 0, 0));
        jMenuHorarios.setBorder(null);
        jMenuHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HorarioLogo 1.png"))); // NOI18N
        jMenuHorarios.setText("HORARIOS");
        jMenuHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuHorarios.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemAsigHorarios.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemAsigHorarios.setText("Asignación de horarios");
        jMItemAsigHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemAsigHorariosActionPerformed(evt);
            }
        });
        jMenuHorarios.add(jMItemAsigHorarios);

        jMItemInfoHorarios.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemInfoHorarios.setText("Ver horarios");
        jMItemInfoHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemInfoHorariosActionPerformed(evt);
            }
        });
        jMenuHorarios.add(jMItemInfoHorarios);

        jMenuBar1.add(jMenuHorarios);

        jMenuPagos.setBackground(new java.awt.Color(255, 0, 0));
        jMenuPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagos.png"))); // NOI18N
        jMenuPagos.setText("PAGOS");
        jMenuPagos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemGestPagos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemGestPagos.setText("Gestionar pagos");
        jMItemGestPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemGestPagosActionPerformed(evt);
            }
        });
        jMenuPagos.add(jMItemGestPagos);

        jMItemVerPagos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemVerPagos.setText("Ver pagos");
        jMItemVerPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemVerPagosActionPerformed(evt);
            }
        });
        jMenuPagos.add(jMItemVerPagos);

        jMenuBar1.add(jMenuPagos);

        jMenuEmpleados.setBackground(new java.awt.Color(255, 0, 0));
        jMenuEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emple.png"))); // NOI18N
        jMenuEmpleados.setText("EMPLEADOS");
        jMenuEmpleados.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemGestEmple.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemGestEmple.setText("Gestionar empleados");
        jMItemGestEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemGestEmpleActionPerformed(evt);
            }
        });
        jMenuEmpleados.add(jMItemGestEmple);

        jMenuBar1.add(jMenuEmpleados);

        jMenuAsistencia.setBackground(new java.awt.Color(255, 0, 0));
        jMenuAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asistencia.png"))); // NOI18N
        jMenuAsistencia.setText("ASISTENCIA");
        jMenuAsistencia.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemVerAsistencias.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemVerAsistencias.setText("Ver asistencias");
        jMItemVerAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemVerAsistenciasActionPerformed(evt);
            }
        });
        jMenuAsistencia.add(jMItemVerAsistencias);

        jMItemRegistrarAsistencias.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemRegistrarAsistencias.setText("Registrar asistencias");
        jMItemRegistrarAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemRegistrarAsistenciasActionPerformed(evt);
            }
        });
        jMenuAsistencia.add(jMItemRegistrarAsistencias);

        jMenuBar1.add(jMenuAsistencia);

        jMenuMitienda.setBackground(new java.awt.Color(255, 0, 0));
        jMenuMitienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        jMenuMitienda.setText("MI TIENDA");
        jMenuMitienda.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemMiTienda.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemMiTienda.setText("Gestionar tienda");
        jMItemMiTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemMiTiendaActionPerformed(evt);
            }
        });
        jMenuMitienda.add(jMItemMiTienda);

        jMenuBar1.add(jMenuMitienda);

        jMenuCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jMenuCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jMenuCerrarSesion.setText("CERRAR SESIÓN");
        jMenuCerrarSesion.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemCerrar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jMItemCerrar1.setText("Cerrar Sesión");
        jMItemCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemCerrar1ActionPerformed(evt);
            }
        });
        jMenuCerrarSesion.add(jMItemCerrar1);

        jMenuBar1.add(jMenuCerrarSesion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemAsigHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemAsigHorariosActionPerformed
        IFormAsigHorario IAHorario = new IFormAsigHorario();
        jDesktopPane1.add(IAHorario);
        IAHorario.setVisible(true);
    }//GEN-LAST:event_jMItemAsigHorariosActionPerformed

    private void jMItemInfoHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemInfoHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemInfoHorariosActionPerformed

    private void jMItemGestPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemGestPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemGestPagosActionPerformed

    private void jMItemVerPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemVerPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemVerPagosActionPerformed

    private void jMItemGestEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemGestEmpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemGestEmpleActionPerformed

    private void jMItemVerAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemVerAsistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemVerAsistenciasActionPerformed

    private void jMItemRegistrarAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemRegistrarAsistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemRegistrarAsistenciasActionPerformed

    private void jMItemMiTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemMiTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemMiTiendaActionPerformed

    private void jMItemCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemCerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMItemCerrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMItemAsigHorarios;
    private javax.swing.JMenuItem jMItemCerrar1;
    private javax.swing.JMenuItem jMItemGestEmple;
    private javax.swing.JMenuItem jMItemGestPagos;
    private javax.swing.JMenuItem jMItemInfoHorarios;
    private javax.swing.JMenuItem jMItemMiTienda;
    private javax.swing.JMenuItem jMItemRegistrarAsistencias;
    private javax.swing.JMenuItem jMItemVerAsistencias;
    private javax.swing.JMenuItem jMItemVerPagos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAsistencia;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCerrarSesion;
    private javax.swing.JMenu jMenuEmpleados;
    private javax.swing.JMenu jMenuHorarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMitienda;
    private javax.swing.JMenu jMenuPagos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
