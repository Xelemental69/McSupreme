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

    public CuentaCorriente(double sueldoMin, Cliente cliente) {
        
        super(cliente);
        this.saldoMin = sueldoMin;
        this.saldo = sueldoMin;
        
    }

    public double getSaldo() {
        
        return saldo;
        
    }

    public void setSaldo(double saldo) {
        
        this.saldo = saldo;
        
    }
        
    @Override
    public void actualizarSaldo() {
        
        if (saldoMin > 1000){
            
            saldo = saldo + (saldoMin * INTERES / 100);
            
        }else{
            
            saldo = saldo + (saldo * INTERES / 100);
            
        }
    
    }

    @Override
    public void retirar(double entry) {
        
        if((saldo - entry) >= saldoMin){
            
            saldo -= entry;
            
        }else{
            
            System.out.println("Error. No se puede retirar tanto dinero");
            
        }
    
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nCuenta Corriente{\n" + "Saldo Mínimo: "
                + saldoMin + '}';
        
    }
    
    
            
}
