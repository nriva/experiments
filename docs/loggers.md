# Loggers: esempi

## CASO 1: 



 	<!-- CASO 1: -->
	<!-- API: --> <!-- java util common logging è presente in JDK -->
	<!-- BINDING: -->
	
	
	case 1.1: con jul.properties
	
	caso 1.2: Bridge verso SLF4J con jul2.properties
	
		<!--  BRIDGE  -->
	<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>jul-to-slf4j</artifactId>
  <version>1.7.22</version>
</dependency>
	<!-- BINDING -->
	<!-- CASO 1.2 -->
	<!-- 
	<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-simple</artifactId>
  <version>1.7.21</version>
</dependency>

  caso 1.2.1: Bridge verso
  
## Caso 2: Apache Common Logging

https://cyntech.wordpress.com/2009/01/09/how-to-use-commons-logging/

Output senza configurazione:

dic 17, 2016 12:12:15 PM com.nrsoft.loggerexamples.ApacheCommonsLoggingExample main
SEVERE: testo di errore
dic 17, 2016 12:12:15 PM com.nrsoft.loggerexamples.ApacheCommonsLoggingExample main
WARNING: testo di warning
dic 17, 2016 12:12:15 PM com.nrsoft.loggerexamples.ApacheCommonsLoggingExample main
INFO: testo di info

	Caso 2.1: Apache Commong Logging con Configurazione
	
[ERROR] ApacheCommonsLoggingExample - testo di errore
[WARN] ApacheCommonsLoggingExample - testo di warning
[INFO] ApacheCommonsLoggingExample - testo di info
	
	<!-- CASO 1: log4j -->
<!-- API & BINDING: -->
<!--   
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.7</version>
</dependency>
 -->
 
