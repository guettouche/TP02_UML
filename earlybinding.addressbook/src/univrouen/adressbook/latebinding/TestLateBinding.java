package univrouen.adressbook.latebinding;


import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

public class TestLateBinding {
	@Test
    public void queryAddressBookStructureWithoutGeneratedCode() {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("ecore", new XMIResourceFactoryImpl());
        ResourceSet resourceSet = new ResourceSetImpl();
        URI fileURI = URI.createFileURI("model/addressbook.ecore");
        Resource resource = resourceSet.getResource(fileURI, true);

        EPackage ePackage = (EPackage) resource.getContents().get(0);

        EList<EClassifier> eClassifiers = ePackage.getEClassifiers();

        for (EClassifier eClassifier : eClassifiers) {
            System.out.println(eClassifier.getName());
            System.out.print("  ");

            if (eClassifier instanceof EClass) {
                EClass eClass = (EClass) eClassifier;
                EList<EAttribute> eAttributes = eClass.getEAttributes();
                for (EAttribute eAttribute : eAttributes) {
                    System.out.print(eAttribute.getName() + "("
                            + eAttribute.getEAttributeType().getName() + ") ");
                }

                if (!eClass.getEAttributes().isEmpty()
                        && !eClass.getEReferences().isEmpty()) {
                    System.out.println();
                    System.out.print("  Références : ");
                }

                EList<EReference> eReferences = eClass.getEReferences();
                for (EReference eReference : eReferences) {
                    System.out.print(eReference.getName() + "("
                            + eReference.getEReferenceType().getName() + "["
                            + eReference.getLowerBound() + ".."
                            + eReference.getUpperBound() + "])");
                }

                if (!eClass.getEOperations().isEmpty()) {
                    System.out.println();
                    System.out.print("  Opérations : ");

                    for (EOperation eOperation : eClass.getEOperations()) {
                        System.out.println(eOperation.getEType().getName()
                                + " " + eOperation.getName());
                    }
                }
            }
            System.out.println();
        }

    }
	
}
