/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import static byui.cit260.JavaCadets.control.MapControl.movePlayer;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.model.Scene;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Steven
 */
public class MovePlayer extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println("Enter Row Number and then Enter Column Number");
        String input1 = getInput("Enter Row Number");
        inputs[0] = input1;
        
        String input2 = getInput("Enter Column Number");
        inputs[1] = input2;
        return inputs; 
    }

    @Override
    public boolean doAction(String[] inputs) {
       String Rrow = inputs[0];
       String Ccolumn = inputs[1];
       int row = 0;
       int column = 0;
       Location newLocation = null;
            try {
            row = parseInt(Rrow);
            column = parseInt(Ccolumn);
                    }catch (NumberFormatException nf) {
            System.out.println("The row and column must be a number");
            return false;
                    }
            Player player = CityofAaron.getPlayer();
//            actor = get the Actor in the player object
            Game game = CityofAaron.getCurrentGame();
            Map map = game.getTheMap();
            
            try{
            newLocation = movePlayer(map, row, column);
            } catch (MapControlException mf){
            System.out.println("SUCK IT YOU FAILED ");
            return false;
                    }
            
            
            Scene scene = new Scene();
            scene.setDescription(newLocation.getDescription());
            return true;  
    }
    
}
