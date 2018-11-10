/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class GameMenuView {

    public void displayGameMenuView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs.length < 1) {
                endView = true;
                continue;
            }
            inputs[0] = inputs[0].toUpperCase();
            if (inputs.length < 1 || inputs[0].equals("E")) {
                endView = true;
                break;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println(" *************** ");
        System.out.println(" *  Game Menu  * ");
        System.out.println(" *************** ");
        System.out.println();
        System.out.println("V - View the Map ");
        System.out.println("M - Move to a new Location");
        System.out.println("C - Manage the Crops");
        System.out.println("L - Live the year");
        System.out.println("R - Reports Menu");
        System.out.println("S - Save Game");
        System.out.println("T - Test Tithing Menu");
        System.out.println("B - Test Make Bread");
        System.out.println("N - Test Buy Land");
        System.out.println("Q - Return to Main Menu");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Make a selection from the menu");
            //Get the value entered from the keyboard
            Scanner inFile;
            inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            // Trim off leading and trailing blanks from the value
            inputs[0] = inputs[0].trim();
            //Make sure user entered a value

            if (inputs[0].equals("")) {
                System.out.println("Please enter a non-blank value");
                continue;
            }
            valid = true;
        }

        return inputs;

    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "V": {
                viewTheMap();
            }
            break;
            case "M": {
                moveLocations();
            }
            break;
            case "C": {
                manageCrops();
            }
            break;

            case "L": {
                liveTheYear();
            }
            break;
            case "R": {
                reportsMenu();
            }
            break;
            case "S": {
                saveGame();
            }
            break;
             case "T": {
                testTithes();
            }
             break;
               case "N": {
                BuyLand();
            }
             break;
             case "B": {
                 testMakeBread();
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

    private void viewTheMap() {
        System.out.println("Map View Called");
    }

    private void moveLocations() {
         System.out.println("Move View Called");
    }

    private void manageCrops() {
        ManageTheCrops manageCrops = new ManageTheCrops();
        manageCrops.displayManageTheCrops();
    }

    private void liveTheYear() {
         System.out.println("Live The Year View Called");
    }

    private void saveGame() {
        SaveGameMenuView saveGame = new SaveGameMenuView();
        saveGame.displaySaveGameMenuView();
    }

    private void reportsMenu() {
       ReportsMenuView reportsMenu = new ReportsMenuView();
       reportsMenu.displayReportsMenuView();
    }

    private void testTithes() {
        TithesView tithesview = new TithesView();
        tithesview.displayTithesView();
    }

    private void testMakeBread() {
        MakeAndSellBreadView bread = new MakeAndSellBreadView();
        bread.displayMakeAndSellBreadView();
    }

    private void BuyLand() {
        BuyLandView buyLand = new BuyLandView();
        buyLand.displayBuyLandView();
    }

    
}
