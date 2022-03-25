/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fco-j
 */
public abstract class Empleado extends Persona {

    protected String numSegSocial;
    protected double salario;

    public Empleado(String numSegSocial, double salario,
            String nombre, String apellidos) {

        super(nombre, apellidos);
        this.numSegSocial = numSegSocial;
        this.salario = salario;

    }

    public Empleado(String numSegSocial, double salario,
            String nombre, String apellidos, String numDNI, LocalDate fecCad) {

        super(nombre, apellidos, numDNI, fecCad);
        this.numSegSocial = numSegSocial;
        this.salario = salario;

    }

    public Empleado() {

        super();
        numSegSocial = RandomStringUtils.randomNumeric(9).toUpperCase();
        salario = 5688;

    }

    public abstract double calcularIRPF();

    //GETTERS Y SETTERS
    public String getNumSegSocial() {

        return numSegSocial;

    }

    public void setNumSegSocial(String numSegSocial) {

        this.numSegSocial = numSegSocial;

    }

    public double getSalario() {

        return salario;

    }

    public void setSalario(double salario) {

        this.salario = salario;

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

    public NIF getDni() {

        return dni;

    }

    @Override
    public String toString() {

        return super.toString() + "Como empleado, su nº de la "
                + "\nSeguridad Social es " + numSegSocial
                + "\nY su salario es de " + salario + '€';

    }

}
