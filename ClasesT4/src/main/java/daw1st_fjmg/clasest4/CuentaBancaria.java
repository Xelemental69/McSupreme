/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.*;

/**
 *
 * @author fco-j
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private String nif;
    private String nombre;
    private double saldo;
    private double interes;

    public CuentaBancaria() {
        Random lol = new Random();

        numeroCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        nif = RandomStringUtils.randomNumeric(8).toUpperCase()
                + RandomStringUtils.randomAlphabetic(1).toUpperCase();
        nombre = "Lorkshawn";
        saldo = lol.nextInt(10000000);
        interes = (double) (lol.nextInt(30) + 1) / 1000;

    }

    public CuentaBancaria(String nif, String nombre, double saldo,
            double intereses) {
        Random lol = new Random();

        numeroCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.nif = nif;
        this.nombre = nombre;
        this.saldo = saldo;
        if (intereses >= 0.1 && intereses <= 3) {
            this.interes = (double) intereses / 100;
        } else if (intereses >= 0.001 && intereses <= 0.03) {
            this.interes = intereses;
        } else {
            interes = (double) (lol.nextInt(30) + 1) / 1000;
        }

    }

    public String getNIF() {

        return this.nif;

    }

    public String getNombre() {

        return this.nombre;

    }

    public String getNCuenta() {

        return this.numeroCuenta;

    }

    public double getSaldo() {

        return this.saldo;

    }

    public double getIntereses() {

        return this.interes;

    }

    public void setNif(String nif) {

        this.nif = nif;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public void setInteres(double intereses) {
        Random lol = new Random();

        if (intereses >= 0.1 && intereses <= 3) {
            this.interes = (double) intereses / 100;
        } else if (intereses >= 0.001 && intereses <= 0.03) {
            this.interes = intereses;
        } else {
            interes = (double) (lol.nextInt(30) + 1) / 1000;
        }

    }

    public void ingresarIntereses() {

        saldo = saldo + (interes * saldo);

    }

    public void ingresarDinero(double cantidad) {

        saldo = saldo + cantidad;

    }

    public void retirarDinero(double cantidad) {

        if (saldo >= cantidad) {

            saldo = saldo - cantidad;
            System.out.println("Ha retirado " + cantidad + "€"
                    + " (o lo que sea)");

        } else {

            System.out.println("No hay saldo suficiente");
            System.out.println("Ha retirado " + saldo + "€"
                    + " (o lo que sea)");
            saldo = 0;

        }

    }

    @Override
    public String toString() {
        return "CuentaBancaria{"
                + "numeroCuenta=" + numeroCuenta
                + ", nif=" + nif + ", nombre=" + nombre
                + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}
