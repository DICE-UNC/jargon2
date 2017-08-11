/**
 * 
 */
package org.irods.jargon2.common.confg.enumz;

/**
 * Describes the plugin style for communicating with the iRODS server
 * 
 * @author mcc
 *
 */
public enum EnumProtocolStyle {
	NIO_4, DEFAULT;

	/**
	 * Turn a string representation into the equivalent value
	 * 
	 * @param protocolStyle
	 *            <code>String</code> with the representation for the io
	 *            protocol style
	 * @return {2link EnumProtocolStyle} value or <code>null</code> if unmatched
	 */
	public static EnumProtocolStyle mapIoStyleToEnum(final String protocolStyle) {
		EnumProtocolStyle enumProtocolStyle = null;
		for (EnumProtocolStyle enumValue : EnumProtocolStyle.values()) {
			if (enumValue.toString().equals(protocolStyle)) {
				enumProtocolStyle = enumValue;
				break;
			}
		}

		return enumProtocolStyle;
	}

}
