/**
 * 
 */
package org.irods.jargon2.common.confg.props;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * Provisional MBean server for jargon (this is experimentation at this point)
 * 
 * @author mconway
 *
 */
public class Jargon2MBeanServer {

	public static void main(String[] args) throws Exception {

		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName name = new ObjectName("org.irods.jargon2.utils.confg.props:type=JargonProperties");
		CachedJargonProperties jargonProperties = new CachedJargonProperties();
		mbs.registerMBean(jargonProperties, name);

		System.out.println("Waiting forever...");
		Thread.sleep(Long.MAX_VALUE);
	}

}
