package Modelo;

import control.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Empleado {
    
    Connection con;
    ConexionBD cn = new ConexionBD();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    
    private String DNI;
    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private String turno;
    private double sueldoBase;
    private Date fechaIngreso;
    private String area;
    private String cargo;
    

    // Constructor
    public Empleado(String DNI, String nombres, String apellidoP, String apellidoM, String turno, double sueldoBase, Date fechaIngreso, String area, String cargo) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.turno = turno;
        this.sueldoBase = sueldoBase;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
        
    }

    public Empleado() {
    }

    // Getters y Setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

        
    public static String fechaActual(){
        
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }
    
    public boolean AgregarEmple(Empleado em){
        
        try {
            String sql = "insert into trabajador (DNI,Nombres,ApellidoP,ApellidoM,Turno,SueldoBase,FechaIngreso,Area,Cargo)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            con = cn.conectar();
            ps= con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(getDNI()));
            ps.setString(2, getNombres());
            ps.setString(3, getApellidoP());
            ps.setString(4, getApellidoM());
            ps.setString(5, getTurno());
            ps.setDouble(6, getSueldoBase());
            ps.setString(7, fechaActual());
            ps.setString(8, getArea());
            ps.setString(9, getCargo());
            ps.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
    
    public Empleado BuscEmpleado(int DNI){
        
        Empleado emple = null;
        
        try {
            String sql="Select * from trabajador where DNI =?";
            con = cn.conectar();
            ps= con.prepareStatement(sql);
            ps.setInt(1, DNI);
            rs=ps.executeQuery();
            
            if (rs.next()) {
                emple=new Empleado();
                emple.setNombres(rs.getString(2));
                emple.setApellidoP(rs.getString(3));
                emple.setApellidoM(rs.getString(4));
                emple.setTurno(rs.getString(5));
                emple.setSueldoBase(rs.getDouble(6));
                emple.setFechaIngreso(rs.getDate(7));
                emple.setArea(rs.getString(8));
                emple.setCargo(rs.getString(9));
            }else{
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE,null,ex);
        }
        return emple;
    }
    
    public boolean DespedirEmple(int DNI){
        
        try {
            String sql="delete from trabajador where DNI=?";
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, DNI);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
    
    public boolean EditarEmple(int DNI){
        
        try {
            String sql="UPDATE trabajador SET Nombres = ?, ApellidoP = ?, ApellidoM = ?, Turno = ?, SueldoBase =? "
                    + ", Area =?, Cargo =? WHERE DNI="+DNI;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, getNombres());
            ps.setString(2, getApellidoP());
            ps.setString(3, getApellidoM());
            ps.setString(4, getTurno());
            ps.setDouble(5, getSueldoBase());
            ps.setString(6, getArea());
            ps.setString(7, getCargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
    
    public ArrayList<Empleado> MostrarEmple(){
        
        ArrayList<Empleado> lista = new ArrayList<>();
        Empleado emple;
        
        try {
            String sql="Select * from trabajador";
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
