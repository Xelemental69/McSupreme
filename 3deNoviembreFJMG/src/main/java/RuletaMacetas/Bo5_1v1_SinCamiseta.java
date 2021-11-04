/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RuletaMacetas;

import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author fco-j
 */
public class Bo5_1v1_SinCamiseta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaramos nuestras variables:
        Random ruleta = new Random();
        Random rng = new Random();
        int j1Score = 0,j2Score = 0,numj1,numj2,nT;
        int ronda = 1;
        

        System.out.println("Bienvenidos a la RULETA DE MACETÓPOLIS");
        
        try {//Testeando una forma de pausar el programa por 1 segundo...            
        TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
        System.out.println("HOY, LA SUERTE DECIDIRÁ QUIÉN DE NUESTRAS "
        + "VÍCTIMAS...");
        
        try {//Testeando una forma de pausar el programa por 1 segundo...            
        TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
        System.out.println("perdón...\n JUGADORES TENDRÁ QUE INVITAR A "
                + "VICO A UN HELADO");
        
        try {//Testeando una forma de pausar el programa por 1 segundo...            
        TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
        System.out.println("Comenzamos en 3...");
        
        try {//Testeando una forma de pausar el programa por 1 segundo...            
        TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
        System.out.println("...2...");
        
        try {//Testeando una forma de pausar el programa por 1 segundo...            
        TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
        System.out.println("...1...");
        
        try {//Testeando una forma de pausar el programa por 1 segundo...            
        TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }
        
        System.out.println("LET'S FUCKING GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!");
        
        
        
        //Iniciamos el bucle para el mejor de 5
        while(j1Score < 3 && j2Score < 3){
            
            try {//Testeando una forma de pausar el programa por 2 segundos...            
            TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            }
            
            //Mostramos el nº de ronda
            System.out.println(ronda + "a RONDA: ");
            
            try {//Testeando una forma de pausar el programa por 1 segundo...            
            TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            }
            
            //Generamos los números al azar y los mostramos:
            numj1 = rng.nextInt(5) + 1;
            System.out.println("Nº (J1) = " + numj1);
            numj2 = ruleta.nextInt(5) + 1;
            System.out.println("Nº (J2) = " + numj2);
            
            //Los sumamos y mostramos por pantalla:
            nT = numj1 + numj2;
            System.out.println("Nº resultante de la suma = " + nT);
            
            //Si es mayor a 7, J1 gana, si es menor a 7, J2 gana.
           //Y si es 7, nadie gana
            if(nT>7){
                System.out.println("El jugador 1 gana esta ronda"
                + "\nJugador 2, GIT GUD.");
                j1Score++;
            }else if(nT<7){
                System.out.println("El jugador 2 gana esta ronda"
                + "\nJugador 1, GIT GUD.");
                j2Score++;
            }else{
                System.out.println("Empate, nadie gana puntos."
                + "\nVenga, con más ánimo que vuestro profesor tiene hambre.");
            }
            
            ronda++;
            
        }
        
        //Tras salir del bucle, mostramos quién ha ganado el mejor de 5:        
        System.out.println("Y el ganador de esta partida es...");
        
        if(j1Score == 3){
            System.out.println("El Jugador 1"
            + "\n¡Felicidades Jugador 2,\n ha ganado el honor de invitar a Vico a "
                    + " un helado!");
        }else if (j2Score == 3){
            System.out.println("El Jugador 2"
            + "\n¡Felicidades Jugador 1,\n Ha conseguido el honor de invitar a Vico"
                    + " a un helado!");
        }
        
    }
    
}
