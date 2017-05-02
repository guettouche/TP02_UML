package univrouen.adressbook.latebinding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
public class TestInstanceBinding {
	
	@Test
	public void implementsAddressbookFromModel() throws IOException {
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("ecore", new XMIResourceFactoryImpl());

	        ResourceSet resourceSet = new ResourceSetImpl();
	        URI fileURI = URI.createFileURI("model/adressbook.ecore");
	        Resource resource = resourceSet.createResource(fileURI);

	        resource.load(null);
	        EPackage ePackage = (EPackage) resource.getContents().get(0);

	        EClass eAddressbook = (EClass) ePackage.getEClassifier("AdressBook");
	        EReference eContains = (EReference) eAddressbook.getEStructuralFeature("personne");
	        EAttribute eName = (EAttribute) eAddressbook.getEStructuralFeature("name");
	       
	        EObject addressbookInstance = ePackage.getEFactoryInstance().create(eAddressbook);
	        addressbookInstance.eSet(eName, "Mon Carnet d'Adresses");
	        
	        
	        
	        EClass ePersonneClass = (EClass) ePackage.getEClassifier("Personne");
	        EAttribute ePrenomPersonne = (EAttribute) ePersonneClass.getEStructuralFeature("prenom");
	        EAttribute eNomPersonne = (EAttribute) ePersonneClass.getEStructuralFeature("nom");
	        EObject ePersonneInstance = ePackage.getEFactoryInstance().create(ePersonneClass);
	        ePersonneInstance.eSet(ePrenomPersonne, "Ghiles");
	        ePersonneInstance.eSet(eNomPersonne, "FEGHOUL");
	        
	        
	        
	        
	      
	        
	        EObject ePersonneInstance2 = ePackage.getEFactoryInstance().create(ePersonneClass);
	        ePersonneInstance2.eSet(ePrenomPersonne, "Islam");
	        ePersonneInstance2.eSet(eNomPersonne, "GUETTOUCHE");

	        
	        
	        List<EObject> personneList = new ArrayList<EObject>();
	        personneList.add(ePersonneInstance);
	        personneList.add(ePersonneInstance2);
	        addressbookInstance.eSet(eContains, personneList);

	        
	        resourceSet = new ResourceSetImpl();
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	        String path = System.getProperty("user.dir")+"/doc/";
	        URI uri = URI.createURI("file:/"+path+"AdressBook.xmi");
	        resource = resourceSet.createResource(uri);
	        resource.getContents().add(addressbookInstance);
	        resource.save(null);

	        Registry packageRegistry = resourceSet.getPackageRegistry();
	        packageRegistry.put("http://addressbook/1.0", ePackage);

	        //uri = URI.createURI("file:/"+path+"AdressBook.xmi");
	        //resource = resourceSet.getResource(uri, true);
	        
	        
	        resource.load(null);
	        DynamicEObjectImpl dEOadressBookImpl = (DynamicEObjectImpl)(resource.getContents().get(0));
	        EClass adressBookClass = dEOadressBookImpl.eClass();
	        EAttribute nameAdressBook = (EAttribute)(adressBookClass.getEStructuralFeature("name"));
	        EReference containsAttribute = (EReference)(adressBookClass.getEStructuralFeature("personne"));
	        Assert.assertEquals("Mon Carnet d'Adresses", dEOadressBookImpl.eGet(nameAdressBook));

	        EcoreEList ecoreEListPersonne = (EcoreEList)dEOadressBookImpl.eGet(containsAttribute);
	        
	        
	       
	        DynamicEObjectImpl dEOpersonneImpl = (DynamicEObjectImpl)ecoreEListPersonne.get(0);
	        EClass personne = dEOpersonneImpl.eClass();
	        EAttribute nomPersonne = (EAttribute)personne.getEStructuralFeature("nom");
	        EAttribute prenomPersonne = (EAttribute)personne.getEStructuralFeature("prenom");

	        Assert.assertEquals("Ghiles", dEOpersonneImpl.eGet(prenomPersonne));
	        Assert.assertEquals("FEGHOUL", dEOpersonneImpl.eGet(nomPersonne));
	        
	        
	        
	        DynamicEObjectImpl dEOpersonneImpl2 = (DynamicEObjectImpl)ecoreEListPersonne.get(1);
	        EClass personne2 = dEOpersonneImpl2.eClass();
	        EAttribute nomPersonne2 = (EAttribute)personne2.getEStructuralFeature("nom");
	        EAttribute prenomPersonne2 = (EAttribute)personne2.getEStructuralFeature("prenom");
	       
	       
	        Assert.assertEquals("Islam", dEOpersonneImpl2.eGet(prenomPersonne));
	        Assert.assertEquals("GUETTOUCHE", dEOpersonneImpl2.eGet(nomPersonne));
	        

        
	}
}
