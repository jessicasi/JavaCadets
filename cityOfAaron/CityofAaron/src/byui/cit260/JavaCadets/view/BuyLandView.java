/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.control.BuyLand;
import byui.cit260.JavaCadets.model.Player;
import java.util.Scanner;

/**
 *
 * @author skylerfoxx
 */
public class BuyLandView {
    
    public void displayBuyLandView() {
        boolean endOfView = false;
        do {
        String[] inputs = getInputs();
        //no inputs were entered OR the first input is Q
        if (inputs.length < 1 || inputs[0].equals("Q")) {
            return;
        }
            endOfView = doAction(inputs);
        } 
            while (endOfView != true);
        
            BuyLand buyLand = new BuyLand();
            int landPrice = 5;
        
            System.out.println(" ********************** ");
            System.out.println(" ***   Buy Land   *** ");
            System.out.println(" ********************** ");
            System.out.println();
            System.out.println("You have " + "" + "wheat");
            System.out.println("1 Land costs" + "" + "wheat");
            System.out.println("How much land do you want to buy?");
            System.out.println();
            System.out.println("(Press Q to Return)");


    }
    
    private String[] getInputs() {

        String[] inputs = new String[1];
        boolean valid = false;
        while (valid == false) {
            //Get the value entered from the keyboard
            Scanner inFile;
            inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            // Trim off leading and trailing blanks from the value
            inputs[0] = inputs[0].trim();
            //Make sure user entered a value

            buyLand();
        }

        return inputs;
    }
    
    private void buyLand() {
        
        BuyLand buyland = new BuyLand();
        buyland.displayBuyLand();
    }
}
