/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.JavaCadets.model.Player;

/**
 *
 * @author jessicasi
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
    }
    
}
