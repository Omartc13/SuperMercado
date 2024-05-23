
package Modelo;

/**
 *
 * @author luism
 */
public class Tienda {
    
    
    private int id;
    private String nombre;
    private int numAreas;
    private String area; 
    private int PersonalMin;
    private int PersonalMax;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAreas() {
        return numAreas;
    }

    public void setNumAreas(int numAreas) {
        this.numAreas = numAreas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPersonalMin() {
        return PersonalMin;
    }

    public void setPersonalMin(int PersonalMin) {
        this.PersonalMin = PersonalMin;
    }

    public int getPersonalMax() {
        return PersonalMax;
    }

    public void setPersonalMax(int PersonalMax) {
        this.PersonalMax = PersonalMax;
    }
    
  
}
