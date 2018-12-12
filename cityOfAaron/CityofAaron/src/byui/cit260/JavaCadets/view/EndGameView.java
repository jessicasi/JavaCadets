/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.EndGameException;

import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author jessicasi
 */
public class EndGameView extends View{
    
    
    public void displayEndGameView() throws EndGameException {
        Game game = CityofAaron.getCurrentGame();
        
        if (game == null)
            throw new EndGameException("There is no game to end");
        if(game.getPopulationMortality() > 100){
            this.console.println(game.getPopulationMortality() + " people have died under your watch. That is too many - GAME OVER");
            game.setValid(false);
        }
        else if(game.getYear() >= 5){
            this.console.println("Your term in office is over - Good Work"); 
            game.setValid(false);
        }
        else 
            this.console.println("The game isn't over yet, keep playing!");
        
            
        
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        return false;
    }
    
}
