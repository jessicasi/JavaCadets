/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.control.FeedThePeople;
import byui.cit260.JavaCadets.model.Player;
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
                FeedThePeople();
            }
                return true;

            case "Q":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }


    private void FeedThePeople() {

        FeedThePeople FeedThePeople = new FeedThePeople();
        FeedThePeople.FeedThePeople();
    }
}