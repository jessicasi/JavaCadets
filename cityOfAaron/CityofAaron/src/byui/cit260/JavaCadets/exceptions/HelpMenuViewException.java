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
public class HelpMenuViewException extends Exception {
    
    public HelpMenuViewException() {
    }

    public HelpMenuViewException(String message) {
        super(message);
    }

    public HelpMenuViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public HelpMenuViewException(Throwable cause) {
        super(cause);
    }

    public HelpMenuViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
