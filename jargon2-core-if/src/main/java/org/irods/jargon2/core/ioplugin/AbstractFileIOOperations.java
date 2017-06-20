/**
 * 
 */
package org.irods.jargon2.core.ioplugin;

import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;

import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.IOMonitor;
import org.irods.jargon2.exception.io.JargonIOException;
import org.irods.jargon2.utils.exception.bundle.ExceptionResourceKeys;
import org.irods.jargon2.utils.exception.bundle.MessageUtil;

/**
 * Abstract superclass for FileIOOperations implmementors
 * 
 * @author mcc
 *
 */
public abstract class AbstractFileIOOperations implements FileIOOperations {

	private final IOContext ioContext;

	@Override
	abstract public void transferLocalFileToIrodsSingleBuffer(Path path, WritableByteChannel channel,
			IOMonitor ioMonitor) throws JargonIOException;

	/**
	 * @param ioContext
	 *            {@link IOContext} with config and other context
	 */
	public AbstractFileIOOperations(IOContext ioContext) {
		super();
		if (ioContext == null) {
			throw new IllegalArgumentException(
					MessageUtil.formatMessage(ExceptionResourceKeys.NULL_OR_EMPTY_PARAMETER, "ioContext"));
		}
		this.ioContext = ioContext;
	}

	/**
	 * Get the underlying IOContext
	 * 
	 * @return {@link IOContext}
	 */
	public IOContext getIoContext() {
		return ioContext;
	}

}
