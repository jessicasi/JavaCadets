/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Steven
 */
public class Scene implements Serializable{
    
    private String name;
    private String description;
    private Question question;
    private Question [] questions;
    private InventoryItem item;
    private Location location;
    private String mapSymbol;
    
    public Scene() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public InventoryItem getItem() {
        return item;
    }

    public void setItem(InventoryItem item) {
        this.item = item;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
//     public String getMapSymbol() {
//         String symbol = location.getDisplaySymbol();
//         return symbol;
//    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapsymbol) {
        this.mapSymbol = mapsymbol;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.question);
        hash = 79 * hash + Objects.hashCode(this.item);
        hash = 79 * hash + Objects.hashCode(this.location);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", question=" + question + ", item=" + item + ", location=" + location + ", mapSymbol=" + mapSymbol + '}';
    }

    

   

   
    
}
