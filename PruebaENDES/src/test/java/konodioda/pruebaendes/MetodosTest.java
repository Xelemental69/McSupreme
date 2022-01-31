/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package konodioda.pruebaendes;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fco-j
 */
public class MetodosTest {
    
    public MetodosTest(String[] args) {
    }

    @Test
    public void testTallaXS() {
        
        System.out.println("Tallas");
        String t = "XS";
        Metodos instance = new Metodos();
        String expResult = "Extra pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTallaS() {
        
        System.out.println("Tallas");
        String t = "S";
        Metodos instance = new Metodos();
        String expResult = "Pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTallaM() {
        
        System.out.println("Tallas");
        String t = "M";
        Metodos instance = new Metodos();
        String expResult = "Mediana";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTallaL() {
        
        System.out.println("Tallas");
        String t = "L";
        Metodos instance = new Metodos();
        String expResult = "Grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTallaXL() {
        
        System.out.println("Tallas");
        String t = "XL";
        Metodos instance = new Metodos();
        String expResult = "Muy grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testTallaXXL() {
        
        System.out.println("Tallas");
        String t = "XXL";
        Metodos instance = new Metodos();
        String expResult = "Extra grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIva() {
        System.out.println("iva");
        double precio = 69.0;
        Metodos instance = new Metodos();
        double expResult = 83.49;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
    }                
    
}
