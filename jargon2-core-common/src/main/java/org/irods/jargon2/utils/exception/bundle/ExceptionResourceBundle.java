/**
 * 
 */
package org.irods.jargon2.utils.exception.bundle;

import java.util.ListResourceBundle;

/**
 * Resource bundle for exception messages
 * 
 * @author mconway
 *
 */
public class ExceptionResourceBundle extends ListResourceBundle {

	static final Object[][] contents = {
			// Localize from here
			{ ExceptionResourceKeys.TEST_MSG1, "Test message1" },
			{ ExceptionResourceKeys.TEST_MSG2, "Test message1 {0}" },
			{ ExceptionResourceKeys.TEST_MSG3, "Test message1 {0} {1}" },
			{ ExceptionResourceKeys.EXCEPT_lOCAL_IO, "Local file IO error at: {0}" },

			// Localize to here
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ListResourceBundle#getContents()
	 */
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
