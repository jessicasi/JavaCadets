/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.exceptions;

/**
 *
 * @author jessicasi
 */
public class HarvestCropsException extends Exception {

    public HarvestCropsException() {
    }

    public HarvestCropsException(String message) {
        super(message);
    }

    public HarvestCropsException(String message, Throwable cause) {
        super(message, cause);
    }

    public HarvestCropsException(Throwable cause) {
        super(cause);
    }

    public HarvestCropsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
