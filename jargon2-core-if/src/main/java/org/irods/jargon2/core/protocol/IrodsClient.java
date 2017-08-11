/**
 * 
 */
package org.irods.jargon2.core.protocol;

import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.ioplugin.AbstractProtocolProviderPlugin;
import org.irods.jargon2.core.pub.io.AbstractFileIOOperationsPlugin;

/**
 * @author mcc
 *
 */
public class IrodsClient {

	private IOContext ioContext;
	private AbstractFileIOOperationsPlugin fileIOOperationsPlugin;
	private AbstractProtocolProviderPlugin abstractProtocolProviderPlugin;

	/**
	 * 
	 */
	public IrodsClient() {
	}

}
