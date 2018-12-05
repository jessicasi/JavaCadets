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


/**
 *
 * @author Steven
 */
public class ReportsMenuView extends View {
    
    @Override
    public String[] getInputs(){
    
    String[] inputs = new String[1];
    
        this.console.println(" ********************** ");
        this.console.println(" * Reports Menu * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("A - View the Animals in the StoreHouse ");
        this.console.println("B - View the Tools in the StoreHouse ");
        this.console.println("C - View the Provisions in the StoreHouse ");
        this.console.println("D - View the Authors of the Game ");
        this.console.println("I - View total cost of items in Inventory");
        this.console.println("J - View Average of items in Inventory");
        this.console.println("V - View sorted items in Inventory");
        this.console.println("Q - Quit");
        
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
                this.console.println("Invalid menu item");
            }
            break;
        }
        return false;
    }        

    private void Animals() {
        this.console.println("Aminals in StoreHouse Was Called");
    }

    private void Tools() {
        this.console.println("Tools in StoreHouse Was Called");
    }

    private void Provisions() {
        this.console.println("Provisions in StoreHouse Was Called");
    }

    private void Authors() {
        this.console.println("Authors Was Called");
    }

    private void getInventoryTotal() {
        
        try {
            ReportsControl reportsControl = new ReportsControl();
            InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();
            
            int totalCost = reportsControl.quantityCost(items);
            for (InventoryItem item : items) {
                if (item == null) {
                    continue;
                }
            }
            this.console.println("Total cost of all inventory items: " + totalCost);
        } catch (ReportsControlException ex) {
                 ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
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
            this.console.println("Average of Items in Inventory:" + average);
        } catch (ReportsControlException ex) {
                 ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
        }
    }
    
    private void getInventorySorted() {
        
        try {
            ReportsControl reportsControl = new ReportsControl();
            InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();
            
            int totalList = reportsControl.quantityCost(items);
            this.console.println("Items in Inventory:");
            for (InventoryItem item : items) {
                if (item == null) {
                    continue;
                }
                this.console.println(item.getItemType());
            }
        
        } catch (ReportsControlException ex) {
                   ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
        }
    }

    }
