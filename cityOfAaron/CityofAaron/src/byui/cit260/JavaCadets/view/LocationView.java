/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.LiveTheYear;
import byui.cit260.JavaCadets.exceptions.GrowPopulationException;
import byui.cit260.JavaCadets.exceptions.HarvestCropsException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Question;
import byui.cit260.JavaCadets.model.Scene;

/**
 *
 * @author jessicasi
 */
public class LocationView extends View {

    public void displayLocationView() throws HarvestCropsException, GrowPopulationException {
//        Game game = CityofAaron.getCurrentGame();
//        Location location = game.getCurrentLocation();
//        Scene scene = location.getScene();
//        Question question = scene.getQuestion();
//        LiveTheYear year = new LiveTheYear();
//
//        this.console.println("\nWelcome to " + location.getLocationType() + "\n");
//        this.console.println(location.getDescription() + "\n");
//        this.console.println(question.getQuestions() + "\n");

//        if (game.getMonths() == 12) {
//            year.liveTheYear();
//            CurrentAnnualReportView currentReport = new CurrentAnnualReportView();
//            currentReport.displayCurrentAnnualReportView();
//        } else {
//            game.setMonths(game.getMonths() + 3);
//        }
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        Game game = CityofAaron.getCurrentGame();
        Location location = game.getCurrentLocation();
        Scene scene = location.getScene();
        Question question = scene.getQuestion();
        //LiveTheYear year = new LiveTheYear();

        this.console.println("\nWelcome to " + location.getLocationType() + "\n");
        this.console.println(location.getDescription() + "\n");
        this.console.println(question.getQuestions() + "\n");
        this.console.println(question.getAnswer1() + "\n");
        this.console.println(question.getAnswer2() + "\n");
        this.console.println(question.getAnswer3() + "\n");

        String answer = this.getInput("Enter Your Selection: ");
        inputs[0] = answer;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        String answer = inputs[0].toUpperCase();

        switch (answer) {

            case "NO":
                return true;
            case "QUIT":
                return true;

            case "YES":
                Game game = CityofAaron.getCurrentGame();
                int months = game.getMonths();
                switch (months) {
                    case 0:
                        BuyLandView buyLand = new BuyLandView();
                        buyLand.display();
                        break;
                    case 3:
                        SellLandView sellLand = new SellLandView();
                        sellLand.display();
                        break;
                    case 6:
                        FeedThePeopleView feedPeople = new FeedThePeopleView();
                        feedPeople.display();
                        break;
                    case 9:
                        PlantCropsView plant = new PlantCropsView();
                        plant.display();
                        break;
                    case 12:
                        TithesView tithes = new TithesView();
                        tithes.display();
                        break;
                }

                return true;

            default: {
                this.console.println("Invalid menu item");
            }
            break;

        }

        return false;
    }
}
