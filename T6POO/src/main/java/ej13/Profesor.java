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
public class Profesor  extends Persona{
    
        private String profID;

    public Profesor(String alumnoID, String nombre, String apellidos,
            NIF nif, Direccion direccion) {
        
        super(nombre, apellidos, nif, direccion);
        this.profID = alumnoID;
        
    }

    public Profesor() {
        
        super();
        profID = RandomStringUtils.randomNumeric(5).toUpperCase();
        
    }

    @Override
    public void identificate() {
        
        System.out.println("Esta persona es un profesor");
        
    }

    public String getProfID() {
        
        return profID;
        
    }

    public void setProfID(String profID) {
        
        this.profID = profID;
        
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
        hash = 37 * hash + Objects.hashCode(this.profID);
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
        final Profesor other = (Profesor) obj;
        return Objects.equals(this.profID, other.profID);
    }

    public int compareTo(Profesor p) {
        
        return this.profID.compareTo(p.profID);
    
    }
    
    

    @Override
    public String toString() {
        
        return super.toString() + "Como profesor, su ID es " + profID + '}';
    
    }
                    
}
