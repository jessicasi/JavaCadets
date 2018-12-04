/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.model.Game;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jessica
 */
public class TithesView extends View{


    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Tithes & Offerings * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("T - Pay Tithes & Offerings");
        System.out.println("Q - Quit");
        
        String tithesInput = this.getInput("\nMake a selection from the Tithes Menu");
        inputs[0] = tithesInput;


        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "T": {
                payTithes();
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

    private void payTithes() {

        System.out.println("What percentage of your harvest do you want to pay in tithes & offerings?");

        
        int tithes = 0;

        boolean valid = false;
        String selection = null;
        
        while (!valid) {
            
            try {
                selection = this.keyboard.readLine();
                tithes = Integer.parseInt(selection);
                
                if (tithes < 0) {
                    System.out.println("Enter a number greater than 0");
                    continue;
                } else if (tithes > 100) {
                    System.out.println("Enter a number lower than or equal to 100");
                    continue;
                }
                
                valid = true;
            } //while (valid == false);
            catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            }
           
            
            
        }
        
        Game game = CityofAaron.getCurrentGame();
        game.setTithingPaid(tithes);
  
    
    }

}


