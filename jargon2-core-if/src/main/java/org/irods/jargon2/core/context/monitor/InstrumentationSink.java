/**
 * 
 */
package org.irods.jargon2.core.context.monitor;

/**
 * Receiver of instrumentation, these are messages that indicate the performance
 * of various operations. How reports are handled and analyzed is implementation
 * dependent, but each implementation should minimize latency and overhead.
 * 
 * @author mcc
 *
 */
public interface InstrumentationSink {

	/**
	 * Report an IOMonitor instrument observation to be processed by the
	 * particular sink in a certain way
	 * 
	 * @param ioMonitorStatusReport
	 */
	void reportObservation(IOMonitorStatusReport ioMonitorStatusReport);

}
