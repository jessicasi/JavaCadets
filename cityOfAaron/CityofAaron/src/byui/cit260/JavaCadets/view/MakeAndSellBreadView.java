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
public class MakeAndSellBreadView {
    
    public void displayMakeAndSellBreadView() {
        
        int bread = 0;
        System.out.println("A loaf of bread takes 5 wheat to make. \n");
        System.out.println("Bread can make the user between 3-8 wheat per loaf");
        
        Scanner inFile;
        inFile = new Scanner(System.in);
        bread = inFile.nextInt();
        
        
    }
    
}
