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

public class Ej_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        int sumaPares = 0, contadorImpares = 0;
        boolean skip = true;//Nos servirá en el bucle por razones de presentación
        
        lista.add(12);
        
        for (int i = 0; i < 25; i++){
            
            Integer aux = r.nextInt(91) + 10; 
            lista.add(aux);
            
        }
        
        //Mostramos el array:           
        System.out.printf("Lista: [" + lista.get(0));//Usamos printf para que 
        //se muestre el array sin saltar línea y mostamos el primer integer 
        //antes del bucle
        
        for(Integer x: lista){
            //Mostramos cada nº del array excepto el primero y un punto y coma:
            if(skip){//Nos saltará el primer integer
                skip = false;//Nos aseguamos de no saltar ningun otro integer
            }else{
            
                
                System.out.printf("; " + x);

                if(x % 2 == 0){
                    
                    sumaPares += x;
                    
                }else{
                    
                    contadorImpares++;
                    
                }
            
            }
                
        }
        
        System.out.println("]");//Cerramos la muestra del array
        
        
        
    }
        
}
