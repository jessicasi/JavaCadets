/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.PlantCrops;
import byui.cit260.JavaCadets.exceptions.PlantCropsException;
import byui.cit260.JavaCadets.model.Game;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author skylerfoxx
 */
public class PlantCropsView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        
        this.console.println(" ********************** ");
        this.console.println(" ***  Plant Crops  *** ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("P - Plant Crops");
        this.console.println("Q - Quit Plant Crops");

        String plantInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = plantInput;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "P": {
                //Create Objects and variables
                 PlantCrops plantCrops = new PlantCrops();
                 Game game = CityofAaron.getCurrentGame();
                 
                 int currentAcres = game.getAcresOwned();
                 int currentWheat = game.getWheatInStorage();
                 int acresToPlant = 0;
                 
                 this.console.println(" You currently have " + currentAcres + " acres of land and " 
                         + currentWheat + " bushels of wheat\n");
                 this.console.println("It takes 10 bushels of wheat to plant 1 acre of land\n");
                 
                 String selection = this.getInput("\nHow many acres would you like to plant?");
                 acresToPlant = Integer.parseInt(selection);
                 
            try {
                plantCrops.plantCrops(game, acresToPlant);
            } catch (PlantCropsException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            }
                 this.console.println("You have sucessfully planted " + acresToPlant + " acres of wheat");

            }
                return true;

            case "Q":
                return true;

            default: {
                this.console.println("Invalid menu item");
            }
            break;
        }
        return false;
    }


   
}
