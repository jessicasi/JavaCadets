/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;


import static byui.cit260.JavaCadets.control.GameControl.getGame;
import byui.cit260.JavaCadets.exceptions.GameControlException;

import java.io.IOException;

/**
 *
 * @author Steven
 */


public class StartExistingGameView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" ********************** ");
        this.console.println(" * Load Save Game * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("➤ L: - Load Save");
        this.console.println("➤ Q - Quit without saving");

        String existingGameInput = this.getInput("\nMake a selection from the Game Menu");

        inputs[0] = existingGameInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "L": {
                String fileName = getInput("\nEnter the name of the file the game will load from");

                try {
                    getGame(fileName);
                } catch (GameControlException | IOException | ClassNotFoundException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                    return false;
                }
                
                this.console.println(fileName + " has been loaded");
                  GameMenuView gameMenuView = new GameMenuView();
                  gameMenuView.display();

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
