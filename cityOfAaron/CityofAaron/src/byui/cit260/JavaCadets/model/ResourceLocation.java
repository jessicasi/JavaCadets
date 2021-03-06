/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author Steven
 */
public class ResourceLocation extends Location implements Serializable {
    private InventoryItem inventoryitem;
    private int amountAvailable;
    private int amountUsed;
    private ArrayList<InventoryItem> inventory;
    
   
    public ResourceLocation() {
        }

    public InventoryItem getInventoryitem() {
        return inventoryitem;
    }

    public void setInventoryitem(InventoryItem inventoryitem) {
        this.inventoryitem = inventoryitem;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public int getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(int amountUsed) {
        this.amountUsed = amountUsed;
    }
    
 
    public void setItems(ArrayList<InventoryItem> itemsInLocation) {
        this.inventory = itemsInLocation;
    }
    
     public ArrayList<InventoryItem> getItems() {
         return inventory;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.inventoryitem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResourceLocation other = (ResourceLocation) obj;
        if (!Objects.equals(this.inventoryitem, other.inventoryitem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceLocation{" + "inventoryitem=" + inventoryitem + ", amountAvailable=" + amountAvailable + ", amountUsed=" + amountUsed + '}';
    }

   
  

    
   
 
}
