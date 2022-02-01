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

public class Ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos el scanner y la variable máxima:
        Scanner ultraDejaVu = new Scanner(System.in);
        final int MAX = 500;
        
        //Declaramos e inicializamos los array:
        
        //Uno que recibirá nºs por teclados(para ello necesitamos la variable 
        //MAX como rango):
        int[] x = new int [MAX];
        //Y un array de strings que almacenará las veces que se ha introducido 
        //un nº del 1 al 20:
        String[] z = {"1: ", "2: ", "3: ", "4: ", "5: ", "6: ", "7: ", "8: ",
            "9: ", "10: ", "11: ", "12: ", "13: ", "14: ", "15: ", "16: ",
             "17: ", "18: ", "19: ", "20: "};
        //Declaramos tambiés estas variables auxiliares:
        int cin = 0; //Una pequeña referencia a como es el "scanner" en C++
        int y = 0;
        
        do{//Este bucle se mantendrá activo hasta que se introduzca un 0
            
            try{
                //Se pide por teclado un nº del 1 al 20:
                System.out.println("Introduce un nº del 1 al 20 (0 para terminar)");
                cin = ultraDejaVu.nextInt();

                //Si es un nº dentro de dicho rango, se le es asignado al array
                if(cin > 1 && cin < 21){

                    x[y] = cin;
                    y++;//Y se avanza la posición del array

                }else{//Si no, se muestra este mensaje de error:
                    
                    System.out.println("Nº inválido (fuera de rango");
                    
                }
                
            }catch(InputMismatchException ime){
                
                //Si se introduce un caracter no numérico, salta error y limpiamos
                //buffer:
                System.out.println("ERROR.INTRODUCE UN NÚMERO DE VERDAD");
                ultraDejaVu.nextLine();
                
            }
            
        }while(cin != 0);
        
        cin = 0;//Preparamos la variable "cin" para una segunda función como
        //auxiliar
        
        for(int i = 0; i < y; i++){
            
            //En este bucle, cada nº introducido pasará a ser el valor de cin...
            cin = x[i] - 1;//Ya que la posición inicial (posición 0) es 1, se 
            //resta 1 para igualar.
            
            //El cual añadirá un asterisco en la posición correspondiente:
            z[cin] += "*";
            
        }
        
        //Y por último, mostramos el array por pantalla:
        System.out.println("Array z:");
        
        for(int j = 0; j < z.length; j++){
            
            System.out.println(z[j]);
            
        }
        
    }
    
}
