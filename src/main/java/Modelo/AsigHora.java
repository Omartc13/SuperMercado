package Modelo;

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


public class AsigHora {
    
    Connection con;
    ConexionBD cn = new ConexionBD();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public void AsignarTurnos(String fechaInicioStr, String fechaFinStr) throws SQLException {
        String[] turnos = {"mañana", "tarde", "noche"};
        List<String> areas = obtenerAreas(); // Método para obtener todas las áreas de la tabla

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, dateFormatter);
        LocalDate fechaFin = LocalDate.parse(fechaFinStr, dateFormatter);

        try {
            con = cn.conectar();
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
        } catch (SQLException ex) {
            Logger.getLogger(AsigHora.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
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
            Logger.getLogger(AsigHora.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AsigHora.class.getName()).log(Level.SEVERE, null, ex);
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
