package org.irods.jargon2.common.confg.props;

import org.junit.Assert;
import org.junit.Test;

public class CachedJargonPropertiesTest {

	@Test
	public void testInstrumented() {
		JargonProperties jargonProperties = new CachedJargonProperties();
		jargonProperties.setInstrument(true);
		Assert.assertTrue("didn't get instrumented", jargonProperties.isInstrument());
	}

	@Test
	public void testFastChannelCopy() {
		JargonProperties jargonProperties = new CachedJargonProperties();
		jargonProperties.setUseFastChannelCopy(true);
		Assert.assertTrue("didn't get instrumented", jargonProperties.isUseFastChannelCopy());
	}

}
