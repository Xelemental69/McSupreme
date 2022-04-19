/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vugas;

/**
 *
 * @author fco-j
 */
public class Turismo extends Vehiculo{
    
    // Atributo propio de Turismo, que no existe en vehiculo
    private int numeroPuertas;
    
    // Constructor con parámetros de tanto esta clase como la clase padre
    public Turismo(int numeroPuertas, Long bastidor, String matricula, 
            String marca, String modelo, String color, double tarifa,
            boolean disponible) {
        
        // Primera línea de código de un constructor
        //clase hija es llamar al constructor padre
        //(para ello usamos super, que referencia al padre):
        
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        
        // Inicialización de atributos propios de la subclase
        
        this.numeroPuertas = numeroPuertas;
        
    }
    
    // Sobrescribimos el método getAtributos del padre para esta clase:
    @Override
    public String getAtributos() {
        return super.getAtributos() + "\n\tTurismo{" + 
                "\n\tNumeroPuertas: " + numeroPuertas + '}';
    }
    
   
    public Turismo(){
        
        // Llama al constructor por defecto de Vehiculo
        super();
        this.numeroPuertas = 5;//Valor por defecto del atributo propio
        //del Gran Turismo.
        
    }

    // Métodos propios de turismo
    public int getNumeroPuertas() {
        
        return numeroPuertas;
        
    }

    public void setNumeroPuertas(int numeroPuertas) {
        
        this.numeroPuertas = numeroPuertas;
        
    }
    
    public void metodoTurismo(){
        
        System.out.println("Este es el método propio de turismo");
        
    }


    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            
            return true;
            
        }
        
        if (obj == null) {
            
            return false;
            
        }
        
        if (getClass() != obj.getClass()) {
            
            return false;
            
        }
        
        // Compara ambos vehiculos antes de comparar
        // los atributos propios de turismo
        if (!super.equals(obj)){
            
            return false;
            
        }
        
        final Turismo other = (Turismo) obj;
        
        if (this.numeroPuertas != other.numeroPuertas) {
            
            return false;
            
        }
        
        return true;
    }
    
}
