/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.model.Player;
import java.util.Scanner;

/**
 *
 * @author Skyler, Steven, Jessica
 */
public class HelpMenuView {

        public void displayHelpMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            //no inputs were entered OR the first input is Q
                if (inputs.length < 1 || inputs[0].equals("Q")){
                    System.out.println("Progam end"); 
                    endOfView = true;
                }
                    endOfView = doAction(inputs);
                }
                    while (endOfView != true);

        }
        
    private String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println(" ************** ");
        System.out.println("   Help Menu");
        System.out.println(" ************** ");
        System.out.println();
        System.out.println("G - What is the goal of the game?");
        System.out.println("M - How do I move?");
        System.out.println("E - How do I estimate the number of resources?");
        System.out.println("H - How do I Harvest Resources?");
        System.out.println("D - How to Deliver resources to the warehouse?");
        System.out.println("Q - Quit");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Make a selection from the Help Menu");
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
        
        case "G":
        {   
            System.out.println("The goal of the game is to win of course!");
        }
                    break;
        case "M": 
        {
            System.out.println("You move by pressing the M key");
        }
                    break;
        case "E": 
        {
            System.out.println("You estimate resoures with E");
        }
                    break;
        case "H": 
        {
            System.out.println("Harvest resources with the H Key");
        }
                    break;
        case "D": 
        {
            System.out.println("Deliver resources through the D Key");
        }
                    break;
        case "Q": return true;
        
        default: 
        {
            System.out.println("Invalid Key");
        }
            break;
    }
        return false;
    }
    
}
