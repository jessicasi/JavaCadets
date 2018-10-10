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
    
        private String name;
        private ItemType itemType;
        private int quantity;
        private Condition condition;
        private double pricePerUnit;

    public InventoryItem() {
    }

        
    /**
     * Get the value of pricePerUnit
     *
     * @return the value of pricePerUnit
     */
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Set the value of pricePerUnit
     *
     * @param pricePerUnit new value of pricePerUnit
     */
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }


    /**
     * Get the value of condition
     *
     * @return the value of condition
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Set the value of condition
     *
     * @param condition new value of condition
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Get the value of itemType
     *
     * @return the value of itemType
     */
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Set the value of itemType
     *
     * @param itemType new value of itemType
     */
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.itemType);
        hash = 43 * hash + this.quantity;
        hash = 43 * hash + Objects.hashCode(this.condition);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.pricePerUnit) ^ (Double.doubleToLongBits(this.pricePerUnit) >>> 32));
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
        if (Double.doubleToLongBits(this.pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.itemType != other.itemType) {
            return false;
        }
        if (!Objects.equals(this.condition, other.condition)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "name=" + name + ", itemType=" + itemType + ", quantity=" + quantity + ", condition=" + condition + ", pricePerUnit=" + pricePerUnit + '}';
    }
    
    

}
