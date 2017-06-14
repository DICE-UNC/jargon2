/**
 * 
 */
package org.irods.jargon2.exception.io;

import org.irods.jargon2.exception.JargonException;

/**
 * General IO Exception
 * 
 * @author mcc
 *
 */
public class JargonIOException extends JargonException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5668474226177204223L;

	/**
	 * 
	 */
	public JargonIOException() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public JargonIOException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public JargonIOException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public JargonIOException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public JargonIOException(Throwable arg0) {
		super(arg0);
	}

}
