package com.nrsoft.loggerexamples;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * Java Util Logging
 * @author riva
 */
public class JulExample {

	private static final Logger logger = Logger.getLogger(JulExample.class.getName());
//	private static final LogManager logManager = LogManager.getLogManager();

	public static void main(String[] args) throws SecurityException, IOException {
		
//        logManager.readConfiguration(JulExample.class.getResourceAsStream("/jul.properties"));			// Esmepio jul/1
        
//        logManager.readConfiguration(JulExample.class.getResourceAsStream("/julbridge.properties"));		// Esempio jul/2
		
		 SLF4JBridgeHandler.install();																		// Esempio jul/2
		
    	logger.config("testo di errore");
    	logger.warning("testo di warning");
    	logger.info("testo di info");
    	logger.fine("testo di debug fine");
    	logger.finer("testo di trace finer");
    	logger.finest("testo di trace finest");
    	logger.log(Level.SEVERE, "testi di errore SEVERE");
	}
}