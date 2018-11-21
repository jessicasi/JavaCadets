/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.MapLocations;
import byui.cit260.JavaCadets.model.QuestionLocation;
import byui.cit260.JavaCadets.model.ResourceLocation;

/**
 *
 * @author Steven
 */
public class MapControl {
    
public static Map createMap( Game game,int noOfRows,int noOfColumns) {
// check for invalid inputs
if (game == null || noOfRows < 0 || noOfColumns < 0)
 return null;

// create the map object and assign values to it
Map map = new Map();
map.setDescription("City Of Aaron Local Map");
map.setRowCount(noOfRows);
map.setColumnCount(noOfColumns);
game.setTheMap(map);

// create a two-dimensional array of locations and assign array to the map
Location[][] locations = createLocations(noOfRows, noOfColumns);
    if (locations == null)
     return null;

map.setLocations(locations);

int success = assignActorsToLocations(locations);
    if (success < 0)
        return null;
InventoryItem[] itemsInGame = game.getInventory();
success = assignIemsToLocations(locations, itemsInGame);
    if (success < 0)
    return null;

// Assign all other types objects to locations (e.g., questions, spells)

return map;
}

    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
//        / Check for invalid inputs
         if (noOfRows < 1 || noOfColumns < 1)
            return null; // indicates the method failed
       
         Location[][] location ;
         location = new Location[noOfRows][noOfColumns];

        // Create a location and assign it to its position in the locations array
        Location locations  = new Location();
        locations.setLocationType("Neighbor");
        location[0][0] = locations;
        
        locations = new Location();
        locations.setLocationType("ARiver");
        location[0][1] = locations;
        
        locations = new Location();
        locations.setLocationType("WatersOfMormon");
        location[0][2] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("Market");
        location[0][3] = locations;
        
        locations = new QuestionLocation();
        locations.setLocationType("Inn");
        location[0][4] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("TheCitysGranary");
        location[1][0] = locations;
        
        locations = new Location();
        locations.setLocationType("TheVillage");
        location[1][1] = locations;
        
        locations = new QuestionLocation();
        locations.setLocationType("Road");
        location[1][2] = locations;
        
        locations = new Location();
        locations.setLocationType("Field");
        location[1][3] = locations;
        
        locations = new Location();
        locations.setLocationType("TheWell");
        location[1][4] = locations;
        
        locations = new Location();
        locations.setLocationType("Farm");
        location[2][0] = locations;
        
        locations = new QuestionLocation();
        locations.setLocationType("Temple");
        location[2][1] = locations;
        
        locations = new QuestionLocation();
        locations.setLocationType("TheRulersCourt");
        location[2][2] = locations;
        
        locations = new QuestionLocation();
        locations.setLocationType("Church");
        location[2][3] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("Bakery");
        location[2][4] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("Barn");
        location[3][0] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("Storehouse");
        location[3][1] = locations;
        
        locations = new Location();
        locations.setLocationType("Bathhouse");
        location[3][2] = locations;
        
        locations = new Location();
        locations.setLocationType("Forest");
        location[3][3] = locations;
        
        locations = new Location();
        locations.setLocationType("UndevelopedLand");
        location[3][4] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("WheatField1");
        location[4][0] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("WheatField2");
        location[4][1] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("WheatField3");
        location[4][2] = locations;
        
        locations = new ResourceLocation();
        locations.setLocationType("WheatField4");
        location[4][3] = locations;
        
        locations = new Location();
        locations.setLocationType("LamanitesBorderLand");
        location[4][4] = locations;
              
        //May need to call Setter Method for Resource and Question Locaitons!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!         
         return location; // indicates success
  }


//        Location[][] location ;
//        location = new Location[5][5];
//        return location;
    

    public static int assignActorsToLocations(Location[][] locations) {
        System.out.println("Lovely Actors");
        return 1;
    }

    private static int assignIemsToLocations(Location[][] locations, InventoryItem[] itemsInGame) {
        System.out.println("Lovely Locations");
        return 1;
    }




}
