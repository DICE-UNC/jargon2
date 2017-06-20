/**
 * 
 */
package org.irods.jargon2.common.confg.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.irods.jargon2.common.confg.enumz.EnumIoStyle;
import org.irods.jargon2.exception.configuration.JargonConfigurationRuntimeException;
import org.irods.jargon2.utils.exception.bundle.ExceptionResourceKeys;
import org.irods.jargon2.utils.exception.bundle.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Load <code>JargonProperties</code> via a provided java
 * <code>Properties</code> file
 * 
 * @author mcc
 *
 */
public class PropertiesFileJargonPropertiesLoader implements JargonPropertiesLoader {

	private final String resourcePath;
	public static final Logger log = LoggerFactory.getLogger(PropertiesFileJargonPropertiesLoader.class);

	/**
	 * 
	 */
	public PropertiesFileJargonPropertiesLoader(final String resourcePath) {
		if (resourcePath == null || resourcePath.isEmpty()) {
			throw new IllegalArgumentException(
					MessageUtil.formatMessage(ExceptionResourceKeys.NULL_OR_EMPTY_PARAMETER, "resourcePath"));
		}
		this.resourcePath = resourcePath;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon2.common.confg.props.JargonPropertiesLoader#
	 * loadJargonProperties()
	 */
	@Override
	public JargonProperties loadJargonProperties() {
		log.info("loadJargonProperties() using:{}", resourcePath);
		final Properties properties = new Properties();
		try (final InputStream stream = this.getClass().getResourceAsStream(resourcePath)) {
			properties.load(stream);
		} catch (IOException e) {
			log.error("exception loading properties from:{}", resourcePath, e);
			throw new JargonConfigurationRuntimeException(
					MessageUtil.formatMessage(ExceptionResourceKeys.CONFIG_EXCEPT_LOAD_CONFIG), e);
		}

		JargonProperties jargonProperties = new CachedJargonProperties();
		jargonProperties.setConnectionTimeoutInSeconds(
				Integer.parseInt(properties.getProperty(CachedJargonProperties.CONNECTION_TIMEOUT_IN_SECONDS)));
		jargonProperties.setEnumIoStyle(EnumIoStyle.valueOf(properties.getProperty(CachedJargonProperties.IO_STYLE)));
		jargonProperties.setInstrument(Boolean.valueOf(properties.getProperty(CachedJargonProperties.INSTRUMENTED)));
		jargonProperties.setUseFastChannelCopy(
				Boolean.valueOf(properties.getProperty(CachedJargonProperties.IO_FAST_CHANNEL_COPY)));
		jargonProperties.setUseNioDirect(Boolean.valueOf(properties.getProperty(CachedJargonProperties.IO_NIO_DIRECT)));
		return jargonProperties;

	}

}
