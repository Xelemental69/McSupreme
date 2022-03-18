/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class NewMainAzar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Azar dadini = new Dado();
        Azar coin = new Moneda();
        
        System.out.println(dadini.lanzar());
        System.out.println(dadini.lanzar());
        System.out.println(coin.lanzar());
        System.out.println(coin.lanzar());
        
    }
    
}
