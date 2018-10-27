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
 * @author Steven
 */
public class SellLandTest {
    
    public SellLandTest() {
    }

    /**
     * Test of sellland method, of class SellLand.
     */
    @Test
    public void testSellland() {
        System.out.println("sellland 1");
        int userAcers = 6;
        int acresSold = 3;
        int landPrice = 10;
        SellLand instance = new SellLand();
        int expResult = 30;
        int result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    System.out.println("sellland 2");
         userAcers = 6;
         acresSold = 2;
         landPrice = 0;
         expResult = -1;
         result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);
    
    System.out.println("sellland 3");
         userAcers = 5;
         acresSold = 0;
         landPrice = 4;
         expResult = -2;
         result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);
    
    System.out.println("sellland 4");
         userAcers = 0;
         acresSold = 1;
         landPrice = 8;
         expResult = -3;
         result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);   
    
    System.out.println("sellland 5");
         userAcers = 6;
         acresSold = 1;
         landPrice = 2;
         expResult = 2;
         result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);
    
        System.out.println("sellland 6");
         userAcers = 1;
         acresSold = 0;
         landPrice = 12;
         expResult = -2;
         result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);
    
    System.out.println("sellland 7");
         userAcers = 1;
         acresSold = 1;
         landPrice = 3;
         expResult = 3;
         result = instance.sellland(userAcers, acresSold, landPrice);
        assertEquals(expResult, result);
    }
    
    
}
