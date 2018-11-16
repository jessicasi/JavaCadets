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
public class ReportsMenuView extends View {
    
    @Override
    public String[] getInputs(){
    
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
        
        String reportsInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = reportsInput;

        return inputs;
    }    
            
    @Override
    public boolean doAction(String[] inputs) {
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
