/**
 * 
 */
package org.irods.jargon2.core.ioplugin;

/**
 * Monitor of an i/o process. This represents the movement of file or stream
 * data between the local file system and the iRODS agent. This can track
 * performance and transfer rates.
 * 
 * @author mconway
 *
 */
public interface IOMonitor {

	public void reportIOMonitorStatus(final IOMonitorStatusReport ioMonitorStatus);

}
