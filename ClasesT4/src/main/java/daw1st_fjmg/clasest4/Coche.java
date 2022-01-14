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

    Motor motor;
    Puerta puerta1;
    Puerta puerta2;
    Rueda rueda1;
    Rueda rueda2;
    Rueda rueda3;
    Rueda rueda4;

    public Coche(Motor motor, Puerta puerta1, Puerta puerta2, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
        this.motor = motor;
        this.puerta1 = puerta1;
        this.puerta2 = puerta2;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
    }

    public Coche() {
        
        motor = new Motor();
        puerta1 = new Puerta();
        puerta2 = new Puerta();
        rueda1 = new Rueda();
        rueda2 = new Rueda();
        rueda3 = new Rueda();
        rueda4 = new Rueda();
        
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuerta1() {
        return puerta1;
    }

    public void setPuerta1(Puerta puerta1) {
        this.puerta1 = puerta1;
    }

    public Puerta getPuerta2() {
        return puerta2;
    }

    public void setPuerta2(Puerta puerta2) {
        this.puerta2 = puerta2;
    }

    public Rueda getRueda1() {
        return rueda1;
    }

    public void setRueda1(Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public void setRueda2(Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public void setRueda3(Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }

    public void setRueda4(Rueda rueda4) {
        this.rueda4 = rueda4;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puerta1=" + puerta1
                + ", puerta2=" + puerta2 + ", rueda1=" + rueda1 + ", rueda2="
                + rueda2 + ", rueda3=" + rueda3 + ", rueda4=" + rueda4 + '}';
    }

}
