/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konodioda.t3;
import java.util.*;
/**
 *
 * @author pikac
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int opcion;
        double area;
        
        do{
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Calcular el área de un Cuadrado");
            System.out.println("2. Calcular el área de un Triángulo");
            System.out.println("3. Calcular el área de un Círculo");
            System.out.println("4. Finalizar");

            System.out.println("Elija una opción: ");
            
            opcion = entrada.nextInt();
            System.out.println("");
        }while(opcion <1 || opcion>4 ); 
        
        
        
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduce el lado: ");
            int l = entrada.nextInt();
            area = l * l;
            System.out.println("El área del cuadrado es " + area + "u^2");
        } else
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduce la base: ");
                int b = entrada.nextInt();
                System.out.println("Introduce la altura: ");
                int a = entrada.nextInt();

                area = (double) b * a / 2;
                System.out.println("El área del triángulo es " + area + "u^2");
            } else
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Introduce el radio: ");
                    int r = entrada.nextInt();
                    area = r * r * Math.PI;
                    System.out.println("El área del círculo es " + area + "u^2");
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }


    

