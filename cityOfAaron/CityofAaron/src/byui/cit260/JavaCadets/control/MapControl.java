/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;

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
Location locations = createLocations(noOfRows, noOfColumns);
    if (locations == null)
     return null;

map.setLocations(locations);
// assign actors and items to locations
success = assignActorsToLocations(locations)
if (success < 0) then
 return null;

success = assignIemsToLocations(locations)
if (success < 0) then
 return null;

// Assign all other types objects to locations (e.g., questions, spells)
…
return map;
}

    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        Location[][] locaiton = new Location();
    }




}
