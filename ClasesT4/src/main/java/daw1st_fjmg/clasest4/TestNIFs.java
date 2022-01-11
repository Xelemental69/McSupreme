/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class TestNIFs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NIF snif = new NIF();
        NIF mnif = new NIF("01234567");
        NIF nono = new NIF("0123456");
        NIF nonif = new NIF("012345678");
        
        System.out.println(snif.getNumDNI());
        System.out.println(snif.getLetraDNI());
        System.out.println(mnif.getLetraDNI());
        
        System.out.println("snif: " + snif);
        System.out.println("mnif: " + mnif);
        System.out.println("Cantidad de clases creadas: " + snif.getCantidad());
    }
    
}
