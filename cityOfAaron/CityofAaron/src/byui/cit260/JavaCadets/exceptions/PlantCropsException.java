/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.exceptions;

/**
 *
 * @author skylerfoxx
 */
public class PlantCropsException extends Exception {
    
    public PlantCropsException() {
    }

    public PlantCropsException(String message) {
        super(message);
    }

    public PlantCropsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlantCropsException(Throwable cause) {
        super(cause);
    }

    public PlantCropsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
