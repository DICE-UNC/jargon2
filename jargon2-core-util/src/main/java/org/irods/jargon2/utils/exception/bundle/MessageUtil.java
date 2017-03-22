/**
 * 
 */
package org.irods.jargon2.utils.exception.bundle;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * @author mconway
 *
 */
public class MessageUtil {
	private static ResourceBundle myResources = ResourceBundle
			.getBundle("org.irods.jargon2.utils.exception.bundle.ExceptionResourceBundle");

	private static String getMessageString(String messageKey) {
		return myResources.getString(messageKey);
	}

	public static String formatMessage(String messageKey) {
		MessageFormat mf = new MessageFormat(getMessageString(messageKey));
		return mf.format(new Object[0]);
	}

	public static String formatMessage(String messageKey, Object arg0) {
		String message = getMessageString(messageKey);
		MessageFormat mf = new MessageFormat(message);
		Object[] args = new Object[1];
		args[0] = arg0;
		return mf.format(args);
	}

	public static String formatMessage(String messageKey, Object arg0, Object arg1) {
		MessageFormat mf = new MessageFormat(getMessageString(messageKey));
		Object[] args = new Object[2];
		args[0] = arg0;
		args[1] = arg1;
		return mf.format(args);
	}
	// Include implementations of formatMessage() for as many arguments
	// as you need
}

/*
 * usage
 * 
 * 
 * public class SomeClass implements FooResourcesKeys {
 * 
 * ... if (!file.exists())
 * 
 * { throw new ResourceException( MessageUtil.formatMessage(MSG_FILE_NOT_FOUND,
 * file.getName()));
 * 
 * }
 * 
 * }
 * 
 */