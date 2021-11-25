/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

/**
 *
 * @author fco-j
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CajaCarton cajaGrande = new CajaCarton(8l, 250, 400, 500, 200);
        
        CajaCarton cajaChica = new CajaCarton(2l, 25, 30, 15, 17);
        
        System.out.println("Caja Grande (Datos):");
        
        System.out.println(cajaGrande.getancho());
        System.out.println(cajaGrande.getalto());
        System.out.println(cajaGrande.getlargo());
        System.out.println(cajaGrande.getpeso());
        
        System.out.println("-----------");
        
        System.out.println("Caja Chica (Datos):");
        
        System.out.println(cajaChica.getancho());
        System.out.println(cajaChica.getalto());
        System.out.println(cajaChica.getlargo());
        System.out.println(cajaChica.getpeso());
                
    }
    
}
