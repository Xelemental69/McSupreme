/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscaPalindromos;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class CazaPalindromos {
    
    public static void main(String[] args) {
        
        //Declaramos el Scanner, el String que almacena
        //nuestra palabra a analizar y dos enteros:
        Scanner entry = new Scanner(System.in);        
        String target;
        int x, y;
        
        //La pedimos por pantalla
        System.out.println("Introduce una palabra: ");
        target = entry.next().toLowerCase();
        //".toLowerCase()" lo pondrá todo en minúsculas,
        //para facilitar la comparación.
        
        System.out.println("Objetivo: " + target);
        
        //Inicializamos los dos enteros, uno con cero y otro con el final del String:
        x = 0;
        y = target.length() - 1;
        
        //Y comprobamos si es un palíndromo con el método "esPalindromo":
        System.out.println("¿Es la palabra introducida un Palíndromo? --> "
                + esPalindromo(target, x, y));
        
    }
    
    public static boolean esPalindromo(String target, int x, int y){
        
        //Declaramos e inicializamos el valor a devolver:
        boolean mirror = true;
        
        System.out.println("X: " + x + " (" + target.charAt(x) + ")");
        System.out.println("Y: " + y + " (" + target.charAt(y) + ")");
                            
            if(target.charAt(x) != target.charAt(y)){
                
                //Si las letras a comparar son distintas, se establecerá
                //el mirror como falso: 
                mirror = false;
                
            }else if ((x != y) && (x < y)){
                
                //Si x e y no coinciden de posición (e y se mantiene con valor mayor)
                //, se continua:
                esPalindromo(target, x + 1, y - 1);
                
            }
        
        return mirror;
        
    }
    
}
