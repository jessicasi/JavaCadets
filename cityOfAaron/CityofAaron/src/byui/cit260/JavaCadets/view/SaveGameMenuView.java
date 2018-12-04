/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import static byui.cit260.JavaCadets.control.GameControl.saveGame;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jessica
 */
public class SaveGameMenuView extends View{

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
               
        System.out.println(" ********************** ");
        System.out.println(" * Save Game * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("S - Save Game");
        System.out.println("Q - Quit without saving");
        
       String input1 = getInput("\nMake a selection from the menu");
       
       inputs[0] = input1;
        
//        boolean valid = false;
//        String selection = null;
//        
//        while (!valid) {
//            try {
//                System.out.println("Make a selection from the menu");
//                //Get the value entered from the keyboard
//               
//                selection = this.keyboard.readLine();
//                
//                // Trim off leading and trailing blanks from the value
//                selection = selection.trim();
//                //Make sure user entered a value
//                
//                if (selection.equals("")) {
//                    ErrorView.display(this.getClass().getName(), "Please Enter File Name:");
//                    continue;
//                }
//                valid = true;
//            } catch (IOException ex) {
//                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
//            }
//        }
//        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "S": {
                
               String filename = getInput("Enter the name of the file where the game will be saved: \n");
               Game game = CityofAaron.getCurrentGame();
            try {
                saveGame(game, filename);
            } catch (GameControlException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                return false;
            } catch (IOException ex) { 
                  ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            }
            
            this.console.println("Congratulations, your game has been saved at: " + filename);
            }
            return true;

            case "Q":
                return true;

            default: {
                this.console.println("Invalid menu item");
            }
            break;
        }
        return false;
    }

//    private void saveGame() throws IOException {
//
//        try {
//            System.out.println("Enter the name of the file where the game will be saved: ");
//            
//            String selection = null;
//            
//            selection = this.keyboard.readLine();
//            
//            
//            boolean valid = false;
//            
//            while (valid == false) {
//                if (selection.equals("")) {
//                    System.out.println("Please enter a valid selection");
//                    selection = this.keyboard.readLine();
//                    continue;
//                }
//                System.out.println("Success! Your game has been saved!");
//                valid = true;
//            }
//        } catch (IOException ex) {
//            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
//        }
//
//    }
}
