package model;

public class SportsCar extends Car{
	// 1���� �ʵ带 �߰�
    boolean turbo;	
    
    public SportsCar() {
    	
	}
 
	// 1���� �޼ҵ带 �߰�
	public void setTurbo(boolean newValue) { // �ͺ� ��� ���� �޼ҵ�

		turbo = newValue;
	}

	public void speak() {
		System.out.println("������ī");
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
