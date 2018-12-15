/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.EndGameException;
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

        this.console.println(" *************** ");
        this.console.println(" *  Game Menu  * ");
        this.console.println(" *************** ");
        this.console.println("➤ V - View the Map ");
        this.console.println("➤ M - Move to a new Location");
        this.console.println("➤ C - Manage the Crops");
        this.console.println("➤ R - Reports Menu");
        this.console.println("➤ S - Save Game");
        this.console.println("➤ Q - Return to Main Menu");

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
                 Game game = CityofAaron.getCurrentGame();
                  if(!game.isValid())
                        return true;
                    }
            break;
            case "C": {
                this.manageCrops();
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
            for (Location location : locations[row]) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if (location == map.getLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (location.isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                this.console.print("|"); // start map with a |
                if (location.getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator + location.getScene().getMapSymbol() + rightIndicator);
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
