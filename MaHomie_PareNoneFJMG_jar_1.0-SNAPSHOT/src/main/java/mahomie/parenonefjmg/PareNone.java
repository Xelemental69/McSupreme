/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahomie.parenonefjmg;
import java.util.*;
/**
 *
 * @author fco-j
 */
public class PareNone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entry = new Scanner(System.in);        
        int j1 = 0, j2 = 0, n;
        char choice;
        Random slap = new Random();
        
        do{
        
            System.out.println("¿Cómo quiere introducir los números?\n"
            + "A (Manual)\n" + "B (Al azar)");

            choice = entry.next().charAt(0);

            switch (choice) {

                case 'A':
                    do{
                        System.out.println("Jugador 1, ¿cuántos dedos contamos?");                    
                        j1 = entry.nextInt();

                        System.out.println("Jugador 2, ¿cuántos dedos contamos?");                    
                        j2 = entry.nextInt();
                        
                        if(j1<11 || j1<0 || j2<11 || j2<0){
                            System.out.println("ERROR DE INPUT");
                        }
                        
                    }while(j1<11 || j1<0 || j2<11 || j2<0);
                    
                    break;

                case 'B':
                    
                    System.out.println("De acuerdo, se generarán los números "
                    + "al azar.");
                    
                    j1 = slap.nextInt(11);
                    System.out.println("J1 = " + j1 + " dedos");
                    
                    j2 = slap.nextInt(11);
                    System.out.println("J2 = " + j2 + " dedos");
                    
                    break;

                case 'C':

                    System.out.println("ERROR. Reseteando programa.");

                    break;

            }
        
        }while(choice != 'A' && choice != 'B');
        
        n = j1+j2;
        
        if(n % 2 == 0){
            System.out.println("Ha salido PARES");
        }else{
            System.out.println("Ha salido NONES");
        }
        
    }
    
}
