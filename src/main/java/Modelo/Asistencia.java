package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Time;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Tc
 */
public class Asistencia {

    Connection con;
    ConexionBD cn = new ConexionBD();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    int DNI;
    Date FECHA;
    Time HoraLlegada;
    String puntualidad;

    public Asistencia(int DNI, Date FECHA, Time HoraLlegada, String puntualidad) {
        this.DNI = DNI;
        this.FECHA = FECHA;
        this.HoraLlegada = HoraLlegada;
        this.puntualidad = puntualidad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }

    public Time getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(Time HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public String getPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(String puntualidad) {
        this.puntualidad = puntualidad;
    }

    public Asistencia() {
        try {
            con = cn.conectar();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public boolean ValidadDNI(int dni) {
        String sql = "SELECT COUNT(*) FROM trabajador WHERE dni = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void registrarAsistencia(int dni) {
        if (!ValidadDNI(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI ingresado no es válido.");
            return;
        }

        String puntualidad = determinarPuntualidad();
        Time horaLlegada = Time.valueOf(LocalTime.now());
        Date fecha = Date.valueOf(LocalDate.now());

        String sql = "INSERT INTO asistencia (DNI, FECHA, HoraLlegada, Puntualidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, dni);
            stmt.setDate(2, fecha);
            stmt.setTime(3, horaLlegada);
            stmt.setString(4, puntualidad);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar la asistencia.");
        }
    }

    private String determinarPuntualidad() {
        String turno = determinarTurno();
        LocalTime horaActual = LocalTime.now();
        System.out.println(turno);
        switch (turno) {
            case "MAÑANA":
                if (horaActual.isBefore(LocalTime.of(5, 0))) {
                    return "MUY PUNTUAL";
                } else if (horaActual.isBefore(LocalTime.of(5, 10))) {
                    return "PUNTUAL";
                } else {
                    return "TARDANZA";
                }
            case "TARDE":
                if (horaActual.isBefore(LocalTime.of(11, 0))) {
                    return "MUY PUNTUAL";
                } else if (horaActual.isBefore(LocalTime.of(11, 10))) {
                    return "PUNTUAL";
                } else {
                    return "TARDANZA";
                }
            case "NOCHE":
                if (horaActual.isBefore(LocalTime.of(17, 0))) {
                    return "MUY PUNTUAL";
                } else if (horaActual.isBefore(LocalTime.of(17, 10))) {
                    return "PUNTUAL";
                } else {
                    return "TARDANZA";
                }
            default:
                return "ERROR";
        }
    }

    private String determinarTurno() {
        LocalTime horaActual = LocalTime.now();

        if ((horaActual.isAfter(LocalTime.of(4, 40)) || horaActual.equals(LocalTime.of(4, 40)))
                && (horaActual.isBefore(LocalTime.of(10, 40)))) {
            return "MAÑANA";
        } else if ((horaActual.isAfter(LocalTime.of(10, 40)) || horaActual.equals(LocalTime.of(10, 40)))
                && (horaActual.isBefore(LocalTime.of(16, 40)))) {
            return "TARDE";
        } else {
            return "NOCHE";
        }
    }

    public ArrayList<Asistencia> obtenerAsistenciasPorAreaYFechas(String area, String fechaInicioStr, String fechaFinStr) {
    ArrayList<Asistencia> listaAsistencias = new ArrayList<>();
    
    try {
        String sql = "SELECT asistencia.* FROM asistencia " +
                     "INNER JOIN trabajador ON asistencia.DNI = trabajador.DNI " +
                     "WHERE trabajador.Area = ? AND asistencia.FECHA BETWEEN ? AND ?";
        
        con = cn.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, area);
        ps.setString(2, fechaInicioStr);
        ps.setString(3, fechaFinStr);
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            int dni = rs.getInt("DNI");
            Date fecha = rs.getDate("FECHA");
            Time horaLlegada = rs.getTime("HoraLlegada");
            String puntualidad = rs.getString("Puntualidad");
            
            Asistencia asistencia = new Asistencia(dni, fecha, horaLlegada, puntualidad);
            listaAsistencias.add(asistencia);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Manejar la excepción apropiadamente
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    return listaAsistencias;
}

}
