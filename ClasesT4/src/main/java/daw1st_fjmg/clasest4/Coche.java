/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Coche {
    
    Motor motor = new Motor(false);
    Puerta puerta1 = new Puerta(false);
    Puerta puerta2 = new Puerta (false);
    Rueda rueda1 = new Rueda(true);
    Rueda rueda2 = new Rueda(true);
    Rueda rueda3 = new Rueda(true);
    Rueda rueda4 = new Rueda(true);
    
    public Coche(boolean motor, boolean puerta1, boolean puerta2, boolean rueda1,
            boolean rueda2, boolean rueda3, boolean rueda4){
        
        this.motor.setMotor(motor);
        this.puerta1.setPuerta(puerta1);
        this.puerta2.setPuerta(puerta2);
        this.rueda1.setRueda(rueda1);
        this.rueda2.setRueda(rueda2);
        this.rueda3.setRueda(rueda3);
        this.rueda4.setRueda(rueda4);
        
    }
    
}
