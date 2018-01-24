package model;

public class SportsCar extends Car{
	// 1개의 필드를 추가
    boolean turbo;	
    
    public SportsCar() {
    	
	}
 
	// 1개의 메소드를 추가
	public void setTurbo(boolean newValue) { // 터보 모드 설정 메소드

		turbo = newValue;
	}

	public void speak() {
		System.out.println("스포츠카");
	}
	
	public void speedDown(int decrement)
	{
		
	}
	
	public void compare(Object obj)
	{
		if(obj instanceof SportsCar){
			SportsCar c = (SportsCar)obj;
		}
	}
}
