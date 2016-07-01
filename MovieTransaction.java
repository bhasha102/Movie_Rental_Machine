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
public class MovieTransaction {
   
    public static final Logger log = Logger.getLogger("MRM-Log");
    
    public void rentMovie(){
        log.log(Level.INFO, "Renting the movie");
    }
    
    public void returnMovie(){
        log.log(Level.INFO, "Returning the movie");
    }
    
    public void reserveMovie(){
        log.log(Level.INFO, "Reserving the movie");
    }
    
}
