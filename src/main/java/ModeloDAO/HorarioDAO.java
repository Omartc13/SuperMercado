package ModeloDAO;

import control.ConexionBD;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class HorarioDAO {
    
    Connection con;
    ConexionBD cn = new ConexionBD();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    public void AsignarTurnos(String fechaInicioStr, String fechaFinStr) throws SQLException {
    // Verificar si ya existen horarios asignados para las fechas seleccionadas
    if (horariosAsignados(fechaInicioStr, fechaFinStr)) {
        JOptionPane.showMessageDialog(null, "Ya se asignaron horarios para las fechas seleccionadas.");
        return;
    }

    String[] turnos = {"mañana", "tarde", "noche"};
    List<String> areas = obtenerAreas(); // Método para obtener todas las áreas de la tabla

    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, dateFormatter);
    LocalDate fechaFin = LocalDate.parse(fechaFinStr, dateFormatter);

    try (Connection con = cn.conectar()) {
        String sqlEmpleados = "SELECT DNI FROM trabajador WHERE area = ?";
        String sqlAsignarTurno = "INSERT INTO horario (DNI, fecha, Turno, idTienda) VALUES (?, ?, ?, ?)";

        // Iterar sobre cada día en el rango de fechas
        for (LocalDate fecha = fechaInicio; !fecha.isAfter(fechaFin); fecha = fecha.plusDays(1)) {
            String fechaStr = fecha.format(dateFormatter);
            int diaSemana = fecha.getDayOfWeek().getValue(); // Lunes = 1, Domingo = 7

            for (String area : areas) {
                try (PreparedStatement psEmpleados = con.prepareStatement(sqlEmpleados)) {
                    psEmpleados.setString(1, area);
                    try (ResultSet rsEmpleados = psEmpleados.executeQuery()) {
                        List<Integer> empleados = new ArrayList<>();
                        while (rsEmpleados.next()) {
                            empleados.add(rsEmpleados.getInt("DNI"));
                        }

                        int numEmpleados = empleados.size();
                        int numTurnos = turnos.length;
                        int empleadosPorTurno = numEmpleados / numTurnos;
                        int empleadosRestantes = numEmpleados % numTurnos;

                        try (PreparedStatement psAsiTurno = con.prepareStatement(sqlAsignarTurno)) {
                            int empleadoIndex = 0;
                            for (int i = 0; i < numTurnos; i++) {
                                for (int j = 0; j < empleadosPorTurno + (i < empleadosRestantes ? 1 : 0); j++) {
                                    int dni = empleados.get(empleadoIndex);
                                    int diaDescanso = (empleadoIndex % 7) + 1;

                                    if (diaSemana != diaDescanso) {
                                        psAsiTurno.setInt(1, dni);
                                        psAsiTurno.setString(2, fechaStr);
                                        psAsiTurno.setString(3, turnos[i]);
                                        psAsiTurno.setInt(4, 1); // id Tienda 1
                                        psAsiTurno.executeUpdate();
                                    }
                                    empleadoIndex++;
                                }
                            }
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Horarios asignados satisfactoriamente.");
    } catch (SQLException ex) {
        Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Ocurrió un error al asignar los horarios.");
    }
}    
    
    private boolean horariosAsignados(String fechaInicioStr, String fechaFinStr) throws SQLException {
    boolean horariosAsignados = false;

    try {
        con = cn.conectar();
        String sql = "SELECT COUNT(*) AS cantidad FROM horario WHERE fecha BETWEEN ? AND ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, fechaInicioStr);
        ps.setString(2, fechaFinStr);
        rs = ps.executeQuery();
        if (rs.next()) {
            int cantidad = rs.getInt("cantidad");
            horariosAsignados = cantidad > 0;
        }
    } finally {
        // Cerrar recursos
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (con != null) con.close();
    }

    return horariosAsignados;
}

    // Método para obtener todas las áreas de la tabla 'trabajador'
    private List<String> obtenerAreas() {
        List<String> areas = new ArrayList<>();
        try {
            con = cn.conectar();
            String sql = "SELECT DISTINCT area FROM trabajador";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                areas.add(rs.getString("area"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return areas;
    
    } 
    
    public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }
    
}
