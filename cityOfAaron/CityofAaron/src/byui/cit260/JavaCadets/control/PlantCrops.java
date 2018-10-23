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
public class PlantCrops {
    
    public int plantCrops(int acres, int wheat, int userAcres) {
    
        if (userAcres <= 0) {
            return -3; 
        }
        if (userAcres > acres) {
            return -1;
        }
        
        int wheatNeeded = userAcres/2 ;
        
        if (wheatNeeded == 0) {
            wheatNeeded += 1;
        }
        if (wheatNeeded > wheat) {
            return -2;
        }
        wheat -= wheatNeeded;
        
        return wheat;
    
    
    }
    
}
