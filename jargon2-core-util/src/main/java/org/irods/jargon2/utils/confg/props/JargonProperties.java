/**
 * 
 */
package org.irods.jargon2.utils.confg.props;

/**
 * Defines global tuning and behavior properties
 * 
 * @author mconway
 *
 */
public class JargonProperties implements JargonPropertiesMBean {

	/**
	 * Timeout period for connections to iRODS, 0 denotes no timeout. Expressed
	 * in seconds
	 */
	private int connectionTimeoutInSeconds = 30;

	/* (non-Javadoc)
	 * @see org.irods.jargon2.utils.confg.props.JargonPropertiesIf#getConnectionTimeoutInSeconds()
	 */
	@Override
	public int getConnectionTimeoutInSeconds() {
		return connectionTimeoutInSeconds;
	}

	/* (non-Javadoc)
	 * @see org.irods.jargon2.utils.confg.props.JargonPropertiesIf#setConnectionTimeoutInSeconds(int)
	 */
	@Override
	public void setConnectionTimeoutInSeconds(int connectionTimeoutInSeconds) {
		this.connectionTimeoutInSeconds = connectionTimeoutInSeconds;
	}

}
