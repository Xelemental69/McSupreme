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
public class CuentaCorriente extends Cuenta{
    
    public static final double INTERES = 1.5;
    private double saldoMin;

    public CuentaCorriente(double saldoMin, Cliente cliente) {
        
        super(cliente);
        this.saldoMin = saldoMin;
        this.saldo = saldoMin;
        
    }
    
    public CuentaCorriente(){
        
        super();
        saldoMin = 225;
                
    }

    //GETTERS Y SETTERS:
    
    public double getSaldo() {
        
        return saldo;
        
    }

    public void setSaldo(double saldo) {
        
        this.saldo = saldo;
        
    }

    public double getSaldoMin() {
        
        return saldoMin;
        
    }

    public void setSaldoMin(double saldoMin) {
        
        this.saldoMin = saldoMin;
        
    }

    public String getNumeroCuenta() {
                
        return numeroCuenta;
        
    }

    public void setNumeroCuenta(String numeroCuenta) {
        
        this.numeroCuenta = numeroCuenta;
        
    }

    public cuentas.Cliente getCliente() {
        
        return cliente;
        
    }

    public void setCliente(cuentas.Cliente cliente) {
        
        this.cliente = cliente;
        
    }
                
    //Métodos heredados:
    
    @Override
    public void actualizarSaldo() {
        
        if (saldoMin > 1000){//Si el saldo mínimo es mayor a 1000:
            
            saldo = saldo + (saldoMin * INTERES / 100);
            
        }else{//Si el saldo mínimo es menor a 1000:
            
            saldo = saldo + (saldo * INTERES / 100);
            
        }
    
    }

    @Override
    public void retirar(double entry) {
        
        if((saldo - entry) >= saldoMin){//Si el resultado de la extracción es mayor al mínimo,
            //se realizará la operación:
            
            saldo -= entry;
            
        }else{//Si no se cumple la condición, salta error:
            
            System.out.println("Error. No se puede retirar tanto dinero");
            
        }
    
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nCuenta Corriente{\n" + "Saldo Mínimo: "
                + saldoMin + '€' + '}';
        
    }
    
    
            
}
