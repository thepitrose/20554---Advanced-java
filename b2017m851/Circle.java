package b2017m851;

public abstract class Circle implements Shape{
	
	private int radius;
	
	public Circle(int i) {
		radius=i;
	
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}

}


