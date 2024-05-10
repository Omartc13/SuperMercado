package Modelo;

import java.util.Date;

public class Empleado {
    private String DNI;
    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private String turno;
    private double sueldoBase;
    private Date fechaIngreso;
    private String area;
    private String cargo;
    private String tipoHorario;

    // Constructor
    public Empleado(String DNI, String nombres, String apellidoP, String apellidoM, String turno, double sueldoBase, Date fechaIngreso, String area, String cargo, String tipoHorario) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.turno = turno;
        this.sueldoBase = sueldoBase;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
        this.tipoHorario = tipoHorario;
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

    public String getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }
}
