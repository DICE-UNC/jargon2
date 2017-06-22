package org.irods.jargon2.common.confg.props;

import org.junit.Test;

import junit.framework.Assert;

public class PropertiesFileJargonPropertiesLoaderTest {

	@Test
	public void testLoadJargonProperties() {
		JargonPropertiesLoader loader = new PropertiesFileJargonPropertiesLoader("/properties/jargon1.properties");
		JargonProperties props = loader.loadJargonProperties();
		Assert.assertNotNull("no properties loaded", props);
		Assert.assertNotNull(props.getConnectionTimeoutInSeconds());

	}

}
