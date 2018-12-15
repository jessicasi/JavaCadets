/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.BuyLand;
import byui.cit260.JavaCadets.exceptions.BuyLandException;
import byui.cit260.JavaCadets.model.Game;
import java.io.IOException;

/**
 *
 * @author skylerfoxx
 */
public class BuyLandView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        
        this.console.println(" ********************** ");
        this.console.println(" ***   Buy Land   *** ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("***********************");
        this.console.println("➤ B - Buy Land");
        this.console.println("➤ Q - Quit Buying Land");
        this.console.println("***********************");
        this.console.println();
        String buyInput = this.getInput("\nMake a selection from the Buy Land Menu");
        inputs[0] = buyInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "B": {

                //Create new buyLand object
                BuyLand buyLand = new BuyLand();

                //declare other variables
                Game game = CityofAaron.getCurrentGame();
                int price = 0;
                boolean valid = false;
                String selection = null;
                int landToBuy = 0;
                //Calculate the random price it will be sold for
                try {
                    price = buyLand.calculatePrice();
                } catch (BuyLandException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                }
                //get current wheat in storage
                int currentWheat = game.getWheatInStorage();
                this.console.println("\n"+"══════════════════════════════");
                this.console.println("➤ 1 acre of land costs " + price + " wheat.");
                this.console.println("➤ You currently have " + currentWheat + " wheat.");
                this.console.println("══════════════════════════════");
                
                //get number of Acres user wants to buy
                while (!valid) {
                    this.console.println("\n"+"How many acres do you want to buy?");

                    try {
                        selection = this.keyboard.readLine();
                        selection = selection.trim();

                        if (selection.length() < 1) {
                            this.console.println("You must enter a value");
                            continue;
                        }
                       
                    } catch (IOException ex) {
                        ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                        continue;
                    }
                    //parse selection to an integer
                    landToBuy = Integer.parseInt(selection);

                    try {
                        //ensure user has enough wheat to purchase land
                        //  valid = buyLand.calculateWheatNeeded(game, landToBuy,price);
                        valid = buyLand.BuyLand(game, landToBuy, price);

                    } catch (BuyLandException ex) {
                        ErrorView.display(this.getClass().getName(), ex.getMessage());

                    }

                }
                this.console.println("\n"+"═════════════════════════════════");
                this.console.println("You now have " + game.getAcresOwned() + " total acres.");
                this.console.println("You have " + game.getWheatInStorage() + " wheat remaining.");
                this.console.println("═════════════════════════════════");    
        
                return true;
            }
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
