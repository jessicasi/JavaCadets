/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jessica Steven Skyler
 */
public abstract class View implements ViewInterface {
    
   protected final BufferedReader keyboard = CityofAaron.getInFile();
   protected final PrintWriter console = CityofAaron.getOutFile();
   
    public View() {
        
    }
    
    @Override
     public void display() {
        boolean endOfView = false;
        do {
            String[] selections = this.getInputs();
            //no selections were entered OR the first selection is Q
                    if (selections.length < 1 || selections[0].equals("Q")){
                        System.out.println("Progam end"); 
                        endOfView = true;
                    }

                        endOfView = doAction(selections);
                    }
                        while (endOfView != true);
    
    }
     
    @Override
     public String getInput(String promptMessage){
//         String selection = "";
         
         
             boolean valid = false;
             String selection = null;
             
       
             try {
                 while (!valid ){
                 //Display the prompt message
                 System.out.println(promptMessage);
                 
                 //Get the value entered from the keyboard
//               Scanner inFile;
                 selection = this.keyboard.readLine();
                 
                 
                 // Trim off leading and trailing blanks from the value
                 selection = selection.trim();
                 
                 //IF length of the value < 1 then
                 // Display "You must enter a non-blank value”
                 if (selection.equals("")){
                     ErrorView.display(this.getClass().getName(), "You must ender a Name:" );
                     continue;
                 }
                 valid = true;
             } 
                    } catch (IOException ex) {   
                            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
       }
                    
                    return selection;
     }
    
    
}
