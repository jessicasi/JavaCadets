/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.util.Objects;

/**
 *
 * @author Steven
 */
public class Game {
    
    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulaiton;
    private int acresOwned;
    private int wheatInstorage;       

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

    public int getCurrentPopulaiton() {
        return currentPopulaiton;
    }

    public void setCurrentPopulaiton(int currentPopulaiton) {
        this.currentPopulaiton = currentPopulaiton;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInstorage() {
        return wheatInstorage;
    }

    public void setWheatInstorage(int wheatInstorage) {
        this.wheatInstorage = wheatInstorage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.thePlayer);
        hash = 79 * hash + Objects.hashCode(this.theMap);
        hash = 79 * hash + Objects.hashCode(this.theStorehouse);
        hash = 79 * hash + this.currentPopulaiton;
        hash = 79 * hash + this.acresOwned;
        hash = 79 * hash + this.wheatInstorage;
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
        if (this.currentPopulaiton != other.currentPopulaiton) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatInstorage != other.wheatInstorage) {
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
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + ", theMap=" + theMap + ", theStorehouse=" + theStorehouse + ", currentPopulaiton=" + currentPopulaiton + ", acresOwned=" + acresOwned + ", wheatInstorage=" + wheatInstorage + '}';
    }
    
    
}
