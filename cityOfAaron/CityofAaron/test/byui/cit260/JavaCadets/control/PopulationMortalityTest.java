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
public class PopulationMortalityTest {
    
    public PopulationMortalityTest() {
    }

    /**
     * Test of populationMortality method, of class PopulationMortality.
     */
    @Test
    public void testPopulationMortality() {
        System.out.println("populationMortality1");
        int population = 5;
        int wheat = 100;
        PopulationMortality instance = new PopulationMortality();
        int expResult = 5;
        int result = instance.populationMortality(population, wheat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
        System.out.println("populationMortality2");
        population = 6;
        wheat = 100;
        expResult = 5;
        result = instance.populationMortality(population, wheat);
        assertEquals(expResult, result);
        
        System.out.println("populationMortality3");
        population = 10;
        wheat = -1;
        expResult = -1;
        result = instance.populationMortality(population, wheat);
        assertEquals(expResult, result);
        
        System.out.println("populationMortality4");
        population = -1;
        wheat = 100;
        expResult = -2;
        result = instance.populationMortality(population, wheat);
        assertEquals(expResult, result);
        
        System.out.println("populationMortality5");
        population = 5;
        wheat = 0;
        expResult = 0;
        result = instance.populationMortality(population, wheat);
        assertEquals(expResult, result);
        
        System.out.println("populationMortality6");
        population = 0;
        wheat = 100;
        expResult = 0;
        result = instance.populationMortality(population, wheat);
        assertEquals(expResult, result);
    }
    
    
}
