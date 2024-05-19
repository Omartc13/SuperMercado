package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

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

    public boolean ValidadDNI(int dni) {

        String sql = "SELECT COUNT(*) FROM trabajador WHERE dni = ?";

        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1)>0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public void registrarAsistencia(int dni, String estado, LocalDate fecha, LocalTime hora){
        
        String sql = "INSERT INTO asistencia(DNI,FECHA,HoraLlegada,Puntualidad) VALUES(?,?,?,?)";
        
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, fecha.toString());
            ps.setString(3, hora.toString());
            ps.setString(4, estado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
