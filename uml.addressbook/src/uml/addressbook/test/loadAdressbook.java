package uml.addressbook.test;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import addressbook.univrouen.fr.addressbook.AdressBook;
import addressbook.univrouen.fr.addressbook.Personne;

import org.junit.Test;

public class loadAdressbook {
	@Test
	public void createAddressbookTest() throws IOException, JAXBException {
	
		JAXBContext jaxbContext = JAXBContext.newInstance(AdressBook.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		AdressBook carnet = (AdressBook) jaxbUnmarshaller.unmarshal(new File("carnet.addressbook"));
		
		System.out.println(carnet.getName());
		System.out.println(carnet.getPersonne().size());
		
		for (Personne p : carnet.getPersonne()) {
			System.out.println(p.display());
			System.out.println(p.getAdresse().display());
		}
		
	}
}
