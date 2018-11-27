
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.MapControl;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jessicasi
 */

public class  MapView extends View {
    
    
//private final String map;
 @Override
    public String[] getInputs() {
        
        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Move Locations * ");
        System.out.println(" ********************** ");
        System.out.println();

        
//        String mapOption = this.getInput("\nEnter Desired Location: ");
//        inputs[0] = mapOption;

        
        MovePlayer moveplayer = new MovePlayer();
        moveplayer.display();

        return inputs;
    }
 @Override
  public boolean doAction(String [] inputs) {
     String mapOption = inputs[0].toUpperCase();
     Game game = CityofAaron.getCurrentGame(); // retreive the game
     Map map = game.getTheMap(); // retreive the map from game
     Location[][] locations = map.getLocations(); // retreive the locations from map
     for (int row = 0; row < locations.length; row++) {
          for (int column = 0; column < locations[row].length; column++) {
               if (locations[row][column].getScene() != null) {               
                    if (mapOption.equals(locations[row][column].getScene().getMapSymbol())) {
                        try {
                            MapControl.movePlayer(map, row, column);
                        } catch (MapControlException ex) {
                            Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                         return true;
                    }
                 }
            }
     }
     System.out.println("\n*** Invalid selection *** Try Again later");
     return false;
   }


}

