/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author fco-j
 */
public class PimpMyRide {
    
    public static void main(String[] args) {
        
        Coche1[] vugas = new Coche1[100];
        
        for(int i = 0; i < vugas.length; i++){
            
            vugas[i] = new Coche1 ();
            
        }
        
        for(int j = 0; j < vugas.length; j++){
            
            try {//Pausa el programa por 1 segundo

                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException ie) {

                Thread.currentThread().interrupt();

            }
            
            System.out.println(vugas[j]);
            
        }
        
        System.out.println("YOU GOTTA PIMP MA RIIIIIIIIIIIIIIIIIDE!");
        
    }
    
}
