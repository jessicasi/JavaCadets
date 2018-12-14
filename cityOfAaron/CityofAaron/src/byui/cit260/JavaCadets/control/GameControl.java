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
        game.setCurrentPopulation(100);
        game.setPopulationMortality(0);

        //create start of game positions and items
        InventoryItem[] items = createItems();
        game.setInventory(items);
        
        game.setWheatInStorage(items[ItemType.wheat.ordinal()].getQuantityInStock());
        
        game.setAcresOwned(750);
        
        game.setWheatInStorage(2700);
        
        Question[] questions = createQuestion();
        game.setQuestion(questions);
        
        game.setTithingPaid(0);
        game.setMonths(0);
        
        game.setRatWheat(0);
        game.setMarks(0);
        
        game.setNewPopulation(0);
        game.setValid(true);
        
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
        item.setQuantityInStock(3000);
        item.setCondition("Good");
        item.setPricePerUnit(ItemType.wheat.getCost());
        //item.setRequiredAmount(~);
        items[ItemType.wheat.ordinal()] = item;
        return items;

    }

    public static Question[] createQuestion() {
        
        Question[] questions = new Question[5];
        
        Question question = new Question();
        question.setQuestions("How many pecks of wheat are in a bushel?");
        question.setAnswer1("4");
        question.setAnswer2("3");
        question.setAnswer3("2");
        question.setAnswer("A");
        questions[0] = question;
        
        question = new Question();
        question.setQuestions("How many times a year do you need to shear a sheep?");
        question.setAnswer1("5-6");
        question.setAnswer2("3-4");
        question.setAnswer3("1-2");
        question.setAnswer("C");
        questions[1] = question;
        
        question = new Question();
        question.setQuestions("How many pounds of feed does a pig eat per day?");
        question.setAnswer1("4-6");
        question.setAnswer2("6-8");
        question.setAnswer3("8-10");
        question.setAnswer("B");
        questions[2] = question;
        
        question = new Question();
        question.setQuestions("How old are chickens before they start laying eggs?");
        question.setAnswer1("6 months");
        question.setAnswer2("9 months");
        question.setAnswer3("12 months");
        question.setAnswer("A");
        questions[3] = question;
        
        question = new Question();
        question.setQuestions("How long do donkeys live?");
        question.setAnswer1("15-20 years");
        question.setAnswer2("20-25 years");
        question.setAnswer3("25-30 years");
        question.setAnswer("B");
        questions[4] = question;
        
        
        return questions;
    }

    public static Map createMap(Game game, int noOfRows, int noOfColumns) throws MapControlException {
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
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            game = (Game) in.readObject();
        }

        if (game == null) {
            throw new IOException(" I/O Error");
        }
        CityofAaron.setCurrentGame(game);
        CityofAaron.setPlayer(game.getThePlayer());

        return game;
    }
    
    public static void resetYear(Game game) {
        game.setRatWheat(0);
        game.setTithingPaid(0);
        game.setMonths(0);
        game.setPopulationMortality(0);
        game.setNewPopulation(0);
    }

}
