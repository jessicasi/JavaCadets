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

    public void liveTheYear() throws HarvestCropsException, GrowPopulationException {

        HarvestCrops harvestCrops = new HarvestCrops();
        Game game = CityofAaron.getCurrentGame();

        int cropsHarvested = harvestCrops.harvestCrops(game);

//The total number of bushels of wheat in store after adding the harvest and subtracting the wheat paid in offerings.
        game.setWheatInStorage(game.getWheatInStorage() + cropsHarvested);
//The number of bushels of wheat in store eaten by rats. This value is subtracted from the wheat in store.
        EatenByRats rats = new EatenByRats();
        int ratWheat = rats.eatenByRats();
        game.setRatWheat(ratWheat);
        game.setWheatInStorage(game.getWheatInStorage() - ratWheat);
//The number of people that move into the city.  
        GrowPopulation growPopulation = new GrowPopulation();
        int newPeople = growPopulation.growPopulation(game);
        game.setNewPopulation(newPeople);

    }

}
