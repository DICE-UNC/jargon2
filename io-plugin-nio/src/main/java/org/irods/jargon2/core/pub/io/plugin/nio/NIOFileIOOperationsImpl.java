/**()
 * 
 */
package org.irods.jargon2.core.pub.io.plugin.nio;

import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

import org.irods.jargon2.core.ioplugin.FileIOOperations;
import org.irods.jargon2.core.ioplugin.IOContext;
import org.irods.jargon2.core.ioplugin.IOMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NIO implementation of file operations. These plug into protocol operations to
 * manage access to the local file system and the streaming of the actual bytes
 * between the client and iRODS. This sits below the actual protocol operations
 * 
 * @author mconway
 *
 */
public class NIOFileIOOperationsImpl implements FileIOOperations {

	public static final Logger log = LoggerFactory.getLogger(NIOFileIOOperationsImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon2.core.ioplugin.FileIOOperations#
	 * transferLocalFileToIrodsSingleBuffer(java.nio.file.Path,
	 * java.nio.channels.Channel, org.irods.jargon2.core.ioplugin.IOMonitor,
	 * org.irods.jargon2.core.ioplugin.IOContext)
	 */
	@Override
	public void transferLocalFileToIrodsSingleBuffer(Path path, Channel channel, IOMonitor ioMonitor,
			IOContext ioContext) {
		log.info("transferLocalFileToIrodsSingleBuffer()");
		if (path == null) {
			throw new IllegalArgumentException("null path");
		}

		if (channel == null) {
			throw new IllegalArgumentException("null channel");
		}

		log.info("path:{}", path);
		log.info("channel:{}", channel);
		log.info("ioMonitor:{}", ioMonitor);
		log.info("ioContext:{}", ioContext);

		FileChannel.open(path);

	}

}
