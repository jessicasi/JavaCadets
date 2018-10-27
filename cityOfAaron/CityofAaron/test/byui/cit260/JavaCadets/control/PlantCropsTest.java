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
 * @author steven
 * @author jessica
 */
public class PlantCropsTest {
    
    public PlantCropsTest() {
    }

    /**
     * Test of plantCrops method, of class PlantCrops.
     */
    @Test
    
    public void testPlantCrops() {
        System.out.println("Test Case 1");
        int acres = 5;
        int wheat = 10;
        int userAcres = 2;
        PlantCrops instance = new PlantCrops();
        int expResult = 9;
        int result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    
        System.out.println("Test Case 2");
        acres = 0;
        wheat = 10;
        userAcres = 1;
        // PlantCrops instance = new PlantCrops();
        expResult = -1;
        result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 3");
        acres = 10;
        wheat = 0;
        userAcres = 2;
        // PlantCrops instance = new PlantCrops();
        expResult = -2;
        result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        acres = 10;
        wheat = 5;
        userAcres = 0;
        // PlantCrops instance = new PlantCrops();
        expResult = -3;
        result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 5");
        acres = 1;
        wheat = 10;
        userAcres = 1;
        // PlantCrops instance = new PlantCrops();
        expResult = 9;
        result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 6");
        acres = 10;
        wheat = 1;
        userAcres = 2;
        // PlantCrops instance = new PlantCrops();
        expResult = 0;
        result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 7");
        acres = 10;
        wheat = 5;
        userAcres = 1;
        // PlantCrops instance = new PlantCrops();
        expResult = 4;
        result = instance.plantCrops(acres, wheat, userAcres);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    
    }
        
}
