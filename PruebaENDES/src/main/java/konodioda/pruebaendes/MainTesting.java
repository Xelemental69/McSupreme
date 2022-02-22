/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.pruebaendes;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class MainTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClasificacionTallas();
    }
    
    public static void ClasificacionTallas(){
        Scanner in = new Scanner(System.in);
        String talla;
        double precio = 0;
        boolean repetir;
        
        do{
            
            try{
                
                System.out.println("Introduzca la talla:(XS,S,M,L,XL,XXL)");
                talla = in.next().toUpperCase();
                System.out.println("Introduzca el precio");
                precio = in.nextDouble();
                Metodos met = new Metodos();
                System.out.println();
                System.out.println("La talla es: "+ met.Tallas(talla));
                System.out.println("El precio final es: " + met.iva(precio));
                repetir = false;
                
            }catch(InputMismatchException ime){

                System.out.println("ERROR: CARACTER NO NUMÉRICO INTRODUCIDO");
                in.nextLine();
                repetir = true;

            }
            
        }while(repetir);
    }    
        
}
