/*
 *
 * Desarrolla una clase Cancion con los siguientes atributos:
 * 
 * titulo: una variable String que guarda el título de la canción.
 *
 * autor: una variable String que guarda el autor de la canción.
 *
 * y los constructores por defecto (inicializando a cadenas vacías)
 * y parametrizado, así como métodos get, set y toString. En una clase
 * de prueba, con el método main(), crea un par de objetos y prueba los
 * métodos get, set y toString.
 *
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 * 
 */
public enum CancionEnum {//Versión enum de la clase Canción
    
        LEFT_OUTSIDE_ALONE("Left Outside Alone", "Anastasia"),
        IM_OUTTA_LOVE("I'm Outta Love", "Anastasia"),
        ONE_DAY_IN_YOUR_LIFE("One Day In Your Life", "Anastasia"),
        POKER_FACE("Poker Face", "Lady Gaga");
    
        final private String TITULO;
        final private String AUTOR;
    
    private CancionEnum(String titulo, String autor){
        
        this.TITULO = titulo;
        this.AUTOR = autor;
        
    }
    
    public String getTitle() {
        
        return this.TITULO;
        
    }
    
    public String getAuthor() {
        
        return this.AUTOR;
        
    }
            
    @Override
    public String toString(){
        
        return "Autor de la canción: " + this.AUTOR + "\n" + "Título de la "
                + "canción: " + this.TITULO;
        
    }
    
}
