package a2017m931;

public class Two extends One{
	public Two(int x,int y) {
		super(x,y);
	}
	public void move() {
		super.move();
		x++;y--;
	}
	public String toString() {
		return("*Two*"+super.toString());
	}
}
