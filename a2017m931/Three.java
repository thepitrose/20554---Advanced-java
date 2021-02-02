package a2017m931;

public class Three extends One{
	public Three(int x,int y) {
		super(x, y);
	}
	public void move(int i) {
		super.move();
		x=x+i;
		y=y+i;
	}
	public String toString() {
		return("*Three*"+super.toString());
	}

}
