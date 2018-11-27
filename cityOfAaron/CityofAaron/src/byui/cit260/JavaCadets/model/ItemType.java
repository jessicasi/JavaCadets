/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;

/**
 *
 * @author Steven
 */
public enum ItemType implements Serializable{
    
   pig (20),
   chicken (15),
   horse (30),
   goat (15),
   donkey (10),  
   scyth (20),
   hoe (10),
   pickaxe (10),
   bow (30),
   feed (10),
   wheat (1),
   cart(200);
   
   private final int cost;
   
     ItemType(int cost){
        this.cost = cost;
    }
     
     public int getCost() {
         return cost;
     }

}