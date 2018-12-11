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
        Game game = CityofAaron.getCurrentGame();
        Location location = game.getCurrentLocation();
        Scene scene = location.getScene();
        Question question = scene.getQuestion();
        LiveTheYear year = new LiveTheYear();

        this.console.println("\nWelcome to " + location.getLocationType() + "\n");
        this.console.println(question.getQuestions());

        if (game.getMonths() == 12) {
            year.liveTheYear();
            CurrentAnnualReportView currentReport = new CurrentAnnualReportView();
            currentReport.displayCurrentAnnualReportView();
        } else {
            game.setMonths(game.getMonths() + 3);
        }
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        return false;
    }
}
