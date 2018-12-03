/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.MakeBreadException;

import java.util.Scanner;

/**
 *
 * @author jessicasi
 */
public class MakeBread {

    public int MakeBread() {
        System.out.println("A loaf of bread takes 5 wheat to make. \n");
        System.out.println("Bread can make the user between 3-8 wheat per loaf");

        boolean enough = false;
        int loavesToMake = 0;

        do {
            //Get User Input
            System.out.println("How many loves of bread would you like to make?"); 
            Scanner inFile;
            inFile = new Scanner(System.in);
            loavesToMake = inFile.nextInt();

            //TODO: Change this to call getWheatAvailable() from the Game class
            int wheatAvailable = 30;
            int wheatNeeded = 5 * loavesToMake;
            System.out.println();
            System.out.println("It will take " + wheatNeeded + " wheat to make that much bread.");

            if (wheatAvailable < wheatNeeded) {
                System.out.println("You don't have enough wheat to make that much bread. Enter a lower number");
                continue;
            } else {
                wheatAvailable -= wheatNeeded;
                enough = true;
               //TODO: Call setWheatAvailable() from the Game class
            }

        } while (enough == false);

        //Should never reach this point
        return loavesToMake;
    }

}
