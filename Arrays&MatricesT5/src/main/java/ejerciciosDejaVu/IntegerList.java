/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class IntegerList {

    private ArrayList<Integer> lista;

    public IntegerList() {
        
        lista = new ArrayList<>();
        
    }
    
    
    public IntegerList(int tam) {
        
        Random r = new Random();
        lista = new ArrayList<>();
        
        for (int i = 0; i < tam; i++){
            
            Integer aux = r.nextInt(91) + 10; 
            lista.add(aux);
            
        }
        
    }

    public ArrayList<Integer> getLista() {
        
        return lista;
    
    }

    public void setLista(ArrayList<Integer> lista) {
    
        this.lista = lista;
    
    }
    
    
}
