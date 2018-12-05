/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;


import byui.cit260.JavaCadets.model.Game;
import java.io.IOException;

/**
 *
 * @author Steven
 */
public class StartExistingGameView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" ********************** ");
        this.console.println(" * Load Save Game * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("L: - Load Save");
        this.console.println("Q - Quit without saving");

        String existingGameInput = this.getInput("\nMake a selection from the Game Menu");
        
        inputs[0] = existingGameInput;
                
        return inputs;
        }
    
    @Override
   public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "L": {
                LoadGame();
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
   
    private void LoadGame() {
      String selection = null;
        try {
            this.console.println("Enter the name of thee the file the game will Load From");

          selection = this.keyboard.readLine();
//        String filename = inFile.nextLine();

                boolean valid = false;

                while (valid == false) {
                    if (selection.equals("")) {
                        ErrorView.display(this.getClass().getName(), "Error reading Input:");
                        selection = this.keyboard.readLine();
                        continue;
                    }
                                                        
                    this.console.println("Success! Your game has been Loaded!");
                    valid = true;
                }
                        } catch (IOException ex) {
                       ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
        }
              //  try{
                    Game.getGame(selection);
                    
                 //  } catch (GameControlException ex){
                     //ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
                     
                   }
              //  return false;
    }  


   
    
    
