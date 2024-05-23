package Vistas;


import Modelo.Empleado;
import Modelo.Horario;
import ModeloDAO.EmpleadoDAO;
import ModeloDAO.HorarioDAO;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Omar Tc
 */
public class IFormAsigHorario extends javax.swing.JInternalFrame {

    HorarioDAO hora;
    DefaultTableModel model;
    public IFormAsigHorario() {
        initComponents();
        establecerColumnas();
        tblVerHorarios.setModel(model);
        for (int column = 0; column < tblVerHorarios.getColumnCount(); column++) {
            tblVerHorarios.setDefaultEditor(tblVerHorarios.getColumnClass(column), null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAsignar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jDateFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaInicio = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVerHorarios = new javax.swing.JTable();
        jComboAreas = new javax.swing.JComboBox<>();
        btnExportar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("STXinwei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Asignar horarios");

        jSeparator1.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnAsignar.setBackground(new java.awt.Color(153, 0, 0));
        btnAsignar.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignar.setText("Asignar");
        btnAsignar.setBorderPainted(false);
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscar.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jDateFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        jDateFechaFin.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Al:");

        jLabel3.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Del:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addComponent(jDateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblVerHorarios.setBackground(new java.awt.Color(255, 255, 255));
        tblVerHorarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblVerHorarios.setForeground(new java.awt.Color(0, 0, 0));
        tblVerHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Area", "Turno Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVerHorarios.setFocusable(false);
        tblVerHorarios.setGridColor(new java.awt.Color(0, 0, 0));
        tblVerHorarios.setShowGrid(true);
        tblVerHorarios.getTableHeader().setResizingAllowed(false);
        tblVerHorarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVerHorarios);

        jComboAreas.setBackground(new java.awt.Color(255, 255, 255));
        jComboAreas.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jComboAreas.setForeground(new java.awt.Color(0, 0, 0));
        jComboAreas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FILTRAR", "RECEPCIÓN", "CAJAS", "LIMPIEZA", "SEGURIDAD", "ALMACEN", "COMIDAS", "PISO", "ADUANAS", "FRUTAS Y VERDURAS", "CARNICERÍA", "PANADERÍA" }));
        jComboAreas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnExportar.setBackground(new java.awt.Color(153, 0, 0));
        btnExportar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("Exportar");
        btnExportar.setBorder(null);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        
    Date fechaInicio = jDateFechaInicio.getDate();
    Date fechaFin = jDateFechaFin.getDate();

  // Verificar si las fechas son nulas
  if (fechaInicio == null || fechaFin == null) {
    JOptionPane.showMessageDialog(rootPane, "Por favor, seleccione las fechas de inicio y fin.");
    return;
  }

  // Crear instancias de Calendar para las fechas seleccionadas
  Calendar calInicio = Calendar.getInstance();
  calInicio.setTime(fechaInicio);
  Calendar calFin = Calendar.getInstance();
  calFin.setTime(fechaFin);

  // Verificar si la fecha de inicio es un lunes y la fecha de fin es un domingo
  if (calInicio.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY || calFin.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
    JOptionPane.showMessageDialog(rootPane, "Se debe seleccionar un Lunes como fecha de inicio y un Domingo como fecha de fin para generar horarios.");
    return;
  }

  // Verificar si hay exactamente 7 días de diferencia
  long diff = calFin.getTimeInMillis() - calInicio.getTimeInMillis();
  long daysDiff = diff / (24 * 60 * 60 * 1000);
  if (daysDiff != 6) { // Deben ser exactamente 7 días de diferencia entre lunes y domingo (6 días en total)
    JOptionPane.showMessageDialog(rootPane, "El rango de fechas debe cubrir exactamente 7 días (de lunes a domingo de la misma semana).");
    return;
  }

  SimpleDateFormat formatoFec = new SimpleDateFormat("yyyy-MM-dd");
  String fechaini = formatoFec.format(fechaInicio);
  System.out.println(fechaini);
  String fechafin = formatoFec.format(fechaFin);
  System.out.println(fechafin);

  hora = new HorarioDAO();
  try {
    hora.AsignarTurnos(fechaini, fechafin);
    
  } catch (SQLException ex) {
    Logger.getLogger(IFormAsigHorario.class.getName()).log(Level.SEVERE, null, ex);
   
     } 
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
        try {
            exportarExcel(tblVerHorarios);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }        
    }//GEN-LAST:event_btnExportarActionPerformed

    public void exportarExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
    
    public void mostrarTabla() {
    Date fechaInicio = jDateFechaInicio.getDate();
    Date fechaFin = jDateFechaFin.getDate();
    if (jComboAreas.getSelectedIndex() == 0 || fechaInicio == null || fechaFin == null) {
        JOptionPane.showMessageDialog(rootPane, "Complete los campos");
    } else {
        // Obtener los horarios por área y rango de fechas
        String area = jComboAreas.getSelectedItem().toString();
        SimpleDateFormat formatoFec = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicioStr = formatoFec.format(fechaInicio);
        String fechaFinStr = formatoFec.format(fechaFin);

        Empleado empleado = new Empleado();
        ArrayList<Horario> horarios = empleado.obtenerHorariosPorAreaYFechas(area, fechaInicioStr, fechaFinStr);

        // Limpiar el modelo antes de agregar nuevas filas
        model.setRowCount(0);

        if (horarios.isEmpty()) {
            model.setRowCount(0);
            tblVerHorarios.setModel(model);
            JOptionPane.showMessageDialog(null, "No se encontraron horarios para el área " + area + " entre las fechas " + fechaInicioStr + " y " + fechaFinStr);
        } else {
            // Agregar cada horario al modelo de la tabla
            for (Horario horario : horarios) {
                String dni = horario.getEmpleado().getDNI();
                String nombres = horario.getEmpleado().getNombres() + " " + horario.getEmpleado().getApellidoP() + " " + horario.getEmpleado().getApellidoM();
                String fechaHorario = horario.getFecha().toString(); // Ajustar formato de fecha según sea necesario
                String turno = horario.getTurno();

                // Agregar fila al modelo
                model.addRow(new Object[]{dni, nombres, fechaHorario, turno});
            }
            tblVerHorarios.setModel(model);
        }
    }
}


    
     private void establecerColumnas() {

        model = new DefaultTableModel();
        model.addColumn("DNI");
        model.addColumn("Nombres");
        model.addColumn("Fecha");
        model.addColumn("Turno");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JComboBox<String> jComboAreas;
    private com.toedter.calendar.JDateChooser jDateFechaFin;
    private com.toedter.calendar.JDateChooser jDateFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblVerHorarios;
    // End of variables declaration//GEN-END:variables
}
