/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sauce;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class OhJoderNoQueHabeisHecho {
    
    public static void main(String[] args) {
        //Generamos las variables para hacer una clave potencialmente compleja
        Random candado = new Random();
        int v, w, x, y;
        char z, a, b, c;
        int order;
        
        do{
        
            do{
                //Generamos los números dentro de un bucle en el cual solo podrán
               //salir si la suma de ambos es impar
                v = candado.nextInt(10);
                y = candado.nextInt(10);

            }while( (v + y) % 2 == 0);

            do{
                //Generamos los números dentro de un bucle en el cual solo podrán
               //salir si el producto de ambos es par
                w = candado.nextInt(10);
                x = candado.nextInt(10);

            }while( (w * x) % 2 != 0);
        
        }while(v == y || v == w || v == x || y == w || y == x || w == x);
        
        //Generamos una letra
        z = (char) (candado.nextInt(122 - 33 + 1) + 33);
        
        do{
            //Generamos otra letra dentro de un bucle que dejará salir un valor
           //que no sea idéntico al anterior
            a = (char) (candado.nextInt(122 - 33 + 1) + 33);
        }while(a==z);
        
        do{
            //Generamos otra letra dentro de un bucle que dejará salir un valor
           //que no sea idéntico a los anteriores
            b = (char) (candado.nextInt(122 - 33 + 1) + 33);
        }while(b == z || b == a);
        
        do{
        //Generamos la última letra
        c = (char) (candado.nextInt(122 - 33 + 1) + 33);
        }while(c == z || c == a || c == b);   
        
        //Generamos un nº al azar que determinará el orden de los caracteres
        order = candado.nextInt(4);
            
        switch(order){//Según order, el orden de los carateres será distinto.
            case 0:
                System.out.println("1ª variación:");
                System.out.println("Su clave generara es: " + v + a + x
                    + b + w + z + y + c);
                break;
            case 1:
                System.out.println("2ª variación:");
                System.out.println("Su clave generara es: " + c + w + y
                    + z + a + b + x + v);
                break;
                
            case 2:
                System.out.println("3ª variación:");
                System.out.println("Su clave generara es: " + z + a + v
                    + x + w + c + y + b);
                break;
                
            case 3:
                System.out.println("4ª variación:");
                System.out.println("Su clave generara es: " + w + a + z
                    + y + c + x + v + b);
                break;
        }   
    }
    
}
