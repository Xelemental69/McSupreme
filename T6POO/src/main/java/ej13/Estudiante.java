/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author fco-j
 */
public class Estudiante extends Persona{
    
    private String alumnoID;

    public Estudiante(String alumnoID, String nombre, String apellidos,
            NIF nif, Direccion direccion) {
        
        super(nombre, apellidos, nif, direccion);
        this.alumnoID = alumnoID;
        
    }

    public Estudiante() {
        
        super();
        alumnoID = RandomStringUtils.randomNumeric(9).toUpperCase();
        
    }

    @Override
    public void identificate() {
        
        System.out.println("Esta persona es un estudiante");
        
    }

    public String getAlumnoID() {
        
        return alumnoID;
        
    }

    public void setAlumnoID(String alumnoID) {
        
        this.alumnoID = alumnoID;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getApellidos() {
        
        return apellidos;
        
    }

    public void setApellidos(String apellidos) {
        
        this.apellidos = apellidos;
        
    }

    public NIF getNif() {
        
        return nif;
        
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public Direccion getDireccion() {
        
        return direccion;
        
    }

    public void setDireccion(Direccion direccion) {
        
        this.direccion = direccion;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.alumnoID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        return Objects.equals(this.alumnoID, other.alumnoID);
    }
    
    public int compareTo(Estudiante a) {
        
        return this.alumnoID.compareTo(a.alumnoID);
    
    }

    @Override
    public String toString() {
        
        return super.toString() + "Como estudiante, su ID es " + alumnoID + '}';
    
    }
                    
}
