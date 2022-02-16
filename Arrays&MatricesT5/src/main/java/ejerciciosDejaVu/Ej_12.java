/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fco-j
 */
public class Ej_12 {

    /**
     * @param args the command line arguments
     */
    
    public static void insertarDatos(char [][] rec){
    //Método para introducir datos en el array;
        
        //Declaramos el Scanner
        Scanner entry = new Scanner (System.in);
        boolean ldMatiasPratz;//boolean de fallo (temática linea directa)
        
        do{//Bucle para llamar a ldMatiasPratz si algo falla e insistir
            
            try{//Código cuando solo se introducen caracteres numéricos
                                              
                for(int m = 0; m < rec.length; m++){//Bucles dentro de bucles, sí
                    
                    for(int n = 0; n < rec[m].length; n++){

                    //Se pide por teclado un número entero por cada posición del
                    //array:
                    System.out.println("Introduce el caracter nº " + n + " del array nº " + m + ":");
                    rec[m][n] = entry.nextLine().charAt(0);
                    
                    }

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
    
    public static void mostrarEnPantalla(char[][] matrix){
        
        System.out.println("La matriz introducida es la siguiente:");
        
        for (int m = 0; m < matrix.length; m++){
            
            for (int n = 0; n < matrix[m].length;n++){
                
                System.out.printf(matrix[m][n] + " ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        char [][] inception = new char [2][3];
        
        insertarDatos(inception);
        
        mostrarEnPantalla(inception);
        
    }
    
}
