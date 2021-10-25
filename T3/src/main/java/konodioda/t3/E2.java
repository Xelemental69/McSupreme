/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos el Scanner
        Scanner entry = new Scanner(System.in);
        //Declaramos e inicializamos x con lo que nos pide en pantalla
        System.out.println("Introduce un número");
        int x = entry.nextInt();
        //Declaramos e inicializamos ent, que será el valor absoluto
        int ent = (x>=0) ? x : x*(-1);
        //Declaramos e inicializamos resultado según sea menor o mayor/igual que 135
        String resultado = (x>=135) ? "mayor o igual" : "menor";
        //Y lo mostramos por pantalla
        System.out.println(x + " es " + resultado + " que 135 ");
        //Mostramos si x es positivo o negativo
        System.out.println((x>=0) ? x + " es mayor o igual que 0"
                : x + " es menor que 0");
        //Mostramos el valor absoluto en pantalla:
        System.out.println("Valor absoluto de " + x + ": " + ent);
        
    }
    
}
