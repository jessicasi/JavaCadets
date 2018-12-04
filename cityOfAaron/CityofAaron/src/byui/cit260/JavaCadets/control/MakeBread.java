/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.MakeBreadException;
import byui.cit260.JavaCadets.model.Game;


/**
 *
 * @author jessicasi
 */
public class MakeBread {

    public boolean MakeBread( Game game, int loaves) throws MakeBreadException {
        
            int wheatAvailable = game.getWheatInStorage();
            int wheatNeeded = loaves * 5;


            if (wheatAvailable < wheatNeeded) {
                throw new MakeBreadException("You don't have enough wheat available to make that much bread\n");      
            }
            
            game.setWheatInStorage((game.getWheatInStorage()-wheatNeeded));
            return true;
    }

}
