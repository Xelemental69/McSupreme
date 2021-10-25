/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.mavenproject1;

/**
 *
 * @author fco-j
 */

import java.util.*;

public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos e inicializamos las variables que harán falta, pidiendo por
        //pantalla el caracter
        Scanner hemoSidoEngañaos = new Scanner(System.in);
        
        System.out.println("Introduce un solo caracter o cifra: ");
        //Para coger un char por teclado, usamos el .next para coger una palabra
        //y a continuación el .charAt(0)para coger el primer acarter introducido
        //(en posición 0)
        char x = hemoSidoEngañaos.next().charAt(0);
        
        int y = x;
                        
        System.out.println(x+ " es en número (UNICODE): " + y);
        //Según el rango en el Unicode, se comprobará con if/else 
        //si se halla entre el rango de dígitos, minúsculas o mayúsculas
        if(y>=48 && y<=57){
            System.out.println("El caracter introducido es un número");
        }else if (y>=65 && y<=90){
            System.out.println("El caracter introducido es una letra mayúscula");
        }else if (y>=97 && y<=122){
            System.out.println("El caracter introducido es una letra minúscula");
        }else{
            //Si no se halla en ninguno de los rangos deseados, salta error
            System.out.println("ERROR. El caracter no válido");
        }
                
    }
    
}
