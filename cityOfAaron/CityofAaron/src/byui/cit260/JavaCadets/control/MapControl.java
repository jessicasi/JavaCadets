/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.model.Actor;
import byui.cit260.JavaCadets.model.ActorName;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.ItemType;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.Point;
import byui.cit260.JavaCadets.model.Question;
import byui.cit260.JavaCadets.model.QuestionLocation;
import byui.cit260.JavaCadets.model.ResourceLocation;
import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class MapControl {

    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
// check for invalid inputs
        if (game == null || noOfRows < 0 || noOfColumns < 0) {
            return null;
        }

// create the map object and assign values to it
        Map map = new Map();
        map.setDescription("City Of Aaron Local Map");
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
        game.setTheMap(map);

// create a two-dimensional array of locations and assign array to the map
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null) {
            return null;
        }

        map.setLocations(locations);

        int success = assignActorsToLocations(locations);
        if (success < 0) {
            return null;
        }
        InventoryItem[] itemsInGame = game.getInventory();
        success = assignIemsToLocations(locations, itemsInGame);
        if (success < 0) {
            return null;
        }

// Assign all other types objects to locations (e.g., questions, spells)
        return map;
    }

    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        // Check for invalid inputs
        if (noOfRows < 1 || noOfColumns < 1) {
            return null; // indicates the method failed
        }
        Location[][] location;
        location = new Location[noOfRows][noOfColumns];

        // Create a location and assign it to its position in the locations array
        //Location 1
        Location locations = new Location();
        locations.setLocationType("Neighbor");
        location[0][0] = locations;
        locations.setRow(0);
        locations.setColumn(0);
        locations.setDescription("Visiting your Neighbor");
        locations.setVisited(false);
        locations.setDisplaySymbol("NB");

        //Location 2
        locations = new Location();
        locations.setLocationType("A River");
        location[0][1] = locations;
        locations.setRow(0);
        locations.setColumn(1);
        locations.setDescription("This is a river you can visit");
        locations.setVisited(false);
        locations.setDisplaySymbol("RV");

        //Location 3
        locations = new Location();
        locations.setLocationType("Waters Of Mormon");
        location[0][2] = locations;
        locations.setRow(0);
        locations.setColumn(2);
        locations.setDescription("Visit the famous Waters of Mormon");
        locations.setVisited(false);
        locations.setDisplaySymbol("WM");
 

        //Location 4
        ResourceLocation resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Market");
        location[0][3] = resourceLocation;
        resourceLocation.setRow(0);
        resourceLocation.setColumn(3);
        resourceLocation.setDescription("This is the Market where you can buy items");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("MK");
        //resourceLocation.setAmountAvailable(3000);
        //resourceLocation.setAmountUsed(0);
        ArrayList<InventoryItem> itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 5
        QuestionLocation questionLocation = new QuestionLocation();
        //locations = new QuestionLocation();
        questionLocation.setLocationType("Inn");
        location[0][4] = questionLocation;
        questionLocation.setRow(0);
        questionLocation.setColumn(4);
        questionLocation.setDescription("Visit the Inn to talk to people");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("IN");
        ArrayList<Question> questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 6
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("The Citys Granary");
        location[1][0] = resourceLocation;
        resourceLocation.setRow(1);
        resourceLocation.setColumn(0);
        resourceLocation.setDescription("Visit the City Granary to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("GN");
        resourceLocation.setAmountAvailable(3000);
        resourceLocation.setAmountUsed(0);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 7
        locations = new Location();
        locations.setLocationType("The Village");
        location[1][1] = locations;
        locations.setRow(1);
        locations.setColumn(1);
        locations.setDescription("Visit the Village!");
        locations.setVisited(false);
        locations.setDisplaySymbol("VG");
 

        //Location 8
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("Road");
        location[1][2] = questionLocation;
        questionLocation.setRow(1);
        questionLocation.setColumn(2);
        questionLocation.setDescription("Visit the Road to chat with someone");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("RD");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 9
        locations = new Location();
        locations.setLocationType("Field");
        location[1][3] = locations;
        locations.setRow(1);
        locations.setColumn(3);
        locations.setDescription("Go visit a random field");
        locations.setVisited(false);
        locations.setDisplaySymbol("FD");
       

        //Location 10
        locations = new Location();
        locations.setLocationType("The Well");
        location[1][4] = locations;
        locations.setRow(1);
        locations.setColumn(4);
        locations.setDescription("Go to the Well");
        locations.setVisited(false);
        locations.setDisplaySymbol("WL");


        //Location 11
        locations = new Location();
        locations.setLocationType("Farm");
        location[2][0] = locations;
        locations.setRow(2);
        locations.setColumn(0);
        locations.setDescription("Visit the Farm");
        locations.setVisited(false);
        locations.setDisplaySymbol("RM");


        //Location 12
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("Temple");
        location[2][1] = questionLocation;
        questionLocation.setRow(2);
        questionLocation.setColumn(1);
        questionLocation.setDescription("Go to the Temple to learn");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("TP");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 13
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("The Rulers Court");
        location[2][2] = questionLocation;
        questionLocation.setRow(2);
        questionLocation.setColumn(2);
        questionLocation.setDescription("Go to the Rulers Court to talk to someone");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("RC");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 14
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("Church");
        location[2][3] = questionLocation;
        questionLocation.setRow(2);
        questionLocation.setColumn(3);
        questionLocation.setDescription("Go to Church and talk to someone");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("CH");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 15
        locations = new Location();
        locations.setLocationType("Bakery");
        location[2][4] = locations;
        locations.setRow(2);
        locations.setColumn(4);
        locations.setDescription("Visit the Bakery to run errands");
        locations.setVisited(false);
        locations.setDisplaySymbol("BY");

        //Location 16
       resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Barn");
        location[3][0] = resourceLocation;
        resourceLocation.setRow(3);
        resourceLocation.setColumn(0);
        resourceLocation.setDescription("Visit the Barn to do some chores");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("BN");
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 17
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Storehouse");
        location[3][1] = locations;
        resourceLocation.setRow(3);
        resourceLocation.setColumn(1);
        resourceLocation.setDescription("Visit the Storehouse to look at your items");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("ST");
        //resourceLocation.setAmountAvailable(2000);
        //resourceLocation.setAmountUsed(0);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 18
        locations = new Location();
        locations.setLocationType("Bathhouse");
        location[3][2] = locations;
        locations.setRow(3);
        locations.setColumn(2);
        locations.setDescription("Visit the Bathhouse");
        locations.setVisited(false);
        locations.setDisplaySymbol("BH");

        //Location 19
        locations = new Location();
        locations.setLocationType("Forest");
        location[3][3] = locations;
        locations.setRow(3);
        locations.setColumn(3);
        locations.setDescription("Visit the Forest");
        locations.setVisited(false);
        locations.setDisplaySymbol("FT");

        //Location 20
        locations = new Location();
        locations.setLocationType("Undeveloped Land");
        location[3][4] = locations;
        locations.setRow(3);
        locations.setColumn(4);
        locations.setDescription("Visit the Undeveloped Land");
        locations.setVisited(false);
        locations.setDisplaySymbol("UD");

        //Location 21
        locations = new Location();
        locations.setLocationType("Wheat Field 1");
        location[4][0] = locations;
        locations.setRow(4);
        locations.setColumn(0);
        locations.setDescription("Visit the WheatField to work the fields");
        locations.setVisited(false);
        locations.setDisplaySymbol("W1");

        //Location 22
        locations = new Location();
        locations.setLocationType("Wheat Field 2");
        location[4][1] = locations;
        locations.setRow(4);
        locations.setColumn(1);
        locations.setDescription("Visit the WheatField to work the fields");
        locations.setVisited(false);
        locations.setDisplaySymbol("W2");

        //Location 23
        locations = new Location();
        locations.setLocationType("Wheat Field 3");
        location[4][2] = locations;
        locations.setRow(4);
        locations.setColumn(2);
        locations.setDescription("Visit the WheatField to work the fields");
        locations.setVisited(false);
        locations.setDisplaySymbol("W3");

        //Location 24
        locations = new Location();
        locations.setLocationType("Wheat Field 4");
        location[4][3] = locations;
        locations.setRow(4);
        locations.setColumn(3);
        locations.setDescription("Visit the WheatField to work the fields");
        locations.setVisited(false);
        locations.setDisplaySymbol("W4");

        //Location 25
        locations = new Location();
        locations.setLocationType("Lamanites BorderLand");
        location[4][4] = locations;
        locations.setRow(4);
        locations.setColumn(4);
        locations.setDescription("Visit the Lamanites BorderLand");
        locations.setVisited(false);
        locations.setDisplaySymbol("LN");

        return location; // indicates success
    }

    private static int assignActorsToLocations(Location[][] locations) {
        // Check for invalid input
        if (locations == null) {
            return -1; // indicates invalid input
        }
        // Assign the actor Nephi to starting its location

        Location location = locations[0][4];
        location.setActor(ActorName.nephi);
        Point actorCoordinates = ActorName.innkeeper.getCoordinates();
        location.setActorCoordinates(actorCoordinates);
        //actorPosition.setColumn(4);

        location = locations[1][2];
        location.setActor(ActorName.sister);
        actorCoordinates = ActorName.sister.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][1];
        location.setActor(ActorName.moses);
        actorCoordinates = ActorName.moses.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][2];
        location.setActor(ActorName.king);
        actorCoordinates = ActorName.king.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][3];
        location.setActor(ActorName.nephi);
        actorCoordinates = ActorName.nephi.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][4];
        location.setActor(ActorName.mother);
        actorCoordinates = ActorName.mother.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[0][0];
        location.setActor(ActorName.villager);
        actorCoordinates = ActorName.villager.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][4];
        location.setActor(ActorName.fieldworker);
        actorCoordinates = ActorName.fieldworker.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[4][4];
        location.setActor(ActorName.brother);
        actorCoordinates = ActorName.brother.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][2];
        location.setActor(ActorName.father);
        actorCoordinates = ActorName.father.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][3];
        location.setActor(ActorName.Aaron);
        actorCoordinates = ActorName.Aaron.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        // Repeat above steps for each actor in the game
        return 1; // indicates success
    }

    private static int assignIemsToLocations(Location[][] locations, InventoryItem[] itemsInGame) {
        /// Check for invalid inputs
        if (locations == null || itemsInGame == null) {
            return -1; // indicates an invalid input
        }
        // Add items to a location in the map
        ResourceLocation location = (ResourceLocation) locations[0][3];
        ArrayList<InventoryItem> itemsInLocation = location.getItems();
        itemsInLocation.add(itemsInGame[ItemType.scyth.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.hoe.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.pickaxe.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.bow.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.feed.ordinal()]);
        
        location = (ResourceLocation) locations[1][0];
        itemsInLocation = location.getItems();
        itemsInLocation.add(itemsInGame[ItemType.wheat.ordinal()]);
   
        
        location = (ResourceLocation) locations[3][0];
        itemsInLocation = location.getItems();
        itemsInLocation.add(itemsInGame[ItemType.pig.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.chicken.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.horse.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.goat.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.donkey.ordinal()]);
        
        
       
     return 1;
    }
    
 public static Location movePlayer(Map map, int i, int io) throws MapControlException {
       if (map == null)
           throw new MapControlException("Map is invalid");
              
       if (i < 0 || i > 4 || io < 0 || io > 4)
           throw new MapControlException("Row or Column Number Invalid");
     
        int row = i;
        int column = io;
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
        Location location = map.getCurrentLocation();
        return location;
        
    }

}
