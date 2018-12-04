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
public class ReportsMenuViewException extends Exception {
    
    public ReportsMenuViewException() {
    }

    public ReportsMenuViewException(String message) {
        super(message);
    }

    public ReportsMenuViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportsMenuViewException(Throwable cause) {
        super(cause);
    }

    public ReportsMenuViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
