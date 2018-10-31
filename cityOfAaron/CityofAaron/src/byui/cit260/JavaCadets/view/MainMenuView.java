/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

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
        inputs[0]=inputs[0].toUpperCase();
        if (inputs.length < 1 || inputs[0].equals("Q")) {
            endView = true;
            break;
        }
        endView = doAction(inputs);
        } while (endView != true);
        
    }

    private String[] getInputs() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("***** getInputs() called ****");
        
        String[] inputs = new String[1];
        inputs[0] = "testInput";
        
        return inputs;
        
    }

    private boolean doAction(String[] inputs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("***** doAction() called *****");
        System.out.println("\tinputs = " + inputs[0]);
        return true;
    }
}
