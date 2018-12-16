/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.ResourceLocation;
import java.util.ArrayList;


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

        this.console.println("\n"+"══════════════════════════════");
        this.console.println("Hi - my name is " + location.getActor());
        this.console.println(location.getDescription());
        this.console.println("══════════════════════════════ \n");
        
        this.console.println("➤ This location has the following resource(s):");
        char x = 'A';
        for (InventoryItem item : itemsInLocation) {
            if (item != null) {
                this.console.println(x + " - " + item.getItemName());
                x += 1;
            }

        }

        String answer = this.getInput("\n➤ Choose one item that you would like");
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
                x = 0;
                break;
            case "B":
                x = 1;
                break;
            case "C":
                x = 2;
                break;
            case "D":
                x = 3;
                break;
            case "E":
                x = 4;
                break;
            default:
                this.console.println("Invalid menu item");
                return false;

        }

        String item = itemsInLocation.get(x).getItemName();
        InventoryItem[] inventory = game.getInventory();

        for (int i = 0; inventory.length >= i; i++) {

            if (inventory[i] != null && inventory[i].getItemName().equals(item)) {
                inventory[i].setQuantity(inventory[i].getQuantity() + 1);
                break;
            }

        }
        this.console.println("\n"+"══════════════════════════════");
        this.console.println("You chose a(n) " + item);
        this.console.println("1 has been added to your inventory");
        this.console.println("Oh, and 3 months have gone by!");
        this.console.println("══════════════════════════════ \n");

        return true;
    }

}
