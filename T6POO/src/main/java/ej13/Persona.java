/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public abstract class Persona implements Identificable, Comparable<Persona> {

    protected String nombre;
    protected String apellidos;
    protected NIF nif;
    protected Direccion direccion;

    public Persona(String nombre, String apellidos, NIF nif, Direccion direccion) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;

    }

    public Persona() {

        nombre = "Lorkshawn";
        apellidos = "Fallen Glory";
        nif = new NIF();
        direccion = new Direccion();

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
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellidos);
        hash = 17 * hash + Objects.hashCode(this.nif);
        hash = 17 * hash + Objects.hashCode(this.direccion);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override
    public int compareTo(Persona p) {
        
        return this.nombre.compareTo(p.nombre);
        
    }
        
    @Override
    public String toString() {

        return nombre + " " + apellidos + ", con el DNI " + nif
                + "\n Vive en la " + direccion;

    }

}
