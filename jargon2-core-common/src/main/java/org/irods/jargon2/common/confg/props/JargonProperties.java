package org.irods.jargon2.common.confg.props;

import org.irods.jargon2.common.confg.enumz.EnumIoStyle;

/**
 * Interface for jargon
 * 
 * @author mconway
 *
 */
public interface JargonProperties {

	/*
	 * -------------------------------------------------------------------------
	 * ------------------------- General behavior properties
	 */

	/**
	 * Is performance logging turned on?
	 * 
	 * @return <code>boolean</code> if logging is turned on
	 */
	boolean isInstrument();

	/**
	 * 
	 * Turn insrumentation logging on or off, <code>true</code> turns on logging
	 * to the configured {@link IOMonitor}
	 * 
	 * @param instrument
	 */
	void setInstrument(boolean instrument);

	/*
	 * -------------------------------------------------------------------------
	 * ------------------------- iRODS connection properties
	 */
	int getConnectionTimeoutInSeconds();

	void setConnectionTimeoutInSeconds(int connectionTimeoutInSeconds);

	/*
	 * -------------------------------------------------------------------------
	 * ------------------------- General i/o properties
	 */

	/**
	 * Get the configured io style
	 * 
	 * @return {@link EnumIoStyle}
	 */
	EnumIoStyle getEnumIoStyle();

	void setEnumIoStyle(EnumIoStyle enumIoStyle);

	/*
	 * -------------------------------------------------------------------------
	 * ------------------------- local file system i/o properties
	 */

	/**
	 * Check if using NIO direct buffers. Only active if NIO is the chosen IO
	 * mode
	 * 
	 * @return <code>boolean</code> use nio direct
	 */
	boolean isUseNioDirect();

	/**
	 * Set nio direct
	 * 
	 * @param useNioDirect
	 *            <code>boolean</code> if nio direct is to be used, otherwise an
	 *            indirect byte buffer is used
	 */
	void setUseNioDirect(boolean useNioDirect);

	/**
	 * Use fast channel copy between channels, only active if io style is nio
	 * 
	 * @return <code>boolean</code> if using fast channel copy
	 */
	boolean isUseFastChannelCopy();

	/**
	 * Set fast channel copy behavior
	 * 
	 * @param useFastChannelCopy
	 */
	void setUseFastChannelCopy(boolean useFastChannelCopy);

}