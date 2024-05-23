
package VistasPrincipales;

import Vistas.FrameRegAsisEmple;
import Vistas.IFormAsigHorario;
import Vistas.IFormEmpleados;
import Vistas.IFormGesPagos;
import Vistas.IFormInfo;
import Vistas.IFormPagos;
import Vistas.IFormVerAsistencia;
import Vistas.IFormVerHorarios;
import VistasPrincipales.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;

/**
 *
 * @author luism
 */
public class FramePrincipal extends javax.swing.JFrame {

    private JDesktopPane desktopPane;
    
    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1207, 664);
        getRootPane().setWindowDecorationStyle(javax.swing.JRootPane.FRAME); // Estilo de decoración para permitir el botón de cerrar
        desktopPane = new JDesktopPane();
        getContentPane().add(desktopPane);
        // Cambiar el color de fondo del menú
        UIManager.put("Menu.background", new javax.swing.plaf.ColorUIResource(255, 0, 0));
        // Cambiar el color de texto del menú
        UIManager.put("Menu.foreground", new javax.swing.plaf.ColorUIResource(255, 255, 255));
        // Volver a pintar el menú para que se reflejen los cambios
        jMenuBar1.updateUI();
        actualizarListas();
        verificarFecha();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRecordar = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AdvertenciaRoja.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 110));

        List1.setBackground(new java.awt.Color(153, 0, 0));
        List1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        List1.setFont(new java.awt.Font("Segoe UI Black", 1, 9)); // NOI18N
        List1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(List1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 330, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AdvertenciaAmarrilla.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 110));

        List2.setBackground(new java.awt.Color(153, 0, 0));
        List2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        List2.setFont(new java.awt.Font("Segoe UI Black", 1, 9)); // NOI18N
        List2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(List2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recordar.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 110));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtRecordar.setEditable(false);
        txtRecordar.setBackground(new java.awt.Color(153, 0, 0));
        txtRecordar.setColumns(20);
        txtRecordar.setFont(new java.awt.Font("Segoe UI Black", 1, 9)); // NOI18N
        txtRecordar.setForeground(new java.awt.Color(255, 255, 255));
        txtRecordar.setRows(5);
        txtRecordar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(txtRecordar);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 110));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 320, 150));

        btnActualizar.setBackground(new java.awt.Color(153, 0, 0));
        btnActualizar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar Notas");
        btnActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 190, 39));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 20, 830, 530));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoLogin.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

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
        jMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarSesionActionPerformed(evt);
            }
        });

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
        IFormVerHorarios IforVerHora= new IFormVerHorarios();
        jDesktopPane1.add(IforVerHora);
        IforVerHora.setVisible(true);
    }//GEN-LAST:event_jMItemInfoHorariosActionPerformed

    private void jMItemGestPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemGestPagosActionPerformed
        IFormGesPagos Idges = new IFormGesPagos();
        jDesktopPane1.add(Idges);
        Idges.setVisible(true);
    }//GEN-LAST:event_jMItemGestPagosActionPerformed

    private void jMItemVerPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemVerPagosActionPerformed
        IFormPagos IPagos = new IFormPagos();
        jDesktopPane1.add(IPagos);
        IPagos.setVisible(true);
    }//GEN-LAST:event_jMItemVerPagosActionPerformed

    private void jMItemGestEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemGestEmpleActionPerformed
        IFormEmpleados Iemple= new IFormEmpleados();
        jDesktopPane1.add(Iemple);
        Iemple.setVisible(true);
    }//GEN-LAST:event_jMItemGestEmpleActionPerformed

    private void jMItemVerAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemVerAsistenciasActionPerformed
        IFormVerAsistencia IforVerAsis= new IFormVerAsistencia();
        jDesktopPane1.add(IforVerAsis);
        IforVerAsis.setVisible(true);
    }//GEN-LAST:event_jMItemVerAsistenciasActionPerformed

    private void jMItemRegistrarAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemRegistrarAsistenciasActionPerformed
        FrameRegAsisEmple RegAsis = new FrameRegAsisEmple();
        RegAsis.setVisible(true);
    }//GEN-LAST:event_jMItemRegistrarAsistenciasActionPerformed

    private void jMItemMiTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemMiTiendaActionPerformed
        IFormInfo IInfo = new IFormInfo();
        jDesktopPane1.add(IInfo);
        IInfo.setVisible(true);
    }//GEN-LAST:event_jMItemMiTiendaActionPerformed

    private void jMItemCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemCerrar1ActionPerformed
        dispose();
         Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMItemCerrar1ActionPerformed

    private void jMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCerrarSesionActionPerformed

    }//GEN-LAST:event_jMenuCerrarSesionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarListas();
        verificarFecha();
    }//GEN-LAST:event_btnActualizarActionPerformed
     private void actualizarListas() {
        DefaultListModel<String> modelFaltantes = new DefaultListModel<>();
        DefaultListModel<String> modelSobrantes = new DefaultListModel<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", "root", "");

            // Consulta para obtener la cantidad de trabajadores por área
            String queryTrabajadores = "SELECT Area, COUNT(*) AS Total FROM trabajador GROUP BY Area";
            PreparedStatement pstmtTrabajadores = conn.prepareStatement(queryTrabajadores);
            ResultSet rsTrabajadores = pstmtTrabajadores.executeQuery();

            // Mapa para almacenar la cantidad de trabajadores por área
            HashMap<String, Integer> trabajadoresPorArea = new HashMap<>();

            while (rsTrabajadores.next()) {
                String area = rsTrabajadores.getString("Area");
                int totalTrabajadores = rsTrabajadores.getInt("Total");
                trabajadoresPorArea.put(area, totalTrabajadores);
            }

            // Consulta para obtener el PersonalMin y PersonalMax de cada área
            String queryPersonal = "SELECT Nombre, PersonalMin, PersonalMax FROM areas";
            PreparedStatement pstmtPersonal = conn.prepareStatement(queryPersonal);
            ResultSet rsPersonal = pstmtPersonal.executeQuery();

            boolean todoCorrectoFaltantes = true;
            boolean todoCorrectoSobrantes = true;

            while (rsPersonal.next()) {
                String area = rsPersonal.getString("Nombre");
                int personalMin = rsPersonal.getInt("PersonalMin");
                int personalMax = rsPersonal.getInt("PersonalMax");
                int totalTrabajadores = trabajadoresPorArea.getOrDefault(area, 0);

                if (totalTrabajadores < personalMin) {
                    int faltantes = personalMin - totalTrabajadores;
                    String mensaje = "Falta/n " + faltantes + " trabajador/es para el área " + area+"\n\n";
                    modelFaltantes.addElement(mensaje);
                    todoCorrectoFaltantes = false;
                }

                if (totalTrabajadores > personalMax) {
                    int sobrantes = totalTrabajadores - personalMax;
                    String mensaje = "Hay " + sobrantes + " trabajador/es sobrantes en el área " + area+"\n\n";
                    modelSobrantes.addElement(mensaje);
                    todoCorrectoSobrantes = false;
                }
            }

            if (todoCorrectoFaltantes) {
                modelFaltantes.addElement("TODO CORRECTO");
            }

            if (todoCorrectoSobrantes) {
                modelSobrantes.addElement("TODO CORRECTO");
            }

            List1.setModel(modelFaltantes);
            List2.setModel(modelSobrantes);

            rsTrabajadores.close();
            rsPersonal.close();
            pstmtTrabajadores.close();
            pstmtPersonal.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
     
        private void verificarFecha() {
    LocalDate fechaActual = LocalDate.now();
    DayOfWeek diaSemana = fechaActual.getDayOfWeek();
    int diaMes = fechaActual.getDayOfMonth();

    StringBuilder mensaje = new StringBuilder();

    if (diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY) {
        mensaje.append("-NO OLVIDAR GENERAR\nLOS HORARIOS PARA LA\nSEMANA ENTRANTE\n");
    }

    if (diaMes >= 28 && diaMes <= 31) {
        mensaje.append("-RECORDAR GENERAR\nPAGOS PARA CALCULAR\nBONIFICACIONES Y\nPENALIZACIONES");
    }

    if (mensaje.length() == 0) {
        mensaje.append("NO HAY RECORDATORIOS");
    }

    txtRecordar.setText(mensaje.toString());
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
    private javax.swing.JList<String> List1;
    private javax.swing.JList<String> List2;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtRecordar;
    // End of variables declaration//GEN-END:variables
}
