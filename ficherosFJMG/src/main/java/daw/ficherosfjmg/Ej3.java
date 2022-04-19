/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ficherosfjmg;

import org.apache.commons.lang3.RandomStringUtils;
import java.io.*;
import java.util.*;

/**
 *
 * @author fco-j
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "ej3.txt";//Archivo de texto a crear
        String linea = "";
        Random entry = new Random();
        final int MAX = 75;//Máximo de líneas del archivo

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for(int i = 0; i < MAX; i++){                
                                
                while(!(linea.contains("g") && linea.contains("G"))){
            
                    if(entry.nextBoolean()){

                        linea += RandomStringUtils.randomAlphabetic(1).toUpperCase() + ";";

                    }else{

                        linea += RandomStringUtils.randomAlphabetic(1).toLowerCase() + ";";

                    }
                    
                }
                
                //Escribe el valor de linea:
                flujo.write(linea);
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
                
                linea = "";
                
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
