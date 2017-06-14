/**
 * 
 */
package org.irods.jargon2.core.ioplugin;

import java.nio.channels.Channel;
import java.nio.file.Path;

import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.IOMonitor;
import org.irods.jargon2.exception.io.JargonIOException;

/**
 * Interface for a file operations plugin that will handle the primary i/o
 * between the local file system and the iRODS agent. These operations sit below
 * the iRODS protocol and handle tasks such as transferring a file from the
 * local file system to iRODS or vice versa
 * 
 * @author mconway
 *
 */
public interface FileIOOperations {

	/**
	 * Given a {@link Channel|, transfer the contents of the given file at the
	 * {@link Path}. This channel represents a connection to iRODS expecting a
	 * single buffer put
	 * 
	 * @param localSourcePath
	 *            {@link Path} representing a local source file
	 * @param irodsChannel
	 *            {@link Channel} representing the iRODS agent in a state
	 *            expecting to receive the local file data
	 * @param ioMonitor
	 *            {@link IOMonitor}, or null if not needed, that can receive
	 *            status updates
	 * @param ioContext
	 *            {@link IOContext} that can be used to share information and
	 *            signals between threads.
	 * @throws JargonIOException
	 */
	public void transferLocalFileToIrodsSingleBuffer(final Path localSourcePath, final Channel irodsChannel,
			final IOMonitor ioMonitor, final IOContext ioContext) throws JargonIOException;

}
