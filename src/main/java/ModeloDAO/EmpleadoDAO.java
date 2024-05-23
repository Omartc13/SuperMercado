/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import control.ConexionBD;
import Modelo.Empleado;
import static Modelo.Empleado.fechaActual;
import Modelo.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luism
 */
public class EmpleadoDAO {
    
    Connection con;
    ConexionBD cn = new ConexionBD();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public ArrayList<Empleado> MostrarEmpleSegunArea(String area){
        
        ArrayList<Empleado> lista = new ArrayList<>();
        Empleado emple;
        
        try {
            String sql="SELECT * FROM `trabajador` WHERE Area LIKE"+"'"+area+"';"; 
            con = cn.conectar();
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            
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
                emple.setCargo(rs.getString("cargo"));
                lista.add(emple);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ArrayList<Horario> obtenerHorariosPorAreaYFechas(String area, String fechaInicio, String fechaFin) {
    ArrayList<Horario> listaHorarios = new ArrayList<>();
    
    try {
        String sql = "SELECT trabajador.DNI, trabajador.Nombres, trabajador.ApellidoP, trabajador.ApellidoM, horario.Turno AS TurnoHorario, trabajador.SueldoBase, trabajador.FechaIngreso, trabajador.Area, trabajador.Cargo, horario.Fecha " +
                     "FROM trabajador INNER JOIN horario ON trabajador.DNI = horario.DNI " +
                     "WHERE trabajador.Area = ? AND horario.Fecha BETWEEN ? AND ?";
        
        con = cn.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, area);
        ps.setString(2, fechaInicio);
        ps.setString(3, fechaFin);
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            String dni = rs.getString("DNI");
            String nombres = rs.getString("Nombres");
            String apellidoP = rs.getString("ApellidoP");
            String apellidoM = rs.getString("ApellidoM");
            double sueldoBase = rs.getDouble("SueldoBase");
            Date fechaIngreso = rs.getDate("FechaIngreso");
            String cargo = rs.getString("Cargo");
            
            Empleado empleado = new Empleado(dni, nombres, apellidoP, apellidoM, "", sueldoBase, fechaIngreso, area, cargo);
            Date fechaHorario = rs.getDate("Fecha");
            String turnoHorario = rs.getString("TurnoHorario");
            
            Horario horario = new Horario(empleado, fechaHorario, turnoHorario);
            listaHorarios.add(horario);
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
    
    return listaHorarios;
}

    
    public ArrayList<Horario> obtenerHorariosPorAreaYFecha(String area, String fecha) {
    ArrayList<Horario> listaHorarios = new ArrayList<>();
    
    try {
        String sql = "SELECT trabajador.DNI, trabajador.Nombres, trabajador.ApellidoP, trabajador.ApellidoM, horario.Turno AS Turno, trabajador.SueldoBase, trabajador.FechaIngreso, trabajador.Area, trabajador.Cargo, horario.Fecha " +
             "FROM trabajador INNER JOIN horario ON trabajador.DNI = horario.DNI " +
             "WHERE trabajador.Area = ? AND horario.Fecha = ?";
        
        con = cn.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, area);
        ps.setString(2, fecha);
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            String dni = rs.getString("DNI");
            String nombres = rs.getString("Nombres");
            String apellidoP = rs.getString("ApellidoP");
            String apellidoM = rs.getString("ApellidoM");
            String turnoEmpleado = rs.getString("Turno");
            double sueldoBase = rs.getDouble("SueldoBase");
            Date fechaIngreso = rs.getDate("FechaIngreso");
            String cargo = rs.getString("Cargo");
            
            
            Empleado empleado = new Empleado(dni, nombres, apellidoP, apellidoM, turnoEmpleado, sueldoBase, fechaIngreso, area, cargo);
            Date fechaHorario = rs.getDate("Fecha");
            String turnoHorario = rs.getString("Turno");
            
            Horario horario = new Horario(empleado, fechaHorario, turnoHorario);
            listaHorarios.add(horario);
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
    
    return listaHorarios;
}

    
    
    public boolean validarAdmin(String usuario, String contrasena) {
        try {
            Connection conexion = ConexionBD.conectar();
            String consulta = "SELECT * FROM administrador WHERE Usuario = ? AND Contraseña = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            ResultSet resultado = statement.executeQuery();

            if (resultado.next()) {
                // Si hay resultados, las credenciales son válidas
                ConexionBD.desconectar(conexion);
                return true;
            }

            ConexionBD.desconectar(conexion);
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
    
}
