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
                
        while(valid == false); {
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
                FeedThePeople();
            }
            return true;
            
            case "D":{
                PlantCrops();
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
        System.out.println("Buy Land was Succesfully Called");
    }

    private void SellLand() {
        System.out.println("Sell Land was SuccessFully Called");
    }

    private void FeedThePeople() {
        System.out.println("Feed The People");
    }

    private void PlantCrops() {
       System.out.println("Plant Crops was Sucessuflly Called");
    }

    private void PayTithesAndOfferings() {
        System.out.println("Pay Tihes And Offerings has been Called");
    }




}
