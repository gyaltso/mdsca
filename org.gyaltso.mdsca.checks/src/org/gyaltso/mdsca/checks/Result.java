package org.gyaltso.mdsca.checks;

public class Result {

	private final String message;

	private final int lineNo;

	public Result(String message, int lineNo) {
		this.message = message;
		this.lineNo = lineNo;
	}

	public String getMessage() {
		return message;
	}

	public int getLineNo() {
		return lineNo;
	}

}
