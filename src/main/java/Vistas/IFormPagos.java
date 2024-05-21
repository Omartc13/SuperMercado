package Vistas;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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



public class IFormPagos extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    
    public IFormPagos() {
        initComponents();
        establecerColumnas();
    }

    private void establecerColumnas() {
        model = new DefaultTableModel();
        model.addColumn("idBoleta");
        model.addColumn("DNI");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Final");
        model.addColumn("Sueldo Bruto");
        jTablePagos.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePagos = new javax.swing.JTable();
        btnExportar = new javax.swing.JButton();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jDateFinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        jCBxFiltrar = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(826, 540));
        setPreferredSize(new java.awt.Dimension(826, 540));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePagos.setBackground(new java.awt.Color(255, 255, 255));
        jTablePagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTablePagos.setForeground(new java.awt.Color(0, 0, 0));
        jTablePagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jTablePagos.setFocusable(false);
        jTablePagos.setShowGrid(true);
        jTablePagos.getTableHeader().setResizingAllowed(false);
        jTablePagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablePagos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 770, 270));

        btnExportar.setBackground(new java.awt.Color(153, 0, 0));
        btnExportar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("Exportar");
        btnExportar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel2.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 130, 40));

        jDateInicio.setBackground(new java.awt.Color(255, 255, 255));
        jDateInicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jDateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, -1));

        jDateFinal.setBackground(new java.awt.Color(255, 255, 255));
        jDateFinal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jDateFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 170, -1));

        jLabel2.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DEL:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 26));

        jLabel3.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AL:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 26));

        jLabel4.setFont(new java.awt.Font("STXinwei", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ver Pagos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 6, -1, 49));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 61, 215, 10));

        btnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 130, 40));

        jCBxFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        jCBxFiltrar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        jCBxFiltrar.setForeground(new java.awt.Color(0, 0, 0));
        jCBxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "TODAS LAS AREAS", "RECEPCIÓN", "CAJAS", "LIMPIEZA", "SEGURIDAD", "ALMACEN", "COMIDAS", "PISO", "ADUANAS", "FRUTAS Y VERDURAS", "CARNICERÍA", "PANADERÍA" }));
        jCBxFiltrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jCBxFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         try {
        // Obtener fechas seleccionadas y filtro de área
        Date fechaInicio = jDateInicio.getDate();
        Date fechaFinal = jDateFinal.getDate();
        String area = jCBxFiltrar.getSelectedItem().toString();

        // Validar si se ha seleccionado un área
        if (area.equals("SELECCIONAR")) {
            JOptionPane.showMessageDialog(null, "Seleccione un área", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar fechas seleccionadas
        if (fechaInicio == null || fechaFinal == null) {
            JOptionPane.showMessageDialog(null, "Selecciona ambas fechas", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strFechaInicio = sdf.format(fechaInicio);
        String strFechaFinal = sdf.format(fechaFinal);

        // Conectar a la base de datos
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", "root", "");

        // Consulta de pagos en la tabla Boleta
        String queryPagos;
        PreparedStatement pstmtPagos;

        if (area.equals("TODAS LAS AREAS")) {
            queryPagos = "SELECT idBoleta, FechaInicio, FechaFinal, SueldoBruto, DNI FROM boleta WHERE FechaInicio BETWEEN ? AND ?";
            pstmtPagos = conn.prepareStatement(queryPagos);
            pstmtPagos.setString(1, strFechaInicio);
            pstmtPagos.setString(2, strFechaFinal);
        } else {
            queryPagos = "SELECT idBoleta, FechaInicio, FechaFinal, SueldoBruto, DNI FROM boleta WHERE FechaInicio BETWEEN ? AND ? AND DNI IN (SELECT DNI FROM trabajador WHERE Area = ?)";
            pstmtPagos = conn.prepareStatement(queryPagos);
            pstmtPagos.setString(1, strFechaInicio);
            pstmtPagos.setString(2, strFechaFinal);
            pstmtPagos.setString(3, area);
        }

        ResultSet rsPagos = pstmtPagos.executeQuery();

        // Limpiar tabla
        DefaultTableModel model = (DefaultTableModel) jTablePagos.getModel();
        model.setRowCount(0);

        // Llenar tabla con resultados
        boolean hasResults = false;
        while (rsPagos.next()) {
            hasResults = true;
            int idBoleta = rsPagos.getInt("idBoleta");       
            String fechaInicioPagos = rsPagos.getString("FechaInicio");
            String fechaFinalPagos = rsPagos.getString("FechaFinal");
            double sueldoBruto = rsPagos.getDouble("SueldoBruto");
            String dni = rsPagos.getString("DNI");

            model.addRow(new Object[]{idBoleta, dni, fechaInicioPagos, fechaFinalPagos, sueldoBruto});
        }

        if (!hasResults) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros para los criterios seleccionados", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al realizar la búsqueda en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            exportarExcel(jTablePagos);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JComboBox<String> jCBxFiltrar;
    private com.toedter.calendar.JDateChooser jDateFinal;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePagos;
    // End of variables declaration//GEN-END:variables
}
