package org.irods.jargon2.utils.confg.props;

/**
 * Interface for jargon
 * @author mconway
 *
 */
public interface JargonPropertiesMBean {

	int getConnectionTimeoutInSeconds();

	void setConnectionTimeoutInSeconds(int connectionTimeoutInSeconds);

}