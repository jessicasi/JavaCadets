/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.model.Player;

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
    
    
    
}
