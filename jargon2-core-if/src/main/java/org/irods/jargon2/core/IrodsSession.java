package org.irods.jargon2.core;

import org.irods.jargon2.common.auth.IrodsPrincipal;
import org.irods.jargon2.exception.JargonException;
import org.irods.jargon2.exception.auth.AuthenticationException;
import org.irods.jargon2.utils.exception.bundle.ExceptionResourceKeys;
import org.irods.jargon2.utils.exception.bundle.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Central shared object that provides common references to configuration and
 * environment, and can be used as a factory that creates the underlying
 * <code>IrodsClient</code> that can carry out operations on iRODS.
 * <p/>
 * This can be created via the {@link} IrodsSession factory for a pure in-code
 * usage pattern, or wired together with appropriate configuration and plugins
 * via Spring.
 * 
 * @author mcc
 *
 */
public class IrodsSession {

	public static final Logger log = LoggerFactory.getLogger(IrodsSession.class);

	private final IOContext ioContext;

	/**
	 * Default constructor requiring an <code>IOContext</code> object
	 * 
	 * @param ioContext
	 *            {@link IOContext} with configuration information
	 */
	public IrodsSession(final IOContext ioContext) {
		if (ioContext == null) {
			throw new IllegalArgumentException(
					MessageUtil.formatMessage(ExceptionResourceKeys.NULL_OR_EMPTY_PARAMETER, "ioContext"));
		}
		this.ioContext = ioContext;

	}

	public IrodsClient connect(IrodsPrincipal irodsPrincipal) throws AuthenticationException, JargonException {

		log.info("connect()");
		if (irodsPrincipal == null)
			throw new IllegalArgumentException(
					MessageUtil.formatMessage(ExceptionResourceKeys.NULL_OR_EMPTY_PARAMETER, "irodsPrincipal"));

		log.info("delegating to irodsProtocolProviderPlugin");
		return null;

	}

}
