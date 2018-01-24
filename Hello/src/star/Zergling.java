package star;

public class Zergling extends Unit{
	@Override
	public void move(int x, int y) {
		this.x = x+1;
		this.y = y+1;
	}
}
