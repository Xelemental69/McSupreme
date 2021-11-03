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
        // TODO code application logic here
        
        //TimeUnit tu=TimeUnit.SECONDS;

        System.out.println("Bienvenidos a la RULETA DE MACETÓPOLIS");
        
        //tu.SECONDS.sleep(1);
        
        System.out.println("HOY, LA SUERTE DECIDIRÄ QUIÉN DE NUESTRAS "
        + "VÍCTIMAS; perdón, JUGADORES TENDRÁ QUE INVITAR A VICO A UN HELADO");
        
        // Declaramos nuestras variables:
        Random ruleta = new Random();
        Random rng = new Random();
        int j1Score = 0,j2Score = 0,numj1,numj2,nT;
        
        //Iniciamos el bucle para el mejor de 5
        while(j1Score < 3 && j2Score < 3){
            
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
                System.out.println("El jugador 1 gana esta ronda");
                j1Score++;
            }else if(nT<7){
                System.out.println("El jugador 2 gana esta ronda");
                j2Score++;
            }else{
                System.out.println("Empate, nadie gana puntos");
            }
            
        }
        
        //Tras salir del bucle, mostramos quién ha ganado el mejor de 5:        
        System.out.println("Y el ganador de esta partida es...");
        
        if(j1Score == 3){
            System.out.println("El Jugador 1");
        }else if (j2Score == 3){
            System.out.println("El Jugador 2");
        }
        
    }
    
}
