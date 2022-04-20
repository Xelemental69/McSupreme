/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ficherosfjmg;

/**
 *
 * @author fcoj
 */
import java.io.*;
import java.util.*;

public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Fichero a leer
        String idFichero = "ej3.txt";

        // Variables para guardar los datos que se van leyendo
        int[] tokens = new int [75];
        int lineNum = 0;
        String linea;
        final int MAX = 75;//Máximo de líneas del archivo

        System.out.println("Leyendo el fichero: " + idFichero);
        
     // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){
            
            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(linea); // Se imprime en pantalla
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){

            System.out.println("Separando cada elemento del fichero: ");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                //tokens = linea.split(",");

                for (int i = 0; i < MAX; i++) {
                    
                    System.out.print(i + "-> Posición nº " + tokens[i]);
                    
                }

                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 

        
    }
    
}
