/**
 * 
 */
package org.irods.jargon2.core;

import org.irods.jargon2.common.confg.props.JargonProperties;
import org.irods.jargon2.core.context.monitor.IOMonitor;

/**
 * Represents a shared, thread safe object for common data structures and
 * configuration
 * 
 * @author mconway
 *
 */
public class IOContext {

	/**
	 * Reference to controlling properties
	 */
	private JargonProperties jargonProperties;

	/**
	 * {@link IOMonitor} that can receive reports of performance
	 * characteristics, timing, etc, per the message hierarchy
	 */
	private IOMonitor instrumentationSink;

	public JargonProperties getJargonProperties() {
		return jargonProperties;
	}

	public void setJargonProperties(JargonProperties jargonProperties) {
		this.jargonProperties = jargonProperties;
	}

	public IOMonitor getInstrumentationSink() {
		return instrumentationSink;
	}

	public void setInstrumentationSink(IOMonitor instrumentationSink) {
		this.instrumentationSink = instrumentationSink;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IOContext [");
		if (jargonProperties != null) {
			builder.append("jargonProperties=").append(jargonProperties).append(", ");
		}
		if (instrumentationSink != null) {
			builder.append("instrumentationSink=").append(instrumentationSink);
		}
		builder.append("]");
		return builder.toString();
	}

}
