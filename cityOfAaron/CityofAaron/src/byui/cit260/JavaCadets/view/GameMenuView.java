/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.LiveTheYear;
import byui.cit260.JavaCadets.exceptions.GrowPopulationException;
import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;


/**
 *
 * @author Jessica
 */
public class GameMenuView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        this.console.println(" *************** ");
        this.console.println(" *  Game Menu  * ");
        this.console.println(" *************** ");
        this.console.println("V - View the Map ");
        this.console.println("M - Move to a new Location");
        this.console.println("C - Manage the Crops");
        this.console.println("L - Live the year");
        this.console.println("R - Reports Menu");
        this.console.println("S - Save Game");
        this.console.println("Q - Return to Main Menu");

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
                    this.console.println(ex.getMessage());
                } catch (GrowPopulationException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
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
                this.console.println("Invalid menu item");
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
        this.console.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            this.console.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            this.console.print(row + " "); // print row numbers to side of map
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
                this.console.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator
                            + locations[row][column].getScene().getMapSymbol()
                            + rightIndicator);
                }
            }
            this.console.println("|");
        }
    }

    private void moveLocations() {
        MovePlayer moveplayer = new MovePlayer();
        moveplayer.display();
        
       
    }

    private void manageCrops() {
        ManageTheCrops manageCrops = new ManageTheCrops();
        manageCrops.display();
    }

    private void liveTheYear() throws HarvestCropsException, GrowPopulationException {
        LiveTheYear liveTheYear = new LiveTheYear();
        String[] yearlyReport = liveTheYear.liveTheYear();
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
