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
public class BuyLand {
    
    public int buyLand (int userAcres, int wheat, int acresBought, int landPrice){
        
        if (wheat < landPrice) {
            return -1;
        }
        if (acresBought <= 0) {
            return -2;
        }
       
        //Price of land is multiplied by land selected
        landPrice *= acresBought;
        
        userAcres += acresBought;
        
        wheat = landPrice - acresBought;
        
        return wheat;
            
    }
        
}
