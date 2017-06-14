/**
 * 
 */
package org.irods.jargon2.core.context.monitor;

/**
 * Represents an instantaneous representation of the status of an i/o operation.
 * This is sent from a transfer process to an {@link IOMonitor} and can be used
 * to monitor transfer performance.
 * 
 * @author mconway
 *
 */
public class IOMonitorStatusReport {

	public enum IOOperType {
		GET_TRANSFER, PUT_TRANSFER, INPUT, OUTPUT
	}

	/**
	 * Total size of the intended operation. If a file get/put it's the total
	 * file size. For io, it's typically the number of bytes to be moved in
	 * total. This could be the entire file, or a file segement.
	 */
	private final long totalSize;
	/**
	 * Amount moved in this operation, which is also reflected in the
	 * <code>totalCompleted</code>
	 */
	private final long sizeThisOperation;
	/**
	 * Total progress towards the <code>totalSize</code>
	 */
	private final long totalCompleted;
	/**
	 * Time when the operation started. This represents the time of the current
	 * invocation, not the total time if multiple invocations make up the whole
	 * operation.
	 */
	private final long startInMillisThisOper;
	/**
	 * Time when this operation completed
	 */
	private final long completeTimeInMillisthisOper;
	/**
	 * Metadata describing the type of operation
	 */
	private final IOOperType ioOperType;

	/**
	 * @param totalSize
	 * @param sizeThisOperation
	 * @param totalCompleted
	 * @param startInMillisThisOper
	 * @param completeTimeInMillisthisOper
	 * @param ioOperType
	 */
	public IOMonitorStatusReport(long totalSize, long sizeThisOperation, long totalCompleted,
			long startInMillisThisOper, long completeTimeInMillisthisOper, IOOperType ioOperType) {
		super();
		this.totalSize = totalSize;
		this.sizeThisOperation = sizeThisOperation;
		this.totalCompleted = totalCompleted;
		this.startInMillisThisOper = startInMillisThisOper;
		this.completeTimeInMillisthisOper = completeTimeInMillisthisOper;
		this.ioOperType = ioOperType;
	}

	public long getTotalSize() {
		return totalSize;
	}

	public long getSizeThisOperation() {
		return sizeThisOperation;
	}

	public long getTotalCompleted() {
		return totalCompleted;
	}

	public long getStartInMillisThisOper() {
		return startInMillisThisOper;
	}

	public long getCompleteTimeInMillisthisOper() {
		return completeTimeInMillisthisOper;
	}

	public IOOperType getIoOperType() {
		return ioOperType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IOMonitorStatusReport [totalSize=").append(totalSize).append(", sizeThisOperation=")
				.append(sizeThisOperation).append(", totalCompleted=").append(totalCompleted)
				.append(", startInMillisThisOper=").append(startInMillisThisOper)
				.append(", completeTimeInMillisthisOper=").append(completeTimeInMillisthisOper).append(", ");
		if (ioOperType != null) {
			builder.append("ioOperType=").append(ioOperType);
		}
		builder.append("]");
		return builder.toString();
	}

}
