/**
 * 
 */
package org.irods.jargon2.core;

import org.irods.jargon2.core.ioplugin.AbstractProtocolProviderPlugin;
import org.irods.jargon2.core.pub.io.AbstractFileIOOperationsPlugin;

/**
 * The central access point for API users, this class is created via the {@link IrodsSession} and provides
 * access to all necessary services and management interfaces.
 * 
 * @author mcc
 *
 */
public class IrodsClient {

	private final IOContext ioContext;
	private final AbstractFileIOOperationsPlugin fileIOOperationsPlugin;
	private final AbstractProtocolProviderPlugin abstractProtocolProviderPlugin;

	/**
	 * 
	 */
	IrodsClient(final ioContext, final ) {
	}

}
