
package Modelo;

import java.util.Date;

/**
 *
 * @author luism
 */
public class Boleta {
    
    private int id;
    private Date fechaini;
    private Date fechafin;
    private Double sueldoB;
    private int dni;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaini() {
        return fechaini;
    }

    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(Double sueldoB) {
        this.sueldoB = sueldoB;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    
}
