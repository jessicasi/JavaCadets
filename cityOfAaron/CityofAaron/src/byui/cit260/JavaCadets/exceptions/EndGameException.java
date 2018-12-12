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
public class EndGameException extends Exception{

    public EndGameException() {
    }

    public EndGameException(String message) {
        super(message);
    }

    public EndGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public EndGameException(Throwable cause) {
        super(cause);
    }

    public EndGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
