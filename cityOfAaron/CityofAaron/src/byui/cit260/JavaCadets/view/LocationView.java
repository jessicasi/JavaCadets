/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.GrowPopulationException;
import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;


/**
 *
 * @author jessicasi
 */
public class LocationView extends View {

    public void displayLocationView() throws HarvestCropsException, GrowPopulationException {
//       
        Game game = CityofAaron.getCurrentGame();
        Location location = game.getCurrentLocation();
        
        this.console.println("\nHi - my name is " + location.getActor());
        this.console.println(location.getDescription());
        this.console.println("There isn't much to do here, but 3 months have gone by anyway!");

    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {



        return false;
    }
}
