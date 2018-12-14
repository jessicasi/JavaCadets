/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.EndGameException;
import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Location;
import byui.cit260.JavaCadets.model.Question;
import byui.cit260.JavaCadets.model.Scene;


/**
 *
 * @author jessicasi
 */
class QuestionLocationView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        Game game = CityofAaron.getCurrentGame();
        Location location = game.getCurrentLocation();
        Scene scene = location.getScene();
        Question question = scene.getQuestion();
        
        this.console.println("\nHi - my name is " + location.getActor());
        this.console.println(location.getDescription() + "\n");

        this.console.println(question.getQuestions() + "\n");
        this.console.println("A - " + question.getAnswer1() + "\n");
        this.console.println("B - " + question.getAnswer2() + "\n");
        this.console.println("C - " + question.getAnswer3() + "\n");

        String answer = this.getInput("Which is the correct answer? ");
        inputs[0] = answer;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        String answer = inputs[0].toUpperCase();
        Game game = CityofAaron.getCurrentGame();
        Location location = game.getCurrentLocation();
        Scene scene = location.getScene();
        Question question = scene.getQuestion();

        if (answer.equals(question.getAnswer())) {
            this.console.println("Congratulations! You picked the right answer - you get to continue your quest - ");
            this.console.println("Your stay here has advanced you by 3 months");
            return true;
        }

        game.setMarks(game.getMarks() + 1);
        this.console.println("Oh, bummer - you got it wrong! That is " + game.getMarks() + " marks against you.");
        this.console.println("If you get 3 marks against you, you're fired!");

        if (game.getMarks() == 3) {

            EndGameView endGame = new EndGameView();
            try {
                endGame.displayEndGameView();
            } catch (EndGameException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

            }
        }
        return true;

    }

}
