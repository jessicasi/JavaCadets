/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;

import byui.cit260.JavaCadets.CityofAaron.CityofAaron;
import java.io.PrintWriter;

/**
 *
 * @author Steven
 */
public class ErrorView {
    private static PrintWriter console = CityofAaron.getOutFile();
    private static PrintWriter log = CityofAaron.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println(
        "\n---- ERROR --------------------------------------" + "\n"
        + errorMessage + 
        "\n---------------------------------------");
        
        log.printf("%n%n%s", className + "-" + errorMessage);
    }
}
