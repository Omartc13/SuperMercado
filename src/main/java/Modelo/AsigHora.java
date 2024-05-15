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

                for (String area : areas) {
                    //Prepara para cada area
                    try (PreparedStatement psEmpleados = con.prepareStatement(sqlEmpleados)) {
                        psEmpleados.setString(1, area);
                        try (ResultSet rsEmpleados = psEmpleados.executeQuery()) {
                            List<Integer> empleados = new ArrayList<>();
                            while (rsEmpleados.next()) {
                                empleados.add(rsEmpleados.getInt("DNI"));
                            }

                            // Dividir los empleados por turnos
                            int numEmpleados = empleados.size();//Obtiene el numero de empleados por area
                            int numTurnos = turnos.length;//Nro de Turnos
                            int empleadosPorTurno = numEmpleados / numTurnos;
                            int empleadosRestantes = numEmpleados % numTurnos;

                            try (PreparedStatement psAsiTurno = con.prepareStatement(sqlAsignarTurno)) {
                                int empleadoIndex = 0;
                                for (int i = 0; i < numTurnos; i++) {
                                    for (int j = 0; j < empleadosPorTurno + (i < empleadosRestantes ? 1 : 0); j++) {
                                        int dni = empleados.get(empleadoIndex++);
                                        psAsiTurno.setInt(1, dni);
                                        psAsiTurno.setString(2, fechaStr);
                                        psAsiTurno.setString(3, turnos[i]);
                                        psAsiTurno.setInt(4, 1); // id Tienda 1
                                        psAsiTurno.executeUpdate();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Algo pasó papu: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            if (con != null) try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    
    // Método para obtener todas las áreas
    private List<String> obtenerAreas() throws SQLException {
        List<String> areas = new ArrayList<>();
        String sql = "SELECT DISTINCT area FROM trabajador";
        try (
            Connection con = cn.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)
        ) {
            while (rs.next()) {
                areas.add(rs.getString("area"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener áreas: " + e.getMessage());
        }
        return areas;
    }
    
    public ArrayList<Horario> MostrarEmple(String area, String fecha) {
        
        ArrayList<Horario> lista = new ArrayList<>();
        Empleado emple;
        
        try {
            String sql = "SELECT trabajador.DNI, trabajador.Nombres, trabajador.ApellidoP, trabajador.Turno, trabajador.Area, horario.Fecha FROM trabajador "
                    + "INNER JOIN horario ON trabajador.DNI = horario.DNI WHERE trabajador.Area ='"+area+"' AND horario.Fecha ='"+fecha+"'";
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                emple = new Empleado();
                
                emple.setDNI(rs.getString("DNI"));
                emple.setNombres(rs.getString("Nombres"));
                emple.setApellidoP(rs.getString("ApellidoP"));
                emple.setApellidoM(rs.getString("ApellidoM"));
                emple.setTurno(rs.getString("Turno"));
                emple.setSueldoBase(rs.getDouble("SueldoBase"));
                emple.setFechaIngreso(rs.getDate("FechaIngreso"));
                emple.setArea(rs.getString("Area"));
                emple.setCargo(rs.getString("Cargo"));
                emple.setFechaIngreso(rs.getDate("Fecha"));
                //lista.add(emple);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return lista;
    }
    
        
    public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }
      
}
