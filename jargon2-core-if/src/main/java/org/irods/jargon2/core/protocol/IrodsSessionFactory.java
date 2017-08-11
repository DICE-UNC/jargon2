/**
 * 
 */
package org.irods.jargon2.core.protocol;

/**
 * Factory that is the typical entry point for working with Jargon2. This
 * factory discovers and users configured jargon properties to create the core
 * <code>IrodsSession</code> object. This factory discovers the various plugins
 * and assembles the <code>IrodsSession</code>.
 * <p/>
 * Think of this as the 'vanilla' way of creating the <code>IrodsSession</code>
 * in code. There will be other routes, such as through Spring wiring, to get an
 * <code>IrodsSession</code>
 * 
 * @author mcc
 *
 */
public class IrodsSessionFactory {

	/**
	 * 
	 */
	public IrodsSessionFactory() {
		// TODO Auto-generated constructor stub
	}

}
