package test;

public interface SerialCommunication {
	void send(byte[] data); // 시리얼 포트에 데이터를 전송한다.

	byte[] receive(); // 시리얼 포트에서 데이터를 받는다.
}
