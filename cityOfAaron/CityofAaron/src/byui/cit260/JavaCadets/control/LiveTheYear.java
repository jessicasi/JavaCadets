/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.GrowPopulationException;
import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author jessicasi
 */
public class LiveTheYear {

    public String[] liveTheYear() throws HarvestCropsException, GrowPopulationException {

        String[] yearlyReport = null;
        HarvestCrops harvestCrops = new HarvestCrops();
        Game game = CityofAaron.getCurrentGame();

        int cropsHarvested = harvestCrops.harvestCrops(game);

//The number of bushels of wheat paid in offerings.
        int tithingPaid = game.getTithingPaid();
//The total number of bushels of wheat in store after adding the harvest and subtracting the wheat paid in offerings.

        int wheatInStore = (game.getWheatInStorage() + cropsHarvested) - tithingPaid;
//The number of bushels of wheat in store eaten by rats. This value is subtracted from the wheat in store.

//The number of people that starve because they don’t have enough wheat.
        int populationMortality = game.getPopulationMortality();

//The number of people that move into the city.  
        GrowPopulation growPopulation = new GrowPopulation();
        int newPeople = growPopulation.growPopulation(game);
        

        return yearlyReport;
    }

}
