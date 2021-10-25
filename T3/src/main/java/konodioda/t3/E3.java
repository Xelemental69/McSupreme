/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 6, valor2 = 9, resultado;
        //Según el valor de "unaCondición", resultado será valor 1 (si es true)
        //o valor2 (si es false), devolviendo valor1 en este caso
        boolean unaCondicion = true;
      resultado = unaCondicion ? valor1 : valor2;
      
        //Según la condición, y será 100 si x es mayor a 9 o será 200 si x
        //es menor a nueve. Dado el valor de x (10 > 9), y valdrá 100
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        
        //Si el valor de público es menor al aforo, lanzará un mensaje de que 
        //hay más hueco, en caso contrario, dirá que está todo vendido
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) 
                ? "Aun no hemos vendido todo" : "Esta todo vendido";
        
    }
    
}
