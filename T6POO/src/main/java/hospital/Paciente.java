/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;
import java.time.LocalDate;
import java.util.*;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fco-j
 */
public class Paciente extends Persona{
    
    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos) {
        
        super(nombre, apellidos);
        this.numeroHistoria = numeroHistoria;
    
    }

    public Paciente(String numeroHistoria, String nombre,
            String apellidos, String numDNI, LocalDate fecCad) {
        
        super(nombre, apellidos, numDNI, fecCad);
        this.numeroHistoria = numeroHistoria;
        
    }
    
    public Paciente(){
        
        super();
        numeroHistoria = RandomStringUtils.randomNumeric(6).toUpperCase();
        
    }
    
    public void tomarMedicina(String medicina){
        
        Random r = new Random();
        boolean curado = r.nextBoolean();
        
        System.out.println(curado ? "El paciente se ha curado con la medicina"
                : "El paciente NO se ha curado con la medicina");
        
    }

    public String getNumeroHistoria() {
        
        return numeroHistoria;
        
    }

    public void setNumeroHistoria(String numeroHistoria) {
        
        this.numeroHistoria = numeroHistoria;
        
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
        
        return super.toString() + "\nComo paciente, posee el "
                + "nº de histora " + numeroHistoria;
        
    }    
        
}
