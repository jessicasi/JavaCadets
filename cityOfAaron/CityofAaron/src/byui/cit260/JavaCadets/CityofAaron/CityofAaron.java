/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.JavaCadets.CityofAaron;

import byui.cit260.JavaCadets.model.Game;
import byui.cit260.JavaCadets.model.Player;
import byui.cit260.JavaCadets.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;




/**
 *
 * @author Steven
 */
public class CityofAaron {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter logFile = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static void main(String[] args){
       try {
          CityofAaron.inFile = new BufferedReader(new InputStreamReader(System.in));
          CityofAaron.outFile = new PrintWriter(System.out,true);
          CityofAaron.logFile = new PrintWriter("logFile.txt");
          
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    } catch (Throwable ie){
        System.out.println(ie.getMessage());
        ie.printStackTrace();
        return;     
    }
       finally {
           try {
             if (CityofAaron.inFile != null)
                 CityofAaron.inFile.close();
             
            if (CityofAaron.outFile != null)
               CityofAaron.outFile.close();
            if (CityofAaron.logFile != null)
                logFile.close();
           } catch (IOException ex) {
               System.out.println("Error Closing Files");
           }
           
       }
    }   
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        CityofAaron.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        CityofAaron.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityofAaron.outFile = outFile;
    }


    public static void setInFile(BufferedReader inFile) {
        CityofAaron.inFile = inFile;
    }

    public static BufferedReader getInFile() {
         return inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityofAaron.logFile = logFile;
    }

    
    
    
}
