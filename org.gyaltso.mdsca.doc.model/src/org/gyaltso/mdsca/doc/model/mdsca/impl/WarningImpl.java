/**
 */
package org.gyaltso.mdsca.doc.model.mdsca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gyaltso.mdsca.doc.model.mdsca.MdscaPackage;
import org.gyaltso.mdsca.doc.model.mdsca.Warning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.doc.model.mdsca.impl.WarningImpl#getLineNo <em>Line No</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WarningImpl extends MinimalEObjectImpl.Container implements Warning {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineNo() <em>Line No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNo()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNo() <em>Line No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNo()
	 * @generated
	 * @ordered
	 */
	protected String lineNo = LINE_NO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdscaPackage.Literals.WARNING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdscaPackage.WARNING__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdscaPackage.WARNING__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineNo() {
		return lineNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNo(String newLineNo) {
		String oldLineNo = lineNo;
		lineNo = newLineNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdscaPackage.WARNING__LINE_NO, oldLineNo, lineNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdscaPackage.WARNING__CLASS_NAME:
				return getClassName();
			case MdscaPackage.WARNING__MESSAGE:
				return getMessage();
			case MdscaPackage.WARNING__LINE_NO:
				return getLineNo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdscaPackage.WARNING__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case MdscaPackage.WARNING__MESSAGE:
				setMessage((String)newValue);
				return;
			case MdscaPackage.WARNING__LINE_NO:
				setLineNo((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdscaPackage.WARNING__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case MdscaPackage.WARNING__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case MdscaPackage.WARNING__LINE_NO:
				setLineNo(LINE_NO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdscaPackage.WARNING__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case MdscaPackage.WARNING__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case MdscaPackage.WARNING__LINE_NO:
				return LINE_NO_EDEFAULT == null ? lineNo != null : !LINE_NO_EDEFAULT.equals(lineNo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (className: ");
		result.append(className);
		result.append(", message: ");
		result.append(message);
		result.append(", lineNo: ");
		result.append(lineNo);
		result.append(')');
		return result.toString();
	}

} //WarningImpl
