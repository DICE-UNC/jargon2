/**
 * 
 */
package org.irods.jargon2.exception.auth;

import org.irods.jargon2.exception.JargonException;

/**
 * Invalid authentication exception, this is a failure to authenticate due to
 * user/password or rights, and can also be due to an improperly formed connect
 * (incorrect zone, unable to connect)
 * 
 * @author mcc
 *
 */
public class AuthenticationException extends JargonException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7223672226904785572L;

	/**
	 * 
	 */
	public AuthenticationException() {
	}

	/**
	 * @param arg0
	 */
	public AuthenticationException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public AuthenticationException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public AuthenticationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public AuthenticationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
