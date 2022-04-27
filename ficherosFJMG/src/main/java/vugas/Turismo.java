/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vugas;

/**
 *
 * @author fco-j
 */
public class Turismo extends Vehiculo {

    private String color;

    // Constructor con parámetros de tanto esta clase como la clase padre
    public Turismo(String color, int numeroPuertas, Long bastidor, String matricula,
            double kilometros, String marca, String modelo,
            double tarifa, boolean disponible, boolean marchaAutomatica) {

        // Primera línea de código de un constructor
        //clase hija es llamar al constructor padre
        //(para ello usamos super, que referencia al padre):
        super(bastidor, matricula, kilometros, marca, modelo, tarifa,
                disponible, marchaAutomatica, numeroPuertas);
        
        this.color = color;
        
    }

    

    public Turismo() {

        // Llama al constructor por defecto de Vehiculo
        super();
        color = "Blanco";

    }
    
    public String getColor() {

        return color;

    }

    // Métodos propios de turismo
    public void setColor(String color) {
        this.color = color;
    }

    public void metodoTurismo() {
        System.out.println("Este es el método propio de turismo");
    }
    
    @Override
    public String getAtributos() {

        return super.getAtributos() + ":" + color;

    }

    

}
