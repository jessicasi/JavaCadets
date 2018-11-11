    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import java.util.Scanner;

/**
 *
 * @author skylerfoxx
 */
public class FeedThePeople {
    
    public int FeedThePeople (){
        
        //TODO: get number of people from Game class
        int people = 75;
        //TODO: get land already owned from Game Class
        int land = 20;
        //TODO: get wheat already owned from Game Class
        int userWheat = 200;
        
        //Calculate wheat needed to feed everyone
        int wheatNeeded = people * 2;
        
        //Set number of people fed
        int peopleFed = 0;
        
        System.out.println("Your population consists of " + people + " across " + land + " acre(s) of land.");
        System.out.println("It takes 2 bushels of wheat to feed each person.");
        System.out.println("You have " + userWheat + " wheat remaining.");
        System.out.println("To feed everyone will require " + wheatNeeded + " wheat.");
        System.out.println();
        System.out.println("How much wheat will you give to the people?");
      
        boolean enoughWheat = false;
        int wheatFeed = 0;
        do{   
        //Get User Input
            System.out.println();
            Scanner inFile;
            inFile = new Scanner(System.in);
            wheatFeed = inFile.nextInt();
            
            //Checks to see if user entered 0 or a negative number
            if (wheatFeed <= 0) {
                System.out.println();
                System.out.println("You neglected to feed your people!");
                System.out.println();
                enoughWheat = true;
                continue;
            }
            
            //Checks to see if user gave more wheat than what was required
            if (wheatFeed >= wheatNeeded) {
                userWheat -= wheatFeed;
                peopleFed = wheatFeed / 2;
                
                //Checks to see if user gave up 100% of their wheat
                    if (userWheat <= 0) {
                        System.out.println("For some reason, you decided to give up all your wheat to the people all at once.");
                        System.out.println();

                        enoughWheat = true;
                        continue;
                    }
                    
                System.out.println("You generously gave more than what your people needed.");
                System.out.println();
                
                enoughWheat = true;
                continue;
            }
            
            //Checks to see if the user has enough wheat to give what they entered
            if (userWheat < wheatNeeded) {
                System.out.println("Unfortunately, you don't have that much wheat. Enter a lower number.");
                System.out.println();
                
            } else {
                userWheat -= wheatFeed;
                System.out.println("You gave " + wheatFeed + " wheat to the people. You now have " + userWheat + " wheat remaining.");
                
                peopleFed = wheatFeed / 2;
                
                System.out.println("You fed " + peopleFed + " out of the " + people + " people." );
                System.out.println();
                
                enoughWheat = true;
            }
               //TODO: Call setWheatAvailable() from the Game class
            } while (enoughWheat == false);

        //Should never reach this point
        return wheatFeed;
    }
        
}