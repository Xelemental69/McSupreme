/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vugas;

/**
 *
 * @author fco-j
 */
public class Deportivo extends Vehiculo {

    private int cilindrada; // Atributo específico de Deportivo

    public Deportivo(int cilindrada, Long bastidor, String matricula,
            double kilometros, String marca, String modelo, String color,
            double tarifa, boolean disponible, boolean marchaAutomatica,
            int numeroPuertas) {

        super(bastidor, matricula, kilometros, marca, modelo, color, tarifa,
                disponible, marchaAutomatica, numeroPuertas);

        this.cilindrada = cilindrada;

    }

    public Deportivo() {

        super();
        this.cilindrada = 4;

    }

    public int getCilindrada() {

        return cilindrada;

    }

    public void setCilindrada(int cilindrada) {

        this.cilindrada = cilindrada;

    }

    @Override
    public String getAtributos() {

        return super.getAtributos() + ":"
                + cilindrada;

    }

    public void metodoDeportivo() {

        System.out.println("Este método es de la clase Deportivo");

    }

    

}
