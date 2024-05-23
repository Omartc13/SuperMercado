package ModeloDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BoletaDAO {
    
    public static void buscarPagos(Date fechaInicio, Date fechaFinal, String area, JTable jTablePagos) {
        try {
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
    }
    public static void asignarPagos(Date fechaInicio, Date fechaFinal) {
    try {
        // Validar fechas seleccionadas
        if (fechaInicio == null || fechaFinal == null) {
            JOptionPane.showMessageDialog(null, "Selecciona ambas fechas", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que la fecha de inicio sea el primer día del mes y la fecha final el último día del mes
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaInicio);
        if (cal.get(Calendar.DAY_OF_MONTH) != 1) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser el primer día del mes", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        cal.setTime(fechaFinal);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (cal.get(Calendar.DAY_OF_MONTH) != maxDay) {
            JOptionPane.showMessageDialog(null, "La fecha final debe ser el último día del mes", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strFechaInicio = sdf.format(fechaInicio);
        String strFechaFinal = sdf.format(fechaFinal);

        // Conectar a la base de datos
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", "root", "");

        // Consulta de asistencias agrupadas por trabajador
        String queryAsistencias = "SELECT DNI, SUM(CASE WHEN Puntualidad = 'MUY PUNTUAL' THEN 1 ELSE 0 END) AS MuyPuntual, SUM(CASE WHEN Puntualidad = 'TARDANZA' THEN 1 ELSE 0 END) AS Tardanza FROM asistencia WHERE Fecha BETWEEN ? AND ? GROUP BY DNI";
        PreparedStatement pstmtAsistencias = conn.prepareStatement(queryAsistencias);
        pstmtAsistencias.setString(1, strFechaInicio);
        pstmtAsistencias.setString(2, strFechaFinal);
        ResultSet rsAsistencias = pstmtAsistencias.executeQuery();

        // Consulta para verificar existencia de pagos en las fechas seleccionadas
        String queryCheckBoleta = "SELECT COUNT(*) AS count FROM boleta WHERE DNI = ? AND FechaInicio = ? AND FechaFinal = ?";
        PreparedStatement pstmtCheckBoleta = conn.prepareStatement(queryCheckBoleta);

        // Consulta para obtener SueldoBase y Area desde Trabajador
        String queryTrabajador = "SELECT SueldoBase, Area FROM trabajador WHERE DNI = ?";

        // Consulta para insertar en Boleta
        String queryInsertBoleta = "INSERT INTO boleta (idBoleta, DNI, FechaInicio, FechaFinal, SueldoBruto) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmtInsertBoleta = conn.prepareStatement(queryInsertBoleta);

        // Obtener el último idBoleta
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT MAX(idBoleta) AS maxId FROM Boleta");
        int idBoleta = 1;
        if (rs.next()) {
            idBoleta = rs.getInt("maxId") + 1;
        }

        boolean pagosAsignados = false;

        while (rsAsistencias.next()) {
            String dni = rsAsistencias.getString("DNI");
            int muyPuntual = rsAsistencias.getInt("MuyPuntual");
            int tardanza = rsAsistencias.getInt("Tardanza");

            // Verificar si ya existen pagos asignados para las fechas y DNI
            pstmtCheckBoleta.setString(1, dni);
            pstmtCheckBoleta.setString(2, strFechaInicio);
            pstmtCheckBoleta.setString(3, strFechaFinal);
            ResultSet rsCheckBoleta = pstmtCheckBoleta.executeQuery();

            if (rsCheckBoleta.next() && rsCheckBoleta.getInt("count") > 0) {
                JOptionPane.showMessageDialog(null, "Ya se asignaron pagos para las fechas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
                conn.close();
                return;
            }

            PreparedStatement pstmtTrabajador = conn.prepareStatement(queryTrabajador);
            pstmtTrabajador.setString(1, dni);
            ResultSet rsTrabajador = pstmtTrabajador.executeQuery();

            if (rsTrabajador.next()) {
                double sueldoBase = rsTrabajador.getDouble("SueldoBase");
                String area = rsTrabajador.getString("Area");

                double sueldoBruto = calcularSueldoBruto(sueldoBase, muyPuntual, tardanza);

                pstmtInsertBoleta.setInt(1, idBoleta++);
                pstmtInsertBoleta.setString(2, dni);
                pstmtInsertBoleta.setString(3, strFechaInicio);
                pstmtInsertBoleta.setString(4, strFechaFinal);
                pstmtInsertBoleta.setDouble(5, sueldoBruto);

                pstmtInsertBoleta.executeUpdate();
                pagosAsignados = true;
            }
        }

        conn.close();
        
        if (pagosAsignados) {
            JOptionPane.showMessageDialog(null, "Pagos asignados y registrados exitosamente");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    private static double calcularSueldoBruto(double sueldoBase, int muyPuntual, int tardanza) {
    // Calcular bonificación o penalización basada en la puntualidad
    double bonificacionMuyPuntual = 0.005 * sueldoBase * muyPuntual; // 0.5% de bonificación por cada "MUY PUNTUAL"
    double penalizacionTardanza = 0.005 * sueldoBase * tardanza; // 0.5% de penalización por cada "TARDANZA"

    // Calcular sueldo bruto final
    double sueldoBruto = sueldoBase + bonificacionMuyPuntual - penalizacionTardanza;

    return sueldoBruto;
}
    
    
}
