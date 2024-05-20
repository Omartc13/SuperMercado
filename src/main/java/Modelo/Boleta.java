package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Boleta {
    private int idBoleta;
    private String DNI;
    private Date fechaInicio;
    private Date fechaFinal;
    private double sueldoBruto;

    public Boleta() {
        // Constructor por defecto
    }

    public Boleta(String dni, Date fechaInicio, Date fechaFinal, double sueldoBruto) {
        this.DNI = dni;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.sueldoBruto = sueldoBruto;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    // Método para calcular el sueldo bruto y registrar en la base de datos
    public void calcularSueldoBrutoYRegistrar(String fechaInicio, String fechaFinal) throws SQLException, ParseException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = ConexionBD.conectar();
            String sql = "SELECT DNI, SueldoBase, COUNT(CASE WHEN Puntualidad = 'MUY PUNTUAL' THEN 1 END) AS Puntualidad_MUY_PUNTUAL, COUNT(CASE WHEN Puntualidad = 'TARDANZA' THEN 1 END) AS Puntualidad_TARDANZA FROM Asistencia WHERE Fecha >= ? AND Fecha <= ? GROUP BY DNI, SueldoBase";
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaInicio);
            ps.setString(2, fechaFinal);
            rs = ps.executeQuery();

            while (rs.next()) {
                String dni = rs.getString("DNI");
                double sueldoBase = rs.getDouble("SueldoBase");
                int muyPuntualCount = rs.getInt("Puntualidad_MUY_PUNTUAL");
                int tardanzaCount = rs.getInt("Puntualidad_TARDANZA");

                double sueldoBruto = sueldoBase + (muyPuntualCount * (sueldoBase * 0.005)) - (tardanzaCount * (sueldoBase * 0.005));
                Boleta boleta = new Boleta(dni, new SimpleDateFormat("yyyy-MM-dd").parse(fechaInicio), new SimpleDateFormat("yyyy-MM-dd").parse(fechaFinal), sueldoBruto);
                agregarBoleta(boleta);
            }
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
    }

    // Método para agregar una boleta a la base de datos
    public void agregarBoleta(Boleta boleta) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConexionBD.conectar();
            String sql = "INSERT INTO Boleta (DNI, FechaInicio, FechaFinal, SueldoBruto) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, boleta.getDNI());
            ps.setDate(2, new java.sql.Date(boleta.getFechaInicio().getTime()));
            ps.setDate(3, new java.sql.Date(boleta.getFechaFinal().getTime()));
            ps.setDouble(4, boleta.getSueldoBruto());
            ps.executeUpdate();
        } finally {
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
    }

    // Método para obtener boletas por área y fechas
    public ArrayList<Boleta> obtenerBoletasPorAreaYFechas(String area, String fechaInicio, String fechaFinal) {
        ArrayList<Boleta> listaBoletas = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = ConexionBD.conectar();
            String sql = "SELECT b.*, e.Area FROM Boleta b JOIN Empleado e ON b.DNI = e.DNI WHERE e.Area = ? AND b.FechaInicio >= ? AND b.FechaFinal <= ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, area);
            ps.setString(2, fechaInicio);
            ps.setString(3, fechaFinal);
            rs = ps.executeQuery();

            while (rs.next()) {
                Boleta boleta = new Boleta();
                boleta.setIdBoleta(rs.getInt("idBoleta"));
                boleta.setDNI(rs.getString("DNI"));
                boleta.setFechaInicio(rs.getDate("FechaInicio"));
                boleta.setFechaFinal(rs.getDate("FechaFinal"));
                boleta.setSueldoBruto(rs.getDouble("SueldoBruto"));
                listaBoletas.add(boleta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Boleta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaBoletas;
    }
}
