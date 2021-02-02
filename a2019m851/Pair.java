package a2019m851;

public class Pair implements cloneable{
	private Item item1;
	private Item item2;
	
	
	public Object clone() {
		Pair obj=null;
		try
		{
			obj=(Pair)super.clone();
			obj.item1=(Item)item1.clone();
			obj.item2=(Item)item2.clone();
		}
		catch (CloneNotSupportedException e) {}
		
		
		return (Object)obj;
		
	 }
}
