package a2018m873;

public class Point implements Swappable<Point> {

	private int x;
	private int y;
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}


	public void swap(Point other) {
		
		int tempX=this.x;
		int tempY=this.y;
		
		this.x=other.x;
		this.y=other.y;
		
		other.x=tempX;
		other.y=tempY;
	}
	
	
}
