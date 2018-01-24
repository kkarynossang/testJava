package shape;

public abstract class Circle extends Shape {
	int radius;

	@Override
	public void draw() {
		System.out.println("원을 그려라");
		
	}

	@Override
	public void print() {
		System.out.println("원");
		
	}
	
	public abstract void caluration();
}
