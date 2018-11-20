/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.model.Question;

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
    
    public static int createNewGame(Player player) {
        // Check for invalid inputs
        if (player == null)
            return -1; // indicates invalid input
        
        Game game = new Game();
        game.setThePlayer(player);
        CityofAaron.setCurrentGame(game);
        // call setter to assign an actor to the player
        // Create the lists of used in the game
        InventoryItem[] items = createItems();
        game.setInventory(items);
        Question[] question = createQuestion();
        game.setQuestion(question);
 
        int noOfRows = 5;
        int noOfColumns = 5;
        
        Map map = createMap(game, noOfRows, noOfColumns);      
        if (map == null)
         return -2; // indicates create map failed
        
        game.setTheMap(map);
        return 1;
    }

    public static InventoryItem[] createItems() {
        System.out.println("Lovely Items");
        return null;
    }

    public static Question[] createQuestion() {
        System.out.println("Lovely Question");
        return null;
    }

    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
       System.out.println("Lovely Map");
       Map map = new Map(noOfRows, noOfColumns);
       return map;
    }
    
        }
