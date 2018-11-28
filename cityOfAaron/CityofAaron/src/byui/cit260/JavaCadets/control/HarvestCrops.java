/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author Steven
 */
public class HarvestCrops {
    
    public int harvestCrops(Game game) throws HarvestCropsException{
      
        int cropYield = 0;
        int bushelsPerAcre = 0;
        int percent = game.getTithingPaid();
        int range = 0;
        
       
        
        if(game.getAcresOwned() <=0){
            throw new HarvestCropsException("There are no acres to harvest");
        }
        if (game.getTithingPaid() <=0){
            throw new HarvestCropsException("You didn't pay your tithing yet, so there aren't any crops to harvest");
        }
        
        if (percent > 12) {
            range = 4;
            bushelsPerAcre = (int) (Math.random() * range) + 2;
            cropYield = bushelsPerAcre * game.getAcresOwned(); 
        }
        else if (percent >= 8 && percent <12) {
       
            range = 3;
             bushelsPerAcre = (int) (Math.random() * range) + 2;
            cropYield = bushelsPerAcre * game.getAcresOwned(); 
        }
        else {
            range = 3;
             bushelsPerAcre = (int) (Math.random() * range) + 1;
            cropYield = bushelsPerAcre * game.getAcresOwned(); 
        }
        
        //TO DO: add crop yield to wheat in storage??
        
        return cropYield;
    }
        
}


