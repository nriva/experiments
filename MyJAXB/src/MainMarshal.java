import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import com.bindings.elementibase.CaratteristicheFusto;
import com.bindings.flora.Pianta;


public class MainMarshal {
  public static void main(String[] args) throws JAXBException, FileNotFoundException  {
	  
	  Pianta nuovapianta = new Pianta();
	  nuovapianta.setNome("Alloro");      
	  CaratteristicheFusto fustoAlloro = new CaratteristicheFusto();
	  fustoAlloro.setSpessore(1);
	  fustoAlloro.setAltezza(8);
	  nuovapianta.setCaratteristicheFusto(fustoAlloro);
	  String context = "com.bindings.flora";
	  JaxbMarshal marshall = new JaxbMarshal("outputFile.xml", context);
	  marshall.getMarshalledFile(nuovapianta);
  }
}