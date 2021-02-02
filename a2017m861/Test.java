package a2017m861;

public class Test {

	public static void main (String [] args) {
		
		Y y1 = new Y();
		
		try
		{
			Y y2 =(Y)y1.clone();
		}
		catch (CloneNotSupportedException e) {}
		
	}
}
