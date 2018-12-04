/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.SellLandException;
import byui.cit260.JavaCadets.model.Game;
import java.util.Scanner;

/**
 *
 * @author Steven Weber, skylerfoxx, 
 */
public class SellLand {
    
    public int SellLand (Game game, int acres, int price) throws SellLandException{
        
       
        
        //TODO: Change this to call getWheatAvailable and getAcresAvailable() from the Game class
        int currentWheat = game.getWheatInStorage();
        int currentAcres = game.getAcresOwned();
        int totalPrice = 0;
        
       // System.out.println("1 acre of land sells for " + price + " wheat.");
        
       
       
            if (acres <= 0) {
               throw new SellLandException("Looks like you chose to not sell any land");
            }
            
            if (currentAcres < acres) {
                throw new SellLandException("You don't have that many acres to sell");
            }
            
            else {
                //Total Price is current price times acres Sold
                totalPrice = price * acres;
                
            }
                
                game.setAcresOwned(game.getAcresOwned() - acres);
                game.setWheatInStorage(game.getWheatInStorage() + totalPrice);


            
            //TODO: Call setAcresAvailable() from the Game class
          
        
            //Should never reach this point
            return totalPrice;
        
    }

    public int getPrice() throws SellLandException {
         //Selling price at a random price between 15 and 19
        int price = (int) (Math.random() * (19 - 15) + 15);
       
       //Acres can sell for 15-19 wheat
        if (price < 15 || price > 19) {
           throw new SellLandException("Internal Price Error, try again");
        }
        
        return price;
    }
}
