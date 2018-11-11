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
       
       //Acres will be sold for 17-27 wheat
        if (price < 17 || price > 27) {
            return -3;
        }
       
       //TODO: Change this to call getAcresAvailable() and getWheatAvailable() from the Game class
        int userAcres = 5;
        int userWheat = 300;
        
        System.out.println("1 acre of land costs " + price + " wheat.");
      
        boolean enoughWheat = false;
        boolean enoughPeople = false;
        int landToBuy = 0;
        do{   
        //Get User Input
            System.out.println();
            System.out.println("You currently have " + userWheat + " wheat.");
            System.out.println("How many acres do you want to buy?");
            Scanner inFile;
            inFile = new Scanner(System.in);
            landToBuy = inFile.nextInt();

            int wheatNeeded = price * landToBuy;

            if (landToBuy <= 0) {
                System.out.println();
                System.out.println("You chose not to buy any land.");
                System.out.println();
                enoughWheat = true;
                continue;
            }
            
            if (userWheat < wheatNeeded) {
                System.out.println("The total price is " + wheatNeeded + " wheat.");
                System.out.println();
                System.out.println("You don't have enough wheat to buy that much land. Enter a lower number.");
            } else {
                userWheat -= wheatNeeded;
                userAcres += landToBuy;
                System.out.println("The total price is " + wheatNeeded + " wheat.");
                System.out.println();
                System.out.println("You now have " + userAcres + " total acres.");
                System.out.println("You have " + userWheat + " wheat remaining.");
                System.out.println();
                
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
        int people = 75;
        //TODO: get land already owned from Game Class
        int land = 20;
        
        int peopleLeft = people - (land/10);
        int peopleNeeded = landToBuy / 10;
        
        if (peopleLeft < peopleNeeded) {
            System.out.println("You don't have enough people to tend the land. Enter a lower number");
            return false;
        }
        return true;
        
    }
            
    
        
}