package org.irods.jargon2.common.confg.enumz;

/**
 * use standard or nio
 * 
 * @author mcc
 * 
 *         https://thomaswabner.wordpress.com/2007/10/09/fast-stream-copy-using-javanio-channels/
 *
 */
public enum EnumIoStyle {
	NIO, Standard;

	public static EnumIoStyle mapIoStyleToEnum(final String ioStyle) {
		EnumIoStyle enumIoStyle = null;
		for (EnumIoStyle enumValue : EnumIoStyle.values()) {
			if (enumValue.toString().equals(ioStyle)) {
				enumIoStyle = enumValue;
				break;
			}
		}

		return enumIoStyle;
	}

}
