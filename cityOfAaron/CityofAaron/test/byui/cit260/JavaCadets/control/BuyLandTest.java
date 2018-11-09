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
 * @author skylerfoxx
 */
public class BuyLandTest {
    
    public BuyLandTest() {
    }

    /**
     * Test of buyLand method, of class BuyLand.
     */
    @Test
    public void testBuyLand() {
        System.out.println("Test Case 1");
        int userAcres = 2;
        int wheat = 15;
        int acresBought = 2;
        int price = 5;
        BuyLand instance = new BuyLand();
        int expResult = 5;
        int result = instance.BuyLand();
        assertEquals(expResult, result);
        
        System.out.println("Test Case 2");
        userAcres = 1;
        wheat = 5;
        acresBought = 2;
        price = 15;
        // BuyLand instance = new BuyLand();
        expResult = -1;
        result = instance.BuyLand();
        assertEquals(expResult, result);
        
        System.out.println("Test Case 3");
        userAcres = 3;
        wheat = 30;
        acresBought = 0;
        price = 10;
        // BuyLand instance = new BuyLand();
        expResult = -2;
        result = instance.BuyLand();
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        userAcres = 4;
        wheat = 40;
        acresBought = 3;
        price = 20;
        // BuyLand instance = new BuyLand();
        expResult = -1;
        result = instance.BuyLand();
        assertEquals(expResult, result);
        
        System.out.println("Test Case 5");
        userAcres = 0;
        wheat = 30;
        acresBought = 2;
        price = 9;
        // BuyLand instance = new BuyLand();
        expResult = 12;
        result = instance.BuyLand();
        assertEquals(expResult, result);
        
        System.out.println("Test Case 6");
        userAcres = 10;
        wheat = 5;
        acresBought = 4;
        price = 1;
        // BuyLand instance = new BuyLand();
        expResult = 1;
        result = instance.BuyLand();
        assertEquals(expResult, result);
        
        System.out.println("Test Case 7");
        userAcres = 3;
        wheat = 25;
        acresBought = 3;
        price = 7;
        // BuyLand instance = new BuyLand();
        expResult = 4;
        result = instance.BuyLand();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
