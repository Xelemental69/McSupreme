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
public class Rueda {

    boolean inflada;
    double diametro;

    public Rueda(boolean inflada, double diametro) {
        this.inflada = inflada;
        this.diametro = diametro;
    }

    public Rueda() {

        Random giveaway = new Random();

        inflada = giveaway.nextBoolean();
        diametro = giveaway.nextInt(100);

    }

    public void inflar() {

        this.inflada = true;

        System.out.println("Inflando la rueda...");

    }

    public void desinflar() {

        this.inflada = false;

        System.out.println("Desinflando la rueda...");

    }

    public boolean getRueda() {

        return this.inflada;

    }

    public void setRueda(boolean enMarcha) {

        this.inflada = enMarcha;

    }

    @Override
    public String toString() {
        return "¿Está inflada? " + inflada + "; Diámetro:"
                + diametro;
    }

}
