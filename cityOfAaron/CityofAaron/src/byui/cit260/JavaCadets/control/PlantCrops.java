/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import java.util.Scanner;

/**
 *
 * @author skylerfoxx, Jessica, Steven
 */
public class PlantCrops {
    
    public int plantCrops() {
        
        //TODO: Change this to GetWheatAvailable and GetAcresAvailable from the Game Class
        int userWheat = 40;
        int userAcres = 5;
        
        int acresPlanted = 0;
        
        System.out.println("You have " + userAcres + " acre(s) of land and " + userWheat + " bushels of wheat.");
        System.out.println("One acre of land requires 10 wheat to plant.");
        System.out.println();
        
        boolean enoughAcres = false;
        
        do{   
        //Get User Input
            System.out.println("How many acres of land do you want to plant?");
            Scanner inFile;
            inFile = new Scanner(System.in);
            int acresPlant = inFile.nextInt();
            
            System.out.println();
            
            //Planting crops is 10 wheat per acre
            int wheatNeeded = acresPlant * 10;
            
            //Checks if the user entered 0 or a negative number
            if (acresPlant <= 0) {
                System.out.println();
                System.out.println("You chose not to plant anything.");
                System.out.println();
                enoughAcres = true;
                continue;
            }
            
            //Checks if user has enough wheat for the acres of land they want to plant
            if (wheatNeeded >= userWheat) {
                System.out.println();
                System.out.println(acresPlant + " acres of land requires " + wheatNeeded + " wheat.");
                System.out.println("You only have " + userWheat + " wheat. Please enter a lower number.");
                continue;
            }
            
            if (userAcres < acresPlant) {
                System.out.println();
                System.out.println("You don't have that many acres of land.");
                
            } else {
                //Player's wheat is subtracted from wheat needed
                userWheat -= wheatNeeded;
                acresPlanted += acresPlant;                
                
                System.out.println();
                System.out.println("You used " + wheatNeeded + " wheat to plant crops on " + acresPlant + " acres of land.");
                System.out.println("You now have " + userWheat + " wheat remaining.");
                System.out.println();
                
                enoughAcres = true;
            }
            
            //TODO: Call setAcresAvailable() from the Game class
            }while (enoughAcres == false);
        
        return userWheat;  
    
    }
    
}
