/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.io.*;
import java.util.*;

/**
 *
 * @author pikac
 */
public class LecturaCSV {
    
    public static void main(String[] args) {
        
        
    // Fichero a leer con datos de ejemplo
        String idFichero = "nombresModulos.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        Map<String, String> modulos = new TreeMap<>();

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-3")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
                
                modulos.put(tokens[0], tokens[1]);                              
                
//                for (String parte : tokens) {
//                    
//                    System.out.print(parte + "\t");
//                    
//                }
//                System.out.println();
                
            }
            
            for (String key : modulos.keySet()) {
                
            System.out.println("" + key + " --> " + modulos.get(key));
            
        }
            
        } catch (FileNotFoundException e) {
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
