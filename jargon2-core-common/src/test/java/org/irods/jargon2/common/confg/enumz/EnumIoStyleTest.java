package org.irods.jargon2.common.confg.enumz;

import org.junit.Assert;
import org.junit.Test;

public class EnumIoStyleTest {

	@Test
	public void testMapIoStyleToEnum() {
		String test = EnumIoStyle.NIO.toString();
		EnumIoStyle actual = EnumIoStyle.mapIoStyleToEnum(test);
		Assert.assertNotNull("null enumIoStyle", actual);
		Assert.assertEquals(EnumIoStyle.NIO, actual);
	}

}
