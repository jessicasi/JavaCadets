/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.control.SellLand;
import byui.cit260.JavaCadets.model.Player;
import java.util.Scanner;

/**
 *
 * @author skylerfoxx
 */
public class SellLandView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        
        System.out.println(" ********************** ");
        System.out.println(" ***   Sell Land   *** ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("S - Sell Land");
        System.out.println("Q - Quit Selling Land");

        String sellInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = sellInput;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "S": {
                sellLand();
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


    private void sellLand() {

        SellLand sellLand = new SellLand();
        sellLand.SellLand();
    }
}