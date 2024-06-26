package Modelo;

import java.util.Date;

/**
 *
 * @author Omar Tc
 */
public class Horario {
    
    Empleado empleado;
    Date fecha;
    String turno;

    public Horario(Empleado empleado, Date fecha, String turno) {
        this.empleado = empleado;
        this.fecha = fecha;
        this.turno = turno;
    }

    
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
