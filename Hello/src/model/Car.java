package model;
public class Car {
	// 3���� �ʵ� ����
	private int speed; // �ӵ�
	private int gear; // ����Ÿ�
	private String color; // ����
	
	
	public Car() {
		
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getGear() {
		return gear;
	}
	// 3���� �޼ҵ� ���� 
	public void setGear(int newGear) { // ��� ���� �޼ҵ�
		gear = newGear;
	}
	public void speedUp(int increment) { // �ӵ� ���� �޼ҵ�
		speed += increment;
	}
	public void speedDown(int decrement) { // �ӵ� ���� �޼ҵ�
		speed -= decrement;
	}
	
	public void speak() {
		
	}

}
