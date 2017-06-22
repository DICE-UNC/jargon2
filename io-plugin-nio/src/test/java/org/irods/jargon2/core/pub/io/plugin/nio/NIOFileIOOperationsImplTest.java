package org.irods.jargon2.core.pub.io.plugin.nio;

import static org.junit.Assert.fail;

import org.irods.jargon2.common.confg.enumz.EnumIoStyle;
import org.irods.jargon2.common.confg.props.JargonProperties;
import org.irods.jargon2.common.confg.props.JargonPropertiesLoader;
import org.irods.jargon2.common.confg.props.PropertiesFileJargonPropertiesLoader;
import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.InMemoryQueueInstrumentationSink;
import org.irods.jargon2.core.context.monitor.InstrumentationSink;
import org.junit.Test;

public class NIOFileIOOperationsImplTest {

	@Test
	public void testTransferLocalFileToIrodsSingleBuffer() {
		fail("Not yet implemented");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNIOFileIOOperationsImplNullContext() {
		// IOContext ioContext = new IOContext();
		new NIOFileIOOperationsImpl(null);
	}

	@Test
	public void testStreamFileToSingleBufferFastChannelCopy() {
		IOContext ioContext = new IOContext();
		JargonPropertiesLoader loader = new PropertiesFileJargonPropertiesLoader("jargon.properties");
		JargonProperties props = loader.loadJargonProperties();
		props.setEnumIoStyle(EnumIoStyle.NIO);
		props.setInstrument(true);
		props.setUseFastChannelCopy(true);
		ioContext.setJargonProperties(props);
		InstrumentationSink sink = new InMemoryQueueInstrumentationSink();
		ioContext.setInstrumentationSink(sink);

	}

}
