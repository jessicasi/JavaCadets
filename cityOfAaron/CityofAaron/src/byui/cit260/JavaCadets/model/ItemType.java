/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

/**
 *
 * @author Steven
 */
public enum ItemType {
    
    Animal("Animal"),
    Tool("Tool"),
    Provision("Provision");
    
    private String item;
    
    ItemType(String item){
        this.item = item;
}

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "ItemType{" + "item=" + item + '}';
    }
    
    
}