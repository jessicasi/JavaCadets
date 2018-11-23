/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Steven
 */
public class Location implements Serializable {

    private Scene scene;
    private boolean visited;
    private String LocationType;
    private String description;
    private String displaySymbol;
    private int row;
    private int column;
    private Actor actor;
    private ActorName actorName;

    public Actor getActors() {
        return actor;
    }

    public Location() {
        actor = new Actor();
     
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visted) {
        this.visited = visted;
    }

    public String getLocationType() {
        return LocationType;
    }

    public void setLocationType(String LocationType) {
        this.LocationType = LocationType;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActors(ArrayList<Actor> actors) {
        System.out.println("Lovely setActors");
    }
    
    public void setActor(ActorName actorName) {
        this.actorName = actorName;
    }

    public void setActorCoordinates(Point coordinates) {
            actor.setCoordinates(coordinates);
           
    }

 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.scene);
        hash = 67 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + ", visited=" + visited + ", LocationType=" + LocationType + ", description=" + description + ", displaySymbol=" + displaySymbol + ", row=" + row + ", column=" + column + ", actor=" + actor + '}';
    }

}
