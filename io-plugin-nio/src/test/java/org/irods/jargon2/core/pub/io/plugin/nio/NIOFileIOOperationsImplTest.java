package org.irods.jargon2.core.pub.io.plugin.nio;

import static org.junit.Assert.fail;

import org.junit.Test;

public class NIOFileIOOperationsImplTest {

	@Test
	public void testTransferLocalFileToIrodsSingleBuffer() {
		fail("Not yet implemented");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNIOFileIOOperationsImpl() {
		// IOContext ioContext = new IOContext();
		new NIOFileIOOperationsImpl(null);
	}

}
