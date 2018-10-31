/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

/**
 *
 * @author skylerfoxx
 */
public class SellBread {
    
    public int sellBread(int wheat, int loaves, int price) {
        
        //There must be loaves to make
        if (loaves < 1) {
            return -1;
        }
        
        //It takes 5 wheat to make a loaf of bread
        int cost = loaves * 5;
        
        if (wheat < cost)
            return -2;
        
        //This will need to be an object later on
        wheat -= cost;
        
        //Bread will be sold for 3-8 wheat
        if (price < 3 || price > 8) {
            return -3;
        }
        
        int sale = loaves * price;
        int profit = sale-cost;
        
        
        if (profit <=0) {
            return 0;
        }
        
        
        return  profit;
    }
    
}
