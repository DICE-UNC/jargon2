/**
 * 
 */
package org.irods.jargon2.exception;

/**
 * Base of runtime exception hierarchy
 * 
 * @author mconway
 *
 */
public class JargonRuntimeException extends RuntimeException {

	/**
	 * iRODS error code, if available
	 */
	private int irodsErrorCode = 0;

	/**
	 * 
	 */
	private static final long serialVersionUID = 3540887186451328323L;

	/**
	 * 
	 */
	public JargonRuntimeException() {
	}

	/**
	 * @param arg0
	 */
	public JargonRuntimeException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public JargonRuntimeException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public JargonRuntimeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public JargonRuntimeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public int getIrodsErrorCode() {
		return irodsErrorCode;
	}

	public void setIrodsErrorCode(int irodsErrorCode) {
		this.irodsErrorCode = irodsErrorCode;
	}

}
