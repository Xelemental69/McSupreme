/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class CuentaAhorro extends Cuenta{
    
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(Cliente cliente, double interes, double comisionAnual) {
        
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
        
    }

    @Override
    public void actualizarSaldo() {
        
        saldo = saldo + (saldo * interes / 100) - comisionAnual;
        
    }

    @Override
    public void retirar(double entry) {
        
        if (saldo >= entry){
            
            saldo -= entry;
            
        }else{
            
            System.out.println("Error. No se puede retirar tanto dinero");
            
        }
    
    }

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
