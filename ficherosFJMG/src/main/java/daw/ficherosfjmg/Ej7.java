/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.ficherosfjmg;

import java.io.*;
import java.util.*;
import vugas.*;

/**
 *
 * @author fcoj
 */
public class Ej7 {

    // Método que se encarga de abrir el fichero de ruta "idFichero"
    // y carga los objetos Vehiculo en una lista, que devuelve
    public static ArrayList<Vehiculo> leerVugas(String idFichero) {

        ArrayList<Vehiculo> vugas = new ArrayList<>();
        FileInputStream fisfisfis;
        Vehiculo gato;

        try {
            fisfisfis = new FileInputStream(idFichero);

            // A partir del fichero anterior se crea el flujo para leer objetos
            // Estructura try-with-resources
            try (ObjectInputStream flujo = new ObjectInputStream(fisfisfis)) {
                // Devuelve el número estimado de bytes que hay por leer
                // o cero si se ha alcanzado el final del fichero
                while (fisfisfis.available() > 0) {
                    // Se hace un casting explícito del objeto devuelto
                    // por readObject()
                    gato = (Vehiculo) flujo.readObject();
                    // Añade el objeto a la lista
                    vugas.add(gato);
                }

            } catch (ClassNotFoundException | IOException e) { // Multicatch
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("EL fichero a leer no existe.");
        }

        return vugas;

    }

    public static void main(String[] args) {

        ArrayList<Vehiculo> vugas = leerVugas("ej4-1.txt");
        vugas.forEach(System.out::println);

    }
    
}
