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
public class TithesException extends Exception{

    public TithesException() {
    }

    public TithesException(String message) {
        super(message);
    }

    public TithesException(String message, Throwable cause) {
        super(message, cause);
    }

    public TithesException(Throwable cause) {
        super(cause);
    }

    public TithesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
