/**
 * generated by Xtext 2.23.0
 */
package org.gyaltso.mdsca.ruledsl.ruleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gyaltso.mdsca.ruledsl.ruleDsl.Rule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.RuleDslPackage;
import org.gyaltso.mdsca.ruledsl.ruleDsl.RulesFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.RulesFileImpl#getMethodNameRule <em>Method Name Rule</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.RulesFileImpl#getMethdLengthRule <em>Methd Length Rule</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.RulesFileImpl#getMethodNoOfParamsRule <em>Method No Of Params Rule</em>}</li>
 *   <li>{@link org.gyaltso.mdsca.ruledsl.ruleDsl.impl.RulesFileImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RulesFileImpl extends MinimalEObjectImpl.Container implements RulesFile
{
  /**
   * The cached value of the '{@link #getMethodNameRule() <em>Method Name Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodNameRule()
   * @generated
   * @ordered
   */
  protected Rule methodNameRule;

  /**
   * The cached value of the '{@link #getMethdLengthRule() <em>Methd Length Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethdLengthRule()
   * @generated
   * @ordered
   */
  protected Rule methdLengthRule;

  /**
   * The cached value of the '{@link #getMethodNoOfParamsRule() <em>Method No Of Params Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodNoOfParamsRule()
   * @generated
   * @ordered
   */
  protected Rule methodNoOfParamsRule;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected Rule typeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RulesFileImpl()
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
    return RuleDslPackage.Literals.RULES_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getMethodNameRule()
  {
    return methodNameRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodNameRule(Rule newMethodNameRule, NotificationChain msgs)
  {
    Rule oldMethodNameRule = methodNameRule;
    methodNameRule = newMethodNameRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__METHOD_NAME_RULE, oldMethodNameRule, newMethodNameRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMethodNameRule(Rule newMethodNameRule)
  {
    if (newMethodNameRule != methodNameRule)
    {
      NotificationChain msgs = null;
      if (methodNameRule != null)
        msgs = ((InternalEObject)methodNameRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__METHOD_NAME_RULE, null, msgs);
      if (newMethodNameRule != null)
        msgs = ((InternalEObject)newMethodNameRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__METHOD_NAME_RULE, null, msgs);
      msgs = basicSetMethodNameRule(newMethodNameRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__METHOD_NAME_RULE, newMethodNameRule, newMethodNameRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getMethdLengthRule()
  {
    return methdLengthRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethdLengthRule(Rule newMethdLengthRule, NotificationChain msgs)
  {
    Rule oldMethdLengthRule = methdLengthRule;
    methdLengthRule = newMethdLengthRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE, oldMethdLengthRule, newMethdLengthRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMethdLengthRule(Rule newMethdLengthRule)
  {
    if (newMethdLengthRule != methdLengthRule)
    {
      NotificationChain msgs = null;
      if (methdLengthRule != null)
        msgs = ((InternalEObject)methdLengthRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE, null, msgs);
      if (newMethdLengthRule != null)
        msgs = ((InternalEObject)newMethdLengthRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE, null, msgs);
      msgs = basicSetMethdLengthRule(newMethdLengthRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE, newMethdLengthRule, newMethdLengthRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getMethodNoOfParamsRule()
  {
    return methodNoOfParamsRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodNoOfParamsRule(Rule newMethodNoOfParamsRule, NotificationChain msgs)
  {
    Rule oldMethodNoOfParamsRule = methodNoOfParamsRule;
    methodNoOfParamsRule = newMethodNoOfParamsRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE, oldMethodNoOfParamsRule, newMethodNoOfParamsRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMethodNoOfParamsRule(Rule newMethodNoOfParamsRule)
  {
    if (newMethodNoOfParamsRule != methodNoOfParamsRule)
    {
      NotificationChain msgs = null;
      if (methodNoOfParamsRule != null)
        msgs = ((InternalEObject)methodNoOfParamsRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE, null, msgs);
      if (newMethodNoOfParamsRule != null)
        msgs = ((InternalEObject)newMethodNoOfParamsRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE, null, msgs);
      msgs = basicSetMethodNoOfParamsRule(newMethodNoOfParamsRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE, newMethodNoOfParamsRule, newMethodNoOfParamsRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeName(Rule newTypeName, NotificationChain msgs)
  {
    Rule oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__TYPE_NAME, oldTypeName, newTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTypeName(Rule newTypeName)
  {
    if (newTypeName != typeName)
    {
      NotificationChain msgs = null;
      if (typeName != null)
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDslPackage.RULES_FILE__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDslPackage.RULES_FILE__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RuleDslPackage.RULES_FILE__METHOD_NAME_RULE:
        return basicSetMethodNameRule(null, msgs);
      case RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE:
        return basicSetMethdLengthRule(null, msgs);
      case RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE:
        return basicSetMethodNoOfParamsRule(null, msgs);
      case RuleDslPackage.RULES_FILE__TYPE_NAME:
        return basicSetTypeName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RuleDslPackage.RULES_FILE__METHOD_NAME_RULE:
        return getMethodNameRule();
      case RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE:
        return getMethdLengthRule();
      case RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE:
        return getMethodNoOfParamsRule();
      case RuleDslPackage.RULES_FILE__TYPE_NAME:
        return getTypeName();
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
      case RuleDslPackage.RULES_FILE__METHOD_NAME_RULE:
        setMethodNameRule((Rule)newValue);
        return;
      case RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE:
        setMethdLengthRule((Rule)newValue);
        return;
      case RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE:
        setMethodNoOfParamsRule((Rule)newValue);
        return;
      case RuleDslPackage.RULES_FILE__TYPE_NAME:
        setTypeName((Rule)newValue);
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
      case RuleDslPackage.RULES_FILE__METHOD_NAME_RULE:
        setMethodNameRule((Rule)null);
        return;
      case RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE:
        setMethdLengthRule((Rule)null);
        return;
      case RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE:
        setMethodNoOfParamsRule((Rule)null);
        return;
      case RuleDslPackage.RULES_FILE__TYPE_NAME:
        setTypeName((Rule)null);
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
      case RuleDslPackage.RULES_FILE__METHOD_NAME_RULE:
        return methodNameRule != null;
      case RuleDslPackage.RULES_FILE__METHD_LENGTH_RULE:
        return methdLengthRule != null;
      case RuleDslPackage.RULES_FILE__METHOD_NO_OF_PARAMS_RULE:
        return methodNoOfParamsRule != null;
      case RuleDslPackage.RULES_FILE__TYPE_NAME:
        return typeName != null;
    }
    return super.eIsSet(featureID);
  }

} //RulesFileImpl