package test;

public class Television implements RemoteControl, SerialCommunication, Print {
	// RemoteControl�� SerialCommunication�� �޼ҵ带 ���ÿ� �����Ͽ��� �Ѵ�.
	public void turnON() {
		System.out.println("Ƽ�� �������ϴ�.");
	}

	public void turnOFF() {
		System.out.println("Ƽ�� �������ϴ�.");
	}

	public void send(byte[] data) {
		System.out.println( data + "�� ���½��ϴ�.");
	}

	public byte[] receive() {
		System.out.println( "receive");
		return null;
	}

	@Override
	public void print() {
		System.out.println( "TV");
		
	}
}
