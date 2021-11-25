/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class MisCanciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion rickroll = new Cancion("RickRoll", "Rick");
        
        System.out.println(rickroll.getAuthor());
        System.out.println(rickroll.getTitle());
        
        System.out.println("");
        
        rickroll.setAuthor("Rick Astley");
        rickroll.setTitle("Never Gonna Give You Up");
        
        System.out.println(rickroll.toString());
        
    }
    
}
