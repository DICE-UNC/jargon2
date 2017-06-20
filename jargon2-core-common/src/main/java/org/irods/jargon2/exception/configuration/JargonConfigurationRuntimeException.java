/**
 * 
 */
package org.irods.jargon2.exception.configuration;

import org.irods.jargon2.exception.JargonRuntimeException;

/**
 * Exception in the configuration of the Jargon2 api
 * 
 * @author mcc
 *
 */
public class JargonConfigurationRuntimeException extends JargonRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2436589854839525924L;

	/**
	 * 
	 */
	public JargonConfigurationRuntimeException() {
	}

	/**
	 * @param arg0
	 */
	public JargonConfigurationRuntimeException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public JargonConfigurationRuntimeException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public JargonConfigurationRuntimeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public JargonConfigurationRuntimeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
