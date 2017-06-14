/**
 * 
 */
package org.irods.jargon2.exception;

/**
 * Root of checked Jargon exception hierarchy
 * 
 * @author mconway
 *
 */
public class JargonException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4061550775957048060L;

	/**
	 * 
	 */
	public JargonException() {
	}

	/**
	 * @param arg0
	 */
	public JargonException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public JargonException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public JargonException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public JargonException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
