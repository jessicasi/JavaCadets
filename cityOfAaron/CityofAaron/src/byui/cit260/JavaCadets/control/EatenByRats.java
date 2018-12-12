/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author jessicasi
 */
public class EatenByRats {
    
    public int eatenByRats() {
 
   int fate = (int) (Math.random() * (100 - 1) + 1);
   if(fate < 30)
       return 0;
    Game game = CityofAaron.getCurrentGame();
    int ratWheat = 0;
    float percent = 0;
    int range = 0;
    int tithes = game.getTithingPaid();
    
   if (tithes > 12) {
            range = 3;
            percent = (float) ((Math.random() * range) + 3)/100;
            ratWheat = (int) (percent * game.getWheatInStorage()); 
        }
        else if (tithes >= 8 && percent <12) {
       
            range = 5;
             percent = (float)( (Math.random() * range) + 3) / 100;
            ratWheat = (int) (percent * game.getWheatInStorage()); 
        }
        else {
            range = 5;
             percent = (float) ((Math.random() * range) + 6) / 100;
            ratWheat = (int) (percent * game.getWheatInStorage());  
        }
    
    return ratWheat;
       }
   
}
