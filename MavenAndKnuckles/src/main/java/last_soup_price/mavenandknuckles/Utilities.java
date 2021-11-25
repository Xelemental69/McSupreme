/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package last_soup_price.mavenandknuckles;
import java.util.*;
/**
 *
 * @author fco-j
 */
public class Utilities {
    
    public static int whatAGamble(int y, int z){
        int x;
        Random jollyWally = new Random();
    
        System.out.println("Rango del azar: " + "de " + y + " a " + z);
        
        x = jollyWally.nextInt(z - y + 1) + y;
    
        System.out.println("Nº obtenido: " + x);
        
        return x;
    
}
    
    public static int sesamoStreet(){
        int x;
        Scanner jollyWally = new Scanner(System.in);
        boolean killerQueen;//And before you ask... Yes, THIS IS A JOJO REFERENCE!!!
        
        do{
        
            try{

            System.out.println("Introduce un nº entero: ");                

                x = jollyWally.nextInt();
                killerQueen = false;

            } catch (InputMismatchException ime) {

                    System.out.println("ERROR!!!!!! DEBE INTRODUCIR UN Nº");

                    killerQueen = true;
                    x = 0;

            }
        
        }while(killerQueen);
        
        System.out.println("Nº obtenido: " + x);
        
        return x;
    
}
    
}
