/**
 * 
 */
package org.irods.jargon2.core.protocol;

import org.irods.jargon2.core.IOContext;
import org.irods.jargon2.core.pub.io.AbstractFileIOOperationsPlugin;

/**
 * Factory for creating IO plugins. These are services that support local i/o
 * operations
 * 
 * @author mcc
 *
 */
public abstract class AbstractIoPluginFactory {

	private IOContext ioContext;

	/**
	 * 
	 */
	public AbstractIoPluginFactory() {
	}

	/**
	 * 
	 * @return
	 */
	public abstract AbstractFileIOOperationsPlugin instance();

}
