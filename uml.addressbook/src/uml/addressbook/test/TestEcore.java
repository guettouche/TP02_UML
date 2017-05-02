package uml.addressbook.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.junit.Test;

import addressbook.univrouen.fr.addressbook.AddressbookPackage;

public class TestEcore {
	  @Test
	    public void queryAddressBookStructure() {
	        AddressbookPackage addressbookPackage = AddressbookPackage.eINSTANCE;
	        EList<EClassifier> eClassifiers = addressbookPackage.getEClassifiers();

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

	                    EList<EReference> eReferences = eClass.getEReferences();
	                    for (EReference eReference : eReferences) {
	                        System.out.print(eReference.getName() + "("
	                            + eReference.getEReferenceType().getName() + "["
	                            + eReference.getLowerBound() + ".."
	                            + eReference.getUpperBound() + "])");
	                    }
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
