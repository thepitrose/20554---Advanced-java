package a2016m821;

public class Item implements cloneable {
	
	private int a;
	private int b;
	
	public void setA(int num) {
		a=num;
	}
	public void setB(int num) {
		b=num;
	}
	
	public Object clone() {
		Item obj=null;
		try
		{
			obj=(Item)super.clone();
		}
		catch (CloneNotSupportedException e) {}
		
		obj.a=a;
		obj.b=b;
		
		return (Object)obj;
		
	 }
	
}
