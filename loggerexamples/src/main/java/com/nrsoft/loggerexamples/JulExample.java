package com.nrsoft.loggerexamples;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * CASO 1: Java Util Common logging example
 * CASO 1.1: usa jul.properties
 * CASO 1.2: usa jul2.properties
 * CASO 6: usa julbrige.properties
 * @author riva
 *
 */
public class JulExample {

	private static final Logger logger = Logger.getLogger(JulExample.class.getName());
	private static final LogManager logManager = LogManager.getLogManager();

	public static void main(String[] args) throws SecurityException, IOException {
		
//        logManager.readConfiguration(JulExample.class.getResourceAsStream("/jul.properties"));			// CASO 1.1
        
//        logManager.readConfiguration(JulExample.class.getResourceAsStream("/jul2.properties"));				// CASO 1.2
		
		logManager.readConfiguration(JulExample.class.getResourceAsStream("/julbrige.properties"));				// CASO 6
		
    	logger.config("testo di errore");
    	logger.warning("testo di warning");
    	logger.info("testo di info");
    	logger.fine("testo di debug fine");
    	logger.finer("testo di trace finer");
    	logger.finest("testo di trace finest");
    	logger.log(Level.SEVERE, "testi di errrore SEVERE");

		

	}

}