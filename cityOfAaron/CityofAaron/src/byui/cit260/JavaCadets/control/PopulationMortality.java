///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.JavaCadets.control;
//
//import byui.cit260.JavaCadets.exceptions.PopulationMortalityException;
///**
// *
// * @author jessicasi
// */
//public class PopulationMortality  {
//    
//    public int populationMortality(int population, int wheat) throws PopulationMortalityException {
//        
//        if (population < 0) {
//           throw new PopulationMortalityException("You don't have any population, so no one died");
//       }
//        
//        if (wheat < 0) {
//           return -1;
//       }
//      
//       int peopleFed = wheat/20;
//       
//       if(peopleFed >= population) {
//           return population;
//       }
//       else {
//           int peopleDied = population - peopleFed;
//           population -= peopleDied;
//       }
//        
//        return population;
//    }
//}
