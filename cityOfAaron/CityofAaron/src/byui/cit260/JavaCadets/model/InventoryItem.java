/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.util.Objects;

/**
 *
 * @author jessicasi
 */
public class InventoryItem {
    
        private String itemType;
        private int quantity;
        private String condition;
        private int pricePerUnit;

    public InventoryItem() {
    }

        
    /**
     * Get the value of pricePerUnit
     *
     * @return the value of pricePerUnit
     */
    public int getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Set the value of pricePerUnit
     *
     * @param pricePerUnit new value of pricePerUnit
     */
    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }


    /**
     * Get the value of condition
     *
     * @return the value of condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Set the value of condition
     *
     * @param condition new value of condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }


    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public int getQuantityInStock() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantityInStock(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Get the value of itemType
     *
     * @return the value of itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Set the value of itemType
     *
     * @param itemType new value of itemType
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.itemType);
        hash = 37 * hash + this.quantity;
        hash = 37 * hash + Objects.hashCode(this.condition);
        hash = 37 * hash + this.pricePerUnit;
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.pricePerUnit != other.pricePerUnit) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.condition, other.condition)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "itemType=" + itemType + ", quantity=" + quantity + ", condition=" + condition + ", pricePerUnit=" + pricePerUnit + '}';
    }

    
    
}
