/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class LineaBlancaNoSospechosa {

    private PuntitaGeometrica puntoA;
    private PuntitaGeometrica puntoB;

    public LineaBlancaNoSospechosa() {

        puntoA = new PuntitaGeometrica();
        puntoB = new PuntitaGeometrica();

    }

    public LineaBlancaNoSospechosa(PuntitaGeometrica puntoA,
            PuntitaGeometrica puntoB) {

        this.puntoA = puntoA;
        this.puntoB = puntoB;

    }

    public PuntitaGeometrica getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntitaGeometrica puntoA) {
        this.puntoA = puntoA;
    }

    public PuntitaGeometrica getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntitaGeometrica puntoB) {
        this.puntoB = puntoB;
    }

    public void mueveDerecha(double x) {

        double z = puntoA.getX() + x;
        puntoA.setX(z);
        
        z = puntoB.getX() + x;
        puntoB.setX(z);
        
    }

    public void mueveIzquierda(double x) {

        double z = puntoA.getX() - x;
        puntoA.setX(z);
        
        z = puntoB.getX() - x;
        puntoB.setX(z);
        
    }

    public void mueveArriba(double y) {

        double z = puntoA.getY() + y;
        puntoA.setY(z);
        
        z = puntoB.getY() + y;
        puntoB.setY(z);
        
    }

    public void mueveAbajo(double y) {

        double z = puntoA.getY() - y;
        puntoA.setY(z);
        
        z = puntoB.getY() - y;
        puntoB.setY(z);
        
    }

    public void MostrarLinea() {

        System.out.println("[(" + puntoA.getX() + "),(" + puntoA.getY()
                + ") ; (" + puntoB.getX() + "),(" + puntoB.getY() + ")]");

    }

    @Override
    public String toString() {
        return "LineaBlancaNoSospechosa{\n" + " Punto A = " + puntoA
                + "\n Punto B = " + puntoB + "\n}";
    }

}
