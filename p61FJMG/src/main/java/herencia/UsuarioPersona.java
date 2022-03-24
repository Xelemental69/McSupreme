/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public class UsuarioPersona extends Ser {
    
    private String id;
    private MetodoActivacion metodo;

    public UsuarioPersona(String id, MetodoActivacion metodo,
            String nombre, String apellidos) {
        
        super(nombre, apellidos);
        this.id = id;
        this.metodo = metodo;
        
    }
    
    public UsuarioPersona() {
        
        super();
        id = "X-824";
        metodo = MetodoActivacion.MASCARA;
        
    }

    public void esUsuarioPersonas(){
        
        System.out.println("Es un usuario de Personas");
        
    }
    
    public void provenienciaPoderes(){//Método B
    
        switch(metodo){
            //Casos en el switch: NAIPE, PISTOLA, MASCARA, ESTILO_P1_P2;
            case NAIPE:
                System.out.println("Obtuvo el poder desde la densidad de la niebla");
                break;
            
            case PISTOLA:
                System.out.println("Obtuvo el poder en la"
                        + " hora más oscura de las noches");
                break;
            
            case MASCARA:
                System.out.println("Obtuvo el poder desde una dimensión solo"
                        + " habitada por conciencias cognitivas");
                break;
                
            case ESTILO_P1_P2:
                System.out.println("Obtuvo el poder en un mundo manipulado"
                        + " por seres más allá de toda comprensión");
                break;
                
        }
    
    }
    
    public String estadoPersona(){//Método B2
        
        return "Latente";
        
    }
    
    public String getId() {
        
        return id;
        
    }

    public void setId(String id) {
        
        this.id = id;
        
    }

    public MetodoActivacion getMetodo() {
        
        return metodo;
        
    }

    public void setMetodo(MetodoActivacion metodo) {
        
        this.metodo = metodo;
        
    }

    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getApellidos() {
        
        return apellidos;
        
    }

    public void setApellidos(String apellidos) {
        
        this.apellidos = apellidos;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.metodo);
        return hash;
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
        final UsuarioPersona other = (UsuarioPersona) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return this.metodo == other.metodo;
    }
        
    @Override
    public String toString() {
        
        String invocacion = "";
        
        switch(metodo){
            //Casos en el switch: NAIPE, PISTOLA, MASCARA, ESTILO_P1_P2;
            case NAIPE:
                invocacion = "a través de las cartas que llevan a mano";
                break;
            
            case PISTOLA:
                invocacion = "a través del uso de una pistola";
                break;
            
            case MASCARA:
                invocacion = "a través de las máscaras que llevan puestas";
                break;
                
            case ESTILO_P1_P2:
                invocacion = "sin necesidad de ningún dispositivo especial";
                break;
                
        }
        
        return super.toString() + "\nEs reconocido con la ID " + id
                + "\nEs un usuario de persona que las invoca ";
                        
    }
            
}
