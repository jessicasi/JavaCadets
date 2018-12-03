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
public class MakeBreadException extends Exception {
    
    public MakeBreadException() {
    }

    public MakeBreadException(String message) {
        super(message);
    }

    public MakeBreadException(String message, Throwable cause) {
        super(message, cause);
    }

    public MakeBreadException(Throwable cause) {
        super(cause);
    }

    public MakeBreadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
