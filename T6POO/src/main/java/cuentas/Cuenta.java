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


public abstract class Cuenta {//Clase abstracta
    
    //Atributos de la clase:
    protected String numeroCuenta;
    protected double saldo;
    protected Cliente cliente;
    public static final ArrayList <String> NUM_TOMADO = new ArrayList <>();//Sirve para almacenar cada número de cuenta generado
    
    private String generarNumCuenta(){//Método para generar el número de cuenta
        
        String numero = "";
        
        do{//Bucle que se repetirá si el número de cuenta generado se halla en otra clase:
            
            numero = RandomStringUtils.randomNumeric(20).toUpperCase();
            
        }while(NUM_TOMADO.contains(numero));
        
        NUM_TOMADO.add(numero);//Una vez generado un nº de cuenta único, éste se almacena en el ArrayList
        
        return numero;
        
    }

    public Cuenta(Cliente cliente) {
        
        numeroCuenta = generarNumCuenta();
        saldo = 0;
        this.cliente = cliente;
        
    }
    
    public Cuenta() {
        
        numeroCuenta = generarNumCuenta();
        saldo = 0;
        cliente = new Cliente();
        
    }
    
    public abstract void actualizarSaldo();//Método abstacto
    
    public abstract void retirar(double entry);//Método abstracto

    //GETTERS Y SETTERS:
    
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
        
    @Override
    public String toString() {
        return "Cuenta{" + "\nNumeroCuenta: " + numeroCuenta
                + "\nSaldo: " + saldo + '€' + "\nCliente: " + cliente + '}';
    }
    
    
    
}
