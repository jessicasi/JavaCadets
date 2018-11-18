/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;


/**
 *
 * @author Jessica
 */
public class GameMenuView extends View{

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
        System.out.println("B - Test Make Bread");
        System.out.println("BL - Test Buy Land");
        System.out.println("SL - Test Sell Land");
        System.out.println("P - Test Plant Crops");
        System.out.println("F - Test Feed Population");
        System.out.println("T - Test Tithing Menu");
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
               case "BL": {
                BuyLand();
            }
             break;
            case "SL": {
                SellLand();
             }
            break;
            case "P": {
                plantCrops();
            }
            break;
            case "F": {
                feedPopulation();
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
        manageCrops.display();
    }

    private void liveTheYear() {
         System.out.println("Live The Year View Called");
    }

    private void saveGame() {
        SaveGameMenuView saveGame = new SaveGameMenuView();
        saveGame.display();
    }

    private void reportsMenu() {
       ReportsMenuView reportsMenu = new ReportsMenuView();
       reportsMenu.display();
    }

    private void testTithes() {
        TithesView tithesview = new TithesView();
        tithesview.display();
    }

    private void testMakeBread() {
        MakeAndSellBreadView bread = new MakeAndSellBreadView();
        bread.display();
    }

    private void BuyLand() {
        BuyLandView buyLand = new BuyLandView();
        buyLand.display();
    }
    
    private void SellLand() {
        SellLandView sellLand = new SellLandView();
        sellLand.display();
    }
    
    private void feedPopulation() {
        FeedThePeopleView FeedThePeopleView = new FeedThePeopleView();
        FeedThePeopleView.displayFeedThePeopleView();
    }
    
    private void plantCrops() {
        PlantCropsView PlantCropsView = new PlantCropsView();
        PlantCropsView.displayPlantCropsView();
    }

    
}
