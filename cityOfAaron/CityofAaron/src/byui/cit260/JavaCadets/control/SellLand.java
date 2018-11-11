/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import java.util.Scanner;

/**
 *
 * @author Steven Weber
 */
public class SellLand {
    
    public int SellLand (){
        
        //Selling price at a random price between 15 and 19
        int price = (int) (Math.random() * (19 - 15) + 15);
       
       //Acres can sell for 15-19 wheat
        if (price < 15 || price > 19) {
            return -3;
        }
        
        //TODO: Change this to call getWheatAvailable and getAcresAvailable() from the Game class
        int userWheat = 4;
        int userAcres = 4;
        
        System.out.println("1 acre of land sells for " + price + " wheat.");
        
        boolean enoughAcres = false;
        boolean enoughPeople = false;
        int acresSold = 0;
        
        do{   
        //Get User Input
            System.out.println("You currently have " + userAcres + " acre(s) of land.");
            System.out.println("How many acres do you want to sell?");
            Scanner inFile;
            inFile = new Scanner(System.in);
            acresSold = inFile.nextInt();
            
            System.out.println();
            
            if (userAcres < acresSold) {
                System.out.println("You don't have that many acres of land to sell. Enter a lower number.");
            } else {
                System.out.println("You earned " + price + " wheat for " + acresSold + " acre(s) of land.");
                userAcres -= acresSold;
                userWheat += price; 
                
                enoughAcres = true;
            }
            
            //TODO: Call setAcresAvailable() from the Game class
            }while (enoughAcres == false);
        
            //Should never reach this point
            return userAcres;
        
    }
}
