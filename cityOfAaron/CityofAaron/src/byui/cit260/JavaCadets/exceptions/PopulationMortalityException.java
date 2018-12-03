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
public class PopulationMortalityException extends Exception {
        
    public PopulationMortalityException() {
    }

    public PopulationMortalityException(String message) {
        super(message);
    }

    public PopulationMortalityException(String message, Throwable cause) {
        super(message, cause);
    }

    public PopulationMortalityException(Throwable cause) {
        super(cause);
    }

    public PopulationMortalityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
