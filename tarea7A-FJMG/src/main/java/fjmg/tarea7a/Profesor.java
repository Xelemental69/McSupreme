/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fjmg.tarea7a;

/**
 *
 * @author pikac
 */
import java.time.*;

public class Profesor implements Comparable<Profesor> {

    private String nombre;
    private String apellidos;
    private String dni;
    private String puesto;
    private String fechaIni;
    private String fechaCese;
    private String telefono;
    private boolean evaluador;
    private boolean coordinador;

    public Profesor(String nombre, String apellidos, String dni, String puesto, String fechaIni, String fechaCese, String telefono, boolean evaluador, boolean coordinador) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.puesto = puesto;
        this.fechaIni = fechaIni;
        this.fechaCese = fechaCese;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;

    }

    public Profesor() {

        nombre = "";
        apellidos = "";
        dni = "";
        puesto = "";
        fechaIni = null;
        fechaCese = null;
        telefono = "";
        evaluador = false;
        coordinador = false;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(String fechaCese) {
        this.fechaCese = fechaCese;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public String toString() {
        return nombre + "," + apellidos
                + ", " + dni + "," + puesto + ","
                + fechaIni + "," + fechaCese + ","
                + telefono + "," + evaluador + "," + coordinador;
    }

    @Override
    // En este caso se utiliza el atributo NIF como criterio para
    // decidir que persona es anterior a otra
    public int compareTo(Profesor p) {
        return this.puesto.compareTo(p.puesto);
    }

}
