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
    moses (2,1), 
    Aaron (3,3), 
    father (3,2), 
    mother (2,4), 
    sister (1,2), 
    brother (4,4),
    nephi (2,3),
    innkeeper (0,4),
    fieldworker (3,4),
    villager (0,0),
    king (2,2);

    private final int row;
    private final int column;
    
    ActorName(int row, int column){
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
    
    
