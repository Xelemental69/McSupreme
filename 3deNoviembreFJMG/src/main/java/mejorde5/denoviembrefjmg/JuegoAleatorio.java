/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejorde5.denoviembrefjmg;
import java.util.*;
/**
 *
 * @author fco-j
 */
public class JuegoAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
