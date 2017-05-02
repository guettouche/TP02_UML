package uml.addressbook.model.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.AESCipherImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import adressbook.univrouen.fr.adressbook.AdressBook;
import adressbook.univrouen.fr.adressbook.AdressbookFactory;
import adressbook.univrouen.fr.adressbook.Adresse;
import adressbook.univrouen.fr.adressbook.Personne;

public class AddressbookTest {
	
	@Test
	public void createAddressbookTest() throws IOException {   
		AdressBook carnet = AdressbookFactory.eINSTANCE.createAdressBook();  
		carnet.setName("MonCarnet");
		
    // Création d'une adresse  
		Adresse adr1 = AdressbookFactory.eINSTANCE.createAdresse();   
		adr1.setNuméro(2);
		adr1.setRue("Bis, Place général De Gaulle");
		
		// Création d'une personne    
		Personne pers1 = AdressbookFactory.eINSTANCE.createPersonne();
		pers1.setNom("FEGHOUL");
		pers1.setPrénom("Ghiles");
		pers1.setAge(24);
		pers1.setAdresse(adr1);
		
		Adresse adr2 = AdressbookFactory.eINSTANCE.createAdresse();   
		adr2.setNuméro(49);
		adr2.setRue("Boulevard Siegfried");
		
		Personne pers2 = AdressbookFactory.eINSTANCE.createPersonne();
		pers2.setNom("GUETTOUCHE");
		pers2.setPrénom("Islam");
		pers2.setAge(24);
		pers2.setAdresse(adr2);
		
		Adresse adr3 = AdressbookFactory.eINSTANCE.createAdresse();   
		adr3.setNuméro(2000);
		adr3.setRue("Rue Des Mimosas");
		
		Personne pers3 = AdressbookFactory.eINSTANCE.createPersonne();
		pers3.setNom("GRINGO");
		pers3.setPrénom("Pilo");
		pers3.setAge(24);
		pers3.setAdresse(adr3);
		
		carnet.addContact(pers1);
		carnet.addContact(pers2);
		carnet.addContact(pers3);
		

  // Affichage du contenu de carnet - affichez les valeurs suivantes :
	assertEquals(carnet.getName(),"MonCarnet");
	assertEquals(carnet.getPersonne().size(),3);
	assertEquals(carnet.getPersonne().get(0).display(),pers1.display()); 
	assertEquals(carnet.getPersonne().get(0).getAdresse().display(),adr1.display());
	assertEquals(carnet.getPersonne().get(1).display(),pers2.display());
	assertEquals(carnet.getPersonne().get(1).getAdresse(),adr2);
	assertEquals(carnet.getPersonne().get(2).display(),pers3.display());
	assertEquals(carnet.getPersonne().get(2).getAdresse(),adr3);
	
	ResourceSet resourceSet = new ResourceSetImpl(); 
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap(). put("addressbook", new XMIResourceFactoryImpl()); 
	String path = System.getProperty("user.dir")+"/doc/";
	URI uri = URI.createURI("file:/" + path + "carnet.addressbook");
	Resource resource = resourceSet.createResource(uri); 
	resource.getContents().add(carnet); 
	resource.save(null);
	Assert.assertTrue(new File(path + "carnet.addressbook").exists());
	
	}
}
