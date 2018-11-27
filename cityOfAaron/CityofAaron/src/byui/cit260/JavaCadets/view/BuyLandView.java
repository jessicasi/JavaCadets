/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.control.BuyLand;
import byui.cit260.JavaCadets.exceptions.BuyLandException;
import byui.cit260.JavaCadets.model.Player;
import java.util.Scanner;

/**
 *
 * @author skylerfoxx
 */
public class BuyLandView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        
        System.out.println(" ********************** ");
        System.out.println(" ***   Buy Land   *** ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("B - Buy Land");
        System.out.println("Q - Quit Buying Land");

        String buyInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = buyInput;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "B": {
             buyLand();
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


    private boolean buyLand() {

        BuyLand buyland = new BuyLand();
        try {
        buyland.BuyLand();
    } catch (BuyLandException ie){
        System.out.println(ie.getMessage());
        return false;
    }
        return true;
    }
}