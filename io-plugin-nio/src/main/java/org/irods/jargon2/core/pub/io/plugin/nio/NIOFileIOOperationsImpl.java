/**()
 * 
 */
package org.irods.jargon2.core.pub.io.plugin.nio;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;

import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.IOMonitor;
import org.irods.jargon2.core.context.monitor.IOMonitorStatusReport;
import org.irods.jargon2.core.context.monitor.IOMonitorStatusReport.IOOperType;
import org.irods.jargon2.core.ioplugin.FileIOOperations;
import org.irods.jargon2.core.pub.io.AbstractFileIOOperationsPlugin;
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
public class NIOFileIOOperationsImpl extends AbstractFileIOOperationsPlugin implements FileIOOperations {

	public static final Logger log = LoggerFactory.getLogger(NIOFileIOOperationsImpl.class);

	/**
	 * Constructor taking a context
	 * 
	 * @param ioContext
	 */
	public NIOFileIOOperationsImpl(IOContext ioContext) {
		super(ioContext);
	}

	@Override
	public void transferLocalFileToIrodsSingleBuffer(Path path, WritableByteChannel channel, IOMonitor ioMonitor)
			throws JargonIOException {
		log.info("transferLocalFileToIrodsSingleBuffer()");
		if (path == null) {
			throw new IllegalArgumentException(
					MessageUtil.formatMessage(ExceptionResourceKeys.NULL_OR_EMPTY_PARAMETER, "path"));
		}

		if (channel == null) {
			throw new IllegalArgumentException(
					MessageUtil.formatMessage(ExceptionResourceKeys.NULL_OR_EMPTY_PARAMETER, "channel"));
		}

		log.info("path:{}", path);
		log.info("channel:{}", channel);
		log.info("ioMonitor:{}", ioMonitor);

		FileChannel fileChannel;
		try {
			fileChannel = FileChannel.open(path);

			long startTime = System.currentTimeMillis();
			if (getIoContext().getJargonProperties().isUseFastChannelCopy()) {
				log.info("fast channel copy for file");
				fileChannel.transferTo(0, fileChannel.size(), channel);
				long endTime = System.currentTimeMillis();
				log.info("successfully transferred");
				if (getIoContext().getJargonProperties().isInstrument()) {
					IOMonitorStatusReport statusReport = new IOMonitorStatusReport();
					statusReport.setCompleteTimeInMillisthisOper(endTime);
					statusReport.setIoOperType(IOOperType.OUTPUT_WRITE);
					statusReport.setSizeThisOperation(fileChannel.size());
					statusReport.setStartInMillisThisOper(startTime);
					statusReport.setTotalCompleted(statusReport.getSizeThisOperation());
					statusReport.setTotalSize(statusReport.getSizeThisOperation());
					getIoContext().getInstrumentationSink().reportObservation(statusReport);
				}
			} else {
				log.error("unsupported transfer method");
				throw new UnsupportedOperationException();
			}
		} catch (IOException e) {
			log.error("I/O Exception opening path:{}", path, e);
			throw new JargonIOException(MessageUtil.formatMessage(ExceptionResourceKeys.EXCEPT_lOCAL_IO, path), e);
		}
	}

}
