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
public class TithesandOfferingsVIew {
    
   public void displayTithesandOfferingsView() {
    
    System.out.println("What percentage of your harvest do you want to pay in tithes & offerings?");
    
    Scanner inFile;
   int tithes = 0;
    
    boolean valid = false;
    
    while(valid == false){
        inFile = new Scanner(System.in);        
    tithes = inFile.nextInt();
        if ( tithes < 0) {
            System.out.println("Enter a number greater than 0");
            continue;
        }
        
        if( tithes > 100) {
            System.out.println("Enter a number lower than or equal to 100");
            continue;
        }
        
        valid = true;
    }
    
    //TODO : Save the value entered by user
    }
            
    
}
