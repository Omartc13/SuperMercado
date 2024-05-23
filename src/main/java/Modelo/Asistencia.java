package Modelo;

import java.sql.Time;
import java.sql.Date;


/**
 *
 * @author Omar Tc
 */
public class Asistencia {


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

}
