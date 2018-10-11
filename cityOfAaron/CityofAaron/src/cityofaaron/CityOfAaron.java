/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.JavaCadets.model.Author;
import static byui.cit260.JavaCadets.model.Condition.Good;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import static byui.cit260.JavaCadets.model.ItemType.Tool;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.model.Storehouse;

/**
 *
 * @author jessicasi
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        Location locationOne = new Location();
        Game game = new Game();
        Storehouse storehouseOne = new Storehouse();
        Author authorOne = new Author();
        InventoryItem itemOne = new InventoryItem();
     
        locationOne.setVisited(false);
        authorOne.setAuthors("Barney");
        playerOne.setName("Fred Flinstone");
        itemOne.setName("Hammer");
        itemOne.setItemType(Tool);
        itemOne.setQuantity(4);
        itemOne.setCondition(Good);
        itemOne.setPricePerUnit(.75);
        game.setCurrentPopulaiton(100);
        game.setAcresOwned(200);
        game.setThePlayer(playerOne);
        game.setTheStorehouse(storehouseOne);
        
        
        //For first part of Team Activity
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        System.out.println(authorOne.toString());
        System.out.println(itemOne.toString());
        System.out.println(locationOne.toString());
        System.out.println(game.toString());
        System.out.println(storehouseOne.toString());
     
    }
    
}
