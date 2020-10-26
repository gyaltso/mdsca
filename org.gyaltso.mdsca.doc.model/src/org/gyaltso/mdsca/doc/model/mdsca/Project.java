/**
 */
package org.gyaltso.mdsca.doc.model.mdsca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.Project#getWarnings <em>Warnings</em>}</li>
 * </ul>
 *
 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gyaltso.mdsca.doc.model.mdsca.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Warnings</b></em>' containment reference list.
	 * The list contents are of type {@link org.gyaltso.mdsca.doc.model.mdsca.Warning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warnings</em>' containment reference list.
	 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getProject_Warnings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Warning> getWarnings();

} // Project
