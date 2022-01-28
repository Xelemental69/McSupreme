/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fco-j
 */
public class Joker {

    /**
     * @param args the command line arguments
     */
    
    
    public static void insertarDatos(int [] rec){
    //Método para introducir datos en el array;
        
        //Declaramos el Scanner
        Scanner entry = new Scanner (System.in);
        boolean ldMatiasPratz;//boolean de fallo (temática linea directa)
        
        do{//Bucle para llamar a ldMatiasPratz si algo falla e insistir
            
            try{//Código cuando solo se introducen caracteres numéricos
                                              
                for(int i = 0; i < rec.length; i++){//Bucles dentro de bucles, sí

                    //Se pide por teclado un número entero por cada posición del
                    //array:
                    System.out.println("Introduce el entero nº " + i + ":");
                    rec[i] = entry.nextInt();

                }

                //Si todo sale bien, no habrá que insistir.
                ldMatiasPratz = false;
                
            }catch(InputMismatchException ime){//Si algo sale mal...
                //En caso de que se introduzca un caracter no numérico,
                //salta este error.
                System.out.println("Hay que introducir números");
                System.out.println("PERMÍTEME QUE INSISTA");
                ldMatiasPratz = true;//Hay que insistir
                entry.next();
                
            }
        
        }while(ldMatiasPratz);//La condición del bucle: Matias Pratz
        
    }      
    
    public static void generarArrays(int[] recipient) {
        //Método que genera el array al azar:
        Random surprise = new Random();

        for (int i = 0; i < recipient.length; i++) {

            recipient[i] = surprise.nextInt(10);

        }

    }
    
    //Método para mostrar el array:
    public static void mostrarArray(int [] rec){
        
        System.out.printf("Array: { ");//Usamos printf para que se muestre el
        //array sin saltar línea.
        
        for(int x = 0; x < rec.length; x++){
            
            if(x < (rec.length - 1)){//Mostramos cada nº del array y un punto y
                //coma (excepto para el último nº del array)
                
                System.out.printf(rec[x] + "; ");
                
            }else{//Mostramos el último nº del array
                
                System.out.printf(rec[x] + "");
                
            }
            
        }
        
        System.out.println("}");//Cerramos la muestra del array
        
    }
    
    //Método para realizar el juego:
    public static void game(int[] trickster, int[] fool){
        boolean bonneChance = true;//Boolean que determina el precio bueno
        int bet, target;//Variables auxiliares
        
        for(int i = 0; i < trickster.length; i++){//Realizamos un bucle para 
            //comprobar los nºs: 
            
            //Preparamos la variables auxiliares:
            bet = fool[i];
            target = Arrays.binarySearch(trickster, bet);
            System.out.println("target: " + target);
            
            if(target < 0){
                //Si no coincide uno de los nºs, no hay premio 
                
                System.out.println("No hay premio, qué lástima...");
                System.out.println("i: " + i);
                bonneChance = false;//Rompemos las posibilidades de un premio.
                break;//Y rompemos el bucle.
                
            }else if(target != i && (trickster[target] != fool[i])){
                //Si coinciden los nºs, pero no las posiciones, nuestro jugador
                //se llevará un premio sorpresa... LA SORPRESA DE SU VIDA.
                
                System.out.println("i: " + i);
                System.out.println("Felicidades, has ganado el joker...");
                
                try {//Pausa el programa por 1 segundo
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                } catch (InterruptedException ie) {
                    
                    Thread.currentThread().interrupt();
                    
                }
                
                System.out.println("Pero no como tú querrías... "
                        + "\nHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA");
                
                //Rompemos las posibilidades de un buen premio:
                bonneChance = false;
                break;//Y rompemos el bucle.
                
            }
            
        }
        
        if(bonneChance){
            //Si coinciden nºs y posiciones, nuestro jugador ganará un gran,
            //maravilloso premio (pero de verdad, así que guarda la dama de 
            //hierro)
            
            System.out.println("Felicidades, has ganado el joker...");
                
            try {//Pausa el programa por 1 segundo

                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException ie) {

                Thread.currentThread().interrupt();

            }
            
            System.out.println("Tendrás tu premio pronto, nuestro feliz ganador");
            
        }
        
    }
    
    public static void main(String[] args) {
        // Declaramos las variables del juego del Joker:
        
        //Empezando con el array que se creará al azar:
        int[] theTrickster = new int[7];
        
        //Y acabando con el array con el que el usuario intentará adivinar:
        int[] theFool = new int[7];
        
        //Inicializamos los dos arrays:
        generarArrays(theTrickster);//Uno al azar.
        mostrarArray(theTrickster);
        insertarDatos(theFool);//Otro por teclado.
        
        //Iniciamos el juego, y que la suerte decida el destino, de nuestro
        //inocente jugador:
        game(theTrickster, theFool);
        
    }
    
}
