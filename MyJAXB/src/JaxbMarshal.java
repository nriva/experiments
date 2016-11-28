import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMarshal {  
    String filePath;
    String context;
    JAXBContext jaxbContext;
    
    public JaxbMarshal(String filePath, String context) throws JAXBException{
    	
        this.filePath=filePath;
        this.context=context;
        this.jaxbContext = JAXBContext.newInstance(context);
    }       
    
    public void getMarshalledFile(Object object) throws JAXBException, FileNotFoundException{       
           
    	Marshaller marshaller = jaxbContext.createMarshaller ();           
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
        marshaller.marshal(object, new FileOutputStream(filePath));
    }
}