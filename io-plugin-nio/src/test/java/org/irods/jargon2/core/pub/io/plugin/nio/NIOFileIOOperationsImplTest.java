package org.irods.jargon2.core.pub.io.plugin.nio;

import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.irods.jargon2.common.confg.enumz.EnumIoStyle;
import org.irods.jargon2.common.confg.props.JargonProperties;
import org.irods.jargon2.common.confg.props.JargonPropertiesLoader;
import org.irods.jargon2.common.confg.props.PropertiesFileJargonPropertiesLoader;
import org.irods.jargon2.core.context.IOContext;
import org.irods.jargon2.core.context.monitor.InMemoryQueueInstrumentationSink;
import org.irods.jargon2.core.ioplugin.FileIOOperations;
import org.irods.jargon2.core.pub.io.plugin.nio.utils.MockSocketChannel;
import org.irods.jargon2.testsupport.config.TestingPropertiesHelper;
import org.irods.jargon2.testsupport.utils.FileGenerator;
import org.irods.jargon2.testsupport.utils.ScratchFileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class NIOFileIOOperationsImplTest {

	private static Properties testingProperties = new Properties();
	private static TestingPropertiesHelper testingPropertiesHelper = new TestingPropertiesHelper();
	private static ScratchFileUtils scratchFileUtils = null;
	public static final String IRODS_TEST_SUBDIR_PATH = "NIOFileIOOperationsImplTest";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TestingPropertiesHelper testingPropertiesLoader = new TestingPropertiesHelper();
		testingProperties = testingPropertiesLoader.getTestProperties();
		scratchFileUtils = new ScratchFileUtils(testingProperties);
		scratchFileUtils.clearAndReinitializeScratchDirectory(IRODS_TEST_SUBDIR_PATH);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void afterEach() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNIOFileIOOperationsImplNullContext() {
		// IOContext ioContext = new IOContext();
		new NIOFileIOOperationsImpl(null);
	}

	@Test
	public void testStreamFileToSingleBufferFastChannelCopy() throws Exception {
		String testFileName = "testStreamFileToSingleBufferFastChannelCopy.txt";
		long length = 40 * 1024 * 1024;
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

		String absPath = scratchFileUtils.createAndReturnAbsoluteScratchPath(IRODS_TEST_SUBDIR_PATH);
		String localFileName = FileGenerator.generateFileOfFixedLengthGivenName(absPath, testFileName, length);

		Path path = Paths.get(localFileName);
		nioFileIOOperations.transferLocalFileToIrodsSingleBuffer(path, channel, sink);
		Assert.assertFalse("no observations in queue", sink.getGlobalQueue().isEmpty());
	}

}
