///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package byui.cit260.JavaCadets.control;
//
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.exceptions.PopulationMortalityException;
import byui.cit260.JavaCadets.model.Game;
///**
// *
// * @author jessicasi
// */
public class PopulationMortality  {
    
    public static void populationMortality(Game game) throws PopulationMortalityException, GameControlException {
        
        if(game == null)
            throw new GameControlException("Game is empty, try again");
        
        int currentPop = game.getCurrentPopulation();
        
        if (currentPop < 0) {
           throw new PopulationMortalityException("You don't have any population, so no one died");
       }
       
       int peopleFed = game.getPeopleFed();
       
       if(peopleFed >= currentPop) {
           game.setPopulationMortality(game.getPopulationMortality() + 0);
       }
       else {
           int peopleDied = currentPop - peopleFed;
           game.setPopulationMortality(game.getPopulationMortality() + peopleDied);
           game.setCurrentPopulation(currentPop-peopleDied);
       }
        

    }
}
