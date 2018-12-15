/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.SellLand;
import byui.cit260.JavaCadets.exceptions.SellLandException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author skylerfoxx
 */
public class SellLandView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" ********************** ");
        this.console.println(" ***   Sell Land   *** ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("➤ S - Sell Land");
        this.console.println("➤ Q - Quit Selling Land");

        String sellInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = sellInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "S": {
                //Create Objects and other variables
                SellLand sellLand = new SellLand();
                Game game = CityofAaron.getCurrentGame();

                int price = 0;
                String selection = null;
                int acres = 0;

                try {
                    price = sellLand.getPrice();
                } catch (SellLandException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                }

                this.console.println("Right now, 1 acres of land is selling for " + price + " wheat\n");
                this.console.println("You currently have " + game.getAcresOwned() + " acres of land\n");

                selection = this.getInput("How many acres would you like to sell?");

                acres = Integer.parseInt(selection);

                try {
                    sellLand.SellLand(game, acres, price);
                } catch (SellLandException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                }
                
                this.console.println("Congratulations - you succesfully sold " + acres + " of Land\n");
                this.console.println("You made " + price*acres + " wheat");
                this.console.println("You now have " + game.getWheatInStorage() + " wheat in storage");
                

            }
            return true;

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
