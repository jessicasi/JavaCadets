/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessicasi
 */
public class SellBreadTest {

    public SellBreadTest() {
    }

    /**
     * Test of sellBread method, of class SellBread.
     */
    @Test
    public void testSellBread() {
        System.out.println("sellBread1");
        int loaves = 3;
        int price = 6;
        SellBread instance = new SellBread();
        int expResult = 3;
        int result = instance.sellBread(loaves);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        //Test Case 2
        System.out.println("sellBread2");
        loaves = 11;
        price = 6;
        expResult = -2;
        result = instance.sellBread(loaves);
        assertEquals(expResult, result);

        //Test Case 3
        System.out.println("sellBread3");
        loaves = 0;
        price = 6;
        expResult = -1;
        result = instance.sellBread(loaves);
        assertEquals(expResult, result);

        //Test Case 4
        System.out.println("sellBread4");
        loaves = 6;
        price = 2;
        expResult = -3;
        result = instance.sellBread(loaves);
        assertEquals(expResult, result);

        //Test Case 5
        System.out.println("sellBread5");
        loaves = 1;
        price = 3;
        result = instance.sellBread(loaves);
        expResult = 0;
        assertEquals(expResult, result);

        //Test Case 6
        System.out.println("sellBread6");
        loaves = 3;
        price = 8;
        expResult = 9;
        result = instance.sellBread(loaves);
        assertEquals(expResult, result);

        //Test Case 7
        System.out.println("sellBread7");
        loaves = 1;
        price = 6;
        expResult = 1;
        result = instance.sellBread(loaves);
        assertEquals(expResult, result);
    }

}
