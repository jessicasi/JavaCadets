/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.LiveTheYear;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.exceptions.GrowPopulationException;
import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jessica
 */
public class GameMenuView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println(" *************** ");
        System.out.println(" *  Game Menu  * ");
        System.out.println(" *************** ");
        System.out.println("V - View the Map ");
        System.out.println("M - Move to a new Location");
        System.out.println("C - Manage the Crops");
        System.out.println("L - Live the year");
        System.out.println("R - Reports Menu");
        System.out.println("S - Save Game");
        System.out.println("Q - Return to Main Menu");

        String gameInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = gameInput;

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "V": {
                this.displayMap();
            }
            break;
            case "M": {
                this.moveLocations();
            }
            break;
            case "C": {
                this.manageCrops();
            }
            break;

            case "L": {
            try {
                liveTheYear();
            } catch (HarvestCropsException ex) {
                System.out.println(ex.getMessage());            } catch (GrowPopulationException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
            case "R": {
                this.reportsMenu();
            }
            break;
            case "S": {
                this.saveGame();
            }
            break;

            case "P": {
                this.plantCrops();
            }
            break;

            case "Q":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }

    private void displayMap() {
        String leftIndicator;
        String rightIndicator;
        Game game = CityofAaron.getCurrentGame(); // retreive the game
        Map map = game.getTheMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        // Build the heading of the map
        System.out.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            System.out.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().getMapSymbol()
                            + rightIndicator);
                }
            }
            System.out.println("|");
        }
    }

    private void moveLocations() {
//        MapView mapView = new MapView();
//        mapView.display();
        MovePlayer moveplayer = new MovePlayer();
        moveplayer.display();
    }

    private void manageCrops() {
        ManageTheCrops manageCrops = new ManageTheCrops();
        manageCrops.display();
    }

    private void liveTheYear() throws HarvestCropsException, GrowPopulationException {
        LiveTheYear liveTheYear = new LiveTheYear();
        String [] yearlyReport = liveTheYear.liveTheYear();
    }

    private void saveGame() {
        SaveGameMenuView saveGame = new SaveGameMenuView();
        saveGame.display();
    }

    private void reportsMenu() {
        ReportsMenuView reportsMenu = new ReportsMenuView();
        reportsMenu.display();
    }

    private void plantCrops() {
        PlantCropsView PlantCropsView = new PlantCropsView();
        PlantCropsView.display();
    }

}
