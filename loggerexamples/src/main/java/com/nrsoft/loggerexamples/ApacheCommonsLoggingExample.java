package com.nrsoft.loggerexamples;

import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory;

public class ApacheCommonsLoggingExample {
	
	static Log logger = LogFactory.getLog(ApacheCommonsLoggingExample.class);
	
	public static void main(String[] args)
	{
	    	logger.error("testo di errore");
	    	logger.warn("testo di warning");
	    	logger.info("testo di info");
	    	logger.debug("testo di debug");
	    	logger.trace("testo di trace");
	}

}
