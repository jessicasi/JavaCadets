/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import byui.cit260.JavaCadets.exceptions.GameControlException;
import byui.cit260.JavaCadets.exceptions.PopulationMortalityException;
import byui.cit260.JavaCadets.model.Game;

/**
 *
 * @author Jessica
 */
public class CurrentAnnualReportView extends View{
   public void displayCurrentAnnualReportView() throws PopulationMortalityException, GameControlException {
       //eventually hook up to variables
       Game game = CityofAaron.getCurrentGame();
       this.console.println("═══════════════════════════");
       
       this.console.println("\tCurrent Annual Report:");
       
       this.console.println("➤ Year Number: " + game.getYear());
           
       this.console.println("➤ # of people who starved: " + game.getPopulationMortality());
       
       this.console.println("➤ # of people who moved in: " + game.getNewPopulation());
       
       this.console.println("➤ Current Population: " + game.getCurrentPopulation());
       
       this.console.println("➤ # of acres of crop land owned: " + game.getAcresOwned());
       
       this.console.println("➤ % of bushels of wheat paid in tithing: " + game.getTithingPaid());
       
       this.console.println("➤ # of bushels of wheat eaten by rats: " + game.getRatWheat());
       
       this.console.println("➤ # of bushels of wheat in storehouse: " + game.getWheatInStorage());
       
       this.console.println("═══════════════════════════" + "\n\n");
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
