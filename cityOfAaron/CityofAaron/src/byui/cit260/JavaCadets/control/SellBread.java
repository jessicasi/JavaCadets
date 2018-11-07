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

    public int sellBread(int loaves) {

        int price = (int) (Math.random() * (10 - 4) + 4);

        //Bread will be sold for 4-10 wheat
        if (price < 3 || price > 8) {
            return -3;
        }

        int sale = loaves * price;

        //TODO: add sale to wheatAvailable
        return sale;
    }

}
