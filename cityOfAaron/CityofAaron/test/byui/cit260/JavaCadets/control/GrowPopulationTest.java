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
public class GrowPopulationTest {
    
    public GrowPopulationTest() {
    }

    /**
     * Test of growPopulation method, of class GrowPopulation.
     */
    @Test
    public void testGrowPopulation() {
        System.out.println("growPopulation1");
        int population = 100;
        float growthRate = 3;
        GrowPopulation instance = new GrowPopulation();
        int expResult = 103;
        int result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("growPopulation2");
        population = 0;
        growthRate = 5;
        expResult = -1;
        result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
        
        System.out.println("growPopulation3");
        population = 100;
        growthRate = 0;
        expResult = -2;
        result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
        
        System.out.println("growPopulation4");
        population = 100;
        growthRate = 6;
        expResult = -3;
        result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
        
        System.out.println("growPopulation5");
        population = 1;
        growthRate = 5;
        expResult = 2;
        result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
        
        System.out.println("growPopulation6");
        population = 100;
        growthRate = 1;
        expResult = 101;
        result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
        
        System.out.println("growPopulation7");
        population = 100;
        growthRate = 5;
        expResult = 105;
        result = instance.growPopulation(population, growthRate);
        assertEquals(expResult, result);
    }
    
}
