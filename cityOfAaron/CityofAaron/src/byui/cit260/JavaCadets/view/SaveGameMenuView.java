/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import java.util.Scanner;

/**
 *
 * @author Jessica
 */
public class SaveGameMenuView {
    
    public void displaySaveGameMenuView() {
        
        boolean valid = false;
        System.out.println("Enter the name of the file where the game will be saved: ");
        Scanner inFile;
        inFile = new Scanner(System.in);        
        String filename = inFile.nextLine();
        
        while (valid == false) {
            if(filename.equals("")) {
                System.out.println("Please enter a valid filename");
                    filename = inFile.nextLine();
                    continue;
        }
            System.out.println("Success! Your game has been saved!");
            valid = true;
        }
    
}
    
}
