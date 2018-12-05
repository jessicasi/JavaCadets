/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
import byui.cit260.JavaCadets.exceptions.HelpMenuViewException;

/**
 *
 * @author Skyler, Steven, Jessica
 */
public class HelpMenuView extends View{

        
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        this.console.println(" ************** ");
        this.console.println("   Help Menu");
        this.console.println(" ************** ");
        this.console.println();
        this.console.println("G - What is the goal of the game?");
        this.console.println("M - How do I move?");
        this.console.println("E - How do I estimate the number of resources?");
        this.console.println("H - How do I Harvest Resources?");
        this.console.println("D - How to Deliver resources to the warehouse?");
        this.console.println("Q - Quit");
        
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
            this.console.println("The goal of the game is to win of course!");
        }
                    break;
        case "M": 
        {
            this.console.println("You move by pressing the M key");
        }
                    break;
        case "E": 
        {
            this.console.println("You estimate resoures with E");
        }
                    break;
        case "H": 
        {
            this.console.println("Harvest resources with the H Key");
        }
                    break;
        case "D": 
        {
            this.console.println("Deliver resources through the D Key");
        }
                    break;
        case "Q": return true;
        
        default: 
        {
           this.console.println("Invalid Key");
        }
            break;
    }
        return false;
    }
    
}
