/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;
/**
 *
 * @authors jessicasi, Steven, Skyler
 */
public class MainMenuView {

    public void displayMainMenuView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs.length < 1) {
                endView = true;
                continue;
            }
            inputs[0] = inputs[0].toUpperCase();
            if (inputs.length < 1 || inputs[0].equals("E")) {
                endView = true;
                break;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println(" ************** ");
        System.out.println("   Main Menu");
        System.out.println(" ************** ");
        System.out.println();
        System.out.println("N - Start new game");
        System.out.println("R - Restart exisiting game");
        System.out.println("H - Get help on how to play the game");
        System.out.println("E - Exit");

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
        
        case "N": 
        {   
            startNewGame();
        }
                    break;
        case "R": 
        {
            restartGame();
        }
                    break;
        case "H": 
        {
            getHelp();
        }
                    break;
        case "E": return true;
        
        default: 
        {
            System.out.println("Invalid menu item");
        }
            break;
    }
        return false;
    }

    private void startNewGame() {
        //Create a new Game
        //GameControl.createNewGame()
   //gameMenuView =  create a new GameMenuView object
   //gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
         System.out.println("**** restartGame() called ***");
    }

    private void getHelp() {
         System.out.println("**** getHelp() called ***");
    }
}
