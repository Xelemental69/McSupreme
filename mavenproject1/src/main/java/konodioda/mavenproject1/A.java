/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.mavenproject1;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner emosSidoEngañaos = new Scanner(System.in);
        //Declaramos e inicializamos x con lo que nos pide en pantalla
        System.out.println("Introduce un número");
        int x = emosSidoEngañaos.nextInt();
        
        if(x == 0) System.out.println("El número introducido es 0");
        else if(x<0) System.out.println("El número es negativo");
        else System.out.println("El número es positivo");
    
    
    }
    
}
