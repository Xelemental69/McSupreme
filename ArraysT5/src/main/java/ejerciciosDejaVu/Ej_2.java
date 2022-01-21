/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */

import java.util.*;

public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Nota: Acuérdate de que el error de cuando se sale del 
        //rango del array es ArrayIndexOutofBounds :)
        
        //Declaramos las variables (y el retorno del Scanner)
        int limite, total, media, inf, sup;
        Scanner entry = new Scanner(System.in);
        
        do{//Preparamos un bucle en caso de que no se introduzcan bien los datos 
            
            try{//Preparamos un try catch por si introducen caracteres no 
                //numéricos
            
                //Pedimos el nº de personas por teclado
                System.out.println("Introduce el nº de personas");
                limite = entry.nextInt();
                //Inicializamos las variables que usaremos en futuros bucles:
                total = 0;
                inf = 0;
                sup = 0;
                        
                if(limite > 0){//Si el nº de personas es introducido bien...   
                
                    //Ponemos como rango del array el int que hemos pedido 
                    //por pantalla (límite):
                    int[] alturas = new int[limite];
                    int i;//Declaramos i aquí para poder usarlo fuera del bucle.
               
                    for(i = 0; i < limite; i++){//Bucle en el que pedimos la 
                        //altura de cada persona por teclado
                   
                        System.out.println("Introduce la altura de la "
                           + (i + 1) + "ª persona (en cm):");
                   
                        alturas[i] = entry.nextInt();
                   
                        if(alturas[i] < 0){//Si sale la altura negativa, la 
                            //pasamos a positiva
                       
                            alturas[i] = alturas[i] * (-1);
                       
                        }
                        
                        //Añadimos la altura solicitada al total
                        total = total + alturas[i];
                   
                    }
                    
                    //Calculamos la media a raíz del total de alturas y el nº de
                    //las mismas...
                    media = total / limite;
                    //...y la mostramos por pantalla
                    System.out.println("La altura media es de " + media + "cm");
                    
                    for(i = 0; i < limite; i++){//Podemos reutilizar i aquí
                        //Bucle para comprobar cuántas personar son más altas o
                        //más cortas que la media
                        
                        if(alturas[i] > media){//Si la altura supera a la media
                            
                            sup++;
                            
                        }else if(alturas[i] < media){//Si la altura no supera
                            //a la media
                            
                            inf++;
                            
                        }
                        
                    }
                    
                    //Mostramos la cantidad de gente que es más alta/corta que 
                    //la media:
                    System.out.println("Personas con altura superior a la media:"
                            + " " + sup);
                    
                    System.out.println("Personas con altura inferior a la media:"
                            + " " + inf);
                    
                    System.out.println("Personas en la media de altura: " +
                            (i - sup - inf));
            
                }else{//Sí el nº de personas es 0 o menor, da error...
                
                    System.out.println("Introduce un nº mayor que 0");
                    System.out.println("PERMÍTEME QUE INSISTA");
                
            }
            
            }catch (InputMismatchException ime){//Si se introduce un caracter
                //no numérico, salta error...
                
                System.out.println("ERROR. Introduce un nº");
                System.out.println("PERMÍTEME QUE INSISTA");
                limite = -1;
                entry.next();
                
            }
                                           
        }while(limite <= 0);//El bucle tan querido.
        
    }
    
}
