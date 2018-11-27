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
public class Map implements Serializable {

    private String description;
    private int columnCount;
    private int currentRow = 0;
    private int currentColumn = 0;
    private int rowCount;
    private boolean visited;
    private Location[][] locations;
    private Location location;
    private Location currentLocation;

    public Map() {
    }

    public Map(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.columnCount;
        hash = 53 * hash + this.currentRow;
        hash = 53 * hash + this.currentColumn;
        hash = 53 * hash + this.rowCount;
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
        final Map other = (Map) obj;
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", rowCount=" + rowCount + '}';
    }

}

//    public enum Map {    
//    TheRulersCourt("The Ruler's Court", new Point(1,1)),
//    Storehouse("The City's Granary and Storehouse", new Point(0, 1)),
//    Wheatfield("Wheat Field", new Point(1, 2)),
//    Undevelopedland("Undeveloped Land", new Point (2, 3)),
//    Thevillage("The Village", new Point(1, 2)),
//    River("The River", new Point (1, 1)),
//    Border("The Border of the Lamanites Land", new Point (3, 4)),
//    Temple("The Temple", new Point (5, 2));
//    
//    private String name;
//    private Point coordinates;
//
//    Map(String name, Point coordinates) {
//        this.name = name;
//        this.coordinates = coordinates;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Point getCoordinates() {
//        return coordinates;
//    }
//
//    public void setCoordinates(Point coordinates) {
//        this.coordinates = coordinates;
//    }
//
//    @Override
//    public String toString() {
//        return "Map{" + "name=" + name + ", coordinates=" + coordinates + '}';
//    }
