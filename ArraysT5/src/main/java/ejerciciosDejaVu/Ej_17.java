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

public class Ej_17 {

    /**
     * @param args the command line arguments
     */
    
    //Método para mostrar el array:
    public static void mostrarArray(char [] recipiente){
        
        System.out.printf("Array: { ");//Usamos printf para que se muestre el
        //array sin saltar línea.
        
        for(int x = 0; x < recipiente.length; x++){
            
            if(x < (recipiente.length - 1)){//Mostramos cada nº del array y un punto y
                //coma (excepto para el último nº del array)
                
                System.out.printf(recipiente[x] + "; ");
                
            }else{//Mostramos el último nº del array
                
                System.out.printf(recipiente[x] + "");
                
            }
            
        }
        
        System.out.println("}");//Cerramos la muestra del array
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entry = new Scanner(System.in);
        String line;
        char[] ordered;
        
        System.out.println("Introduce un array con mayúsculas: ");
        line = entry.nextLine().toLowerCase(); //Con el toLowerCase, pone los 
        //caracteres en minúscula
        
        System.out.println("Lo que ha introducido: " + line);
        
        //Ahora la parte de verdad:        
        ordered = new char[line.length()];
        
        for (int i = 0; i < line.length(); i++){
            //Metemos los caracteres de nuestra linea al char:
            ordered[i] = line.charAt(i);
            
        }
        
        //Mostramos el array como ha sido introducido:
        mostrarArray(ordered);
        
        //Lo ordenamos usando un método de la clase Arrays y lo volvemos a mostrar:
        Arrays.sort(ordered);
        
        mostrarArray(ordered);
        
    }
    
}
