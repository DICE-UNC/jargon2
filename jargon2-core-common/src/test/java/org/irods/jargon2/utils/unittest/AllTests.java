package org.irods.jargon2.utils.unittest;

import org.irods.jargon2.common.confg.enumz.EnumIoStyleTest;
import org.irods.jargon2.common.confg.props.CachedJargonPropertiesTest;
import org.irods.jargon2.common.confg.props.PropertiesFileJargonPropertiesLoaderTest;
import org.irods.jargon2.utils.exception.bundle.MessageUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MessageUtilTest.class, EnumIoStyleTest.class, CachedJargonPropertiesTest.class,
		PropertiesFileJargonPropertiesLoaderTest.class })
public class AllTests {

}
