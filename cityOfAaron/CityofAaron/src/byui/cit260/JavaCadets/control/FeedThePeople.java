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

    public int feedThePeople(Game game, int userWheat) throws FeedThePeopleException {

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
            int wheatLeft = game.getWheatInStorage() - userWheat;
            game.setWheatInStorage(wheatLeft);
        }

        return peopleFed;
    }
}

//TODO: get number of people from Game class
//        int people = 75;
//        //TODO: get land already owned from Game Class
//        int land = 20;
//        //TODO: get wheat already owned from Game Class
//        int userWheat = 200;
//        
//        //Calculate wheat needed to feed everyone
//        int wheatNeeded = people * 2;
//        
//        //Set number of people fed
//        int peopleFed = 0;
//        
//        System.out.println("Your population consists of " + people + " people across " + land + " acre(s) of land.");
//        System.out.println("It takes 2 bushels of wheat to feed each person.");
//        System.out.println("You have " + userWheat + " wheat remaining.");
//        System.out.println("To feed everyone will require " + wheatNeeded + " wheat.");
//        System.out.println();
//        System.out.println("How much wheat will you give to the people?");
//      
//boolean enoughWheat = false;
//        int wheatFeed = 0;
//        do{   
//        //Get User Input
//            System.out.println();
//            Scanner inFile;
//            inFile = new Scanner(System.in);
//            wheatFeed = inFile.nextInt();
//            
// System.out.println("Unfortunately, you don't have that much wheat. Enter a lower number.");
//System.out.println();
//}
//            //Checks to see if user gave more wheat than what was required
//            if (wheatFeed >= wheatNeeded) {
//                userWheat -= wheatFeed;
//                peopleFed = wheatFeed / 2;
//                //Checks to see if user gave up 100% of their wheat
//                    if (userWheat <= 0) {
//                        System.out.println("For some reason, you decided to give up all your wheat to the people all at once.");
//                        System.out.println();
//
//                        enoughWheat = true;
//                        continue;
//                    }
//                    
//                System.out.println("You generously gave more than what your people needed.");
//                System.out.println();
//                
//                enoughWheat = true;
//                continue;
//            }
//           
//            if (wheatFeed == 1) {
//                System.out.println("You tossed 1 wheat into the air for the people to share.");
//                System.out.println("Your people look at you with disgust.");
//                System.out.println();
//                enoughWheat = true;
//                continue;
//            } 
//            else {
//                userWheat -= wheatFeed;
//                System.out.println("You gave " + wheatFeed + " wheat to the people. You now have " + userWheat + " wheat remaining.");
//                
//                peopleFed = wheatFeed / 2;
//                
//                System.out.println("You fed " + peopleFed + " out of the " + people + " people." );
//                System.out.println();
//                
//                enoughWheat = true;
//            }
//               //TODO: Call setWheatAvailable() from the Game class
//            } while (enoughWheat == false);
//
//        //Should never reach this point
//        return wheatFeed;
//    }

