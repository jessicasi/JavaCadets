/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.ItemType;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.model.Question;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jessicasi
 */
public class GameControl {

    public static Player savePlayer(String playersName) throws GameControlException {

        if (playersName == null || playersName.length() < 1) {
            throw new GameControlException("Oops - we need a player name to continue!");
        }

        Player player = new Player();
        player.setName(playersName);
        CityofAaron.setPlayer(player);

        return player;
    }

    public static void createNewGame(Player player) throws MapControlException, GameControlException {
        // Check for invalid inputs
        if (player == null) {
            throw new GameControlException("Oops - we need a player name to continue!");
        }
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
        if (map == null) {
            throw new MapControlException("Oops - there isn't a map, something went wrong, try again!");
        }
        game.setTheMap(map);
        movePlayerToStartingLocation(map);

    }

    public static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[12];

        InventoryItem item = new InventoryItem();
        item.setItemName("chicken");
        item.setItemType("animal");
        item.setQuantityInStock(3);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.chicken.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.chicken.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemName("horse");
        item.setItemType("animal");
        item.setQuantityInStock(1);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.horse.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.horse.ordinal()] = item;
        
        item = new InventoryItem();
        item.setItemName("pig");
        item.setItemType("animal");
        item.setQuantityInStock(2);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.pig.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.pig.ordinal()] = item;

        item = new InventoryItem();
        item.setItemName("feed");
        item.setItemType("provisions");
        item.setQuantityInStock(4);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.feed.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.feed.ordinal()] = item;

        item = new InventoryItem();
        item.setItemName("bow");
        item.setItemType("tool");
        item.setQuantityInStock(2);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.bow.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.bow.ordinal()] = item;

        item = new InventoryItem();
        item.setItemName("cart");
        item.setItemType("tool");
        item.setQuantityInStock(1);
        //item.setRequiredAmount(~);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.cart.getCost());
        items[ItemType.cart.ordinal()] = item;

        item = new InventoryItem();
        item.setItemName("hoe");
        item.setItemType("tool");
        item.setQuantityInStock(1);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.hoe.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.hoe.ordinal()] = item;

        item = new InventoryItem();
        item.setItemName("scyth");
        item.setItemType("tool");
        item.setQuantityInStock(1);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.scyth.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.scyth.ordinal()] = item;

        item = new InventoryItem();
        item.setItemName("wheat");
        item.setItemType("provisions");
        item.setQuantityInStock(500);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.wheat.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.wheat.ordinal()] = item;
        return items;

    }

    public static Question[] createQuestion() {
        return null;
    }

    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
        Map map = MapControl.createMap(game, noOfRows, noOfColumns);

        return map;
    }

    public static void movePlayerToStartingLocation(Map map) throws MapControlException {
        MapControl.movePlayer(map, 0, 0);
    }

    
    public static void saveGame(Game game, String filePath) throws GameControlException, IOException {
        if (game == null || filePath == null || filePath.length() < 1) {
            throw new GameControlException("File Path invaild");
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(game);

        } catch (IOException ex){
            throw new IOException("Out object didn't write");
        }

        }

            

    public static Game getGame(String fileName) throws GameControlException, FileNotFoundException, IOException, ClassNotFoundException {

        if (fileName == null) {
            throw new GameControlException("Empty Filename");
        }

        Game game;
        //game = new Game();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            game = (Game) in.readObject();
        }

        if (game == null) {
            throw new IOException(" I/O Error");
        }
        CityofAaron.setCurrentGame(game);
        CityofAaron.setPlayer(game.getThePlayer());

        return game;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
