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
public class FeedThePeopleException extends Exception {

    public FeedThePeopleException() {
    }

    public FeedThePeopleException(String message) {
        super(message);
    }

    public FeedThePeopleException(String message, Throwable cause) {
        super(message, cause);
    }

    public FeedThePeopleException(Throwable cause) {
        super(cause);
    }

    public FeedThePeopleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
