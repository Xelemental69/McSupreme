/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ficherosfjmg;

import java.io.*;
import java.util.*;

/**
 *
 * @author fco-j
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "ej2.txt";
        String linea = "";
        Scanner entry = new Scanner(System.in);

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            while (!linea.contains("EOF")) {
                
                    System.out.println("Introduce una linea: ");
                    linea = entry.nextLine();
                
                    flujo.write(linea);
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            
            System.out.println(e.getMessage());
            
        }

    }
            
}
