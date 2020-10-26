package org.gyaltso.mdsca.checks.method;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.gyaltso.mdsca.checks.Check;
import org.gyaltso.mdsca.checks.Result;
import org.gyaltso.mdsca.model.Method;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodLengthRule;

public class MethodLengthCheck implements Check {

	private MethodLengthRule methodLengthRule;

	public MethodLengthCheck(MethodLengthRule methodLengthRule) {
		this.methodLengthRule = methodLengthRule;
	}

	@Override
	public Result check(ASTNode astNode) {
		Method method = new Method((MethodDeclaration) astNode);
		if (method.getLength() > methodLengthRule.getMax()) {
			return new Result("Invalid method length - " + method.getName(), method.getLineNo());
		}
		return null;
	}

}
