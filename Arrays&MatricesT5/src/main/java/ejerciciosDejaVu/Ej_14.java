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

public class Ej_14 {

    /**
     * @param args the command line arguments
     */    
    
    public static void mostrarEnPantalla(int[][] matrix){
        
        System.out.println("La matriz resultante es la siguiente:");
        
        for (int m = 0; m < matrix.length; m++){
            
            for (int n = 0; n < matrix[m].length;n++){
                
                System.out.printf(matrix[m][n] + " ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static void insertarDatosAzar(int [][] rec){
    //Método para introducir datos en el array;
        
        //Declaramos el Random
        Random lucky = new Random();        
                                                              
            for(int m = 0; m < rec.length; m++){

                for(int n = 0; n < rec[m].length; n++){//Bucles dentro de bucles, sí
                //Introducimos los nºs al azar (rango: entre 1 y 100)

                rec[m][n] = lucky.nextInt(100) + 1;

                }

            }
        
    }
    
    public static double media (int [] [] rec){
        
        int total = 0,
            contador = 0;
        double media;
        
        for(int m = 0; m < rec.length; m++){
                    
            for(int n = 0; n < rec[m].length; n++){//Bucles dentro de bucles, sí
            //Añadimos el nº al total y sumamos 1 al contador:

                total += rec[m][n];
                contador++;

            }

        }
                        
        media = (double) total / contador;
        
        return media;
        
    }
    
    public static int min (int [] [] rec){
        
        int min = 101;
        
        for(int m = 0; m < rec.length; m++){
                    
            for(int n = 0; n < rec[m].length; n++){//Bucles dentro de bucles, sí
            //Añadimos el nº al total y sumamos 1 al contador:

                if(rec[m][n] < min){
                    
                    min = rec[m][n];
                    
                }

            }

        }                                
        
        return min;
        
    }
    
    public static int max (int [] [] rec){
        
        int max = 0;
        
        for(int m = 0; m < rec.length; m++){
                    
            for(int n = 0; n < rec[m].length; n++){//Bucles dentro de bucles, sí
            //Añadimos el nº al total y sumamos 1 al contador:

                if(rec[m][n] > max){
                    
                    max = rec[m][n];
                    
                }

            }

        }                                
        
        return max;
        
    }
    
    public static void main(String[] args) {
        
        int [][] inception = new int [3][3];
        
        insertarDatosAzar(inception);
        
        mostrarEnPantalla(inception);
        
        System.out.println("Valor mínimo: " + min(inception));
        System.out.println("Valor máximo: " + max(inception));
        System.out.println("Media = " + media(inception));
        
    }
    
}
