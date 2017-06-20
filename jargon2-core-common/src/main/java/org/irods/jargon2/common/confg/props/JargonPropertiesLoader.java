/**
 * 
 */
package org.irods.jargon2.common.confg.props;

/**
 * Describes a source to produce a configured <code>JargonProperties</code>.
 * This can load from a properties file, database, etc
 * 
 * @author mcc
 *
 */
public interface JargonPropertiesLoader {

	JargonProperties loadJargonProperties();

}
