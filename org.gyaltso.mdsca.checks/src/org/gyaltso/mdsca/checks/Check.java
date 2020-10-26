package org.gyaltso.mdsca.checks;

import org.eclipse.jdt.core.dom.ASTNode;

public interface Check {
	
	Result check(ASTNode astNode);
	
}
