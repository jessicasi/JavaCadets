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
public class PlantCropsViewException extends Exception {
    
    public PlantCropsViewException() {
    }

    public PlantCropsViewException(String message) {
        super(message);
    }

    public PlantCropsViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlantCropsViewException(Throwable cause) {
        super(cause);
    }

    public PlantCropsViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
