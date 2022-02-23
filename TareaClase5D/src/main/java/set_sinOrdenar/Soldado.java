/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_sinOrdenar;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public class Soldado {

    private String nif;//DNI
    private String nombre;//Nombre
    private String apellido1;
    private String apellido2;//Apellidos
    private int edad;//Edad

    public Soldado(String nif, String nombre, String apellido1, String apellido2, int edad) {
        //Constructor que recoje los datos de los parámetros
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    /*public Soldado() { (No tiene mucho sentido un constructor por defecto en este caso)
        
        
        
    }*/

 /*--------------------------GETTERS Y SETTERS--------------------------------*/
    public String getNIF() {
        return nif;
    }

    public void setNIF(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*----------------------------HashCode&Equals---------------------------------*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nif);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellido1);
        hash = 59 * hash + Objects.hashCode(this.apellido2);
        hash = 59 * hash + this.edad;
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
        final Soldado other = (Soldado) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido1, other.apellido1)) {
            return false;
        }
        return Objects.equals(this.apellido2, other.apellido2);
    }

    /*-------------------------------TO STRING--------------------------------*/
    @Override
    public String toString() {
        return "Soldado {\n" + "NIF = " + nif + "\nNombre = " + nombre
                + "\nApellidos = " + apellido1 + " " + apellido2
                + "\nEdad = " + edad + "\n" + '}';
    }

}
