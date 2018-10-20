import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshal {    
    String filePath;
    String context;
    JAXBContext jaxbContext;
    InputStream InpStr;
    
    public JaxbUnmarshal(String filePath, String context) throws JAXBException{
    	
        this.filePath=filePath;
        this.context=context;
        this.jaxbContext = JAXBContext.newInstance (context);
    }
    
    public Object getUnmarshalledObject() throws JAXBException, FileNotFoundException {
           
    	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller ();       
    	Object objectJAXB = unmarshaller.unmarshal( new FileInputStream(filePath));
        return objectJAXB;          
    }
}