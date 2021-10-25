/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;
import java.util.*;
/********************/
 /*                 */
 /* @author Xele    */
 /*******************/
public class BE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        int gg;
        System.out.printf("Ingrese el valor final: ");
        gg=teclado.nextInt();
        
        for(int x = 1; x<=gg; x++) {
            //En un for, se declara y/o inicializa una variable, se le da una
            //condición para repetirse y un operador que modifique la variable.
            System.out.print(x);
            System.out.print(" - ");
            
        }

        
    }
    
}
