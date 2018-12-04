/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.SellBreadException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author skylerfoxx
 */
public class SellBread {
    

    public int sellBread( Game game, int loaves) throws SellBreadException {

        int price = (int) (Math.random() * (10 - 4) + 4);

        //Bread will be sold for 4-10 wheat
        if (price < 4 || price > 10) {
            throw new SellBreadException("Internal Price Error, try again");
        }

        int sale = loaves * price;
        game.setWheatInStorage(game.getWheatInStorage() + sale);
        
       
        return sale;
    }



}
