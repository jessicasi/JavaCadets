/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.model.Actor;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.InventoryItem;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
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
        locations.setDisplaySymbol("NBR");
        ArrayList<Actor> actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 2
        locations = new Location();
        locations.setLocationType("A River");
        location[0][1] = locations;
        locations.setRow(0);
        locations.setColumn(1);
        locations.setDescription("This is a river you can visit");
        locations.setVisited(false);
        locations.setDisplaySymbol("RVR");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 3
        locations = new Location();
        locations.setLocationType("Waters Of Mormon");
        location[0][2] = locations;
        locations.setRow(0);
        locations.setColumn(2);
        locations.setDescription("Visit the famous Waters of Mormon");
        locations.setVisited(false);
        locations.setDisplaySymbol("MMN");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 4
        ResourceLocation resourceLocation = new ResourceLocation();
        //locations = new ResourceLocation();
        resourceLocation.setLocationType("Market");
        location[0][3] = resourceLocation;
        resourceLocation.setRow(0);
        resourceLocation.setColumn(3);
        resourceLocation.setDescription("This is the Market where you can buy items");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("MKT");
        //resourceLocation.setAmountAvailable(3000);
        //resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);

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
        questionLocation.setDisplaySymbol("INN");
        actors = new ArrayList<>();
        locations.setActors(actors);
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
        resourceLocation.setDisplaySymbol("GRN");
        resourceLocation.setAmountAvailable(3000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
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
        locations.setDisplaySymbol("VLG");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 8
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("Road");
        location[1][2] = locations;
        questionLocation.setRow(1);
        questionLocation.setColumn(2);
        questionLocation.setDescription("Visit the Road to chat with someone");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("ROD");
        actors = new ArrayList<>();
        locations.setActors(actors);
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
        locations.setDisplaySymbol("FLD");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 10
        locations = new Location();
        locations.setLocationType("The Well");
        location[1][4] = locations;
        locations.setRow(1);
        locations.setColumn(4);
        locations.setDescription("Go to the Well");
        locations.setVisited(false);
        locations.setDisplaySymbol("WEL");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 11
        locations = new Location();
        locations.setLocationType("Farm");
        location[2][0] = locations;
        locations.setRow(2);
        locations.setColumn(0);
        locations.setDescription("Visit the Farm");
        locations.setVisited(false);
        locations.setDisplaySymbol("FRM");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 12
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("Temple");
        location[2][1] = locations;
        questionLocation.setRow(2);
        questionLocation.setColumn(1);
        questionLocation.setDescription("Go to the Temple to learn");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("TMP");
        actors = new ArrayList<>();
        locations.setActors(actors);
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 13
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("The Rulers Court");
        location[2][2] = locations;
        questionLocation.setRow(2);
        questionLocation.setColumn(2);
        questionLocation.setDescription("Go to the Rulers Court to talk to someone");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("RLR");
        actors = new ArrayList<>();
        locations.setActors(actors);
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 14
        questionLocation = new QuestionLocation();
        questionLocation.setLocationType("Church");
        location[2][3] = locations;
        questionLocation.setRow(2);
        questionLocation.setColumn(3);
        questionLocation.setDescription("Go to Church and talk to someone");
        questionLocation.setVisited(false);
        questionLocation.setDisplaySymbol("CHR");
        actors = new ArrayList<>();
        locations.setActors(actors);
        questionsInLocation = new ArrayList<>();
        questionLocation.setQuestions(questionsInLocation);

        //Location 15
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Bakery");
        location[2][4] = locations;
        resourceLocation.setRow(2);
        resourceLocation.setColumn(4);
        resourceLocation.setDescription("Visit the Bakery to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("BKY");
        resourceLocation.setAmountAvailable(2000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 16
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Barn");
        location[3][0] = locations;
        resourceLocation.setRow(3);
        resourceLocation.setColumn(0);
        resourceLocation.setDescription("Visit the Barn to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("BRN");
        resourceLocation.setAmountAvailable(4000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
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
        resourceLocation.setDisplaySymbol("STR");
        //resourceLocation.setAmountAvailable(2000);
        //resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
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
        locations.setDisplaySymbol("BTH");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 19
        locations = new Location();
        locations.setLocationType("Forest");
        location[3][3] = locations;
        locations.setRow(3);
        locations.setColumn(3);
        locations.setDescription("Visit the Forest");
        locations.setVisited(false);
        locations.setDisplaySymbol("FST");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 20
        locations = new Location();
        locations.setLocationType("Undeveloped Land");
        location[3][4] = locations;
        locations.setRow(3);
        locations.setColumn(4);
        locations.setDescription("Visit the Undeveloped Land");
        locations.setVisited(false);
        locations.setDisplaySymbol("ULD");
        actors = new ArrayList<>();
        locations.setActors(actors);

        //Location 21
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Wheat Field 1");
        location[4][0] = locations;
        resourceLocation.setRow(4);
        resourceLocation.setColumn(0);
        resourceLocation.setDescription("Visit the WheatField to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("WHT");
        resourceLocation.setAmountAvailable(5000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 22
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Wheat Field 2");
        location[4][1] = locations;
        resourceLocation.setRow(4);
        resourceLocation.setColumn(1);
        resourceLocation.setDescription("Visit the WheatField to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("WHT");
        resourceLocation.setAmountAvailable(4000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 23
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Wheat Field 3");
        location[4][2] = locations;
        resourceLocation.setRow(4);
        resourceLocation.setColumn(2);
        resourceLocation.setDescription("Visit the WheatField to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("WHT");
        resourceLocation.setAmountAvailable(6000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 24
        resourceLocation = new ResourceLocation();
        resourceLocation.setLocationType("Wheat Field 4");
        location[4][3] = locations;
        resourceLocation.setRow(4);
        resourceLocation.setColumn(3);
        resourceLocation.setDescription("Visit the WheatField to pick up some Wheat");
        resourceLocation.setVisited(false);
        resourceLocation.setDisplaySymbol("WHT");
        resourceLocation.setAmountAvailable(3000);
        resourceLocation.setAmountUsed(0);
        actors = new ArrayList<>();
        resourceLocation.setActors(actors);
        itemsInLocation = new ArrayList<>();
        resourceLocation.setItems(itemsInLocation);

        //Location 25
        locations = new Location();
        locations.setLocationType("Lamanites BorderLand");
        location[4][4] = locations;
        locations.setRow(4);
        locations.setColumn(4);
        locations.setDescription("Visit the Lamanites BorderLand");
        locations.setVisited(false);
        locations.setDisplaySymbol("LMN");
        actors = new ArrayList<>();
        locations.setActors(actors);

        return location; // indicates success
    }

    public static int assignActorsToLocations(Location[][] locations) {
        System.out.println("Lovely Actors");
        return 1;
    }

    private static int assignIemsToLocations(Location[][] locations, InventoryItem[] itemsInGame) {
        System.out.println("Lovely Locations");
        return 1;
    }

}
