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
public class BE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        int gg,x;
        System.out.printf("Ingrese el valor final: ");
        gg=teclado.nextInt();
        x=1;
        while (x<=gg) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

        
    }
    
}
