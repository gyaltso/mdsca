/**
 */
package org.gyaltso.mdsca.doc.model.mdsca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getMessage <em>Message</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getLineNo <em>Line No</em>}</li>
 * </ul>
 *
 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getWarning()
 * @model
 * @generated
 */
public interface Warning extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getWarning_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getWarning_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Line No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line No</em>' attribute.
	 * @see #setLineNo(String)
	 * @see org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage#getWarning_LineNo()
	 * @model
	 * @generated
	 */
	String getLineNo();

	/**
	 * Sets the value of the '{@link org.gyaltso.mdsca.doc.model.mdsca.Warning#getLineNo <em>Line No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line No</em>' attribute.
	 * @see #getLineNo()
	 * @generated
	 */
	void setLineNo(String value);

} // Warning
