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
 * @author Steven, Jessica, Skyler
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    public void displayStartProgramView() {
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            //no inputs were entered OR the first input is Q
                    if (inputs.length < 1 || inputs[0].equals("Q")){
                        System.out.println("Progam end"); 
                        endOfView = true;
                    }

                        endOfView = doAction(inputs);
                    }
                        while (endOfView != true);
    
    }

    private String[] getInputs()  {
        
        String[] inputs = new String[1];
        
        //Display a description of the view
                System.out.println("*********************************");
                System.out.println("* WELCOME TO THE CITY OF AARON  *");
                System.out.println("* In this game you will be the  *");
                System.out.println("* ruler of a city for 7 years.  *");
                System.out.println("* Learn to care for your people *");
                System.out.println("* to win the Game!              *");
                System.out.println("*********************************");
                
                boolean valid = false;
                    while (valid == false){
                         //Display the prompt message
                        System.out.println("Enter Players Name Below:");
                        
                        //Get the value entered from the keyboard
                        Scanner inFile;
                        inFile = new Scanner (System.in);
                        inputs[0] = inFile.nextLine();
                        
                        // Trim off leading and trailing blanks from the value
                        inputs[0] = inputs[0].trim();
                        
                        //IF length of the value < 1 then
                        // Display "You must enter a non-blank value”
                        if (inputs[0].equals("")){
                            System.out.println("Please enter a name:");
                            continue;
                        }
                        valid = true;
                    }                        
        
                        return inputs;
        
    }

    private boolean doAction(String[] inputs) {
       
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        
        if(player == null){
            System.out.println("Could not create the player. " +
                                "Enter a different name.");
            return false;
        }
        
        System.out.println("************************************************");
        System.out.println("* Welcome to the game " + playersName +       "*");
        System.out.println("* We hope you enjoy it!                        *");
        System.out.println("************************************************");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        return true;
        
    }
}
