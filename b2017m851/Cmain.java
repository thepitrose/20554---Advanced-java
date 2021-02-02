package b2017m851;

import java.awt.Graphics;
import java.util.*;

public class Cmain  {
	public static void main (String [] args) 
	{
		//Shape shape1 = new Square(100);
		//Shape shape2 = new Circle(50);
		//System.out.println(((Circle)shape1).getRadius());
		//System.out.println(shape2.getRadius());
		
		ArrayList<Shape> l = new ArrayList<Shape>();
		//Shape a1 = new Square();
		 l.add(new Square(10) {

			@Override
			public void draw(Graphics g) {
				g.fillRect(0, 0, getEdge(), getEdge());
				
			}});
	}
	
	
}
