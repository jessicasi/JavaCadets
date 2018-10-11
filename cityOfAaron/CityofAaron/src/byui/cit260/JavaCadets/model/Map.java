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
 * @author Skyler
 */
public enum Map {
    
    TheRulersCourt("The Ruler's Court", new Point(1,1)),
    Storehouse("The City's Granary and Storehouse", new Point(0, 1)),
    Wheatfield("Wheat Field", new Point(1, 2)),
    Undevelopedland("Undeveloped Land", new Point (2, 3)),
    Thevillage("The Village", new Point(1, 2)),
    River("The River", new Point (1, 1)),
    Border("The Border of the Lamanites Land", new Point (3, 4)),
    Temple("The Temple", new Point (5, 2));
    
    private String name;
    private Point coordinates;

    Map(String name, Point coordinates) {
        this.name = name;
        this.coordinates = coordinates;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Map{" + "name=" + name + ", coordinates=" + coordinates + '}';
    }
    
    
}
