/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

import daw_fjmg.t6poo.*;

/**
 *
 * @author fco-j
 */
public class CuentaAhorro extends Cuenta{
    
    //Atributos exclusivos de la clase hija
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(Cliente cliente, double interes, double comisionAnual) {
        //Constructor parametrizado:
        
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
        
    }
    
    public CuentaAhorro(){//Constructor por defecto:
        
        super();
        interes = 1.5;
        comisionAnual = 100.50;
        
    }

    //Métodos heredados:
    @Override
    public void actualizarSaldo() {
        
        saldo = saldo + (saldo * interes / 100) - comisionAnual;
        
    }

    @Override
    public void retirar(double entry) {
        
        if (saldo >= entry){//Si hay suficiente dinero, para retirar,
            //se realiza la operación:
            
            saldo -= entry;
            
        }else{//Sino, salta error:
            
            System.out.println("Error. No se puede retirar tanto dinero");
            
        }
    
    }
    
    //GETTERS Y SETTERS:

    public double getInteres() {
        
        return interes;
    
    }

    public void setInteres(double interes) {
        
        this.interes = interes;
    
    }

    public double getComisionAnual() {
        
        return comisionAnual;
        
    }

    public void setComisionAnual(double comisionAnual) {
        
        this.comisionAnual = comisionAnual;
    
    }

    public double getSaldo() {
        
        return saldo;
        
    }

    public void setSaldo(double saldo) {
        
        this.saldo = saldo;
        
    }
        
    @Override
    public String toString() {
        return super.toString() + "Cuenta Ahorro{" + "\nInterés: " + interes
                + "\nComisión Anual: " + comisionAnual + '}';
    }
    
    
    
}
