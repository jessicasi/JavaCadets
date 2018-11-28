/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.ItemType;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.model.Question;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jessicasi
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        
        if(playersName == null || playersName.length() < 1) {
        
        return null;
    }
        
        Player player = new Player();
        player.setName(playersName);
        
        //Save player
        
        CityofAaron.setPlayer(player);
        
        System.out.println("****savePlayer() called *****");
        return player;
    }
    
    public static int createNewGame(Player player) throws MapControlException {
        // Check for invalid inputs
        if (player == null)
            return -1; // indicates invalid input
        
        Game game = new Game();
        game.setThePlayer(player);
        CityofAaron.setCurrentGame(game);
        game.setCurrentPopulation(5);
        // call setter to assign an actor to the player
        // Create the lists of weapons used in the game
        InventoryItem[] items = createItems();
        
        game.setInventory(items);
        game.setWheatInStorage(items[ItemType.wheat.ordinal()].getQuantityInStock());
        game.setAcresOwned(50);
        Question[] question = createQuestion();
        game.setQuestion(question);
 
        int noOfRows = 5;
        int noOfColumns = 5;
        
        Map map = createMap(game, noOfRows, noOfColumns);      
        if (map == null)
         return -2; // indicates create map failed
        
        game.setTheMap(map);
        movePlayerToStartingLocation(map);
        
        return 1;
    }

    public static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[12];
        
        InventoryItem item = new InventoryItem();
        item.setItemType("chicken");
        item.setQuantityInStock(2);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.chicken.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.chicken.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemType("feed");
        item.setQuantityInStock(4);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.feed.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.feed.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemType("bow");
        item.setQuantityInStock(2);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.bow.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.bow.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemType("cart");
        item.setQuantityInStock(1);
        //item.setRequiredAmount(~);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.cart.getCost());
        items[ItemType.cart.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemType("hoe");
        item.setQuantityInStock(1);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.hoe.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.hoe.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemType("scyth");
        item.setQuantityInStock(1);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.scyth.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.scyth.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemType("wheat");
        item.setQuantityInStock(500);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.wheat.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.wheat.ordinal()] = item;
        return items;
        
        
    }

    public static Question[] createQuestion() {
        System.out.println("Lovely Questions For Later to Create becasue of Crazy Week 10 ");
        return null;
    }

    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
          Map map = MapControl.createMap(game, noOfRows, noOfColumns);

//       System.out.println("Lovely Map");
//       Map map = new Map(noOfRows, noOfColumns);
        return map;
    }
    
    public static void movePlayerToStartingLocation(Map map) throws MapControlException {
     MapControl.movePlayer(map, 0, 0); 
    }
}
