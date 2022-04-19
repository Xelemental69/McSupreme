/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.tareavuelosfjmg;

import java.util.Objects;
import java.time.*;

/**
 *
 * @author fco-j
 */
public class Persona implements Comparable<Persona> {//CLASE A

    //Atributos de la clase:
    protected String nombre;
    protected String apellidos;
    protected NIF dni;

    public Persona(String nombre, String apellidos, String numDNI, LocalDate fecCad) {
        //Constructor parametrizado (incluido parámetros de NIF)

        this.nombre = nombre;
        this.apellidos = apellidos;
        dni = new NIF(numDNI);

    }

    public Persona(String nombre, String apellidos) {
        //Constructor parametrizado

        this.nombre = nombre;
        this.apellidos = apellidos;
        dni = new NIF();

    }

    public Persona() {

        nombre = "César";
        apellidos = "Carballo";
        dni = new NIF();

    }

    //GETTERS Y SETTERS:
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellidos);
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
        return Objects.equals(this.apellidos, other.apellidos);
    }

    public int compareTo(Persona h) {

        return this.nombre.compareTo(h.nombre);

    }

    @Override
    public String toString() {

        return "El nombre y apellidos de este sujeto son "
                + nombre + " " + apellidos + "\n" + dni;

    }

}
