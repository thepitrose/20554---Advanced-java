package a2017m931;

public class One {
	protected int x;
	protected int y;
	
	public One(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void move() {x++;y++;}
	public String toString() {
		return("*One*"+"x="+x+" y="+y);
	}
}
