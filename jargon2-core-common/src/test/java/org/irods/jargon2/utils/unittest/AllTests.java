package org.irods.jargon2.utils.unittest;

import org.irods.jargon2.common.confg.enumz.EnumIoStyleTest;
import org.irods.jargon2.utils.exception.bundle.MessageUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MessageUtilTest.class, EnumIoStyleTest.class })
public class AllTests {

}
