/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.control.MakeBread;
import byui.cit260.JavaCadets.control.SellBread;
import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class MakeAndSellBreadView extends View{

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Make & Sell Bread  * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("M - Make Bread");
        System.out.println("Q - Quit");
        
        String breadInput = this.getInput("\nMake your selection");
        inputs[0] = breadInput;
       
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
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

    

