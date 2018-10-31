/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

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
                        endOfView = true;
                    }
            //RETURN
            //ENDIF
            endOfView = doAction(inputs);
                    }
                         while (endOfView != true);
    
    }

    private String[] getInputs() {
        System.out.println("**** getInputs() called ***");
        
        String[] inputs = new String[1];
        inputs[0] = "testInput";
        
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
