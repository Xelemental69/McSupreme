/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  Crear una clase Empleado que modele la información que una empresa mantiene 
sobre cada empleado: nombre, apellidos, NIF, sueldo base, pago por hora 
extra, horas extra realizadas en el mes, tipo de IRPF (entre 1% y 20%), 
casado o no y número de hijos. Crea un constructor por defecto que 
inicialice los valores como consideres oportunos y otro constructor 
parametrizado. Además debes establecer los métodos get, set y toString.
En una clase de prueba, con el método main(), crea un par de objetos y 
prueba los métodos get y set.



 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Empleado {
    
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String nif;
    double sueldoBase;
    double pagoHoraExtra;
    int horasExtra;
    double irpf;
    boolean casado;
    int hijos;
    
    public Empleado(String nombre1, String nombre2, String apellido1,
    String apellido2, String nif, double sueldoBase, double pagoHoraExtra,
    int horasExtra, double irpf, boolean casado, int hijos){
        
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtra = horasExtra;
        this.irpf = irpf;
        this.casado = casado;
        this.hijos = hijos;
        
    }
    
    public void setNombre1(String nombre1){
        
        
        
    }
    
    public void setNombre2(String nombre2){
        
        
        
    }
    
    public void setApellido1(String apellido1){
        
        
        
    }
    
    public void setApellido2(String apellido2){
        
        
        
    }
    
    public void setNIF(String nif){
        
        
        
    }
    
    public void setSueldoBase(double sueldoBase){
        
        
        
    }
    
    public void setPagoHoraExtra(double pagoHoraExtra){
        
        
        
    }
    
    public void setHorasExtra(int horasExtra){
        
        
        
    }
    
    public void setIRPF(double irpf){
        
        
        
    }
    
    public void setCasado(boolean casado){



    }
    
    public void setHijos(int hijos){
        
        
        
    }
    
    public String getNombre1(){

        return this.nombre1;

    }

    public String getNombre2(){

        return this.nombre2;

    }

    public String getApellido1(){

        return this.apellido1;

    }

    public String getApellido2(){

        return this.apellido2;

    }

    public String getNIF(){

        return this.nif;

    }

    public double getSueldoBase(){

        return this.sueldoBase;

    }

    public double getPagoHoraExtra(){

        return this.pagoHoraExtra;

    }

    public int getHorasExtra(){

        return this.horasExtra;

    }

    public double getIRPF(){

        return this.irpf;

    }

    public boolean getCasado(){

        return this.casado;

    }

    public int getHijos(){

        return this.hijos;

    }
    
}