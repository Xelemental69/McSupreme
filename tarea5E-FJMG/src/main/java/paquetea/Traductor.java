/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetea;

/**
 *
 * @author pikac
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos la clase:
        Traduccion traductor = new Traduccion();
        
        //Le añadimos 10 entradas al traductor:
        traductor.guardarEntrada("Burguer", "Hamburguesa");
        traductor.guardarEntrada("Chocolate", "Chocolate");
        traductor.guardarEntrada("Gum", "Chicle");
        traductor.guardarEntrada("Ham", "Jamón");
        traductor.guardarEntrada("Computer", "Ordenador");
        traductor.guardarEntrada("Phone", "Móvil");
        traductor.guardarEntrada("Machine", "Máquina");
        traductor.guardarEntrada("Psicology", "Psicología");
        traductor.guardarEntrada("Scarf", "Pañuelo");
        traductor.guardarEntrada("Cock", "Poll*");
        
        //Modificamos la entrada con traduciión censurada a una
        //más correcta (aunque menos popular)
        traductor.modificarEntrada("Cock", "Gallo");
        
        //Mostramos la lista de palabras en inglés:
        System.out.println("Palabras en inglés:");
        System.out.println(traductor.listEng());
        
        //Mostramos la lista de palabras traducidas:
        System.out.println("Palabras en español:");
        System.out.println(traductor.listaEsp());        
        
    }
    
}
