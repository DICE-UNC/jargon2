package org.irods.jargon2.utils.exception.bundle;

import org.junit.Assert;
import org.junit.Test;

public class MessageUtilTest {

	@Test
	public void testFormatMessageString() {
		String actual = MessageUtil.formatMessage(ExceptionResourceKeys.TEST_MSG1);
		Assert.assertEquals("Test message1", actual);
	}

	@Test
	public void testFormatMessageStringObject() {
		String p1 = "1";
		String actual = MessageUtil.formatMessage(ExceptionResourceKeys.TEST_MSG2, p1);
		Assert.assertEquals("Test message1 1", actual);
	}

	@Test
	public void testFormatMessageStringObjectObject() {
		String p1 = "1";
		String p2 = "2";
		String actual = MessageUtil.formatMessage(ExceptionResourceKeys.TEST_MSG3, p1, p2);
		Assert.assertEquals("Test message1 1 2", actual);
	}

}
