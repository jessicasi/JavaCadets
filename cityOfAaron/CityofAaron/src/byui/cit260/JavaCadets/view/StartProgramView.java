/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.model.Player;

/**
 *
 * @author Steven, Jessica, Skyler
 */
public class StartProgramView extends View {

    public StartProgramView() {

    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        //Display a description of the view
        this.console.println("*********************************");
        this.console.println("* WELCOME TO THE CITY OF AARON  *");
        this.console.println("* In this game you will be the  *");
        this.console.println("* ruler of a city for 5 years.  *");
        this.console.println("* Learn to care for your people *");
        this.console.println("* to win the Game!              *");
        this.console.println("*********************************");

        String playersName = this.getInput("\nPlease enter your name: ");
            inputs[0] = playersName;
       
     return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {

        String playersName = inputs[0];
        Player player = null;
        try {
            player = GameControl.savePlayer(playersName);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }

        if (player == null) {
           this.console.println("Could not create the player. " + "Enter a different name.");
            return false;
        }

        this.console.println("******************************************");
        this.console.println("* Welcome to the game " + playersName + " *");
        this.console.println("* We hope you enjoy it!                  *");
        this.console.println("******************************************");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;

    }
}
