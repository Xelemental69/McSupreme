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
        String[] tokens;
        int lineNum = 0;
        String linea;
        int posAct = 0;
        int posLinea = 0;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(linea); // Se imprime en pantalla
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            System.out.println("Buscando la cadena \"web\": ");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");

                for (String string : tokens) {

                    if (string.equalsIgnoreCase("b")
                            && tokens[(posAct - 1)].equalsIgnoreCase("e")
                            && tokens[(posAct - 2)].equalsIgnoreCase("w")) {

                        System.out.println("\"web\" encontrado (Posición "
                                + (posAct - 2) + " en la Linea " + posLinea + ')');

                    }

                    posAct++;

                }

                posAct = 0;
                posLinea++;

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            System.out.println("Buscando la cadena \"DIO\": ");
            posLinea = 0;

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador punto y coma
                tokens = linea.split(";");

                for (posAct = 0; posAct < tokens.length; posAct++) {

                    if (tokens[posAct].equalsIgnoreCase("d")
                            && tokens[(posAct + 1)].equalsIgnoreCase("i")
                            && tokens[(posAct + 2)].equalsIgnoreCase("o")) {

                        System.out.println("\"DIO\" encontrado (Posición "
                                + posAct + " en la Linea " + posLinea + ')'
                                +   "\n\tWRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");

                    }

                }

                posLinea++;

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}

/*

*/