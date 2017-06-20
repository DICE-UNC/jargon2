/**
 * 
 */
package org.irods.jargon2.core.context;

import org.irods.jargon2.common.confg.props.JargonProperties;
import org.irods.jargon2.core.context.monitor.InstrumentationSink;

/**
 * Represents a shared, thread safe object between IO operations and the process
 * calling those operations. This allows cancellation, pause, and other types of
 * information to be passed to the i/o process.
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
	 * {@link InstrumentationSink} that can receive reports of performance
	 * characteristics, timing, etc, per the message hierarcy
	 */
	private InstrumentationSink instrumentationSink;

	public JargonProperties getJargonProperties() {
		return jargonProperties;
	}

	public void setJargonProperties(JargonProperties jargonProperties) {
		this.jargonProperties = jargonProperties;
	}

	public InstrumentationSink getInstrumentationSink() {
		return instrumentationSink;
	}

	public void setInstrumentationSink(InstrumentationSink instrumentationSink) {
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
