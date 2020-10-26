package org.gyaltso.mdsca.checks.method;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.gyaltso.mdsca.checks.Check;
import org.gyaltso.mdsca.checks.Result;
import org.gyaltso.mdsca.model.Method;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodParamCountRule;

public class MethodParamCountCheck implements Check {

	private MethodParamCountRule methodParamCountRule;

	public MethodParamCountCheck(MethodParamCountRule methodParamCountRule) {
		this.methodParamCountRule = methodParamCountRule;
	}

	@Override
	public Result check(ASTNode astNode) {
		Method method = new Method((MethodDeclaration) astNode);
		if (method.getParams().size() > methodParamCountRule.getMax()) {
			return new Result("Invalid method parameters count - " + method.getName(), method.getLineNo());
		}
		return null;
	}

}
