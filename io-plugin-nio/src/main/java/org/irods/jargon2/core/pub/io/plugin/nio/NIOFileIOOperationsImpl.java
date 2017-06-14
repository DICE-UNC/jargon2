/**()
 * 
 */
package org.irods.jargon2.core.pub.io.plugin.nio;

import java.io.IOException;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.IOMonitor;
import org.irods.jargon2.core.ioplugin.FileIOOperations;
import org.irods.jargon2.exception.io.JargonIOException;
import org.irods.jargon2.utils.exception.bundle.ExceptionResourceKeys;
import org.irods.jargon2.utils.exception.bundle.MessageUtil;
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
			IOContext ioContext) throws JargonIOException {
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

		FileChannel fileChannel;
		try {
			FileChannel.open(path);
		} catch (IOException e) {
			log.error("I/O Exception opening path:{}", path, e);
			throw new JargonIOException(MessageUtil.formatMessage(ExceptionResourceKeys.EXCEPT_lOCAL_IO, path), e);
		}

	}

}
