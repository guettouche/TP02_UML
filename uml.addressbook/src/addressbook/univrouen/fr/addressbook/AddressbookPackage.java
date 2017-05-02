/**
 */
package addressbook.univrouen.fr.addressbook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see addressbook.univrouen.fr.addressbook.AddressbookFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface AddressbookPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "addressbook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "addressbook.univrouen.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "addressbook";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressbookPackage eINSTANCE = addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl.init();

	/**
	 * The meta object id for the '{@link addressbook.univrouen.fr.addressbook.impl.AdresseImpl <em>Adresse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see addressbook.univrouen.fr.addressbook.impl.AdresseImpl
	 * @see addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl#getAdresse()
	 * @generated
	 */
	int ADRESSE = 0;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__RUE = 1;

	/**
	 * The number of structural features of the '<em>Adresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link addressbook.univrouen.fr.addressbook.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see addressbook.univrouen.fr.addressbook.impl.PersonneImpl
	 * @see addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__AGE = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__ADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__IDENTIFIER = 4;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link addressbook.univrouen.fr.addressbook.impl.AdressBookImpl <em>Adress Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see addressbook.univrouen.fr.addressbook.impl.AdressBookImpl
	 * @see addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl#getAdressBook()
	 * @generated
	 */
	int ADRESS_BOOK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_BOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Personne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_BOOK__PERSONNE = 1;

	/**
	 * The number of structural features of the '<em>Adress Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_BOOK_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link addressbook.univrouen.fr.addressbook.Adresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adresse</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Adresse
	 * @generated
	 */
	EClass getAdresse();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.Adresse#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Adresse#getNumero()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Numero();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.Adresse#getRue <em>Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rue</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Adresse#getRue()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Rue();

	/**
	 * Returns the meta object for class '{@link addressbook.univrouen.fr.addressbook.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.Personne#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Personne#getAge()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Age();

	/**
	 * Returns the meta object for the containment reference '{@link addressbook.univrouen.fr.addressbook.Personne#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Personne#getAdresse()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.Personne#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see addressbook.univrouen.fr.addressbook.Personne#getIdentifier()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Identifier();

	/**
	 * Returns the meta object for class '{@link addressbook.univrouen.fr.addressbook.AdressBook <em>Adress Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adress Book</em>'.
	 * @see addressbook.univrouen.fr.addressbook.AdressBook
	 * @generated
	 */
	EClass getAdressBook();

	/**
	 * Returns the meta object for the attribute '{@link addressbook.univrouen.fr.addressbook.AdressBook#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see addressbook.univrouen.fr.addressbook.AdressBook#getName()
	 * @see #getAdressBook()
	 * @generated
	 */
	EAttribute getAdressBook_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link addressbook.univrouen.fr.addressbook.AdressBook#getPersonne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personne</em>'.
	 * @see addressbook.univrouen.fr.addressbook.AdressBook#getPersonne()
	 * @see #getAdressBook()
	 * @generated
	 */
	EReference getAdressBook_Personne();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AddressbookFactory getAddressbookFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link addressbook.univrouen.fr.addressbook.impl.AdresseImpl <em>Adresse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see addressbook.univrouen.fr.addressbook.impl.AdresseImpl
		 * @see addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl#getAdresse()
		 * @generated
		 */
		EClass ADRESSE = eINSTANCE.getAdresse();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__NUMERO = eINSTANCE.getAdresse_Numero();

		/**
		 * The meta object literal for the '<em><b>Rue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__RUE = eINSTANCE.getAdresse_Rue();

		/**
		 * The meta object literal for the '{@link addressbook.univrouen.fr.addressbook.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see addressbook.univrouen.fr.addressbook.impl.PersonneImpl
		 * @see addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__AGE = eINSTANCE.getPersonne_Age();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__ADRESSE = eINSTANCE.getPersonne_Adresse();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__IDENTIFIER = eINSTANCE.getPersonne_Identifier();

		/**
		 * The meta object literal for the '{@link addressbook.univrouen.fr.addressbook.impl.AdressBookImpl <em>Adress Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see addressbook.univrouen.fr.addressbook.impl.AdressBookImpl
		 * @see addressbook.univrouen.fr.addressbook.impl.AddressbookPackageImpl#getAdressBook()
		 * @generated
		 */
		EClass ADRESS_BOOK = eINSTANCE.getAdressBook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS_BOOK__NAME = eINSTANCE.getAdressBook_Name();

		/**
		 * The meta object literal for the '<em><b>Personne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADRESS_BOOK__PERSONNE = eINSTANCE.getAdressBook_Personne();

	}

} //AddressbookPackage
