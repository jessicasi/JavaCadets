/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.exceptions;

/**
 *
 * @author Steven
 */
public class ReportsControlException extends Exception {

    public ReportsControlException() {
    }

    public ReportsControlException(String message) {
        super(message);
    }

    public ReportsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportsControlException(Throwable cause) {
        super(cause);
    }

    public ReportsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
