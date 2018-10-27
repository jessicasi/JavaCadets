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
public class HarvestCropsTest {
    
    public HarvestCropsTest() {
    }

    /**
     * Test of harvestCrops method, of class HarvestCrops.
     */
    @Test
    public void testHarvestCrops() {
        System.out.println("harvestCrops1");
        int userAcres = 5;
        int tithesAndOfferings = 12;
        HarvestCrops instance = new HarvestCrops();
        int expResult = 10;
        int result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
        System.out.println("harvestCrops2");
         userAcres = 0;
         tithesAndOfferings = 12;
        //HarvestCrops instance = new HarvestCrops();
         expResult = -1;
        result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
        
        System.out.println("harvestCrops3");
         userAcres = 10;
         tithesAndOfferings = 0;
        //HarvestCrops instance = new HarvestCrops();
         expResult = -2;
        result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
        
        System.out.println("harvestCrops4");
         userAcres = 0;
         tithesAndOfferings = 0;
        //HarvestCrops instance = new HarvestCrops();
         expResult = -1;
        result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
        
        System.out.println("harvestCrops5");
         userAcres = 3;
         tithesAndOfferings = 1;
        //HarvestCrops instance = new HarvestCrops();
         expResult = 6;
        result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
    
         System.out.println("harvestCrops6");
         userAcres = 50;
         tithesAndOfferings = 9;
        //HarvestCrops instance = new HarvestCrops();
         expResult = 150;
        result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
    
         System.out.println("harvestCrops7");
         userAcres = 12;
         tithesAndOfferings = 8;
        //HarvestCrops instance = new HarvestCrops();
         expResult = 36;
        result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
    }
    
}
