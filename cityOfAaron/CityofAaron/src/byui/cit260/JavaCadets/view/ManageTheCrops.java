/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;


/**
 *
 * @author Steven
 */
public class ManageTheCrops {
    
   public void displayManageTheCrops() {
        boolean endOfView = false;
            do{
            String[] inputs = getInputs();
            //no inputs were entered OR the first input is Q
            if (inputs.length < 1 || inputs[0].equals("Q")) {
                System.out.println("Progam end");
                endOfView = true;
            }
                endOfView = doAction(inputs);
        } while (endOfView != true);
}
    
private String[] getInputs(){
    
    String[] inputs = new String[1];
    
     System.out.println(" ********************** ");
        System.out.println(" * Manage Your Crops * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("A - Buy Land ");
        System.out.println("B - Sell Land ");
        System.out.println("C - Feed the People ");
        System.out.println("D - Plant Crops ");
        System.out.println("E - Pay Tithes and Offerings ");
        System.out.println("Q - Quit");

        boolean valid = false;
                
        while(valid == false) {
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

            case "A": {
                BuyLand();
            }
            return true;
            
            case "B":{
                SellLand();
            }
            return true;
            
            case "C":{
                feedPopulation();
            }
            return true;
            
            case "D":{
                plantCrops();
            }
            return true;
            
            case "E":{
                PayTithesAndOfferings();
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

    private void BuyLand() {
        BuyLandView buyLand = new BuyLandView();
        buyLand.displayBuyLandView();
    }

    private void SellLand() {
        SellLandView sellLand = new SellLandView();
        sellLand.displaySellLandView();
    }

    private void feedPopulation() {
        FeedThePeopleView FeedThePeopleView = new FeedThePeopleView();
        FeedThePeopleView.displayFeedThePeopleView();
    }

    private void plantCrops() {
        PlantCropsView PlantCropsView = new PlantCropsView();
        PlantCropsView.displayPlantCropsView();
    }

    private void PayTithesAndOfferings() {
        TithesView payTithesAndOfferings = new TithesView();
        payTithesAndOfferings.displayTithesView();
    }




}
