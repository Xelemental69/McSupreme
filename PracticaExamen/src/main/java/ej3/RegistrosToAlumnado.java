/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import ej2.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author pikac
 */
public class RegistrosToAlumnado {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        ArrayList <Alumnado> alumnados = new ArrayList<>();
        Alumnado aux;
        
        ArrayList<RegistroJSON> alumnado = mapeador.readValue(new File("calificacionesGrupo.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));
        System.out.println("---- Catálogo de Alumnos, de parte de Sundowner ----");
        for (RegistroJSON alumno : alumnado) {
            System.out.println(alumno);
            
            aux = new Alumnado(alumno.getAlumnoA());
            
            aux.getCalificaciones().put("OACV", alumno.getoACV());
            aux.getCalificaciones().put("EA", alumno.geteA());
            aux.getCalificaciones().put("TII", alumno.gettII());
            aux.getCalificaciones().put("TC", alumno.gettC());
            aux.getCalificaciones().put("ING", alumno.getiNG());
            aux.getCalificaciones().put("FOL", alumno.getfOL());
            aux.getCalificaciones().put("CEAC", alumno.getcEAC());
            
            alumnados.add(aux);
            
        }
        
        for(Alumnado tmp : alumnados){
            
            System.out.println("----------------------------------------------------------------");
            System.out.println("[" + tmp.getNomAlumno() + "]");
            
            for (String key : tmp.getCalificaciones().keySet()) {                
                
                System.out.printf("[" + key + ": " + tmp.getCalificaciones().get(key) + "]");                
            
            }
            
            System.out.println("\n----------------------------------------------------------------");
            
        }
        
    }
    
}
