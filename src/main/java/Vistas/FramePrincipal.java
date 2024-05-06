/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import VistasInternas.AsignaciónHorarios;

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
    
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMItemAsigHorarios = new javax.swing.JMenuItem();
        jMItemInfoHorarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMItemGestPagos = new javax.swing.JMenuItem();
        jMItemVerPagos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMItemGestEmple = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMItemVerAsistencias = new javax.swing.JMenuItem();
        jMItemRegistrarAsistencias = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMItemMiTienda = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMItemCerrar1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoContenedor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 810, 560));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setAlignmentX(2.5F);

        jMenu2.setBackground(new java.awt.Color(0, 102, 102));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HorarioLogo 1.png"))); // NOI18N
        jMenu2.setText("HORARIOS");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemAsigHorarios.setBackground(new java.awt.Color(153, 204, 255));
        jMItemAsigHorarios.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemAsigHorarios.setForeground(new java.awt.Color(255, 255, 255));
        jMItemAsigHorarios.setText("Asignación de horarios");
        jMItemAsigHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemAsigHorariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMItemAsigHorarios);

        jMItemInfoHorarios.setBackground(new java.awt.Color(153, 204, 255));
        jMItemInfoHorarios.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemInfoHorarios.setForeground(new java.awt.Color(255, 255, 255));
        jMItemInfoHorarios.setText("Ver horarios");
        jMItemInfoHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemInfoHorariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMItemInfoHorarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 102, 102));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagos.png"))); // NOI18N
        jMenu3.setText("PAGOS");
        jMenu3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemGestPagos.setBackground(new java.awt.Color(153, 204, 255));
        jMItemGestPagos.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemGestPagos.setForeground(new java.awt.Color(255, 255, 255));
        jMItemGestPagos.setText("Gestionar pagos");
        jMItemGestPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemGestPagosActionPerformed(evt);
            }
        });
        jMenu3.add(jMItemGestPagos);

        jMItemVerPagos.setBackground(new java.awt.Color(153, 204, 255));
        jMItemVerPagos.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemVerPagos.setForeground(new java.awt.Color(255, 255, 255));
        jMItemVerPagos.setText("Ver pagos");
        jMItemVerPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemVerPagosActionPerformed(evt);
            }
        });
        jMenu3.add(jMItemVerPagos);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 102, 102));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emple.png"))); // NOI18N
        jMenu4.setText("EMPLEADOS");
        jMenu4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemGestEmple.setBackground(new java.awt.Color(153, 204, 255));
        jMItemGestEmple.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemGestEmple.setForeground(new java.awt.Color(255, 255, 255));
        jMItemGestEmple.setText("Gestionar empleados");
        jMItemGestEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemGestEmpleActionPerformed(evt);
            }
        });
        jMenu4.add(jMItemGestEmple);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 102, 102));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asistencia.png"))); // NOI18N
        jMenu5.setText("ASISTENCIA");
        jMenu5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemVerAsistencias.setBackground(new java.awt.Color(153, 204, 255));
        jMItemVerAsistencias.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemVerAsistencias.setForeground(new java.awt.Color(255, 255, 255));
        jMItemVerAsistencias.setText("Ver asistencias");
        jMItemVerAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemVerAsistenciasActionPerformed(evt);
            }
        });
        jMenu5.add(jMItemVerAsistencias);

        jMItemRegistrarAsistencias.setBackground(new java.awt.Color(153, 204, 255));
        jMItemRegistrarAsistencias.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemRegistrarAsistencias.setForeground(new java.awt.Color(255, 255, 255));
        jMItemRegistrarAsistencias.setText("Registrar asistencias");
        jMItemRegistrarAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemRegistrarAsistenciasActionPerformed(evt);
            }
        });
        jMenu5.add(jMItemRegistrarAsistencias);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(0, 102, 102));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        jMenu6.setText("MI TIENDA");
        jMenu6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemMiTienda.setBackground(new java.awt.Color(153, 204, 255));
        jMItemMiTienda.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemMiTienda.setForeground(new java.awt.Color(255, 255, 255));
        jMItemMiTienda.setText("Gestionar tienda");
        jMItemMiTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemMiTiendaActionPerformed(evt);
            }
        });
        jMenu6.add(jMItemMiTienda);

        jMenuBar1.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(0, 102, 102));
        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jMenu7.setText("CERRAR SESIÓN");
        jMenu7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jMItemCerrar1.setBackground(new java.awt.Color(153, 204, 255));
        jMItemCerrar1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMItemCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        jMItemCerrar1.setText("Cerrar Sesión");
        jMItemCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemCerrar1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMItemCerrar1);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemAsigHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemAsigHorariosActionPerformed

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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
