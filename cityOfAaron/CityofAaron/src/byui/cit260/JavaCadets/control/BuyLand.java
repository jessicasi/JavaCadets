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
public class BuyLand {
    
    public int BuyLand (){
        
         int price = (int) (Math.random() * (27 - 17) + 17);

        //Bread will be sold for 4-10 wheat
        if (price < 17 || price > 27) {
            return -3;
        }
       System.out.println("The cost of 1 acre of land right now is " + price + " wheat.");
       System.out.println();
      
        boolean enoughWheat = false;
        boolean enoughPeople = false;   
        int landToBuy = 0;
        
        do{   
            //TODO: Change this to call getWheatAvailable() from the Game class
            int wheatAvailable = 300;
            System.out.println("You have " + wheatAvailable + " wheat to buy land with.");
            System.out.println("How many acres do you want to buy?");
            Scanner inFile;
            inFile = new Scanner(System.in);
            landToBuy = inFile.nextInt();

            
            int wheatNeeded = price * landToBuy;
            System.out.println();
            System.out.println("It will take " + wheatNeeded + " wheat to buy that much land.");
            System.out.println();

            if (wheatAvailable < wheatNeeded) {
                System.out.println("You don't have enough wheat to buy that much land. Enter a lower number");
            } else {
                wheatAvailable -= wheatNeeded;
                enoughPeople=calculatePeople(landToBuy);
                    if(enoughPeople == false) continue;
                
                enoughWheat = true;
            }
               //TODO: Call setWheatAvailable() from the Game class
            } while (enoughWheat == false);

        //Should never reach this point
        return landToBuy;
    }

        

    private boolean calculatePeople(int landToBuy) {
                
        //TODO: get number of people from Game class
        int people = 60;
        //TODO: get land already owned from Game Class
        int land = 20;
        
        int peopleLeft = people - (land/10);
        int peopleNeeded = landToBuy / 10;
        
        if (peopleLeft < peopleNeeded) {
            System.out.println("You don't have enough people to tend the land. Enter a lower number");
            return false;
        }
        else{
            System.out.println("Congratulations, you just bought " + landToBuy + " acres of land!");
        }
        
        return true;
        
    }
            
    
        
}
