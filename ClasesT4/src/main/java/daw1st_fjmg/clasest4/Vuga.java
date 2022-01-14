/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Vuga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Motor Kachowwww = new Motor(true, 6.9);
        Motor Kachiga = new Motor();
        
        Ventana vent = new Ventana(false, false);
        Ventana sus = new Ventana();
        
        Puerta pilo = new Puerta(true, vent);
        Puerta copilo = new Puerta(false, new Ventana (true, false));
        Puerta trasera = new Puerta();
        
        Rueda shmoooving = new Rueda();
        Rueda zoomin = new Rueda(true, 56);
        
        Coche Vuga1 = new Coche();
        
        Coche Vuga2 = new Coche(new Motor(false, 2.0),
            new Puerta(false, new Ventana(true,true)),
            new Puerta(false, new Ventana(true,true)),
            new Rueda(true, 50),
            new Rueda(true, 50),
            new Rueda(true, 50),
            new Rueda(true, 50));
    
    
    }
    
}
