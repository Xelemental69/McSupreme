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
        int v, w, x, y, letra;
        char z, a, b, c;
        int order;
        
        do{
        
            do{
                //Generamos los números dentro de un bucle en el cual solo podrán
               //salir si la suma de ambos es impar
                v = candado.nextInt(10);
                y = candado.nextInt(10);
                
                System.out.println("Prueba de v&y: " + v + y);

            }while( (v + y) % 2 == 0);

            do{
                //Generamos los números dentro de un bucle en el cual solo podrán
               //salir si el producto de ambos es par
                w = candado.nextInt(10);
                x = candado.nextInt(10);
                
                System.out.println("Prueba de w&x: " + w + x);

            }while( (w * x) % 2 != 0);
            
            System.out.println("Probando: " + v + w + x + y);
        
        }while(v == y || v == w || v == x || y == w || y == x || w == x);
        
            /*
            System.out.println(v);
            System.out.println(w);
            System.out.println(x);
            System.out.println(y);
            */
        
        do{
        //Generamos una letra                
            letra = candado.nextInt(122 - 33 + 1) + 33;
            z = (char) letra;//Para comprobar si sale número y resetear el valor
            System.out.println("Prueba de z: " + z);
        }while(letra >= 48 && letra <= 57);
        
        System.out.println(z);
        
        do{
            //Generamos otra letra dentro de un bucle que dejará salir un valor
           //que no sea idéntico al anterior
           letra = candado.nextInt(122 - 33 + 1) + 33;
            a = (char) letra;//Para comprobar si sale número y resetear el valor
            System.out.println("Prueba de a: " + a);
        }while(a==z || (letra >= 48 && letra <= 57));
        System.out.println(a);
        
        do{
            //Generamos otra letra dentro de un bucle que dejará salir un valor
           //que no sea idéntico a los anteriores
           letra = candado.nextInt(122 - 33 + 1) + 33;
            b = (char) letra;//Para comprobar si sale número y resetear el valor
            System.out.println("Prueba de b: " + b);
        }while(b == z || b == a || (letra >= 48 && letra <= 57));
        System.out.println(b);
        
        do{
        //Generamos la última letra
            letra = candado.nextInt(122 - 33 + 1) + 33;
            c = (char) letra;//Para comprobar si sale número y resetear el valor
            System.out.println("Prueba de c: " + c);
        }while(c == z || c == a || c == b || (letra >= 48 && letra <= 57));   
        System.out.println(c);
        
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
