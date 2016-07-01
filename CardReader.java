/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentalmachine;

import java.util.logging.Level;
import java.util.logging.Logger;
import static movierentalmachine.ServerConnection.log;

/**
 *
 * @author Mitul
 */
public class CardReader {
    
    public static final Logger logger = Logger.getLogger("MRM-Log");
    
    public static boolean validateCardNumner(String customerCardNumber){
        boolean isCardNumberValid = false;
        try{
            
            if(isIntegerValid(customerCardNumber) && customerCardNumber.length() == 4){
                Integer cardNumber = Integer.parseInt(customerCardNumber);
                if(cardNumber >= 1000 && cardNumber <= 9999){
                    isCardNumberValid = true;
                    logger.log(Level.INFO, "The card nummber " + customerCardNumber + "is validated");
                }
            }
        }catch(NumberFormatException nfe){
            isCardNumberValid = false;
            logger.log(Level.INFO, "The card nummber " + customerCardNumber + "is invalid");
        }
        return isCardNumberValid;
    }
    
    public static boolean isIntegerValid(String mrmString){
        boolean isIntegerValid = false;
        try{
            Integer.parseInt(mrmString);
            isIntegerValid = true;
        }catch(NumberFormatException nfe){
            isIntegerValid = false;
        }
        return isIntegerValid;
    }
}
