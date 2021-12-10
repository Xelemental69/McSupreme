/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class LineaNOSOYSOSPECHOSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LineaBlancaNoSospechosa woooo = new LineaBlancaNoSospechosa();
        
        PuntitaGeometrica lucino = new PuntitaGeometrica(42.0,69.25);
        PuntitaGeometrica martha = new PuntitaGeometrica(6.9,4.20);
        LineaBlancaNoSospechosa ops = new LineaBlancaNoSospechosa(lucino, martha);
        
        ops.MostrarLinea();
        ops.mueveAbajo(5.25);
        ops.MostrarLinea();
        ops.mueveArriba(8.36);
        ops.MostrarLinea();
        ops.mueveDerecha(13.15);
        ops.MostrarLinea();
        ops.mueveIzquierda(13.25);
        System.out.println("Ops: ");
        ops.MostrarLinea();
        System.out.println(ops);
        System.out.println("Woooo: ");
        woooo.MostrarLinea();
        System.out.println(woooo);
        
    }
    
}
