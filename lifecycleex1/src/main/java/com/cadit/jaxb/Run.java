package com.cadit.jaxb;

import java.io.File;

import javax.xml.bind.*;

import com.response.mwwsrvws.mwpt81.ObjectFactory;
import com.response.mwwsrvws.mwpt81.ProgramInterface;

//import com.cadit.jaxb.helloworld.Customer;

public class Run {
	
	
	
	
	public static void main(String[] args) {

		ProgramInterface programInterface = new ProgramInterface();
		
		programInterface.setZsrvallWs("pippo");


		  try {

			File file = new File("C:\\temp\\file.xml");
			
			ObjectFactory objectFactory = new ObjectFactory();
			
			JAXBContext jaxbContext = JAXBContext.newInstance(ProgramInterface.class);
			
			
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

//			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			
			
			
			
	        JAXBElement<ProgramInterface> je =  objectFactory.createMWPT81OperationResponse(programInterface);
	        jaxbMarshaller.marshal(je, System.out);
//			jaxbMarshaller.marshal(je, file);	        
	        // jaxbMarshaller.marshal(programInterface, System.out); si può usare se l'oggetto ha @XmlRootElement
	        

			

		      // Unmarshal Shipping Address
//	        File shippingXML = new File("C:\\temp\\file.xml");
	        
//	        ProgramInterface shipping = (ProgramInterface) JAXBIntrospector
//	                .getValue(unmarshaller.unmarshal(shippingXML));
	        
	        
	        File xml = new File("C:\\temp\\file.xml");
	        JAXBElement<ProgramInterface> je2 = (JAXBElement<ProgramInterface>) unmarshaller.unmarshal(xml);
	        ProgramInterface pi = je2.getValue();	        
	        
			
	        System.out.print(pi.getZsrvallWs());
	        

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }

		}


}
