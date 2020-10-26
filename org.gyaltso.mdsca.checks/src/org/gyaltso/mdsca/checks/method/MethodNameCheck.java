package org.gyaltso.mdsca.checks.method;

import java.util.regex.Pattern;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.gyaltso.mdsca.checks.Check;
import org.gyaltso.mdsca.checks.Result;
import org.gyaltso.mdsca.model.Method;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodNameRule;

public class MethodNameCheck implements Check {

	private MethodNameRule methodNameRule;

	public MethodNameCheck(MethodNameRule methodNameRule) {
		this.methodNameRule = methodNameRule;
	}

	@Override
	public Result check(ASTNode astNode) {
		Method method = new Method((MethodDeclaration) astNode);
		if (!isValidMethodName(method.getName(), methodNameRule.getFormat())) {
			return new Result("Method name " + method.getName() + " should not start with an Upper case letter",
					method.getLineNo());
		}
		return null; 
	}

	private boolean isValidMethodName(String methodName, String format) {
		return Pattern.compile(format).matcher(methodName).find();
	}

}
