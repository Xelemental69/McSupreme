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

public class Ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ultraDejaVu = new Scanner(System.in);
        final int MAX = 500;
        
        int[] x = new int [MAX];
        String[] z = {"1: ", "2: ", "3: ", "4: ", "5: ", "6: ", "7: ", "8: ",
            "9: ", "10: ", "11: ", "12: ", "13: ", "14: ", "15: ", "16: ",
             "17: ", "18: ", "19: ", "20: "};
        int cout = 0;
        int y = 0;
        
        do{
            
            try{
            
                System.out.println("Introduce un nº del 1 al 20 (0 para terminar)");
                cout = ultraDejaVu.nextInt();

                if(cout > 1 && cout < 21){

                    x[y] = cout;
                    y++;

                }
                
            }catch(InputMismatchException ime){
                
                System.out.println("ERROR.INTRODUCE UN NÚMERO DE VERDAD");
                ultraDejaVu.nextLine();
                
            }
            
        }while(cout != 0);
        
        
        
    }
    
}
