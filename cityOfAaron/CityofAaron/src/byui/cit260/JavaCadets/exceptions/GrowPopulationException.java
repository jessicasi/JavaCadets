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
public class GrowPopulationException extends Exception{

    public GrowPopulationException() {
    }

    public GrowPopulationException(String message) {
        super(message);
    }

    public GrowPopulationException(String message, Throwable cause) {
        super(message, cause);
    }

    public GrowPopulationException(Throwable cause) {
        super(cause);
    }

    public GrowPopulationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
