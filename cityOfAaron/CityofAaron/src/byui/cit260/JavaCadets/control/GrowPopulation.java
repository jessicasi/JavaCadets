/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.GrowPopulationException;

/**
 *
 * @author jessicasi
 */
public class GrowPopulation {
    
    public int growPopulation(int population, float growthRate) throws GrowPopulationException{
        
        if (population < 1) {
            throw new GrowPopulationException("All of your people are gone!");

        }
        if (growthRate < 1) {
            throw new GrowPopulationException("Your growth rate is less than 0 - that's not growth, try again!");
        }
        if (growthRate > 5) {
            throw new GrowPopulationException("Your growth rate is too high, keep it 4 or under");
        }
        
        growthRate = growthRate/100;
        int newPopulation = (int) (population * growthRate);
        
        if (newPopulation == 0) {
            newPopulation = 1;
        }
        

        return (population += newPopulation);
       
    
    }
    
}
