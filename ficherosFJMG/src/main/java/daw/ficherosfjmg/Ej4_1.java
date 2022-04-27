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
public class Ej4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String route = "vehiculos.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(route))) {
            Concesionario concecionario = new Concesionario();
            for(Vehiculo vehiculo : concecionario.getVehiculos()){
                String numero = "";
                if(vehiculo instanceof Turismo){
                    numero="0";
                }else if(vehiculo instanceof Deportivo){
                    numero ="1";
                } else if(vehiculo instanceof Furgoneta){
                    numero="2";
                }

                bw.write(numero+"-"+vehiculo.getAtributos());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
