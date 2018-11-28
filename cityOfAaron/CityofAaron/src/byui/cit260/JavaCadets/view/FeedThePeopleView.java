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
import java.util.Scanner;

/**
 *
 * @author skylerfoxx
 */
public class FeedThePeopleView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        
        System.out.println(" *********************** ");
        System.out.println(" *** Feed Population *** ");
        System.out.println(" *********************** ");
        System.out.println();
        System.out.println("F - Feed the People");
        System.out.println("Q - Quit Feed Population");

        String feedInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = feedInput;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "F": {
            try {
                feedThePeople();
            } catch (FeedThePeopleException ex) {
                System.out.println(ex.getMessage());            }
            }
                break;

            case "Q":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }


    private void feedThePeople() throws FeedThePeopleException {

        Game game = CityofAaron.getCurrentGame();
        
        FeedThePeople feedThePeople = new FeedThePeople();
        //feedThePeople
        System.out.println("Your population consists of " + game.getCurrentPopulation() + 
                " people across " + game.getAcresOwned() + " acre(s) of land.");
        System.out.println("It takes 2 bushels of wheat to feed each person.");
        System.out.println("You have " + game.getWheatInStorage() + " wheat remaining.");
        System.out.println("To feed everyone will require " + game.getCurrentPopulation() * 2 + " wheat.");
        System.out.println();
        System.out.println("How much wheat will you give to the people?");
        
        //Get User Input
            System.out.println();
            Scanner inFile;
            inFile = new Scanner(System.in);
            int wheatFeed = inFile.nextInt();
            int peopleFed = feedThePeople.feedThePeople(game, wheatFeed);
            
                 System.out.println("\nGreat Work! You fed " + peopleFed + " people and have " + game.getWheatInStorage() + " wheat left");        
     
    }
}