package net.i2cat.nexus.resources.protocol;

/**
 * Base exception for protocol-related matters.
 * 
 * @author eduardgrasa
 */
public class ProtocolException extends Exception {

	private static final long	serialVersionUID	= 1L;

	public ProtocolException(String message) {
		super(message);
	}

	public ProtocolException(Exception nextedException) {
		super(nextedException);
	}

	public ProtocolException(String message, Exception nestedException) {
		super(message, nestedException);
	}

}