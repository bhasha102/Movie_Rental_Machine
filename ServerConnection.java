/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentalmachine;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class ServerConnection {
    
    public static final Logger log = Logger.getLogger("MRM-Log");
    
    public void connectToServer(){
        log.log(Level.INFO, "Connected to the server");
    }
    
    public void stopConnectionToServer(){
        log.log(Level.INFO, "Connected to the server stopped safely");
    }
    
}
