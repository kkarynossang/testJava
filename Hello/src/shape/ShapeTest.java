package shape;

public class ShapeTest {
	public static void main(String arg[]) {
		Rectangle rec = new Rectangle();
		rec.draw();
		
		SpecialCircle cir = new SpecialCircle();
		cir.draw();
		
		rec.move(1, 1);
		
		cir.move(2, 2);

	
	}
}