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
public class ManageTheCropsException extends Exception {
    
    public ManageTheCropsException() {
    }

    public ManageTheCropsException(String message) {
        super(message);
    }

    public ManageTheCropsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManageTheCropsException(Throwable cause) {
        super(cause);
    }

    public ManageTheCropsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
