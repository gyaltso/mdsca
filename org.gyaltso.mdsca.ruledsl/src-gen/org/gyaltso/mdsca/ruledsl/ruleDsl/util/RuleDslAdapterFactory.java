/**
 * generated by Xtext 2.23.0
 */
package org.gyaltso.mdsca.ruledsl.ruleDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gyaltso.mdsca.ruledsl.ruleDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gyaltso.mdsca.ruledsl.ruleDsl.RuleDslPackage
 * @generated
 */
public class RuleDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RuleDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RuleDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleDslSwitch<Adapter> modelSwitch =
    new RuleDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseRulesFile(RulesFile object)
      {
        return createRulesFileAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseTypeNameRule(TypeNameRule object)
      {
        return createTypeNameRuleAdapter();
      }
      @Override
      public Adapter caseMethodNameRule(MethodNameRule object)
      {
        return createMethodNameRuleAdapter();
      }
      @Override
      public Adapter caseMethodLengthRule(MethodLengthRule object)
      {
        return createMethodLengthRuleAdapter();
      }
      @Override
      public Adapter caseMethodParamCountRule(MethodParamCountRule object)
      {
        return createMethodParamCountRuleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.gyaltso.mdsca.ruledsl.ruleDsl.RulesFile <em>Rules File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gyaltso.mdsca.ruledsl.ruleDsl.RulesFile
   * @generated
   */
  public Adapter createRulesFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gyaltso.mdsca.ruledsl.ruleDsl.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gyaltso.mdsca.ruledsl.ruleDsl.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gyaltso.mdsca.ruledsl.ruleDsl.TypeNameRule <em>Type Name Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gyaltso.mdsca.ruledsl.ruleDsl.TypeNameRule
   * @generated
   */
  public Adapter createTypeNameRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gyaltso.mdsca.ruledsl.ruleDsl.MethodNameRule <em>Method Name Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gyaltso.mdsca.ruledsl.ruleDsl.MethodNameRule
   * @generated
   */
  public Adapter createMethodNameRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gyaltso.mdsca.ruledsl.ruleDsl.MethodLengthRule <em>Method Length Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gyaltso.mdsca.ruledsl.ruleDsl.MethodLengthRule
   * @generated
   */
  public Adapter createMethodLengthRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gyaltso.mdsca.ruledsl.ruleDsl.MethodParamCountRule <em>Method Param Count Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gyaltso.mdsca.ruledsl.ruleDsl.MethodParamCountRule
   * @generated
   */
  public Adapter createMethodParamCountRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RuleDslAdapterFactory
