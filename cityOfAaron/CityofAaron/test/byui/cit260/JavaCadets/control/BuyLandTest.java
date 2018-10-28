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
        int userAcres = 1;
        int wheat = 20;
        int acresBought = 1;
        int landPrice = 15;
        BuyLand instance = new BuyLand();
        int expResult = 5;
        int result = instance.buyLand(userAcres, wheat, acresBought, landPrice);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 2");
        userAcres = 3;
        wheat = 5;
        acresBought = 2;
        landPrice = 5;
        // BuyLand instance = new BuyLand();
        expResult = -1;
        result = instance.buyLand(userAcres, wheat, acresBought, landPrice);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 3");
        userAcres = 3;
        wheat = 5;
        acresBought = 0;
        landPrice = 15;
        // BuyLand instance = new BuyLand();
        expResult = -2;
        result = instance.buyLand(userAcres, wheat, acresBought, landPrice);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        userAcres = 0;
        wheat = 35;
        acresBought = 2;
        landPrice = 15;
        // BuyLand instance = new BuyLand();
        expResult = 5;
        result = instance.buyLand(userAcres, wheat, acresBought, landPrice);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
