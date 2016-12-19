# Loggers: esempi

## Caso 1: Java Util Common Logging

Java util common logging è presente in JDK.
	
~~~{.java .numberLines}	

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JulExample {

	private static final Logger logger = Logger.getLogger(JulExample.class.getName());
	private static final LogManager logManager = LogManager.getLogManager();

	public static void main(String[] args) throws SecurityException, IOException {

		logger.config("testo di errore");
		logger.warning("testo di warning");
		logger.info("testo di info");
		logger.fine("testo di debug fine");
		logger.finer("testo di trace finer");
		logger.finest("testo di trace finest");
		logger.log(Level.SEVERE, "testi di errrore SEVERE");
	}

}
~~~

### Caso 1.1

Con `jul.properties`.

~~~{.java .numberLines}
public class JulExample {

	private static final Logger logger = Logger.getLogger(JulExample.class.getName());
	private static final LogManager logManager = LogManager.getLogManager();

	public static void main(String[] args) throws SecurityException, IOException {
		
		logManager.readConfiguration(JulExample.class.getResourceAsStream("/jul.properties"));	// CASO 1.1
		
		
		logger.config("testo di errore");
		logger.warning("testo di warning");
		logger.info("testo di info");
		logger.fine("testo di debug fine");
		logger.finer("testo di trace finer");
		logger.finest("testo di trace finest");
		logger.log(Level.SEVERE, "testi di errrore SEVERE");
   }
}
~~~

	
### Caso 1.2

Configurazione con `jul2.properties`.

~~~{.java .numberLines}	
public class JulExample {

	private static final Logger logger = Logger.getLogger(JulExample.class.getName());
	private static final LogManager logManager = LogManager.getLogManager();

	public static void main(String[] args) throws SecurityException, IOException {
		
		logManager.readConfiguration(JulExample.class.getResourceAsStream("/jul2.properties"));	// CASO 1.2
		
		logger.config("testo di errore");
		logger.warning("testo di warning");
		logger.info("testo di info");
		logger.fine("testo di debug fine");
		logger.finer("testo di trace finer");
		logger.finest("testo di trace finest");
		logger.log(Level.SEVERE, "testi di errrore SEVERE");
   }

}
~~~

### Caso 1.2.1: Bridge verso

COnfigurazione con `jul2.properties` e bridge verso Slf4j con handler Simple.

~~~{.xml .numberLines}	
<!--  BRIDGE  -->
<dependency>
	<groupId>org.slf4j</groupId>
	<artifactId>jul-to-slf4j</artifactId>
	<version>1.7.22</version>
</dependency>

<!-- BINDING -->
<dependency>
	<groupId>org.slf4j</groupId>
	<artifactId>slf4j-simple</artifactId>
	<version>1.7.21</version>
</dependency>
~~~  

## Caso 2: Apache Common Logging

[How to use commons loggin](https://cyntech.wordpress.com/2009/01/09/how-to-use-commons-logging/)

Output senza configurazione:

	dic 17, 2016 12:12:15 PM com.nrsoft.loggerexamples.ApacheCommonsLoggingExample main
	SEVERE: testo di errore
	dic 17, 2016 12:12:15 PM com.nrsoft.loggerexamples.ApacheCommonsLoggingExample main
	WARNING: testo di warning
	dic 17, 2016 12:12:15 PM com.nrsoft.loggerexamples.ApacheCommonsLoggingExample main
	INFO: testo di info

### Caso 2.1: Apache Commong Logging con Configurazione
	
	[ERROR] ApacheCommonsLoggingExample - testo di errore
	[WARN] ApacheCommonsLoggingExample - testo di warning
	[INFO] ApacheCommonsLoggingExample - testo di info
	
# Caso 4: log4j

~~~{.xml .numberLines}	
<!-- API & BINDING: -->
<dependency>
	<groupId>org.apache.logging.log4j</groupId>
	<artifactId>log4j-core</artifactId>
	<version>2.7</version>
</dependency>
~~~ 
