package org.gyaltso.mdsca.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class Method {

	private final MethodDeclaration method;

	public Method(MethodDeclaration methodDeclaration) {
		this.method = methodDeclaration;
	}

	public int getLineNo() {
		final TypeDeclaration typeDeclaration = (TypeDeclaration) method.getParent();
		final CompilationUnit compilationUnit = (CompilationUnit) typeDeclaration.getParent();
		return compilationUnit.getLineNumber(method.getStartPosition());
	}

	public String getName() {
		return method.getName().getIdentifier();
	}

	public int getLength() {
		return method.getBody().statements().size();
	}

	public List<SingleVariableDeclaration> getParams() {
		final List<SingleVariableDeclaration> params = new ArrayList<>();
		method.parameters().forEach(param -> params.add((SingleVariableDeclaration) param));
		return params;
	}
}
