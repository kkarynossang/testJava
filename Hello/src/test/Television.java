package test;

public class Television implements RemoteControl, SerialCommunication, Print {
	// RemoteControl과 SerialCommunication의 메소드를 동시에 구현하여야 한다.
	public void turnON() {
		System.out.println("티비가 켜졌습니다.");
	}

	public void turnOFF() {
		System.out.println("티비가 꺼졌습니다.");
	}

	public void send(byte[] data) {
		System.out.println( data + "를 보냈습니다.");
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
