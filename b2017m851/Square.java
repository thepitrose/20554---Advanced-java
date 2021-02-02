package b2017m851;

//public class Square implements Shape{
public abstract class Square implements Shape{
	
	private int edge;
	
	public Square(int i) {
		edge=i;
	
	}
	public int getEdge() {
		return edge;
	}
	public double getArea() {
		return edge*edge;
	}

}
