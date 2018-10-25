/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

/**
 *
 * @author Steven
 */
public class HarvestCrops {
    
    public int harvestCrops(int userAcres, int tithesAndOfferings) {
      
        int wheat = 0;
        int bushelsPerAcre = 0;
        int cropYield = 0;
        int percent = tithesAndOfferings;
       
        if(userAcres <=0){
            return -1;
        }
        if (percent > 12) {
             bushelsPerAcre = (int) (Math.random() * (5 - 2)) + 0;
            wheat = bushelsPerAcre * userAcres; 
        }
        else if (percent >= 8 && percent <12) {
             bushelsPerAcre = (int) (Math.random() * (4 - 2)) + 0;
            wheat = bushelsPerAcre * userAcres; 
        }
        else {
             bushelsPerAcre = (int) (Math.random() * (3 - 1)) + 0;
            wheat = bushelsPerAcre * userAcres; 
        }
        
        return cropYield = wheat;
    }
        
}


