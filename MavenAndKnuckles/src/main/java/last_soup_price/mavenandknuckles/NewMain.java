/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package last_soup_price.mavenandknuckles;

/**
 *
 * @author fco-j
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f, v, w;
        Utilities hellsing = new Utilities();
        
        v = hellsing.sesamoStreet();
        
        w = hellsing.sesamoStreet();
        
        if(v>=w){
            f = hellsing.whatAGamble(w,v);
        }else{
            f = hellsing.whatAGamble(v,w);
        }
        
    }
    
}
