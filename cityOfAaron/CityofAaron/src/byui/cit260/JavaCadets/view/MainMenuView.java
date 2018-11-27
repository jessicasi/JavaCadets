/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authors Jessica, Steven, Skyler
 */
public class MainMenuView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println(" ************** ");
        System.out.println("   Main Menu");
        System.out.println(" ************** ");
        System.out.println();
        System.out.println("N - Start new game");
        System.out.println("R - Restart exisiting game");
        System.out.println("H - Get help on how to play the game");
        System.out.println("E - Exit");

        String mainMenuInput = this.getInput("\nMake a selection from the Main Menu");
        inputs[0] = mainMenuInput;

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "N": {
            try {
                startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
            case "R": {
                restartGame();
            }
            break;
            case "H": {
                getHelp();
            }
            break;
            case "E":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }

    private void startNewGame() throws MapControlException {
        //Create a new Game
        GameControl.createNewGame(CityofAaron.getPlayer());
       
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();

    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }

    private void getHelp() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
