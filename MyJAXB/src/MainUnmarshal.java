import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import com.bindings.flora.Pianta;


public class MainUnmarshal {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		String filePath = "pianta.xml";
		String context = "com.bindings.flora";
		JaxbUnmarshal unmarshall = new JaxbUnmarshal(filePath, context);
		Pianta piantaObj = (Pianta) unmarshall.getUnmarshalledObject();
		
		System.out.println(piantaObj);

	}

}
