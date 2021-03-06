/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.LiveTheYear;
import static byui.cit260.JavaCadets.control.MapControl.movePlayer;
import byui.cit260.JavaCadets.exceptions.EndGameException;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.exceptions.GrowPopulationException;
import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.exceptions.PopulationMortalityException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Map;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.model.Scene;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Steven
 */
public class MovePlayer extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        
        this.console.println("\n"+"═══════════");
        String input1 = getInput("➤ Enter Row Number");
        this.console.println("═══════════");
        inputs[0] = input1;

        this.console.println("\n"+"═════════════");
        String input2 = getInput("➤ Enter Column Number");
        this.console.println("═════════════");
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
        } catch (NumberFormatException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            return false;
        }

        Player player = CityofAaron.getPlayer();
//            actor = get the Actor in the player object
        Game game = CityofAaron.getCurrentGame();
        Map map = game.getTheMap();

        try {
            newLocation = movePlayer(map, row, column);

        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            return false;
        }

        Scene scene = new Scene();
        scene.setDescription(newLocation.getDescription());
        scene.setMapSymbol(newLocation.getDisplaySymbol());
         LiveTheYear year = new LiveTheYear();
        int months = game.getMonths();

        switch (months) {
            case 0:
                scene.setQuestion(game.getQuestion(0));
                break;
            case 3:
                scene.setQuestion(game.getQuestion(1));
                break;
            case 6:
                scene.setQuestion(game.getQuestion(2));
                break;
            case 9:
                scene.setQuestion(game.getQuestion(3));
                break;
            case 12:
                scene.setQuestion(game.getQuestion(4));
                break;

        }

        newLocation.setScene(scene);
        game.setCurrentLocation(newLocation);
        
      if("questionLocation".equals(newLocation.getLocationType())){
          
          QuestionLocationView questionView = new QuestionLocationView();
          questionView.display();
          
      }
      else if("resourceLocation".equals(newLocation.getLocationType())){
          
          ResourceLocationView resourceView = new ResourceLocationView();
          resourceView.display();
          
      }else {
        LocationView locationView = new LocationView();
        
            try {
                locationView.displayLocationView();
            } catch (HarvestCropsException | GrowPopulationException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

      
            }
      }
     
         if (game.getMonths() == 12) {
             this.console.println("\n"+"════════════════════════════════════════════════");
             this.console.println("Another year is over! Let's make sure you've had a chance to take care of business!");
             this.console.println("════════════════════════════════════════════════");
             BuyLandView buyLand = new BuyLandView();
             buyLand.display();
             
             SellLandView sellLand = new SellLandView();
             sellLand.display();
             
             FeedThePeopleView feedPeople = new FeedThePeopleView();
             feedPeople.display();
             
             PlantCropsView planting = new PlantCropsView();
             planting.display();
             
             TithesView tithing = new TithesView();
             tithing.display();
             
            try {
                year.liveTheYear();
            } catch (HarvestCropsException | GrowPopulationException | PopulationMortalityException | GameControlException ex) {
                 ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            }
            CurrentAnnualReportView currentReport = new CurrentAnnualReportView();
            try {
                currentReport.displayCurrentAnnualReportView();
                if (game.getPopulationMortality() > 100 || game.getYear() >= 5) {
                    EndGameView endGame = new EndGameView();
                    endGame.displayEndGameView();
                }
                game.setMonths(0);
            } catch (PopulationMortalityException | GameControlException | EndGameException ex) {
                 ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            } 
        } else {
            game.setMonths(game.getMonths() + 3);
        }
        
         
//      

        return true;
    }

}
