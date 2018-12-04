/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.control;

import byui.cit260.JavaCadets.exceptions.PopulationMortalityException;
/**
 *
 * @author jessicasi
 */
public class PopulationMortality {
    public int populationMortality(int population, int wheat) {
       if (wheat < 0) {
           return -1;
       }
       if (population < 0) {
           return -2;
       }
       int peopleFed = wheat/20;
       
       if(peopleFed >= population) {
           return population;
       }
       else {
           int peopleDied = population - peopleFed;
           population -= peopleDied;
       }
        
        return population;
    }
}
