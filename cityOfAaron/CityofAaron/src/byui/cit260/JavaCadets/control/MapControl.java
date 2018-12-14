/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.MapControlException;
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

    public static Map createMap(Game game, int noOfRows, int noOfColumns) throws MapControlException {
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
        locations.setLocationType("location");
        location[0][0] = locations;
        locations.setRow(0);
        locations.setColumn(0);
        locations.setDescription("Welcome to the Neighbor's House");
        locations.setVisited(false);
        locations.setDisplaySymbol("NB");

        //Location 2
        locations = new Location();
        locations.setLocationType("location");
        location[0][1] = locations;
        locations.setRow(0);
        locations.setColumn(1);
        locations.setDescription("Welcome to A River");
        locations.setVisited(false);
        locations.setDisplaySymbol("RV");

        //Location 3
        locations = new Location();
        locations.setLocationType("location");
        location[0][2] = locations;
        locations.setRow(0);
        locations.setColumn(2);
        locations.setDescription("Welcome to the Waters of Mormon");
        locations.setVisited(false);
        locations.setDisplaySymbol("WM");

        //Location 4
        ResourceLocation resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("resourceLocation");
        location[0][3] = resourceLocation;
        resourceLocation.setRow(0);
        resourceLocation.setColumn(3);
        resourceLocation.setDescription("Welcome to the Market");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("MK");
        //resourceLocation.setAmountAvailable(3000);
        //resourceLocation.setAmountUsed(0);
        ArrayList<InventoryItem> itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 5
        QuestionLocation questionLocation = new QuestionLocation();
        //locations = new QuestionLocation();
        questionLocation.setLocationType("questionLocation");
        location[0][4] = questionLocation;
        questionLocation.setRow(0);
        questionLocation.setColumn(4);
        questionLocation.setDescription("Welcome to the Inn");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("IN");
        ArrayList<Question> questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 6
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("resourceLocation");
        location[1][0] = resourceLocation;
        resourceLocation.setRow(1);
        resourceLocation.setColumn(0);
        resourceLocation.setDescription("welcome to the Grainary");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("GN");
        resourceLocation.setAmountAvailable(3000);
        resourceLocation.setAmountUsed(0);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 7
        locations = new Location();
        locations.setLocationType("location");
        location[1][1] = locations;
        locations.setRow(1);
        locations.setColumn(1);
        locations.setDescription("Welcome to the Village");
        locations.setVisited(false);
        locations.setDisplaySymbol("VG");

        //Location 8
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("questionLocation");
        location[1][2] = questionLocation;
        questionLocation.setRow(1);
        questionLocation.setColumn(2);
        questionLocation.setDescription("Welcome to the Road");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("RD");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 9
        locations = new Location();
        locations.setLocationType("location");
        location[1][3] = locations;
        locations.setRow(1);
        locations.setColumn(3);
        locations.setDescription("Welcome to the Field");
        locations.setVisited(false);
        locations.setDisplaySymbol("FD");

        //Location 10
        locations = new Location();
        locations.setLocationType("location");
        location[1][4] = locations;
        locations.setRow(1);
        locations.setColumn(4);
        locations.setDescription("Welcome to the Well");
        locations.setVisited(false);
        locations.setDisplaySymbol("WL");

        //Location 11
        locations = new Location();
        locations.setLocationType("location");
        location[2][0] = locations;
        locations.setRow(2);
        locations.setColumn(0);
        locations.setDescription("Welcome to the Farm");
        locations.setVisited(false);
        locations.setDisplaySymbol("RM");

        //Location 12
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("questionLocation");
        location[2][1] = questionLocation;
        questionLocation.setRow(2);
        questionLocation.setColumn(1);
        questionLocation.setDescription("Welcome to the Temple");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("TP");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 13
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("questionLocation");
        location[2][2] = questionLocation;
        questionLocation.setRow(2);
        questionLocation.setColumn(2);
        questionLocation.setDescription("Welcome to the Ruler's Court");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("RC");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 14
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("questionLocation");
        location[2][3] = questionLocation;
        questionLocation.setRow(2);
        questionLocation.setColumn(3);
        questionLocation.setDescription("Welcome to the Church");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("CH");
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 15
        locations = new Location();
        locations.setLocationType("location");
        location[2][4] = locations;
        locations.setRow(2);
        locations.setColumn(4);
        locations.setDescription("Welcome to the Bakery");
        locations.setVisited(false);
        locations.setDisplaySymbol("BY");

        //Location 16
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("resourceLocation");
        location[3][0] = resourceLocation;
        resourceLocation.setRow(3);
        resourceLocation.setColumn(0);
        resourceLocation.setDescription("Welcome to the Barn");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("BN");
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 17
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("resourceLocation");
        location[3][1] = resourceLocation;
        resourceLocation.setRow(3);
        resourceLocation.setColumn(1);
        resourceLocation.setDescription("Welcome to the Storehouse");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("ST");
        //resourceLocation.setAmountAvailable(2000);
        //resourceLocation.setAmountUsed(0);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 18
        locations = new Location();
        locations.setLocationType("location");
        location[3][2] = locations;
        locations.setRow(3);
        locations.setColumn(2);
        locations.setDescription("Welcome to the Bathhouse");
        locations.setVisited(false);
        locations.setDisplaySymbol("BH");

        //Location 19
        locations = new Location();
        locations.setLocationType("location");
        location[3][3] = locations;
        locations.setRow(3);
        locations.setColumn(3);
        locations.setDescription("Welcome to the Forest");
        locations.setVisited(false);
        locations.setDisplaySymbol("FT");

        //Location 20
        locations = new Location();
        locations.setLocationType("location");
        location[3][4] = locations;
        locations.setRow(3);
        locations.setColumn(4);
        locations.setDescription("Welcome to some undeveloped land");
        locations.setVisited(false);
        locations.setDisplaySymbol("UD");

        //Location 21
        locations = new Location();
        locations.setLocationType("location");
        location[4][0] = locations;
        locations.setRow(4);
        locations.setColumn(0);
        locations.setDescription("Welcome to Wheat Field 1");
        locations.setVisited(false);
        locations.setDisplaySymbol("W1");

        //Location 22
        locations = new Location();
        locations.setLocationType("location");
        location[4][1] = locations;
        locations.setRow(4);
        locations.setColumn(1);
        locations.setDescription("Welcome to Wheat Field 2");
        locations.setVisited(false);
        locations.setDisplaySymbol("W2");

        //Location 23
        locations = new Location();
        locations.setLocationType("location");
        location[4][2] = locations;
        locations.setRow(4);
        locations.setColumn(2);
        locations.setDescription("Welcome to Wheat Field 3");
        locations.setVisited(false);
        locations.setDisplaySymbol("W3");

        //Location 24
        locations = new Location();
        locations.setLocationType("location");
        location[4][3] = locations;
        locations.setRow(4);
        locations.setColumn(3);
        locations.setDescription("Welcome to Wheat Field 4");
        locations.setVisited(false);
        locations.setDisplaySymbol("W4");

        //Location 25
        locations = new Location();
        locations.setLocationType("location");
        location[4][4] = locations;
        locations.setRow(4);
        locations.setColumn(4);
        locations.setDescription("Welcome to the Laminiates Borderland");
        locations.setVisited(false);
        locations.setDisplaySymbol("LN");

        return location; // indicates success
    }

    private static int assignActorsToLocations(Location[][] locations) throws MapControlException {
        // Check for invalid input
        if (locations == null) {
            throw new MapControlException("Invalid Input");
        }
        // Assign the actor Nephi to starting its location

        Location location = locations[0][0];
        location.setActor(ActorName.Villager);
        Point actorCoordinates = ActorName.Villager.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[0][1];
        location.setActor(ActorName.Moroni);
        actorCoordinates = ActorName.Moroni.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[0][2];
        location.setActor(ActorName.Joseph);
        actorCoordinates = ActorName.Joseph.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[0][3];
        location.setActor(ActorName.Abraham);
        actorCoordinates = ActorName.Abraham.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[0][4];
        location.setActor(ActorName.Innkeeper);
        actorCoordinates = ActorName.Innkeeper.getCoordinates();
        location.setActorCoordinates(actorCoordinates);
        //actorPosition.setColumn(4);

        location = locations[1][0];
        location.setActor(ActorName.Isaac);
        actorCoordinates = ActorName.Isaac.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[1][1];
        location.setActor(ActorName.Jacob);
        actorCoordinates = ActorName.Jacob.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[1][2];
        location.setActor(ActorName.Sister);
        actorCoordinates = ActorName.Sister.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[1][3];
        location.setActor(ActorName.Micah);
        actorCoordinates = ActorName.Micah.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[1][4];
        location.setActor(ActorName.Isaiah);
        actorCoordinates = ActorName.Isaiah.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][0];
        location.setActor(ActorName.Luke);
        actorCoordinates = ActorName.Luke.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][1];
        location.setActor(ActorName.Moses);
        actorCoordinates = ActorName.Moses.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][2];
        location.setActor(ActorName.King);
        actorCoordinates = ActorName.King.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][3];
        location.setActor(ActorName.Nephi);
        actorCoordinates = ActorName.Nephi.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[2][4];
        location.setActor(ActorName.Mother);
        actorCoordinates = ActorName.Mother.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][0];
        location.setActor(ActorName.Matthew);
        actorCoordinates = ActorName.Matthew.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][1];
        location.setActor(ActorName.Mark);
        actorCoordinates = ActorName.Mark.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][2];
        location.setActor(ActorName.Father);
        actorCoordinates = ActorName.Father.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][3];
        location.setActor(ActorName.Aaron);
        actorCoordinates = ActorName.Aaron.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[3][4];
        location.setActor(ActorName.Fieldworker);
        actorCoordinates = ActorName.Fieldworker.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[4][0];
        location.setActor(ActorName.John);
        actorCoordinates = ActorName.John.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[4][1];
        location.setActor(ActorName.Samuel);
        actorCoordinates = ActorName.Samuel.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[4][2];
        location.setActor(ActorName.Lehi);
        actorCoordinates = ActorName.Lehi.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[4][3];
        location.setActor(ActorName.Sarah);
        actorCoordinates = ActorName.Sarah.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        location = locations[4][4];
        location.setActor(ActorName.Brother);
        actorCoordinates = ActorName.Brother.getCoordinates();
        location.setActorCoordinates(actorCoordinates);

        // Repeat above steps for each actor in the game
        return 1; // indicates success
    }

    private static int assignIemsToLocations(Location[][] locations, InventoryItem[] itemsInGame) throws MapControlException {
        /// Check for invalid inputs
        if (locations == null || itemsInGame == null) {
            throw new MapControlException("Invalid Input");
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

        location = (ResourceLocation) locations[3][1];
        itemsInLocation = location.getItems();
        itemsInLocation.add(itemsInGame[ItemType.chicken.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.horse.ordinal()]);
        itemsInLocation.add(itemsInGame[ItemType.donkey.ordinal()]);

        return 1;
    }

    public static Location movePlayer(Map map, int i, int io) throws MapControlException {
        if (map == null) {
            throw new MapControlException("Map is invalid");
        }

        if (i < 0 || i > 4 || io < 0 || io > 4) {
            throw new MapControlException("Row or Column Number Invalid");
        }

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
