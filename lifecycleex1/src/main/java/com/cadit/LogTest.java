package com.cadit;


/**
 * Hello world!
 *
 */
public class LogTest 
{

	private static void slf4j()
	{
    	/* SLF4J: */

        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
        
        org.slf4j.Logger logger2 = org.slf4j.LoggerFactory.getLogger("logger2");
        logger2.info("Hello World/2");

	}
	
	/*
	 * Vedi log4.properties 
	 */
	private static void log4j(String name)
	{
		/*
		
		org.apache.log4j.PropertyConfigurator.configure(LogTest.class.getResource("/log4j.properties"));
		
    	org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(name);
    	logger.error("Error message");
    	logger.info("Info message");
    	logger.debug("Debug message");
    	*/
	}
	
   
    public static void main(String[] args) {

    	log4j(LogTest.class.getName());
    	log4j("logger2");
    	
    	slf4j();
    }    
    
}
