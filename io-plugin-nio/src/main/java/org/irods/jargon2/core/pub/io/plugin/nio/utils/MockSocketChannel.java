package org.irods.jargon2.core.pub.io.plugin.nio.utils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.NetworkChannel;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stub out socket channel, very likely to change
 * 
 * @author mcc
 *
 */
public class MockSocketChannel implements java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.ByteChannel,
		java.nio.channels.Channel, java.nio.channels.GatheringByteChannel, java.nio.channels.InterruptibleChannel,
		java.nio.channels.NetworkChannel, java.nio.channels.ReadableByteChannel,
		java.nio.channels.ScatteringByteChannel, java.nio.channels.WritableByteChannel {

	public static final Logger log = LoggerFactory.getLogger(MockSocketChannel.class);

	public MockSocketChannel() {
	}

	@Override
	public int write(ByteBuffer arg0) throws IOException {
		return 0;
	}

	@Override
	public long read(ByteBuffer[] arg0) throws IOException {
		return 0;
	}

	@Override
	public long read(ByteBuffer[] arg0, int arg1, int arg2) throws IOException {
		return 0;
	}

	@Override
	public int read(ByteBuffer arg0) throws IOException {
		return 0;
	}

	@Override
	public NetworkChannel bind(SocketAddress arg0) throws IOException {
		return new MockSocketChannel();
	}

	@Override
	public SocketAddress getLocalAddress() throws IOException {
		return new InetSocketAddress(1247);
	}

	@Override
	public <T> T getOption(SocketOption<T> arg0) throws IOException {
		return null;
	}

	@Override
	public <T> NetworkChannel setOption(SocketOption<T> arg0, T arg1) throws IOException {
		return null;
	}

	@Override
	public Set<SocketOption<?>> supportedOptions() {
		return null;
	}

	@Override
	public long write(ByteBuffer[] arg0) throws IOException {
		return 0;
	}

	@Override
	public long write(ByteBuffer[] arg0, int arg1, int arg2) throws IOException {
		return 0;
	}

	@Override
	public boolean isOpen() {
		return true;
	}

	@Override
	public void close() throws IOException {

	}

}
