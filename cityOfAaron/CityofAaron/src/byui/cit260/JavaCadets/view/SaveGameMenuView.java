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



/**
 *
 * @author Jessica
 */
public class SaveGameMenuView extends View{

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
               
        this.console.println(" ********************** ");
        this.console.println(" * Save Game * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("S - Save Game");
        this.console.println("Q - Quit without saving");
        
       String input1 = getInput("\nMake a selection from the menu");
       
       inputs[0] = input1;

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

}
