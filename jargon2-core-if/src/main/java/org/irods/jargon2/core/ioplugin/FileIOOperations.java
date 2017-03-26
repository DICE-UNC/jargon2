/**
 * 
 */
package org.irods.jargon2.core.ioplugin;

import java.nio.channels.Channel;
import java.nio.file.Path;

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

	public void transferLocalFileToIrodsSingleBuffer(final Path localSourcePath, final Channel irodsChannel,
			final IOMonitor ioMonitor);

}
