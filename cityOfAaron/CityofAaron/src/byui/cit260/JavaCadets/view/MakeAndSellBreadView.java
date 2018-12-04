/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.MakeBread;
import byui.cit260.JavaCadets.control.SellBread;
import byui.cit260.JavaCadets.exceptions.MakeBreadException;
import byui.cit260.JavaCadets.exceptions.SellBreadException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author Jessica
 */
public class MakeAndSellBreadView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" ********************** ");
        this.console.println(" * Make & Sell Bread  * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("M - Make Bread");
        this.console.println("Q - Quit");

        String breadInput = this.getInput("\nMake your selection");
        inputs[0] = breadInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "M": {
                //Create new object and variables
                MakeBread makeBread = new MakeBread();
                Game game = CityofAaron.getCurrentGame();
                SellBread sellBread = new SellBread();

                boolean valid = false;
                int loaves = 0;
                int wheatNeeded = 0;
                int sale = 0;
                String profit = null;

                this.console.println("A loaf of bread takes 5 wheat to make. \n");
                this.console.println("Bread can make the user between 3-8 wheat per loaf\n");

                while (!valid) {
                    String loavesToMake = this.getInput("How many loves of bread would you like to make?");
                    loaves = Integer.parseInt(loavesToMake);
                    wheatNeeded = 5 * loaves;
                    this.console.println("It will take " + wheatNeeded + " wheat to make that much bread.\n");

                    try {
                        valid = makeBread.MakeBread(game, loaves);
                    } catch (MakeBreadException ex) {
                        ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                    }
                    this.console.println("You successfully made " + loaves + " loaves of bread\n");
                }

                try {
                    sale = sellBread.sellBread(game, loaves);
                } catch (SellBreadException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                }
                
                this.console.println("You sold your loaves for " + sale/loaves + " wheat a piece\n");
                
                this.console.println("You made " + (sale - wheatNeeded) + " wheat\n");
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

   

}
