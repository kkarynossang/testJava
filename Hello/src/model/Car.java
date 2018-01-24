package model;
public class Car {
	// 3개의 필드 선언
	private int speed; // 속도
	private int gear; // 주행거리
	private String color; // 색상
	
	
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
	// 3개의 메소드 선언 
	public void setGear(int newGear) { // 기어 설정 메소드
		gear = newGear;
	}
	public void speedUp(int increment) { // 속도 증가 메소드
		speed += increment;
	}
	public void speedDown(int decrement) { // 속도 감소 메소드
		speed -= decrement;
	}
	
	public void speak() {
		
	}

}
