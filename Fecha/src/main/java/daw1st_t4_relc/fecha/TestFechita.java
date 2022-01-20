/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1st_t4_relc.fecha;

/**
 *
 * @author fco-j
 */
public class TestFechita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Fecha almonnndiga = new Fecha(1,8,1969);        
        Fecha maBoi = new Fecha();
        Fecha Censored = new Fecha (29,2,1069);
        Fecha XXX = new Fecha (69,420,6969);
        
        almonnndiga.mostrarFechaLarga();
        maBoi.mostrarFechaCorta();
        System.out.println("MaBOI es menor que Almónnndiga? " 
                + maBoi.menorFecha(almonnndiga));
        
    }
    
}
