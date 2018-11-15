/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;

/**
 *
 * @author Jessica Steven Skyler
 */
public abstract class View implements ViewInterface {
    
    public View() {
        
    }
    
    @Override
     public void display() {
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
     
    @Override
     public String getInput(String promptMessage){
         String input = "";
         
             boolean valid = false;
                    while (valid == false){
                         //Display the prompt message
                        System.out.println(promptMessage);
                        
                        //Get the value entered from the keyboard
                        Scanner inFile;
                        inFile = new Scanner (System.in);
                        input = inFile.nextLine();
                        
                        // Trim off leading and trailing blanks from the value
                        input = input.trim();
                        
                        //IF length of the value < 1 then
                        // Display "You must enter a non-blank value”
                        if (input.equals("")){
                            System.out.println("Please enter a name:");
                            continue;
                        }
                        valid = true;
                    }   
                    
                    return input;
     }
    
    
}
