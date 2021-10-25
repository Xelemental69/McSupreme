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
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la edad: ");

        int edad = scanner.nextInt();

        
            System.out.println((edad >= 18) ? "Es mayor de edad"
                    : "Es menor de edad");

        System.out.print("Mostrar la edad: ");
        System.out.println(edad);
        
    }
    
}
