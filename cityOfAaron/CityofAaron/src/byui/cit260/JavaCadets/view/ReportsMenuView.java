/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class ReportsMenuView {
    
    public void ReportsMenuView() {
        boolean endOfView = false;
            do{
            String[] inputs = getInputs();
            //no inputs were entered OR the first input is Q
            if (inputs.length < 1 || inputs[0].equals("Q")) {
                System.out.println("Progam end");
                endOfView = true;
            }
                endOfView = doAction(inputs);
        } while (endOfView != true);
    }
    private String[] getInputs(){
    
    String[] inputs = new String[1];
    
     System.out.println(" ********************** ");
        System.out.println(" * Reports Menu * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("A - View the Animals in the StoreHouse ");
        System.out.println("B - View the Tools in the StoreHouse ");
        System.out.println("C - View the Provisions in the StoreHouse ");
        System.out.println("D - View the Authors of the Game ");
        System.out.println("Q - Quit");
        
        boolean valid = false;
                
        while(valid == false) {
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

            case "A": {
                Animals();
            }
            return true;
            
            case "B":{
                Tools();
            }
            return true;
            
            case "C":{
                Provisions();
            }
            return true;
            
            case "D":{
                Authors();
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

    private void Animals() {
        System.out.println("Aminals in StoreHouse Was Called");
    }

    private void Tools() {
        System.out.println("Tools in StoreHouse Was Called");
    }

    private void Provisions() {
        System.out.println("Provisions in StoreHouse Was Called");
    }

    private void Authors() {
        System.out.println("Authors Was Called");
    }

    }
