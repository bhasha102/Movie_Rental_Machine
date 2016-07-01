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
public class Operator{
    public static final Logger log = Logger.getLogger("MRM-Log");
    ServerConnection serverConnection = null;
    
    public Operator(){
        serverConnection = new ServerConnection();
    }
    
    public void startMachine(){
        log.log(Level.INFO, "The MRM machine is being started");
        serverConnection.connectToServer();
        log.log(Level.INFO, "The MRM machine has started");
        
    }

    public void stopMachine(){
        log.log(Level.INFO, "The MRM machine is being stopped");
        serverConnection.stopConnectionToServer();
        log.log(Level.INFO, "The MRM machine has started");
    }
}
