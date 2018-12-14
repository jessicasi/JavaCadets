/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

/**
 *
 * @author Steven
 */
public enum ActorName {
    Villager(0, 0),
    Moroni(0, 1),
    Joseph(0, 2),
    Abraham(0, 3),
    Innkeeper(0, 4),
    Isaac(1, 0),
    Jacob(1, 1),
    Sister(1, 2),
    Micah(1, 3),
    Isaiah(1, 4),
    Luke(2, 0),
    Moses(2, 1),
    King(2, 2),
    Nephi(2, 3),
    Mother(2, 4),
    Matthew(3, 0),
    Mark(3, 1), 
    Father(3, 2),
    Aaron(3, 3),
    Fieldworker(3, 4),
    John(4,0),
    Samuel(4,1),
    Lehi(4,2),
    Sarah(4,3),
    Brother(4, 4);

    private final int row;
    private final int column;

    ActorName(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Point getCoordinates() {
        Point point = new Point();
        point.setRow(row);
        point.setColumn(column);
        return point;
    }

}
