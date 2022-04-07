/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ficherosfjmg;

/**
 *
 * @author fco-j
 */
import java.io.*;

public class Ej1 {

    public static void main(String[] args) {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "ej1.txt";

        // Array a escribir
        int numeros[][] = {{100, 101, 102, 103}, {200, 201, 202, 203},
            {300, 301, 302, 303}, {400, 401, 402, 403}};

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (int[] is : numeros) {
                for (int i : is) {
                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(i + "\t");
                }
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
