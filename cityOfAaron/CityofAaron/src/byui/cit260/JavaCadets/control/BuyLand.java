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
    
    public void displayBuyLand() {
    }
    
    public int buyLand (int userAcres, int wheat, int acresBought, int landPrice){
        
        boolean endOfView = false;
        
        //Sets price for each land
        landPrice = 10;
        
        System.out.println("1 Land costs" + "" + landPrice);
        System.out.println("How much land do you want to buy?");
        System.out.println();
        
        do {
            //Get User Input
            Scanner inFile;
            inFile = new Scanner(System.in);
            acresBought = inFile.nextInt();

            //TODO: Change this to call getWheatAvailable() from the Game class
            int wheatAvailable = 30;
            //Total Price is multiplied by land selection
            int totalPrice = landPrice * acresBought;
            System.out.println();
            System.out.println("The total price for " + acresBought + " land is " + totalPrice);

            if (wheat < totalPrice) {
                System.out.println("You don't have enough wheat to purchase this land.");
            }
            if (acresBought <= 0) {
                return -2;
            }
            
            else {
                userAcres += acresBought;
                wheat -= totalPrice;

            }
        }
        
        while (endOfView == false);
        
        return wheat & acresBought;
            
    }
        
}
