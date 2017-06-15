/**
 * 
 */
package org.irods.jargon2.common.confg.props;

import java.util.concurrent.ConcurrentHashMap;

import org.irods.jargon2.common.confg.enumz.EnumIoStyle;

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
	public static final String IO_STYLE = "io.style";

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

	@Override
	public EnumIoStyle getEnumIoStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEnumIoStyle(EnumIoStyle enumIoStyle) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isUseNioDirect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setUseNioDirect(boolean useNioDirect) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isUseFastChannelCopy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setUseFastChannelCopy(boolean useFastChannelCopy) {
		// TODO Auto-generated method stub

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
