/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.mavenproject1;



/**
 *
 * @author fco-j
 */
import java.util.*;
public class Sanic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kars = new Scanner(System.in);
        double kachow;
        boolean permitemeQueInsista;

        do {
            try {

                System.out.println("Introduzca velocidad en Km/h: ");
                kachow = kars.nextDouble();

                System.out.println(kachow + " Km/h => "
                        + kachow * 1000 / 3600 + " m/s");
                permitemeQueInsista = false;
                
            } catch (InputMismatchException ime) {

                System.out.println("ERROR!!!!!! DEBE INTRODUCIR UN Nº");

                permitemeQueInsista = true;

            }
        } while (permitemeQueInsista);

    }

}
