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
public class Cancion {
    
    String titulo;
    String autor;
    
    public Cancion(String titulo, String autor){
        
        this.titulo = titulo;
        this.autor = autor;
        
    }
    
    public String getTitle() {
        
        return this.titulo;
        
    }
    
    public String getAuthor() {
        
        return this.autor;
        
    }
    
    public void setTitle(String titulo) {
        
        this.titulo = titulo;
        
    }
    
    public void setAuthor(String autor) {
        
        this.autor = autor;
        
    }
    
    @Override
    public String toString(){
        
        return "Autor de la canción: " + this.autor + "\n" + "Título de la "
                + "canción: " + this.titulo;
        
    }
    
}
