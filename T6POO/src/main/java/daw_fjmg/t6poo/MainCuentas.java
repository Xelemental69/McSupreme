/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class MainCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Cuenta> cuentas = new ArrayList <>();
        
        cuentas.add(new CuentaAhorro(new Cliente(), 69, 131.5));
        cuentas.add(new CuentaCorriente(420, new Cliente()));
        
        cuentas.get(0).setSaldo(500);
        cuentas.get(1).setSaldo(500);
        
        for (Cuenta c : cuentas) {
        
            System.out.println("Cuentas: \n" + c);
            c.retirar(78);
            c.actualizarSaldo();
        
        }
        
        System.out.println("");
        
        for (Cuenta c : cuentas) {
        
            System.out.println("Cuentas: \n" + c);
            c.retirar(900);
            c.actualizarSaldo();
        
        }
        
    }
    
}
