/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
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
            //RETURN
            //ENDIF
                        endOfView = doAction(inputs);
                    }
                        while (endOfView != true);
    
    }

    private String[] getInputs()  {
        
        String[] inputs = new String[1];
        
        //Display a description of the view
                System.out.println("Welcome To The Game!");
        
                boolean valid = false;
                    while (valid == false){
                         //Display the prompt message
                        System.out.println("Enter Players Name");
                        
                        //Get the value entered from the keyboard
                        Scanner inFile;
                        inFile = new Scanner (System.in);
                        inputs[0] = inFile.nextLine();
                        
                        //IF length of the value < 1 then
                        // Display "You must enter a non-blank value”
                        if (inputs[0].equals("")){
                            System.out.println("You must enter a non-blank value");
                            continue;
                        }
                        // Trim off leading and trailing blanks from the value
                        inputs[0] = inputs[0].trim();
                        
                        //IF length of the value < 1 then
                        // Display "You must enter a non-blank value”
                        
                        
                        valid = true;
                    }                        
        
                        return inputs;
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
