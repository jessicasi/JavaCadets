/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class StartExistingGameView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Load Save Game * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("L: - Load Save");
        System.out.println("Q - Quit without saving");

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
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
        } 
   
    private void LoadGame() {
       System.out.println("Enter the name of thee the file the game will Load From");
       
       Scanner inFile;
        inFile = new Scanner(System.in);
        String filename = inFile.nextLine();

        boolean valid = false;

        while (valid == false) {
            if (filename.equals("")) {
                System.out.println("Please enter a valid filename");
                filename = inFile.nextLine();
                continue;
            }
            System.out.println("Success! Your game has been Loaded!");
            valid = true;
        }

    }
        
    }
    
    

