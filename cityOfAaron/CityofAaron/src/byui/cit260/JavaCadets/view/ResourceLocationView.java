/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.ResourceLocation;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jessicasi
 */
class ResourceLocationView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        Game game = CityofAaron.getCurrentGame();
        ResourceLocation location = (ResourceLocation) game.getCurrentLocation();
        ArrayList<InventoryItem> itemsInLocation = location.getItems();

        this.console.println("\nHi - my name is " + location.getActor());
        this.console.println(location.getDescription());
        this.console.println("This location has the following resource(s):");
        for (InventoryItem item : itemsInLocation) {
            char x = 'A';
            this.console.println(x + " - " + item);
            x += 1;
        }

        String answer = this.getInput("Choose one item that you would like");
        inputs[0] = answer;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String answer = inputs[0].toUpperCase();
        Game game = CityofAaron.getCurrentGame();
        ResourceLocation location = (ResourceLocation) game.getCurrentLocation();
        ArrayList<InventoryItem> itemsInLocation = location.getItems();
        int x = 0;

        switch (answer) {
            case "A":
                x = 1;
                break;
            case "B":
                x = 2;
                break;
            case "C":
                x = 3;
                break;
            case "D":
                x = 4;
                break;
            case "E":
                x = 5;
                break;
            default:
                 this.console.println("Invalid menu item");
                 return false;

        }
        
        String item = itemsInLocation.get(x).getItemType().toLowerCase();
        InventoryItem [] inventory = game.getInventory();
        
        for(int i = 0; inventory.length >= i; i++) {
            
         if(inventory[i].getItemName().equals(item)) 
             inventory[i].setQuantity(inventory[i].getQuantity() + 1);
             
        }
        this.console.println("You chose a(n) " + item);
        this.console.println("1 has been added to your inventory");
        this.console.println("Oh, and 3 months have gont by!");
        

        return true;
    }

}
