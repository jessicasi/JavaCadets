/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.ReportsControlException;
import byui.cit260.JavaCadets.model.InventoryItem;

/**
 *
 * @author jessicasi
 */
public class ReportsControl {
    
    
    public int quantityCost(InventoryItem[] items) throws ReportsControlException{
     
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

    
}
