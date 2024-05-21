//package Modelo;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Boleta {
//    
//    // Método para obtener los registros de asistencia
//    public List<Asistencia> obtenerAsistencias(String fechaInicio, String fechaFin) {
//        List<Asistencia> asistencias = new ArrayList<>();
//        
//        String sql = "SELECT DNI, Puntualidad FROM asistencia WHERE FECHA BETWEEN ? AND ?";
//        
//        try (Connection con = ConexionBD.conectar();
//             PreparedStatement ps = con.prepareStatement(sql)) {
//            
//            ps.setString(1, fechaInicio);
//            ps.setString(2, fechaFin);
//            
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                String dni = rs.getString("DNI");
//                String puntualidad = rs.getString("Puntualidad");
//                
//                asistencias.add(new Asistencia(dni, puntualidad));
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        
//        return asistencias;
//    }
//    
//    // Método para obtener el sueldo base de un empleado por su DNI
//    public double obtenerSueldoBase(String dni) {
//        double sueldoBase = 0.0;
//        
//        String sql = "SELECT SueldoBase FROM trabajador WHERE DNI = ?";
//        
//        try (Connection con = ConexionBD.conectar();
//             PreparedStatement ps = con.prepareStatement(sql)) {
//            
//            ps.setString(1, dni);
//            
//            ResultSet rs = ps.executeQuery();
//            
//            if (rs.next()) {
//                sueldoBase = rs.getDouble("SueldoBase");
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        
//        return sueldoBase;
//    }
//    
//    // Método para calcular el sueldo final basado en la puntualidad
//    public double calcularSueldoFinal(String dni, List<Asistencia> asistencias) {
//        double sueldoBase = obtenerSueldoBase(dni);
//        double sueldoFinal = sueldoBase;
//        
//        for (Asistencia asistencia : asistencias) {
//            if (asistencia.getDni().equals(dni)) {
//                String puntualidad = asistencia.getPuntualidad();
//                
//                if ("Muy Puntual".equals(puntualidad)) {
//                    sueldoFinal += sueldoBase * 0.005;
//                } else if ("Tarde".equals(puntualidad)) {
//                    sueldoFinal -= sueldoBase * 0.005;
//                }
//            }
//        }
//        
//        return sueldoFinal;
//    }
//    
//    // Método para generar las boletas de pago para todos los empleados en un rango de fechas
//    public List<BoletaPago> generarBoletasPago(String fechaInicio, String fechaFin) {
//        List<BoletaPago> boletasPago = new ArrayList<>();
//        
//        List<Asistencia> asistencias = obtenerAsistencias(fechaInicio, fechaFin);
//        List<Empleado> empleados = new Empleado().MostrarEmple();
//        
//        for (Empleado empleado : empleados) {
//            String dni = empleado.getDNI();
//            double sueldoFinal = calcularSueldoFinal(dni, asistencias);
//            
//            BoletaPago boleta = new BoletaPago(dni, sueldoFinal);
//            boletasPago.add(boleta);
//        }
//        
//        return boletasPago;
//    }
//    
//    // Clase auxiliar para representar un registro de asistencia
//    public static class Asistencia {
//        private String dni;
//        private String puntualidad;
//        
//        public Asistencia(String dni, String puntualidad) {
//            this.dni = dni;
//            this.puntualidad = puntualidad;
//        }
//        
//        public String getDni() {
//            return dni;
//        }
//        
//        public String getPuntualidad() {
//            return puntualidad;
//        }
//    }
//    
//    // Clase auxiliar para representar una boleta de pago
//    public static class BoletaPago {
//        private String dni;
//        private double sueldoFinal;
//        
//        public BoletaPago(String dni, double sueldoFinal) {
//            this.dni = dni;
//            this.sueldoFinal = sueldoFinal;
//        }
//        
//        public String getDni() {
//            return dni;
//        }
//        
//        public double getSueldoFinal() {
//            return sueldoFinal;
//        }
//    }
//}
