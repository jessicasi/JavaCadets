/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.Tithes;
import byui.cit260.JavaCadets.exceptions.TithesException;
import byui.cit260.JavaCadets.model.Game;
import java.io.IOException;


/**
 *
 * @author Jessica
 */
public class TithesView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" ********************** ");
        this.console.println(" * Tithes & Offerings * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("➤ T - Pay Tithes & Offerings");
        this.console.println("➤ Q - Quit");

        String tithesInput = this.getInput("\nMake a selection from the Tithes Menu");
        inputs[0] = tithesInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "T": {
                //Create tithes object and other variables
                Tithes tithesPaid = new Tithes();
                int tithes = 0;
                Game game = CityofAaron.getCurrentGame();
                boolean valid = false;
                String selection = null;

                while (!valid) {
                    this.console.println("\n"+"══════════════════════════════════════════");
                    this.console.println("What percentage of your harvest do you want to pay in tithes & offerings?");
                    this.console.println("══════════════════════════════════════════");
                    try {
                        selection = this.keyboard.readLine();
                        selection = selection.trim();
                    } catch (IOException ex) {
                        ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                    }

                    //parse tithes to an integer
                    tithes = Integer.parseInt(selection);

                    try {
                        valid = tithesPaid.Tithes(game, tithes);
                    } catch (TithesException ex) {
                        ErrorView.display(this.getClass().getName(), ex.getMessage());
                    }

                }
                this.console.println("➤ Thank you for paying your tithing" + "\n");
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
