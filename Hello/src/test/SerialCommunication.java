package test;

public interface SerialCommunication {
	void send(byte[] data); // �ø��� ��Ʈ�� �����͸� �����Ѵ�.

	byte[] receive(); // �ø��� ��Ʈ���� �����͸� �޴´�.
}
