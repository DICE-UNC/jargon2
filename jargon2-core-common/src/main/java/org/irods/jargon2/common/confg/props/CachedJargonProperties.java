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
	public static final String INSTRUMENTED = "instrumented";
	public static final String IO_STYLE = "io.style";
	public static final String IO_FAST_CHANNEL_COPY = "io.fast.channel.copy";
	public static final String IO_NIO_DIRECT = "io.nio.direct";

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
		return EnumIoStyle.valueOf(propertiesCache.getOrDefault(IO_STYLE, EnumIoStyle.NIO.toString()));
	}

	@Override
	public void setEnumIoStyle(EnumIoStyle enumIoStyle) {
		propertiesCache.put(IO_STYLE, enumIoStyle.toString());

	}

	@Override
	public boolean isUseNioDirect() {
		return valAsBooleanOrFalse(IO_NIO_DIRECT);

	}

	@Override
	public void setUseNioDirect(boolean useNioDirect) {
		propertiesCache.put(IO_NIO_DIRECT, String.valueOf(useNioDirect));

	}

	@Override
	public boolean isUseFastChannelCopy() {
		return valAsBooleanOrFalse(IO_FAST_CHANNEL_COPY);

	}

	@Override
	public void setUseFastChannelCopy(boolean useFastChannelCopy) {
		propertiesCache.put(IO_FAST_CHANNEL_COPY, String.valueOf(useFastChannelCopy));

	}

	@Override
	public boolean isInstrument() {
		return valAsBooleanOrFalse(INSTRUMENTED);
	}

	@Override
	public void setInstrument(boolean instrument) {
		propertiesCache.put(INSTRUMENTED, String.valueOf(instrument));

	}

	private int valAsIntOrZero(final String key) {
		String stringVal = propertiesCache.get(key);
		if (stringVal == null) {
			return 0;
		} else {
			return Integer.parseInt(stringVal);
		}
	}

	private boolean valAsBooleanOrFalse(final String key) {
		String stringVal = propertiesCache.get(key);
		if (stringVal == null) {
			return false;
		} else {
			return Boolean.valueOf(stringVal);
		}
	}

}
