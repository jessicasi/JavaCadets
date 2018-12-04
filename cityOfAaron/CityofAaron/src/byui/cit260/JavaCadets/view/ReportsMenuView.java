/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;
import byui.cit260.JavaCadets.exceptions.ReportsMenuViewException;
import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.ReportsControl;
import byui.cit260.JavaCadets.exceptions.ReportsControlException;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.ItemType;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        System.out.println("I - View total cost of items in Inventory");
        System.out.println("J - View Average of items in Inventory");
        System.out.println("V - View sorted items in Inventory");
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
                         
            case "I" :
                getInventoryTotal();
            return true;
            
            case "J":
                getInventoryAverage();
            break;
            
            case "V":
                getInventorySorted();
            break;
                
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

    private void getInventoryTotal() {
        
        try {
            ReportsControl reportsControl = new ReportsControl();
            InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();
            
            int totalCost = reportsControl.quantityCost(items);
            for(int i = 0; i < items.length; i++){
                if (items[i]==null){
                    continue;
                }
            }
            System.out.println("Total cost of all inventory items: " + totalCost);
        } catch (ReportsControlException ex) {
            Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getInventoryAverage() {
        
        try {
            ReportsControl reportsControl = new ReportsControl();
            InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();
            
            
            int average = reportsControl.quantityCost(items);
            int sum = 0;
            for (int i = 0; i < items.length; i++){
                if(items[i] == null){
                    continue;
                }
                sum = sum + items[i].getPricePerUnit();
                average = sum / items.length;
                
            }
            System.out.println("Average of Items in Inventory:" + average);
        } catch (ReportsControlException ex) {
            Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getInventorySorted() {
        
        try {
            ReportsControl reportsControl = new ReportsControl();
            InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();
            
            int totalList = reportsControl.quantityCost(items);
            System.out.println("Items in Inventory:");
            for(int i = 0; i < items.length; i++){
                if (items[i]==null){
                    continue;
                }
                System.out.println(items[i].getItemType());
            }
        
        } catch (ReportsControlException ex) {
            Logger.getLogger(ReportsMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    }
