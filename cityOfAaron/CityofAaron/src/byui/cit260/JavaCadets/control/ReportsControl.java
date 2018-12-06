/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.ReportsControlException;
import byui.cit260.JavaCadets.model.Animal;
import byui.cit260.JavaCadets.model.InventoryItem;

/**
 *
 * @author jessicasi
 */
public class ReportsControl {
    
    
    public int quantityCost(InventoryItem[] items) throws ReportsControlException{
     
        if(items == null)
            throw new ReportsControlException("There are no items in inventory");
        int total = 0;
        int itemPrice = 0;
        
        for (InventoryItem item : items) {
            if (item == null) {
                continue;
            }
            itemPrice = item.getPricePerUnit() * item.getQuantityInStock();
            total +=itemPrice;
        }
        
        return total;
    }

    public Animal[] getAnimalReport(InventoryItem[] items) throws ReportsControlException {
        
        if(items == null)
            throw new ReportsControlException("There are no items in inventory");
        
        Animal[] animals = new Animal[5];
        Animal animal = new Animal();
        int i = 0;
        
        for(InventoryItem item : items){
            if(item == null)
                continue;
            
            if("animal".equals(item.getItemType())){
               animal = new Animal();
               animal.setName(item.getItemName());
               animal.setQuantity(item.getQuantity());
               animals[i] = animal;
               i++;
            }
        }
        
        return animals;
        
    }

   

    
}
