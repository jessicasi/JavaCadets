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
import byui.cit260.JavaCadets.model.Animal;
import byui.cit260.JavaCadets.model.InventoryItem;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven
 */
public class ReportsMenuView extends View {

    @Override
    public String[] getInputs() {

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
                try {
                    getAnimalReport();
                } catch (ReportsControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

                }
            }
            return true;

            case "B": {
                Tools();
            }
            return true;

            case "C": {
                Provisions();
            }
            return true;

            case "D": {
                Authors();
            }
            return true;

            case "I":
                getInventoryTotal();
                return true;

            case "J":
                getInventoryAverage();
                break;

            case "V":
                try {
                    getInventorySorted();
                } catch (ReportsControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

                }
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

    private void getAnimalReport() throws ReportsControlException {

        ReportsControl reportsControl = new ReportsControl();
        InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();

        Animal[] animals = reportsControl.getAnimalReport(items);

        String filePath = this.getInput("Enter the file path where you would like the report printed:\n");
        try {
            printAnimalReport(filePath, animals);
        } catch (IOException ex) {
             ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
        }

    }
    
     private void printAnimalReport(String filePath, Animal[] animals) throws ReportsControlException, IOException {
         
         if (filePath == null)
             throw new ReportsControlException("FilePath is empty");
         if (animals == null)
             throw new ReportsControlException("No animals in Inventory to display");
         
        try ( 
                FileWriter outFile = new FileWriter(filePath)) {
            
            //write information to file
            outFile.write("\n\t\tAnimals In Inventory\n\n");
            outFile.write("\tAnimal Type\tQuantity In Stock\n\n");
            
            for(Animal animal : animals){
                if (animal == null)
                    continue;
                outFile.write("\t" + animal.getName() + "\t\t\t" + animal.getQuantity() + "\n");
                
            }
            
            outFile.flush();
            
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

        }
        
        this.console.println("\n\nFile Sucessfully Saved");
         
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
            for (InventoryItem item : items) {
                if (item == null) {
                    continue;
                }
                sum = sum + item.getPricePerUnit();
                average = sum / items.length;
            }
            this.console.println("Average of Items in Inventory:" + average);
        } catch (ReportsControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
        }
    }
    
    private void getInventorySorted() throws ReportsControlException {

            ReportsControl reportsControl = new ReportsControl();
            InventoryItem[] items = CityofAaron.getCurrentGame().getInventory();

            int totalList = reportsControl.quantityCost(items);

            String filePath = this.getInput("Enter the file path where you would like the report printed:\n");
            try {
                printInventorySorted(filePath, items);
            } catch (IOException ex) {
                 ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            }

        }
    
    private void printInventorySorted(String filePath, InventoryItem[] items) throws ReportsControlException, IOException {

        if (filePath == null)
             throw new ReportsControlException("FilePath is empty");
         if (items == null)
             throw new ReportsControlException("No animals in Inventory to display");
        
        try ( 
            FileWriter outFile = new FileWriter(filePath)) {
            
            //write information to file
            outFile.write("\n\t\tItems sorted In Inventory\n\n");
            outFile.write("\tIte Type\tQuantity In Stock\n\n");
            
            for (InventoryItem item : items) {
                if (item == null) {
                    continue;
                }
                this.console.println(item.getItemType());
                outFile.write("\t" + item.getItemType() + "\n");
            }
            
            outFile.flush();

        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

        }
        
        this.console.println("\n\nFile Sucessfully Saved");
    }
   

}
