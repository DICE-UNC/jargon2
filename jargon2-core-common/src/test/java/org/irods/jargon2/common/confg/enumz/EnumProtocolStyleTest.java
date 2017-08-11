package org.irods.jargon2.common.confg.enumz;

import org.junit.Test;

import junit.framework.Assert;

public class EnumProtocolStyleTest {

	@Test
	public void test() {
		EnumProtocolStyle actual = EnumProtocolStyle.mapIoStyleToEnum(EnumProtocolStyle.NIO_4.toString());
		Assert.assertEquals(EnumProtocolStyle.NIO_4, actual);
	}
}
