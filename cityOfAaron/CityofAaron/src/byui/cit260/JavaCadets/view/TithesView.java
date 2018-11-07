/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class TithesView {

    public void displayTithesView() {

        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            //no inputs were entered OR the first input is Q
            if (inputs.length < 1 || inputs[0].equals("Q")) {
                System.out.println("Progam end");
                endOfView = true;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }

    private String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Tithes & Offerings * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("T - Pay Tithes & Offerings");
        System.out.println("Q - Quit");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Make a selection from the menu");
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

            case "T": {
                payTithes();
            }
            return true;

            case "Q":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }

    private void payTithes() {

        System.out.println("What percentage of your harvest do you want to pay in tithes & offerings?");

        Scanner inFile;
        int tithes = 0;

        boolean valid = false;

        do {
            inFile = new Scanner(System.in);
            tithes = inFile.nextInt();

            if (tithes < 0) {
                System.out.println("Enter a number greater than 0");
                continue;
            } else if (tithes > 100) {
                System.out.println("Enter a number lower than or equal to 100");
                continue;
            }

            valid = true;
            
        } while (valid == false);
        
        //TODO : Save the value entered by user
        System.out.println("Your value was saved");
    
    }

}


