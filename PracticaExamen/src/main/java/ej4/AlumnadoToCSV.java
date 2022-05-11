/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

/**
 *
 * @author pikac
 */
import java.io.*;
import java.util.*;
import ej3.*;

public class AlumnadoToCSV {
    
    public static void main(String[] args) {
        
        Alumnado delia = new Alumnado("Delia Perez Caballero");
        
        delia.getCalificaciones().put("CEAC", "8");
        delia.getCalificaciones().put("EA", "8");
        delia.getCalificaciones().put("FOL", "6");
        delia.getCalificaciones().put("ING", "8");
        delia.getCalificaciones().put("OACV", "7");
        delia.getCalificaciones().put("TC", "10");
        delia.getCalificaciones().put("TII", "9");
        
        escribirTSV(delia);
        
    }
    
    public static void escribirTSV(Alumnado a){
        
        String idFichero = a.getNomAlumno().replace(" ", "") + ".tsv";
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            System.out.println("Generando el fichero...");
            //flujo.write("");
            //flujo.newLine();
                        
            
            for (String key : a.getCalificaciones().keySet()) {                

                flujo.write("[" + key + ": " + a.getCalificaciones().get(key) + "]"); 
                flujo.newLine();

            }
            
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
