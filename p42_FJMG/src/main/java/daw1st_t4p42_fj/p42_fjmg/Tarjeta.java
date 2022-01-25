/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw1st_t4p42_fj.p42_fjmg;

/**
 *
 * @author Francisco José MG (Xele)
 */
//Incluimos estos repertorios:
import java.lang.Character;
import java.time.*;
import java.util.*;

public class Tarjeta {

    //Declaramos las variables dentro de la clase 
    private String numTarjeta;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String banco;
    private String cvv;
    private double saldo;
    private boolean valido = true;
    private LocalDate caducidad;
    //Por último, estas dos clases determinan la cantidad mínima y máxima que 
    //puede haber de saldo:
    public static final double MIN = 500;
    public static final double MAX = 3000;

    public Tarjeta(String numTarjeta, String nombre, String apellido1,
            String apellido2, String banco, String cvv, double saldo, int mes,
            int ano) {//Constructor parametrizado

        //Comprobamos que el número de la tarjeta y el nº secreto son válidos
        if (validez(numTarjeta, cvv)) {//En caso afirmativo, ponemos los datos

            this.numTarjeta = numTarjeta;
            this.cvv = cvv;
        } else {//Si no, se pondrán datos por defecto, 
            //y la tarjeta será inhabilitada:
            System.out.println("Nº de tarjeta y/o Nº secreto introducido "
                    + "no son válidos");
            this.numTarjeta = "0123456789012345";
            this.cvv = "012";
        }

        //Pasamos el nombre y apellidos
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;

        //Pasamos el nombre de la entidad bancaria
        this.banco = banco;

        //Comprobamos el saldo introducido:
        if (saldo < MIN || saldo > MAX) {
            //Si se sale del rango establecido por min y max, se establece por 
            //defecto:

            System.out.println("El saldo aportado se sale del rango...");
            this.saldo = 803.19;

        } else {//Sino, se pasa el valor parametrizado:

            this.saldo = saldo;

        }

        //Pasamos la fecha de caducidad y comprobamos si la fecha está cumplida
        this.caducidad = LocalDate.of(ano, mes, 1);
        if (this.caducado()) {
            //Si ya ha pasado la fecha de caducidad, se reestablece por defecto:
            this.caducidad = LocalDate.of(2077, 9, 13);
        }

        //Se crea la tarjeta siempre sin ser validada, pudiéndose 
        //activar con un método aparte
        valido = false;

    }

    public Tarjeta() {//Constructor por defecto
        //Introducimos valores por defecto:
        numTarjeta = "0123456789012345";
        cvv = "012";
        nombre = "AlexElCapo";
        apellido1 = "Contigo";
        apellido2 = "PIPO";
        banco = "Firewatch";
        saldo = 803.19;
        caducidad = LocalDate.of(2077, 9, 13);
        valido = false; //Siempre empieza anulada

        /*PD: Los valores del nombre, apellidos y la fecha son relacionados a un
        meme (este: https://www.youtube.com/watch?v=huie2_3Pekg ) */
    }

    public boolean validez(String nT, String cvv) {

        boolean v = true;
        char d;

        if (nT.length() == 16 && cvv.length() == 3) {

            for (int i = 0; i < 16; i++) {

                d = nT.charAt(i);
                if (!(Character.isDigit(d))) {

                    System.out.println("El nº de tarjeta es inválido "
                            + "(no es numérico)");
                    v = false;

                }

            }

            for (int j = 0; j < 3; j++) {

                d = cvv.charAt(j);
                if (!(Character.isDigit(d))) {

                    System.out.println("El CVV es inválido (no es numérico)");
                    v = false;

                }

            }

        } else if (nT.length() != 16) {

            System.out.println("El nº de tarjeta es inválido (fallo de longitud");
            v = false;

        } else {

            System.out.println("El CVV es inválido (fallo de longitud)");
            v = false;

        }

        return v;

    }

    public boolean caducado() {

        LocalDate ahora = LocalDate.now();
        boolean caduco;
        if (!(ahora.isBefore(caducidad))) {

            caduco = true;
            System.out.println("Esta tarjeta ya está caducada");
            this.valido = false;

        } else {

            caduco = false;

        }

        return caduco;

    }

    public LocalDate getCaducidad() {

        return caducidad;

    }

    public double getMin() {

        return MIN;

    }

    public double getMax() {

        return MAX;

    }

    public String getNumTarjeta() {

        return numTarjeta;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellido1() {

        return apellido1;

    }

    public String getApellido2() {

        return apellido2;

    }

    public String getCvv() {

        return cvv;

    }

    public void setCvv(String cvv) {

        this.cvv = cvv;

    }

    public double getSaldo() {

        return saldo;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public String getBanco() {

        return banco;

    }

    public boolean isValido() {

        return valido;

    }

    public void setValido() {

        if (saldo < 0 || this.caducado()) {
            this.valido = false;
        } else if (validez(numTarjeta, cvv)) {
            this.valido = true;
        }

    }

    public void anular() {

        this.valido = false;

    }

    public void pago() {
        Scanner entry = new Scanner(System.in);
        String cvv;
        double coste;
        int aux;

        try {

            System.out.println("Introduce la cantidad a pagar: ");
            coste = entry.nextDouble();

            System.out.println("Introduce el CVV: ");
            cvv = entry.next();

            if (cvv.equals(this.cvv) && this.valido && coste < saldo) {

                aux =(int) ((this.saldo*100) - (coste*100));
                this.setSaldo(aux/100.00);
                System.out.println("Operación realizada con éxito");

            } else if (!(cvv.equals(this.cvv))) {

                System.out.println("El CVV no corresponde con la tarjeta,"
                        + " anulando pago...");

            } else if (!this.valido) {

                System.out.println("ERROR. TARJETA NO ACTIVADA.\n PAGO ANULADO");

            } else {

                System.out.println("ERROR. SALDO INSUFICIENTE.\n PAGO ANULADO");

            }

        } catch (InputMismatchException ime) {

            System.out.println("ERROR DE INPUT. PAGO ANULADO");

        }

    }

    public void copiar(Tarjeta c) {

        numTarjeta = c.getNumTarjeta();
        cvv = c.getCvv();
        nombre = c.getNombre();
        apellido1 = c.getApellido1();
        apellido2 = c.getApellido2();
        banco = c.getBanco();
        saldo = c.getSaldo();
        caducidad = c.getCaducidad();
        valido = c.isValido();

    }

    @Override
    public String toString() {
        return "Tarjeta{\n" + "\n\tTitular: " + nombre + " " + apellido1 + " "
                + apellido2 + "\t Banco: " + banco
                + "\n\tCaduca en " + caducidad.getMonthValue() + '/'
                + caducidad.getYear() + "\tSaldo = " + saldo + '€'
                + "\n\tNumTarjeta = " + numTarjeta + "\n}";
    }

}
