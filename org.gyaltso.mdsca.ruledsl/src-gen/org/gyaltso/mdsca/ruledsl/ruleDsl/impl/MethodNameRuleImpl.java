/**
 * generated by Xtext 2.23.0
 */
package org.gyaltso.mdsca.ruledsl.ruleDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodNameRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.RuleDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Name Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.MethodNameRuleImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.MethodNameRuleImpl#isAllowClassName <em>Allow Class Name</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.MethodNameRuleImpl#isApplyToPublic <em>Apply To Public</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.MethodNameRuleImpl#isApplyToProtected <em>Apply To Protected</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.MethodNameRuleImpl#isApplyToPackage <em>Apply To Package</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.MethodNameRuleImpl#isApplyToPrivate <em>Apply To Private</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodNameRuleImpl extends RuleImpl implements MethodNameRule
{
  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #isAllowClassName() <em>Allow Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowClassName()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_CLASS_NAME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllowClassName() <em>Allow Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowClassName()
   * @generated
   * @ordered
   */
  protected boolean allowClassName = ALLOW_CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isApplyToPublic() <em>Apply To Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToPublic()
   * @generated
   * @ordered
   */
  protected static final boolean APPLY_TO_PUBLIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isApplyToPublic() <em>Apply To Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToPublic()
   * @generated
   * @ordered
   */
  protected boolean applyToPublic = APPLY_TO_PUBLIC_EDEFAULT;

  /**
   * The default value of the '{@link #isApplyToProtected() <em>Apply To Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToProtected()
   * @generated
   * @ordered
   */
  protected static final boolean APPLY_TO_PROTECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isApplyToProtected() <em>Apply To Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToProtected()
   * @generated
   * @ordered
   */
  protected boolean applyToProtected = APPLY_TO_PROTECTED_EDEFAULT;

  /**
   * The default value of the '{@link #isApplyToPackage() <em>Apply To Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToPackage()
   * @generated
   * @ordered
   */
  protected static final boolean APPLY_TO_PACKAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isApplyToPackage() <em>Apply To Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToPackage()
   * @generated
   * @ordered
   */
  protected boolean applyToPackage = APPLY_TO_PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #isApplyToPrivate() <em>Apply To Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToPrivate()
   * @generated
   * @ordered
   */
  protected static final boolean APPLY_TO_PRIVATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isApplyToPrivate() <em>Apply To Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isApplyToPrivate()
   * @generated
   * @ordered
   */
  protected boolean applyToPrivate = APPLY_TO_PRIVATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodNameRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RuleDslPackage.Literals.METHOD_NAME_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.METHOD_NAME_RULE__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAllowClassName()
  {
    return allowClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAllowClassName(boolean newAllowClassName)
  {
    boolean oldAllowClassName = allowClassName;
    allowClassName = newAllowClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.METHOD_NAME_RULE__ALLOW_CLASS_NAME, oldAllowClassName, allowClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isApplyToPublic()
  {
    return applyToPublic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplyToPublic(boolean newApplyToPublic)
  {
    boolean oldApplyToPublic = applyToPublic;
    applyToPublic = newApplyToPublic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PUBLIC, oldApplyToPublic, applyToPublic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isApplyToProtected()
  {
    return applyToProtected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplyToProtected(boolean newApplyToProtected)
  {
    boolean oldApplyToProtected = applyToProtected;
    applyToProtected = newApplyToProtected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PROTECTED, oldApplyToProtected, applyToProtected));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isApplyToPackage()
  {
    return applyToPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplyToPackage(boolean newApplyToPackage)
  {
    boolean oldApplyToPackage = applyToPackage;
    applyToPackage = newApplyToPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PACKAGE, oldApplyToPackage, applyToPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isApplyToPrivate()
  {
    return applyToPrivate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplyToPrivate(boolean newApplyToPrivate)
  {
    boolean oldApplyToPrivate = applyToPrivate;
    applyToPrivate = newApplyToPrivate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PRIVATE, oldApplyToPrivate, applyToPrivate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RuleDslPackage.METHOD_NAME_RULE__FORMAT:
        return getFormat();
      case RuleDslPackage.METHOD_NAME_RULE__ALLOW_CLASS_NAME:
        return isAllowClassName();
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PUBLIC:
        return isApplyToPublic();
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PROTECTED:
        return isApplyToProtected();
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PACKAGE:
        return isApplyToPackage();
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PRIVATE:
        return isApplyToPrivate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RuleDslPackage.METHOD_NAME_RULE__FORMAT:
        setFormat((String)newValue);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__ALLOW_CLASS_NAME:
        setAllowClassName((Boolean)newValue);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PUBLIC:
        setApplyToPublic((Boolean)newValue);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PROTECTED:
        setApplyToProtected((Boolean)newValue);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PACKAGE:
        setApplyToPackage((Boolean)newValue);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PRIVATE:
        setApplyToPrivate((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RuleDslPackage.METHOD_NAME_RULE__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__ALLOW_CLASS_NAME:
        setAllowClassName(ALLOW_CLASS_NAME_EDEFAULT);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PUBLIC:
        setApplyToPublic(APPLY_TO_PUBLIC_EDEFAULT);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PROTECTED:
        setApplyToProtected(APPLY_TO_PROTECTED_EDEFAULT);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PACKAGE:
        setApplyToPackage(APPLY_TO_PACKAGE_EDEFAULT);
        return;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PRIVATE:
        setApplyToPrivate(APPLY_TO_PRIVATE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RuleDslPackage.METHOD_NAME_RULE__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case RuleDslPackage.METHOD_NAME_RULE__ALLOW_CLASS_NAME:
        return allowClassName != ALLOW_CLASS_NAME_EDEFAULT;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PUBLIC:
        return applyToPublic != APPLY_TO_PUBLIC_EDEFAULT;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PROTECTED:
        return applyToProtected != APPLY_TO_PROTECTED_EDEFAULT;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PACKAGE:
        return applyToPackage != APPLY_TO_PACKAGE_EDEFAULT;
      case RuleDslPackage.METHOD_NAME_RULE__APPLY_TO_PRIVATE:
        return applyToPrivate != APPLY_TO_PRIVATE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (format: ");
    result.append(format);
    result.append(", allowClassName: ");
    result.append(allowClassName);
    result.append(", applyToPublic: ");
    result.append(applyToPublic);
    result.append(", applyToProtected: ");
    result.append(applyToProtected);
    result.append(", applyToPackage: ");
    result.append(applyToPackage);
    result.append(", applyToPrivate: ");
    result.append(applyToPrivate);
    result.append(')');
    return result.toString();
  }

} //MethodNameRuleImpl