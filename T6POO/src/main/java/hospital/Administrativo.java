/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;
import java.util.*;

/**
 *
 * @author fco-j
 */
public class Administrativo extends Empleado{
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numSegSocial,
            double salario, String nombre, String apellidos) {
        
        super(numSegSocial, salario, nombre, apellidos);
        this.grupo = grupo;
        
    }
    
    public Administrativo() {
                        
        super();
        
        Random rng = new Random();
        
        switch(rng.nextInt(3)){
            
            case 0:
                grupo = Grupo.C;
                break;
                
            case 1:
                grupo = Grupo.D;
                break;
                
            case 2:
                grupo = Grupo.E;
                break;
                
        }
        
    }
    
    @Override
    public double calcularIRPF() {//Método Abstracto
        
        return grupo.getIRPF();
        
    }
    
    public void registrarDoc(String nomDoc){
        
        System.out.printf("El administrativo " + nombre + apellidos);
        System.out.println(" ha registrado el documento " + nomDoc);
        System.out.println("HashCode: " + nomDoc.hashCode());
        
    }
    
    //GETTERS Y SETTERS:

    public Grupo getGrupo() {
        
        return grupo;
        
    }

    public void setGrupo(Grupo grupo) {
        
        this.grupo = grupo;
        
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

                   
}
