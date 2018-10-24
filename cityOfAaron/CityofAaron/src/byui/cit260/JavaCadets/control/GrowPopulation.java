/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

/**
 *
 * @author jessicasi
 */
public class GrowPopulation {
    
    public int growPopulation(int population, float growthRate) {
        
        if (population < 1) {
            return -1;
        }
        if (growthRate < 1) {
            return -2;
        }
        if (growthRate > 5) {
            return -3;
        }
        
        growthRate = growthRate/100;
        int newPopulation = (int) (population * growthRate);
        
        if (newPopulation == 0) {
            newPopulation = 1;
        }
        

        return (population += newPopulation);
       
    
    }
    
}
