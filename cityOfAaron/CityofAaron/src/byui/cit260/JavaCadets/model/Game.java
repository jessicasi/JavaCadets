/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Steven
 */
public class Game implements Serializable{

    
    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulation;
    private int populationMortality;
    private int acresOwned;
    private int wheatInStorage;       
    private int tithingPaid;
    private int months;
    private int year;
    private int newPopulation;
    private int ratWheat;
    private int peopleFed;
    private int totalDied;
    private int marks;
    private Location currentLocation;
    private InventoryItem[] inventory;
    private Question[] question;
    private boolean valid;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

   
    public int getPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }
    
    public Question getQuestion(int i) {
        return question[i];
    }
    
    public Question[] getQuestion() {
        return question;
    }

    public void setQuestion(Question[] question) {
        this.question = question;
    }
  
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    public Game() {
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }

    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulaiton) {
        this.currentPopulation = currentPopulaiton;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInStorage() {
        return wheatInStorage;
    }

    public void setWheatInStorage(int wheatInstorage) {
        this.wheatInStorage = wheatInstorage;
    }

    public int getTithingPaid() {
        return tithingPaid;
    }

    public void setTithingPaid(int tithingPaid) {
        this.tithingPaid = tithingPaid;
    }

    public int getPopulationMortality() {
        return populationMortality;
    }

    public void setPopulationMortality(int populationMortality) {
        this.populationMortality = populationMortality;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNewPopulation() {
        return newPopulation;
    }

    public void setNewPopulation(int newPopulation) {
        this.newPopulation = newPopulation;
    }

    public int getRatWheat() {
        return ratWheat;
    }

    public void setRatWheat(int ratWheat) {
        this.ratWheat = ratWheat;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public int getTotalDied() {
        return totalDied;
    }
    
    public void setTotalDied(int i) {
        this.totalDied += i;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.thePlayer);
        hash = 97 * hash + Objects.hashCode(this.theMap);
        hash = 97 * hash + Objects.hashCode(this.theStorehouse);
        hash = 97 * hash + this.currentPopulation;
        hash = 97 * hash + this.populationMortality;
        hash = 97 * hash + this.acresOwned;
        hash = 97 * hash + this.wheatInStorage;
        hash = 97 * hash + this.tithingPaid;
        hash = 97 * hash + this.months;
        hash = 97 * hash + this.year;
        hash = 97 * hash + this.newPopulation;
        hash = 97 * hash + this.ratWheat;
        hash = 97 * hash + this.peopleFed;
        hash = 97 * hash + this.totalDied;
        hash = 97 * hash + this.marks;
        hash = 97 * hash + Objects.hashCode(this.currentLocation);
        hash = 97 * hash + Arrays.deepHashCode(this.inventory);
        hash = 97 * hash + Arrays.deepHashCode(this.question);
        hash = 97 * hash + (this.valid ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.currentPopulation != other.currentPopulation) {
            return false;
        }
        if (this.populationMortality != other.populationMortality) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatInStorage != other.wheatInStorage) {
            return false;
        }
        if (this.tithingPaid != other.tithingPaid) {
            return false;
        }
        if (this.months != other.months) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        if (this.newPopulation != other.newPopulation) {
            return false;
        }
        if (this.ratWheat != other.ratWheat) {
            return false;
        }
        if (this.peopleFed != other.peopleFed) {
            return false;
        }
        if (this.totalDied != other.totalDied) {
            return false;
        }
        if (this.marks != other.marks) {
            return false;
        }
        if (this.valid != other.valid) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.theStorehouse, other.theStorehouse)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + ", theMap=" + theMap + ", theStorehouse=" + theStorehouse + ", currentPopulation=" + currentPopulation + ", populationMortality=" + populationMortality + ", acresOwned=" + acresOwned + ", wheatInStorage=" + wheatInStorage + ", tithingPaid=" + tithingPaid + ", months=" + months + ", year=" + year + ", newPopulation=" + newPopulation + ", ratWheat=" + ratWheat + ", peopleFed=" + peopleFed + ", totalDied=" + totalDied + ", marks=" + marks + ", currentLocation=" + currentLocation + ", inventory=" + inventory + ", question=" + question + ", valid=" + valid + '}';
    }

    
  
   
}
    
    

    