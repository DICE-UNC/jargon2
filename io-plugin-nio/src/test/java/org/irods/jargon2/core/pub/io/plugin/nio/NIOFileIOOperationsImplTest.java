package org.irods.jargon2.core.pub.io.plugin.nio;

import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.irods.jargon2.common.confg.enumz.EnumIoStyle;
import org.irods.jargon2.common.confg.props.JargonProperties;
import org.irods.jargon2.common.confg.props.JargonPropertiesLoader;
import org.irods.jargon2.common.confg.props.PropertiesFileJargonPropertiesLoader;
import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.InMemoryQueueInstrumentationSink;
import org.irods.jargon2.core.ioplugin.FileIOOperations;
import org.irods.jargon2.core.pub.io.plugin.nio.utils.MockSocketChannel;
import org.junit.Assert;
import org.junit.Test;

public class NIOFileIOOperationsImplTest {

	@Test(expected = IllegalArgumentException.class)
	public void testNIOFileIOOperationsImplNullContext() {
		// IOContext ioContext = new IOContext();
		new NIOFileIOOperationsImpl(null);
	}

	@Test
	public void testStreamFileToSingleBufferFastChannelCopy() throws Exception {
		IOContext ioContext = new IOContext();
		JargonPropertiesLoader loader = new PropertiesFileJargonPropertiesLoader("/jargon.properties");
		JargonProperties props = loader.loadJargonProperties();
		props.setEnumIoStyle(EnumIoStyle.NIO);
		props.setInstrument(true);
		props.setUseFastChannelCopy(true);
		ioContext.setJargonProperties(props);
		InMemoryQueueInstrumentationSink sink = new InMemoryQueueInstrumentationSink();
		ioContext.setInstrumentationSink(sink);
		FileIOOperations nioFileIOOperations = new NIOFileIOOperationsImpl(ioContext);
		WritableByteChannel channel = new MockSocketChannel();
		// FIXME: build local file mock/test
		Path path = Paths.get(
				"/home/mcc/temp/irodsscratch/dataObjectAOImplTest/testParallelGetWithChecksumVerificationResult.txt");
		nioFileIOOperations.transferLocalFileToIrodsSingleBuffer(path, channel, sink);
		Assert.assertFalse("no observations in queue", sink.getGlobalQueue().isEmpty());
	}

}
