/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.JavaCadets.CityofAaron;

import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.view.StartProgramView;



/**
 *
 * @author Steven
 */
public class CityofAaron {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args){
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        CityofAaron.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        CityofAaron.player = player;
    }
    
   
    
    
}
