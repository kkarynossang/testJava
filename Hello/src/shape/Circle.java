package shape;

public abstract class Circle extends Shape {
	int radius;

	@Override
	public void draw() {
		System.out.println("���� �׷���");
		
	}

	@Override
	public void print() {
		System.out.println("��");
		
	}
	
	public abstract void caluration();
}
