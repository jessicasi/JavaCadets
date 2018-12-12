/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.BuyLandException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author skylerfoxx
 */
public class BuyLand {

    public boolean BuyLand(Game game, int landToBuy, int price) throws BuyLandException {

        boolean valid = false;
        int wheatNeeded = landToBuy * price;
        int currentWheat = game.getWheatInStorage();
        if (landToBuy <= 0) {
            throw new BuyLandException("You chose not to buy any land");
        } else if (wheatNeeded > currentWheat) {
            throw new BuyLandException("You don't have enough wheat to buy that much land");
        }

        if (!calculatePeople(game, landToBuy)) {
            throw new BuyLandException("You don't have enough people to buy that much land");
        } 

        currentWheat -= wheatNeeded;
        game.setWheatInStorage(currentWheat);
        int userAcres = game.getAcresOwned();
        userAcres += landToBuy;
        game.setAcresOwned(userAcres);

       valid = true;
        return valid;

    }

    private boolean calculatePeople(Game game, int landToBuy) {

        int people = game.getCurrentPopulation();
        int land = game.getAcresOwned();

        int peopleLeft = people - (land / 10);
        int peopleNeeded = landToBuy / 10;

        if (peopleLeft < peopleNeeded) {
            return false;
        }
        return true;

    }

    public int calculatePrice() throws BuyLandException {
        int price = (int) (Math.random() * (27 - 17) + 17);

        //Acres will be sold for 17-27 wheat
        if (price < 17 || price > 27) {
            throw new BuyLandException("Not a Valid Price");
        }

        return price;
    }

}
