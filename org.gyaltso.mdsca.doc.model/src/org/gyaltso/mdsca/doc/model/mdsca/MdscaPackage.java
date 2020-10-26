/**
 */
package org.gyaltso.mdsca.doc.model.mdsca;

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
 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaFactory
 * @model kind="package"
 * @generated
 */
public interface MdscaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdsca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gyaltso/mdsca/doc/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mdsca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdscaPackage eINSTANCE = org.gyaltso.mdsca.doc.model.mdsca.impl.MdscaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gyaltso.mdsca.doc.model.mdsca.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.ProjectImpl
	 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.MdscaPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Warnings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WARNINGS = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl <em>Warning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl
	 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.MdscaPackageImpl#getWarning()
	 * @generated
	 */
	int WARNING = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Line No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING__LINE_NO = 2;

	/**
	 * The number of structural features of the '<em>Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.gyaltso.mdsca.doc.model.mdsca.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.gyaltso.mdsca.doc.model.mdsca.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gyaltso.mdsca.doc.model.mdsca.Project#getWarnings <em>Warnings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warnings</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Project#getWarnings()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Warnings();

	/**
	 * Returns the meta object for class '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Warning
	 * @generated
	 */
	EClass getWarning();

	/**
	 * Returns the meta object for the attribute '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Warning#getClassName()
	 * @see #getWarning()
	 * @generated
	 */
	EAttribute getWarning_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Warning#getMessage()
	 * @see #getWarning()
	 * @generated
	 */
	EAttribute getWarning_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getLineNo <em>Line No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line No</em>'.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.Warning#getLineNo()
	 * @see #getWarning()
	 * @generated
	 */
	EAttribute getWarning_LineNo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdscaFactory getMdscaFactory();

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
		 * The meta object literal for the '{@link org.gyaltso.mdsca.doc.model.mdsca.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.ProjectImpl
		 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.MdscaPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Warnings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__WARNINGS = eINSTANCE.getProject_Warnings();

		/**
		 * The meta object literal for the '{@link org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl <em>Warning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl
		 * @see org.gyaltso.mdsca.doc.model.mdsca.impl.MdscaPackageImpl#getWarning()
		 * @generated
		 */
		EClass WARNING = eINSTANCE.getWarning();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING__CLASS_NAME = eINSTANCE.getWarning_ClassName();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING__MESSAGE = eINSTANCE.getWarning_Message();

		/**
		 * The meta object literal for the '<em><b>Line No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING__LINE_NO = eINSTANCE.getWarning_LineNo();

	}

} //MdscaPackage
