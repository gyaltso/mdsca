/**
 * 
 */
package org.gyaltso.mdsca.ruledsl.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodLengthRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodNameRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodParamCountRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.RuleDslPackage;

public class RulesResource extends XtextResource {

	public RulesResource() {
	}

	public MethodNameRule getMethodNameRule() {
		EObject eObject = getContents().get(0);
		return (MethodNameRule) EcoreUtil.getObjectByType(eObject.eContents(),
				RuleDslPackage.Literals.METHOD_NAME_RULE);
	}

	public MethodLengthRule getMethodLengthRule() {
		EObject eObject = getContents().get(0);
		return (MethodLengthRule) EcoreUtil.getObjectByType(eObject.eContents(),
				RuleDslPackage.Literals.METHOD_LENGTH_RULE);
	}

	public MethodParamCountRule getParameterCountRule() {
		EObject eObject = getContents().get(0);
		return (MethodParamCountRule) EcoreUtil.getObjectByType(eObject.eContents(),
				RuleDslPackage.Literals.METHOD_PARAM_COUNT_RULE);
	}
}
