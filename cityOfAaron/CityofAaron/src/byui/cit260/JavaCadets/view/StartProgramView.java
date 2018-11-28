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
        System.out.println("*********************************");
        System.out.println("* WELCOME TO THE CITY OF AARON  *");
        System.out.println("* In this game you will be the  *");
        System.out.println("* ruler of a city for 7 years.  *");
        System.out.println("* Learn to care for your people *");
        System.out.println("* to win the Game!              *");
        System.out.println("*********************************");

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
            System.out.println(ex.getMessage());
        }

        if (player == null) {
            System.out.println("Could not create the player. "
                    + "Enter a different name.");
            return false;
        }

        System.out.println("************************************************");
        System.out.println("* Welcome to the game " + playersName + "*");
        System.out.println("* We hope you enjoy it!                        *");
        System.out.println("************************************************");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;

    }
}
