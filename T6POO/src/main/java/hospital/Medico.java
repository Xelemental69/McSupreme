/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author fco-j
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numSegSocial,
            double salario, String nombre, String apellidos) {

        super(numSegSocial, salario, nombre, apellidos);
        this.especialidad = especialidad;

    }

    public Medico(String especialidad, String numSegSocial,
            double salario, String nombre, String apellidos,
            String numDNI, LocalDate fecCad) {

        super(numSegSocial, salario, nombre, apellidos, numDNI, fecCad);
        this.especialidad = especialidad;

    }

    public Medico() {

        super();

        especialidad = "Pediatra";

    }

    @Override
    public double calcularIRPF() {

        if (especialidad.equalsIgnoreCase("Cirujano")
                || especialidad.equalsIgnoreCase("Cirujía")) {

            return salario * 25 / 100;

        } else {

            return salario * 23.5 / 100;

        }

    }

    public void tratar(Paciente paciente, String medicina) {

        System.out.println("El médico " + nombre + " trata "
                + "a " + paciente.getNombre() + " con la medicina " + medicina);

        paciente.tomarMedicina(medicina);

    }

    //GETTERS Y SETTERS:
    public String getEspecialidad() {

        return especialidad;

    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;

    }

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

        return super.toString() + "Su especialidad como médico es " + especialidad;

    }

}
