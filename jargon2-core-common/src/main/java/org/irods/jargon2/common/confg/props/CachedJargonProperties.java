/**
 * 
 */
package org.irods.jargon2.common.confg.props;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines global tuning and behavior properties. Properties are internally
 * stored as a concurrent hashmap, allowing sharing of this properties class
 * among services.
 * 
 * @author mconway
 *
 */
public class CachedJargonProperties implements JargonProperties {

	public static final String CONNECTION_TIMEOUT_IN_SECONDS = "connection.timeout";

	private ConcurrentHashMap<String, String> propertiesCache = new ConcurrentHashMap<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon2.utils.confg.props.JargonPropertiesIf#
	 * getConnectionTimeoutInSeconds()
	 */
	@Override
	public int getConnectionTimeoutInSeconds() {
		return valAsIntOrZero(CONNECTION_TIMEOUT_IN_SECONDS);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon2.utils.confg.props.JargonPropertiesIf#
	 * setConnectionTimeoutInSeconds(int)
	 */
	@Override
	public void setConnectionTimeoutInSeconds(int timeout) {
		propertiesCache.put(CONNECTION_TIMEOUT_IN_SECONDS, String.valueOf(timeout));
	}

	private int valAsIntOrZero(final String key) {
		String stringVal = propertiesCache.get(key);
		if (stringVal == null) {
			return 0;
		} else {
			return Integer.parseInt(stringVal);
		}
	}

}
