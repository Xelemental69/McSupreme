/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package konodioda.crappycalc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fco-j
 */
public class SumaTest {
    
    public SumaTest() {
    }

    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 1.0;
        double b = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result, 0.0);
    }
        
}
