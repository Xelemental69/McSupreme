/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class BE12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos el string del que mostraremos las letras en pantalla:
        String abc = "abcdefghijklmnopqrstuvxyz";
        
        //Realizamos un for para pasar por cada letra:
        for(int i = 0;i<25;i++){
            System.out.println((int)abc.charAt(i));//Pasamos la letra a int y sacamos
            //el valor en UNICODE             
        }
        
    }
    
}
