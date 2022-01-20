/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos nuestro int, pero como array esta vez (uy, Deja Vu)
        int[] dejaVu = {1, 2, 3, 4, 5, 6};
        int s = 0; //Este int será la suma de cada valor del array
        
        //Mostramos los valores del array:
        System.out.println("Array Deja Vu:");
        
        System.out.printf("{");
        
        for(int i = 0; i < dejaVu.length; i++){
            
            if(i<5){
                
                System.out.printf(dejaVu[i] + "; ");
                
            }else{
                
                System.out.printf(dejaVu[i] + "");
                
            }
            
            s = s + dejaVu[i];
            
        }
        
        System.out.println("}");
        
        System.out.println("Suma de todos los elementos: " + s);
        
    }
    
}
