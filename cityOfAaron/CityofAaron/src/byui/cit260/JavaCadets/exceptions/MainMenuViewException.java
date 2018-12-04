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
public class MainMenuViewException extends Exception {
    
    public MainMenuViewException() {
    }

    public MainMenuViewException(String message) {
        super(message);
    }

    public MainMenuViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainMenuViewException(Throwable cause) {
        super(cause);
    }

    public MainMenuViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
