/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_hospital;

/**
 *
 * @author fco-j
 */
import hospital.*;
import java.time.LocalDate;
import java.util.*;

public class GestionHospital {
    
    private Hospital hospital;

    public GestionHospital(Hospital hospital) {
        
        this.hospital = hospital;
        
    }
    
    public GestionHospital() {
        
        hospital = new Hospital();
        
    }
    
    //Métodos para generar un Médico, Paciente y Administrativo por defecto:
    
    public static Medico generarMedico(){
        
        return new Medico();
        
    }
    
    public static Paciente generarPaciente(){
        
        return new Paciente();
        
    }
    
    public static Administrativo generarPersonalPAS(){
        
        return new Administrativo();
        
    }

    //GETTER Y SETTER
    
    public Hospital getHospital() {
        
        return hospital;
        
    }

    public void setHospital(Hospital hospital) {
        
        this.hospital = hospital;
        
    }        
    
    public static void main(String[] args) {
        
        //Creamos un random:
        Random bingo = new Random();
        Medico m;//Nos servirá para probar el método tratar
        Paciente p;//Nos servirá para los métodos renovarDNI y tratar
        
        //Inicializamos una clase GestionHospital (y a su vez, una clase Hospital):
        GestionHospital gestion = new GestionHospital();
        
        //Contratamos dos médicos, uno por defecto y otro con parámetros:
        gestion.getHospital().contratarEmpleado(generarMedico());
        gestion.getHospital().contratarEmpleado(new Medico("Cirujano", "059742",
                5672, "Sandro", "Rey"));
                
        //Contratamos tres administrativos, uno por defecto y dos con parámetros:
        gestion.getHospital().contratarEmpleado(generarPersonalPAS());
        gestion.getHospital().contratarEmpleado(new Administrativo(Grupo.C, "059759",
                5672, "Pitoniso", "Chungo"));
        gestion.getHospital().contratarEmpleado(new Administrativo(Grupo.E, "059842",
                5672, "Estela", "Reinors"));
        
        for(Empleado e : gestion.getHospital().getTrabajadores()){
            
            //Mostramos los IRPFs de cada empleado:
            System.out.println("IRPF: " + e.calcularIRPF());;
            
        }
        
        System.out.println("");
        
        //Ingresamos 5 pacientes, uno por defecto y 4 con parámetros:
        gestion.getHospital().ingresarPaciente(generarPaciente());
        gestion.getHospital().ingresarPaciente(new Paciente("976535",
                "Antonio", "Recio"));
        gestion.getHospital().ingresarPaciente(new Paciente("998535",
                "Lola", "Pingas", "69696969", LocalDate.of(2027, 4, 1)));
        gestion.getHospital().ingresarPaciente(new Paciente("954545",
                "Paquirrín", "Pantojo"));
        gestion.getHospital().ingresarPaciente(new Paciente("213456",
                "Matías", "Pratz"));
        
        //Cogemos al azar un paciente
        p = gestion.getHospital().getPacientes().get(bingo.nextInt(5));        
        System.out.println(p);//Mostramos sus atributos en un toString 
        System.out.println("");
        p.renovarDNI(LocalDate.of(2036, 7, 29));//Renovamos el DNI con otra fecha
        System.out.println(p);//Mostramos de nuevo los atributos del paciente
        System.out.println("");
        
        if(bingo.nextBoolean()){//Elegimos al azar entre 2 médicos:
                                        
                m = new Medico("Cirujano", "059742",
                5672, "Sandro", "Rey");
                
        }else{
                                           
                m = generarMedico();
                                            
        }
        
        m.tratar(p, "Pancetamol");//Usamos el método tratar con el médico
        //y paciente escogidos
        
                
    }
    
}
