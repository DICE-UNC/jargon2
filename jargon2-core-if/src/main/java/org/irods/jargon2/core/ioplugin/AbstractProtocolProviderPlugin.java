/**
 * 
 */
package org.irods.jargon2.core.ioplugin;

import org.irods.jargon2.common.auth.IrodsAuthentication;
import org.irods.jargon2.common.auth.IrodsPrincipal;
import org.irods.jargon2.exception.auth.AuthenticationException;

/**
 * Plugin representing the underlying connection to iRODS and the protocol used
 * to communicate with the iRODS server. It is the responsibility of this plugin
 * to maintain knowledge of the authenticated principal and other details of the
 * connect to iRODS itself.
 * 
 * @author mcc
 *
 */
public abstract class AbstractProtocolProviderPlugin {

	/**
	 * 
	 */
	public AbstractProtocolProviderPlugin() {
	}

	/**
	 * Cause a principal to be authenticated, and if successful return the
	 * information about the authentication result.
	 * 
	 * @param irodsPrincipal
	 *            {@link IrodsPrincipal} that is being used to authenticate to
	 *            irods
	 * @return {@link IrodsAuthentication} with details from a successful
	 *         authentication. An unsuccessful authentication will throw an
	 *         {@link AuthenticationException}}
	 * @throws AuthenticationException
	 *             from an invalid auth attempt, or an inability to connect to
	 *             the configured iRODS service
	 */
	public abstract IrodsAuthentication authenticate(final IrodsPrincipal irodsPrincipal)
			throws AuthenticationException;

}
