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

public class Ej_16 {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
         // TODO code application logic here
        
         int max;
         boolean repeat;
         Random lanzarMonedas = new Random();
         Scanner entry = new Scanner(System.in);
         
         do{
         
             try{
             
                System.out.println("¿Cuántas veces desea probar suerte?");
                max = entry.nextInt();
                repeat = false;
                
             }catch(InputMismatchException ime){
                 
                 repeat = true;
                 max = 0;
                 System.out.println("TIENE QUE INTRODUCIR UN Nº");
                 entry.nextLine();
                 
             }
         
         }while(repeat);
        
         boolean[] cara = new boolean[max];
        
         int vecesCara = 0;
         int vecesCruz = 0;
         
         for(int i = 0; i < max; i++){
             
             cara[i] = lanzarMonedas.nextBoolean();
             
         }
         
         for(int j = 0; j < max; j++){
             
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
