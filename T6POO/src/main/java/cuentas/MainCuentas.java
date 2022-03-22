/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 *
 * @author fco-j
 */
import daw_fjmg.t6poo.*;
import java.util.*;

public class MainCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos un ArrayList de cuentas:        
        ArrayList <Cuenta> cuentas = new ArrayList <>();
        
        //Añadimos a la lista dos cuentas de cada tipo,
        //una de ellas por defecto, y otra con parámetros:
        cuentas.add(new CuentaAhorro());
        cuentas.add(new CuentaCorriente());
        cuentas.add(new CuentaAhorro(new Cliente(), 69, 131.5));
        cuentas.add(new CuentaCorriente(1480, new Cliente()));
        
        //Asignamos a cada cuenta 2000€ de saldo:
        for (Cuenta c : cuentas) {
            
            c.setSaldo(2000);
            
        }
        
        //Realizamos otro bucle:
        for (Cuenta c : cuentas) {
        
            //Mostramos cada cuenta, retiramos 780€ y actualizamos el saldo:
            System.out.println("Cuentas: \n" + c);
            c.retirar(780);
            c.actualizarSaldo();
        
        }
        
        System.out.println("");
        
        //Realizamos un último bucle:
        for (Cuenta c : cuentas) {
        
            //Mostramos las cuentas con los saldos actualizados:
            System.out.println("Cuentas: \n" + c);
            
            //Retiramos una cantidad excesiva, que resultará en error:
            c.retirar(9000);
        
        }
        
    }
    
}
