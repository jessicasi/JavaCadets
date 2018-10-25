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
        System.out.println("harvestCrops");
        int userAcres = 10;
        int tithesAndOfferings = 12;
        HarvestCrops instance = new HarvestCrops();
        int expResult = 0;
        int result = instance.harvestCrops(userAcres, tithesAndOfferings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
