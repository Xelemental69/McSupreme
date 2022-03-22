/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;
import daw_fjmg.t6poo.*;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.*;


/**
 *
 * @author fco-j
 */


public abstract class Cuenta {
    
    protected String numeroCuenta;
    protected double saldo;
    protected Cliente cliente;
    public static final ArrayList <String> NUM_TOMADO = new ArrayList <>();

    public Cuenta(Cliente cliente) {
        
        numeroCuenta = generarNumCuenta();
        saldo = 0;
        this.cliente = cliente;
        
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double entry);

    public String getNumeroCuenta() {
        
        return numeroCuenta;
        
    }
    
    public double getSaldo() {
        
        return saldo;
    
    }

    public void setSaldo(double saldo) {
        
        this.saldo = saldo;
        
    }

    public Cliente getCliente() {
        
        return cliente;
        
    }
    
    private String generarNumCuenta(){
        
        String numero = "";
        
        do{
            
            numero = RandomStringUtils.randomNumeric(20).toUpperCase();
            
        }while(NUM_TOMADO.contains(numero));
        
        NUM_TOMADO.add(numero);
        
        return numero;
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "\nNumeroCuenta: " + numeroCuenta
                + "\nSaldo: " + saldo + "\nCliente: " + cliente + '}';
    }
    
    
    
}
