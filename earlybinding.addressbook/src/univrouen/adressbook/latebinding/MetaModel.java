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

public class MetaModel {
	 @Test
	    public void implementsAddressbookFromModel() throws IOException {
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		 Map<String, Object> m = reg.getExtensionToFactoryMap();
		 m.put("ecore", new XMIResourceFactoryImpl());
		 ResourceSet resourceSet = new ResourceSetImpl();
		 URI fileURI = URI.createFileURI("model/addressbook.ecore");
		 Resource resource = resourceSet.createResource(fileURI);
		 resource.load(null);
		 EPackage ePackage = (EPackage) resource.getContents().get(0);
		 EClass eAddressbook = (EClass) ePackage.getEClassifier("Addressbook");
		 EReference eContains =
		 (EReference) eAddressbook.getEStructuralFeature("Personne");
		 EAttribute eName =
		 (EAttribute) eAddressbook.getEStructuralFeature("name");
		 EObject addressbookInstance =
		 ePackage.getEFactoryInstance().create(eAddressbook);
		 addressbookInstance.eSet(eName, "Mon Carnet d'Adresses");

	        EClass ePerson = (EClass) ePackage.getEClassifier("Personne");
	        EAttribute eFirstName = (EAttribute) ePerson
	                .getEStructuralFeature("nom");
	        EAttribute eFamilyName = (EAttribute) ePerson
	                .getEStructuralFeature("prenom");
	        EObject personInstance = ePackage.getEFactoryInstance().create(ePerson);
	        personInstance.eSet(eFirstName, "Ghiles");
	        personInstance.eSet(eFamilyName, "FEGHOUL");

	        List<EObject> containsList = new ArrayList<EObject>();
	        containsList.add(personInstance);
	        

	        resourceSet = new ResourceSetImpl();
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
	                .put("xmi", new XMIResourceFactoryImpl());
	        URI uri = URI.createURI("file:/addressbookinstancesonlymodel.xmi");
	        resource = resourceSet.createResource(uri);
	        resource.getContents().add(addressbookInstance);
	        resource.save(null);

	        resourceSet = new ResourceSetImpl();
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
	                .put("xmi", new XMIResourceFactoryImpl());
	        Registry packageRegistry =  resourceSet.getPackageRegistry();
	        packageRegistry.put("http://addressbook/1.0", ePackage);

	        uri = URI.createURI("file:/addressbookinstancesonlymodel.xmi");
	        resource = resourceSet.getResource(uri, true);
	        resource.load(null);
	        DynamicEObjectImpl addressBookImpl = (DynamicEObjectImpl)(resource.getContents().get(0));
	        EClass addressBook = addressBookImpl.eClass();
	        EAttribute nameAttribute = (EAttribute)(addressBook.getEStructuralFeature("name"));
	        EReference containsAttribute = (EReference)(addressBook.getEStructuralFeature("contains"));
	        Assert.assertEquals("Mon Carnet d'Adresses", addressBookImpl.eGet(nameAttribute));

	        EcoreEList eGets = (EcoreEList)addressBookImpl.eGet(containsAttribute);
	        DynamicEObjectImpl personImpl = (DynamicEObjectImpl)eGets.get(0);
	        EClass person = personImpl.eClass();
	        EAttribute nom = (EAttribute)person.getEStructuralFeature("nom");
	        EAttribute prenom = (EAttribute)person.getEStructuralFeature("prenom");

	        Assert.assertEquals("FEGHOUL", personImpl.eGet(nom));
	        Assert.assertEquals("Ghiles", personImpl.eGet(prenom));
	    }
}
