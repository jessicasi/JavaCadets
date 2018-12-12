/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.FeedThePeopleException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author skylerfoxx
 */
public class FeedThePeople {

    public static int feedThePeople(Game game, int userWheat) throws FeedThePeopleException {

//        
        int wheatNeeded = game.getCurrentPopulation() * 2;
        int peopleFed = 0;
    

        //Checks to see if user entered 0 or a negative number
        if (userWheat <= 0) {
            throw new FeedThePeopleException("\nYou neglected to feed your people\n");

        } //Checks to see if the user has enough wheat to give what they entered
        else if (userWheat > game.getWheatInStorage()) {
            throw new FeedThePeopleException("\nUnfortunately, you don't have that much wheat. Try again.\n");
        } //Checks to see if user gave more wheat than what was required
        else if (userWheat > wheatNeeded) {
            throw new FeedThePeopleException("\nFor some reason, you tried to feed the people too much - why don't you try again?\n");
        } //Check to see if user is trying to feed 1 wheat
        else if (userWheat % 2 != 0) {
            throw new FeedThePeopleException("\nEach person needs 2 wheat, try again with an even number\n");
        } else {

            peopleFed = userWheat / 2;
            game.setPeopleFed(peopleFed);
            //peopleDied = game.getCurrentPopulation() - peopleFed;
            int wheatLeft = game.getWheatInStorage() - userWheat;
            game.setWheatInStorage(wheatLeft);
           // game.setPopulationMortality(peopleDied);
            //game.setTotalDied(game.getPopulationMortality() + peopleDied);
            //game.setCurrentPopulation(game.getCurrentPopulation() - peopleDied);
            
           
        }

        return peopleFed;
    }
}

