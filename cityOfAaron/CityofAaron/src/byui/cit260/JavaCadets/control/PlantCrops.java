/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.PlantCropsException;
import byui.cit260.JavaCadets.model.Game;



/**
 *
 * @author skylerfoxx, Jessica, Steven
 */
public class PlantCrops {

    public void plantCrops(Game game, int acresToPlant) throws PlantCropsException {

        int currentWheat = game.getWheatInStorage();
        int currentAcres = game.getAcresOwned();

        if (acresToPlant < 1) {
            throw new PlantCropsException(" Choose a number greater than 0");
        }

        //Planting crops is 10 wheat per acre
        int wheatNeeded = acresToPlant * 10;

        //Checks if user has enough wheat for the acres of land they want to plant
        if (wheatNeeded > currentWheat) {
            throw new PlantCropsException("You don't have enough wheat to plant that many acres");
        }

        if (currentAcres < acresToPlant) {
            throw new PlantCropsException("You don't have that many acres to plant");
        } else {
            //Player's wheat is subtracted from wheat needed
            game.setWheatInStorage(game.getWheatInStorage() - wheatNeeded);

        }

    }
}
