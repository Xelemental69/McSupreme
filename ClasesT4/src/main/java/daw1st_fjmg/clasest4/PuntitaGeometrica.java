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
public class PuntitaGeometrica {

    private double x;
    private double y;

    public PuntitaGeometrica(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public PuntitaGeometrica() {

        Random rnyisu = new Random();
        
        x = rnyisu.nextInt(102) + rnyisu.nextDouble() - 50;
        y = rnyisu.nextInt(102) + rnyisu.nextDouble() - 50;

    }

    public double getX() {
        
        return x;
        
    }

    public void setX(double x) {
        
        this.x = x;
        
    }

    public double getY() {
        
        return y;
    
    }

    public void setY(double y) {
        
        this.y = y;
        
    }

    @Override
    public String toString() {
        
        return "PuntitaGeometrica{\n" + " x = " + x
                + "\n y = " + y + "\n}";
        
    }

}
