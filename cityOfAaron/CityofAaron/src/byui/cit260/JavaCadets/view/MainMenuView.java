/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.control.GameControl;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.exceptions.MapControlException;
import byui.cit260.JavaCadets.exceptions.PopulationMortalityException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @authors Jessica, Steven, Skyler
 */
public class MainMenuView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        this.console.println(" ************** ");
        this.console.println(" * Main Menu  *");
        this.console.println(" ************** ");
        this.console.println();
        this.console.println("*******************************************");
        this.console.println("➤ N - Start new game");
        this.console.println("➤ R - Restart exisiting game");
        this.console.println("➤ H - Get help on how to play the game");
        this.console.println("➤ E - Exit");
        this.console.println("*******************************************");
        
        String mainMenuInput = this.getInput("\nMake a selection from the Main Menu");
        inputs[0] = mainMenuInput;

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "N": {
            try {
                this.startNewGame();
            } catch (MapControlException | GameControlException ex) {
                this.console.println(ex.getMessage());
            } catch (PopulationMortalityException ex) {
               ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());
            }
            }
            break;
            case "R": {
            try {
                this.restartGame();
            } catch (PopulationMortalityException | GameControlException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading Input:" + ex.getMessage());

            }
            }
            break;
            case "H": {
                this.getHelp();
            }
            break;
            case "E":
                return true;

            default: {
                this.console.println("Invalid menu item");
            }
            break;
        }
        
        Game game = CityofAaron.getCurrentGame();
        return game.getYear() >= 5;
    }

    private void startNewGame() throws MapControlException, GameControlException, PopulationMortalityException {
        //Create a new Game
        GameControl.createNewGame(CityofAaron.getPlayer());
       
//        this.console.println("\n\tCurrent Annual Report: \n");
        CurrentAnnualReportView currentReport = new CurrentAnnualReportView();
        
        currentReport.displayCurrentAnnualReportView();
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();

    }

    private void restartGame() throws PopulationMortalityException, GameControlException {
//         this.console.println("\n\tCurrent Annual Report: \n");
        //CurrentAnnualReportView currentReport = new CurrentAnnualReportView();
        //currentReport.displayCurrentAnnualReportView();
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display()
                ;
    }

    private void getHelp() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
