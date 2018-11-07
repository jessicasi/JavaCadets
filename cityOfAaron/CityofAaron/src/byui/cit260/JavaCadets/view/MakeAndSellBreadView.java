/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.control.MakeBread;
import byui.cit260.JavaCadets.control.SellBread;
import byui.cit260.JavaCadets.model.Game;
import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class MakeAndSellBreadView {

    public void displayMakeAndSellBreadView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            //no inputs were entered OR the first input is Q
            if (inputs.length < 1 || inputs[0].equals("Q")) {
                System.out.println("Progam end");
                endOfView = true;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }

    private String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Make & Sell Bread  * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("M - Make Bread");
        System.out.println("Q - Quit");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Make a selection from the menu");
            //Get the value entered from the keyboard
            Scanner inFile;
            inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            // Trim off leading and trailing blanks from the value
            inputs[0] = inputs[0].trim();
            //Make sure user entered a value

            if (inputs[0].equals("")) {
                System.out.println("Please enter a non-blank value");
                continue;
            }
            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "M": {
                int loaves = makeBread();
                sellBread(loaves);
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

    private int makeBread() {
        MakeBread makeBread = new MakeBread();
        int loaves = makeBread.MakeBread();
        return loaves;
    }

    private void sellBread(int loaves) {
            SellBread sellBread = new SellBread();
            int sale = sellBread.sellBread(loaves);
            
            System.out.println();
            System.out.println("You sold your bread for a total of: "+  sale + " wheat!");
        
    }

}

    

