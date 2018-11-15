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
public class HelpMenuView extends View{

        
    @Override
    public String[] getInputs() {
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
        
         String helpInput = this.getInput("\nMake a selection from the Help Menu");
            inputs[0] = helpInput;

      
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
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
