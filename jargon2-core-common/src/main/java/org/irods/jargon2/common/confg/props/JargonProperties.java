package org.irods.jargon2.common.confg.props;

/**
 * Interface for jargon
 * @author mconway
 *
 */
public interface JargonProperties {

	int getConnectionTimeoutInSeconds();

	void setConnectionTimeoutInSeconds(int connectionTimeoutInSeconds);

}