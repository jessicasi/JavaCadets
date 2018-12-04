/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
import byui.cit260.JavaCadets.exceptions.PlantCropsViewException;
import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.control.PlantCrops;
import byui.cit260.JavaCadets.model.Player;
import java.util.Scanner;

/**
 *
 * @author skylerfoxx
 */
public class PlantCropsView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        
        System.out.println(" ********************** ");
        System.out.println(" ***  Plant Crops  *** ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("P - Plant Crops");
        System.out.println("Q - Quit Plant Crops");

        String plantInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = plantInput;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "P": {
                plantCrops();
            }
                return true;

            case "Q":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }


    private void plantCrops() {

        PlantCrops PlantCrops = new PlantCrops();
        PlantCrops.plantCrops();
    }
}
