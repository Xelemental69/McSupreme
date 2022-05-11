/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ej2.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author pikac
 */
public class NewMainEstadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        ArrayList<RegistroJSON> alumnado = mapeador.readValue(new File("calificacionesGrupo.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));
        //System.out.println("---- Catálogo de Alumnos, de parte de Sundowner ----");
//        for (RegistroJSON alumno : alumnado) {
//            
//            System.out.println(alumno);
//            
//        }
        
        Estadistica oacv = new Estadistica("OACV", alumnado);
        
        System.out.println("OACV: " + oacv);
        
    }
    
}
