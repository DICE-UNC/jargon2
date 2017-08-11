/**
 * 
 */
package org.irods.jargon2.core.protocol;

import org.irods.jargon2.core.ioplugin.AbstractProtocolProviderPlugin;

/**
 * Factory to create a concrete {@link AbstractProtocolProviderPlugin}
 * 
 * @author mcc
 *
 */
public abstract class AbstractProtocolProviderFactory {

	/**
	 * 
	 */
	public AbstractProtocolProviderFactory() {
	}

	/**
	 * Create a plugin that connects to and handles operations through the iRODS
	 * protocol
	 * 
	 * @return {@link AbstractProtocolProviderPlugin}
	 */
	public abstract AbstractProtocolProviderPlugin instance();

}
