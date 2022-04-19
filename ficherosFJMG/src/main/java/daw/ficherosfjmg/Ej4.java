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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "ej4.txt";//Archivo de texto a crear        
        ArrayList <Vehiculo> vugas = new ArrayList<>();
        
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        vugas.add(new Furgoneta());
        vugas.add(new Turismo());
        vugas.add(new Deportivo());
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for(Vehiculo v : vugas){
                
                //Escribe el valor de linea:
                flujo.write(v.getAtributos());
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
