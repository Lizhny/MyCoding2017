package third.download.impl;

import java.io.IOException;

import third.download.api.Connection;

public class ConnectionImpl implements Connection {

	@Override
	public byte[] read(int startPos, int endPos) throws IOException {
		
		return null;
	}

	@Override
	public int getContentLength() {
		
		return 0;
	}

	@Override
	public void close() {
		
		
	}

}
