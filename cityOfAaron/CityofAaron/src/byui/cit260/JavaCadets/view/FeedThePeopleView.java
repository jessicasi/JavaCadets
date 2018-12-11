/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.FeedThePeople;
import byui.cit260.JavaCadets.exceptions.FeedThePeopleException;
import byui.cit260.JavaCadets.model.Game;
import java.io.IOException;


/**
 *
 * @author skylerfoxx
 */
public class FeedThePeopleView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" *********************** ");
        this.console.println(" *** Feed Population *** ");
        this.console.println(" *********************** ");
        this.console.println();
        this.console.println("F - Feed the People");
        this.console.println("Q - Quit Feed Population");

        String feedInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = feedInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "F": {

                Game game = CityofAaron.getCurrentGame();

                // FeedThePeople feedThePeople = new FeedThePeople();
                //feedThePeople
                this.console.println("Your population consists of " + game.getCurrentPopulation()
                        + " people across " + game.getAcresOwned() + " acre(s) of land.");
                this.console.println("It takes 2 bushels of wheat to feed each person.");
                this.console.println("You have " + game.getWheatInStorage() + " wheat remaining.");
                this.console.println("To feed everyone will require " + game.getCurrentPopulation() * 2 + " wheat.");
                this.console.println();
                this.console.println("How much wheat will you give to the people?\n");

                //Get User Input
                String selection = null;
                try {
                    selection = this.keyboard.readLine();
                } catch (IOException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                }
                int wheatFeed = 0;
                try {
                    wheatFeed = Integer.parseInt(selection);
                } catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + nf.getMessage());
                }
                int peopleFed = 0;
                try {
                    peopleFed = FeedThePeople.feedThePeople(game, wheatFeed);
                } catch (FeedThePeopleException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                }

                game.setPeopleFed(peopleFed);
                this.console.println("\nGreat Work! You fed " + peopleFed + " people and have " + game.getWheatInStorage() + " wheat left");

                break;
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

//    
}
