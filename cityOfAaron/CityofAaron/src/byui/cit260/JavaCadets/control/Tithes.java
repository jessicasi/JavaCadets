/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.TithesException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author jessicasi
 */
public class Tithes{
    
        public boolean Tithes(Game game, int tithes) throws TithesException{
            
               if (tithes < 0) {
                   throw new TithesException("Enter a number greater than 0");
                    
                } 
               if (tithes > 100) {
                     throw new TithesException("Enter a number lower than or equal to 100");
                }
               
               game.setTithingPaid(tithes);
        return true;
}
}
