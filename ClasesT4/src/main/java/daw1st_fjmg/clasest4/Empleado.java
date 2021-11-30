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
    int irpf;
    int newirpf;
    boolean casado;
    int hijos;

    public Empleado() {

        this.nombre1 = "Sr.";
        this.nombre2 = "X";
        this.apellido1 = "Unknown";
        this.apellido2 = "Mystery";
        this.nif = "01234567Z";
        this.sueldoBase = 0;
        this.pagoHoraExtra = 0;
        this.horasExtra = 10;
        this.irpf = 20;
        this.casado = false;
        this.hijos = 0;

    }

    public Empleado(String nombre1, String nombre2, String apellido1,
            String apellido2, String nif, double sueldoBase, double pagoHoraExtra,
            int horasExtra, int irpf, boolean casado, int hijos) {

        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        if (!(horasExtra < 10 || horasExtra > 25)) {
            this.horasExtra = horasExtra;
        }
        if (irpf > 0 && irpf < 21) {
            this.irpf = irpf;
        } else {
            this.irpf = 20;
        }
        this.casado = casado;
        this.hijos = hijos;

    }

    public void setNombre1(String nombre1) {

        this.nombre1 = nombre1;

    }

    public void setNombre2(String nombre2) {

        this.nombre2 = nombre2;

    }

    public void setApellido1(String apellido1) {

        this.apellido1 = apellido1;

    }

    public void setApellido2(String apellido2) {

        this.apellido2 = apellido2;

    }

    public void setNIF(String nif) {

        this.nif = nif;

    }

    public void setSueldoBase(double sueldoBase) {

        this.sueldoBase = sueldoBase;

    }

    public void setPagoHoraExtra(double pagoHoraExtra) {

        this.pagoHoraExtra = pagoHoraExtra;

    }

    public void setHorasExtra(int horasExtra) {

        this.horasExtra = horasExtra;

    }

    public void setIRPF(int irpf) {

        if (irpf > 0 && irpf < 21) {
            this.irpf = irpf;
        }

    }

    public void setCasado(boolean casado) {

        this.casado = casado;

    }

    public void setHijos(int hijos) {

        this.hijos = hijos;

    }

    public String getNombre1() {

        return this.nombre1;

    }

    public String getNombre2() {

        return this.nombre2;

    }

    public String getApellido1() {

        return this.apellido1;

    }

    public String getApellido2() {

        return this.apellido2;

    }

    public String getNIF() {

        return this.nif;

    }

    public double getSueldoBase() {

        return this.sueldoBase;

    }

    public double getPagoHoraExtra() {

        return this.pagoHoraExtra;

    }

    public int getHorasExtra() {

        return this.horasExtra;

    }

    public int getIRPF() {

        if (this.casado) {

            this.newirpf = this.irpf - 2 - this.hijos;

        } else {

            this.newirpf = this.irpf - this.hijos;

        }

        if (this.newirpf < 0) {

            this.newirpf = 0;

        }

        return this.newirpf;

    }

    public boolean getCasado() {

        return this.casado;

    }

    public int getHijos() {

        return this.hijos;

    }

    public double ComplementoHE() {

        return (this.horasExtra * this.pagoHoraExtra);

    }

    public double getSueldoBruto() {

        return (this.sueldoBase + ComplementoHE());

    }

    public double sueldoNeto() {

        double irpfPerc = (double) this.newirpf / 100;

        return (getSueldoBruto() - (getSueldoBruto() * irpfPerc));

    }

    public void basicInfo() {

        System.out.println("1er Nombre: " + this.nombre1 + "\n"
                + "2º Nombre: " + this.nombre2 + "\n" + "1er Apellido: "
                + this.apellido1 + "\n" + "2º Appellido" + this.apellido2
                + "NIF: " + this.nif + "\n" + "Estado civil: " + (this.casado
                        ? "Casado" : "No Casado") + "\n" + "Hijos: " + this.hijos);

    }

    public void allInfo() {

        basicInfo();

        System.out.println("Sueldo base: " + this.sueldoBase + "\n"
                + "Complemento horas: " + this.ComplementoHE() + "Sueldo bruto: "
                + this.getSueldoBruto() + "IRPF: " + this.newirpf + "%\n"
                + "Sueldo neto: " + this.sueldoNeto());

    }

    @Override
    public String toString() {

        return "1er Nombre: " + this.nombre1 + "\n"
                + "2º Nombre: " + this.nombre2 + "\n" + "1er Apellido: "
                + this.apellido1 + "\n" + "2º Appellido" + this.apellido2
                + "NIF: " + this.nif + "\n" + "Estado civil: " + (this.casado
                        ? "Casado" : "No Casado") + "\n" + "Hijos: " + this.hijos
                + "Sueldo base: " + this.sueldoBase + "\n"
                + "Complemento horas: " + this.ComplementoHE() + "Sueldo bruto: "
                + this.getSueldoBruto() + "IRPF: " + this.newirpf + "%\n"
                + "Sueldo neto: " + this.sueldoNeto();

    }

}
