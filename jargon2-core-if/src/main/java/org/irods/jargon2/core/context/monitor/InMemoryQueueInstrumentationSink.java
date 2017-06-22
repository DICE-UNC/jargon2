/**
 * 
 */
package org.irods.jargon2.core.context.monitor;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Suitable for testing, this just accumulates reports into a queue and logs
 * them. One can do test assertions after an operation by inspecting the queued
 * reports
 * 
 * @author mcc
 *
 */
public class InMemoryQueueInstrumentationSink implements InstrumentationSink {

	private Queue<IOMonitorStatusReport> globalQueue = new ConcurrentLinkedQueue<>();
	public static final Logger log = LoggerFactory.getLogger(InMemoryQueueInstrumentationSink.class);

	/**
	 * 
	 */
	public InMemoryQueueInstrumentationSink() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon2.core.context.monitor.InstrumentationSink#
	 * reportObservation(org.irods.jargon2.core.context.monitor.
	 * IOMonitorStatusReport)
	 */
	@Override
	public void reportObservation(IOMonitorStatusReport ioMonitorStatusReport) {
		log.info("report:{}", ioMonitorStatusReport);
		globalQueue.add(ioMonitorStatusReport);
	}

	public Queue<IOMonitorStatusReport> getGlobalQueue() {
		return globalQueue;
	}

	public void setGlobalQueue(Queue<IOMonitorStatusReport> globalQueue) {
		this.globalQueue = globalQueue;
	}

}
