/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ext15fjmg;

/**
 *
 * @author fco-j
 */
import java.time.*;
import java.lang.*;
import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {

    //Variables de la clase:
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoria;
    public static final double SUELDO_MIN = 1707;

    public Trabajador(String nombre, String apellidos,
            LocalDate fechaNacimiento, CategoriaEmpleado categoria) {
        //Constructor parametrizado:
        
        

        if (!comprobarEdad(fechaNacimiento)) {
            //Si la comprobación da falso (edad < 16), lanza una excepción:

            throw new IllegalArgumentException("ERROR. No posee la edad suficiente.");

        }else{
            
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fechaNacimiento;
            this.categoria = categoria;
            
        }

    }

    public Trabajador(Trabajador trabajador) {
        //Constructor copia:

        this.nombre = trabajador.getNombre();
        this.apellidos = trabajador.getApellidos();
        this.fechaNacimiento = trabajador.getFechaNacimiento();
        this.categoria = trabajador.getCategoria();

    }

    private boolean comprobarEdad(LocalDate fecNac) {
        //Método que comprueba la edad:

        boolean edadMin16 = false;

        Period edad = Period.between(fecNac, LocalDate.now());

        if (edad.getYears() >= 16) {
            edadMin16 = true;
        }

        return edadMin16;

    }

    /*******GETTERS Y SETTERS************/
    
    public String getNombre() {

        return nombre;

    }

    public String getApellidos() {

        return apellidos;

    }

    public LocalDate getFechaNacimiento() {

        return fechaNacimiento;

    }

    public CategoriaEmpleado getCategoria() {

        return categoria;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;

    }

    public void setCategoria(CategoriaEmpleado categoria) {

        this.categoria = categoria;

    }
    
    /************************************/

    public double calcularSueldo() {
        //Método que calcula la suma del sueldo base y el extra por categoría: 
        
        double sueldo = SUELDO_MIN + categoria.getCOMPLEMENTO();

        return sueldo;

    }

    public static LocalDate fechaJubilacion(Trabajador trabajador) {
        //Método que devuelve la fecha de jubilación:
        
        LocalDate jubilacion = trabajador.getFechaNacimiento().plusYears(66);
        return jubilacion;

    }

    public String fechaJubilacionTxt(Trabajador trabajador) {
        //Método que devuelve la fecha de jubilación en forma de String:

        LocalDate jubilacion = fechaJubilacion(this);

        String diaSemana = "";
        String mes = "";

        switch (jubilacion.getDayOfWeek()) {

            case MONDAY:

                diaSemana = "Lunes";
                break;

            case TUESDAY:

                diaSemana = "Martes";
                break;

            case WEDNESDAY:

                diaSemana = "Miércoles";
                break;

            case THURSDAY:

                diaSemana = "Jueves";
                break;

            case FRIDAY:

                diaSemana = "Viernes";
                break;

            case SATURDAY:

                diaSemana = "Sábado";
                break;

            case SUNDAY:

                diaSemana = "Domingo";
                break;

        }

        switch (jubilacion.getMonthValue()) {

            case 1:

                mes = "Enero";
                break;

            case 2:

                mes = "Febrero";
                break;

            case 3:

                mes = "Marzo";
                break;

            case 4:

                mes = "Abril";
                break;

            case 5:

                mes = "Mayo";
                break;

            case 6:

                mes = "Junio";
                break;

            case 7:

                mes = "Julio";
                break;

            case 8:

                mes = "Agosto";
                break;

            case 9:

                mes = "Septiembre";
                break;

            case 10:

                mes = "Octubre";
                break;

            case 11:

                mes = "Noviembre";
                break;

            case 12:

                mes = "Diciembre";
                break;

        }

        return diaSemana + " " + jubilacion.getDayOfMonth() + " de "
                + mes + " de " + jubilacion.getYear();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellidos);
        hash = 47 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 47 * hash + Objects.hashCode(this.categoria);
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.categoria == other.categoria;
    }

    @Override
    public int compareTo(Trabajador t) {//Se compara por título

        return this.nombre.compareTo(t.nombre);

    }

    @Override
    public String toString() {
        return "\t" + apellidos + ", " + nombre
                + "\tF.Nac:" + fechaNacimiento
                + "\nCategoría: " + categoria.getNOMBRE_CAT()
                + "\nFecha Jubilación: " + fechaJubilacionTxt(this)
                + "\nSueldo actual: " + calcularSueldo() + '€';
    }

}
