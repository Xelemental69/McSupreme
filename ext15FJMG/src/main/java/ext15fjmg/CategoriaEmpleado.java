/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ext15fjmg;

/**
 *
 * @author fco-j
 */
public enum CategoriaEmpleado {
    
    //Categorías del enum:
    INICIAL ("Categoría Básica", 50),
    MEDIA ("Categoría Media", 70),
    AVANZADA ("Categoría Avanzada", 100);
    
    private final String NOMBRE_CAT;
    private final double COMPLEMENTO;

    private CategoriaEmpleado(String nombreCat, double complemento) {
        //Constructor parametrizado
        this.NOMBRE_CAT = nombreCat;
        this.COMPLEMENTO = complemento;
        
    }

    //GETTERS Y SETTERS:
    
    public String getNOMBRE_CAT() {
        
        return NOMBRE_CAT;
        
    }

    public double getCOMPLEMENTO() {
        
        return COMPLEMENTO;
        
    }

    public static CategoriaEmpleado getINICIAL() {
        
        return INICIAL;
        
    }

    public static CategoriaEmpleado getMEDIA() {
        
        return MEDIA;
        
    }

    public static CategoriaEmpleado getAVANZADA() {
        
        return AVANZADA;
        
    }        

    @Override
    public String toString() {
        
        return "CategoriaEmpleado{" + "NOMBRE_CAT=" + NOMBRE_CAT + 
                ", COMPLEMENTO=" + COMPLEMENTO + '}';
        
    }
            
}
