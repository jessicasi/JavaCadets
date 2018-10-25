/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

/**
 *
 * @author Steven Weber
 */
public class SellLand {
    
    public int sellland (int userAcers, int acresSold, int landPrice, int wheat){
        if (userAcers <= 0) {
            return -3;
    }
        if (acresSold <= 0) {
            return -2;
    }
        if (landPrice <= 0) {
            return -1;
        }
        
                
        int wheat = landPrice * userAcers;
            return wheat;
        
            
}
