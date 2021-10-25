/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konodioda.mavenproject1;

/**
 *
 * @author fco-j
 */

import java.util.*;

public class C {
    
    public static void main(String[] args) {
        //Declaramos el Scanner y un int donde depositar el número
        Scanner emosSidoEngañaos = new Scanner(System.in);
        System.out.println("Introduce un nº del 1 al 10: ");
        int x = emosSidoEngañaos.nextInt();
        //Si el nº no es del 1 al 10, la siguiente línea no se ejecuta
        if(x>0 && x<11) System.out.printf(x + " en romano es : ");
        
        //Dependiendo del número introducido, se ejecutarás uno de los casos
        //dentro del switch
        switch(x){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("ERROR. Número fuera de rango.");
                break;
        }
        
    }    
    
}
