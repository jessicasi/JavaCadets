/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.util.Objects;


/**
 *
 * @author Steven
 */
public class ResourceLocation extends Location {
    private InventoryItem inventoryitem;
   
    public ResourceLocation() {
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
        return "ResourceLocation{" + "inventoryitem=" + inventoryitem + '}';
    }

   
 
}
