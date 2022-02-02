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
public enum CuentaBancariaEnum {//(puede fácilmente ser un enum)
    
    PIPO("6969696969696969696969696969696969696969", "01234567Z", "Pipo", "Firebank", 420.0);

    private final String NUMERO_CUENTA;
    private final String NIF;
    private final String NOMBRE;
    private final String BANCO;
    private final double SALDO;

    private CuentaBancariaEnum(String nCuenta, String nif, String nombre, String banco, double saldo) {
        Random lol = new Random();

        NUMERO_CUENTA = nCuenta;
        this.NIF = nif;
        this.BANCO = banco;
        this.NOMBRE = nombre;
        this.SALDO = saldo;

    }

    public String getNIF() {

        return this.NIF;

    }

    public String getNombre() {

        return this.NOMBRE;

    }

    public String getNCuenta() {

        return this.NUMERO_CUENTA;

    }

    public double getSaldo() {

        return this.SALDO;

    }

    public String getBANCO() {
        
        return BANCO;
        
    }
       
    @Override
    public String toString() {
        return "CuentaBancaria{\n"
                + "Nº Cuenta: " + NUMERO_CUENTA
                + "\nNIF: " + NIF + "\nNombre:" + NOMBRE
                + "\nSaldo: " + SALDO + "\nBanco: " + BANCO + "\n" + '}';
    }

}
