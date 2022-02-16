/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Ej_15 {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
         // TODO code application logic here
        
         final int MAX = 1000;
         Random lanzarMonedas = new Random();
        
         boolean[] cara = new boolean[MAX];
        
         int vecesCara = 0;
         int vecesCruz = 0;
         
         for(int i = 0; i < MAX; i++){
             
             cara[i] = lanzarMonedas.nextBoolean();
             
         }
         
         for(int j = 0; j < MAX; j++){
             
                if(cara[j]){
                 
                        vecesCara++;
                 
                }else{
                 
                         vecesCruz++;
                 
                }
             
         }
         
         System.out.println("Veces que ha salido cara: " + vecesCara);
         System.out.println("Veces que ha salido cruz: " + vecesCruz);
                 
    }
    
}
