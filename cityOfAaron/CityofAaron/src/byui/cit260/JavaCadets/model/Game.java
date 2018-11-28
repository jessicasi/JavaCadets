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
    private int acresOwned;
    private int wheatInStorage;       
    private int tithingPaid;
    private InventoryItem[] inventory;
    private Question[] question;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.thePlayer);
        hash = 97 * hash + Objects.hashCode(this.theMap);
        hash = 97 * hash + Objects.hashCode(this.theStorehouse);
        hash = 97 * hash + this.currentPopulation;
        hash = 97 * hash + this.acresOwned;
        hash = 97 * hash + this.wheatInStorage;
        hash = 97 * hash + this.tithingPaid;
        hash = 97 * hash + Arrays.deepHashCode(this.inventory);
        hash = 97 * hash + Arrays.deepHashCode(this.question);
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
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatInStorage != other.wheatInStorage) {
            return false;
        }
        if (this.tithingPaid != other.tithingPaid) {
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
        return "Game{" + "thePlayer=" + thePlayer + ", theMap=" + theMap + ", theStorehouse=" + theStorehouse + ", currentPopulation=" + currentPopulation + ", acresOwned=" + acresOwned + ", wheatInStorage=" + wheatInStorage + ", tithingPaid=" + tithingPaid + ", inventory=" + inventory + ", question=" + question + '}';
    }
 
    
    
}
    
    

    