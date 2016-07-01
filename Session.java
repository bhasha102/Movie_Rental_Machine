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
public class Session {
    
    public static final Logger log = Logger.getLogger("MRM-Log");
    
    public void startSession(){
        log.log(Level.INFO, "Customer session has started");
    }
    
    public void endSession(){
        log.log(Level.INFO, "Customer session has ended");
    }
    
}
