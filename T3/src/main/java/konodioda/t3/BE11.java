/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class BE11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos el string del que mostraremos las letras en pantalla y el
        //int para recorrer el do-while
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i = 0;
        //Realizamos un do-while para pasar por cada letra:
        do{
            System.out.println(abc.charAt(i));
            i++;
        }while(i<25);
        
    }
    
}
