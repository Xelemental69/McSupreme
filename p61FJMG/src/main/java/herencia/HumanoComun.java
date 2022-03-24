/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author fco-j
 */
public class HumanoComun extends Ser{
    
    private String dni;

    public HumanoComun(String dni, String nombre, String apellidos) {
        
        super(nombre, apellidos);
        if(dni.length() == 9){
            
            this.dni = dni;
        
        }else{
            
            System.out.println("ERROR. No coincide con el formato aceptado");
            
        }
        
    }

    public HumanoComun() {
        
        super();
        dni = "13158649X";
        
    }
    
    public void esUsuarioPersonas(){//Metodo Abstracto A
        
        System.out.println("No, no es un usuario de Personas");
        
    }
    
    public void datoAdicional(){
        
        System.out.println(" \"Escuché rumores sobre un pintor "
                + "que desapareció hace décadas. Decía algo sobre"
                + " una puerta hacia una habitación azulada "
                + "y un señor de nariz muy larga\" ");
        
    }
    
    //SETTERS Y GETTERS:

    public String getDni() {
        
        return dni;
        
    }

    public void setDni(String dni) {
        
        if(dni.length() == 9){
            
            this.dni = dni;
        
        }else{
            
            System.out.println("ERROR. No coincide con el formato aceptado");
            
        }
        
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
    public String toString() {
        
        return super.toString() + "\nY su DNI es: " + dni
                + "\nNo es un usuario de Personas";
        
    }    
            
}
