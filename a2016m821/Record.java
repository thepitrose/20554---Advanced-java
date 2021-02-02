package a2016m821;

public class Record implements cloneable{
	private StockItem item1;
	private StockItem item2;
	private String description;
	
	public Object clone() {
		Record obj=null;
		try
		{
			obj =(Record) super.clone();
			obj.item1=(StockItem)item1.clone();
			obj.item2=(StockItem)item2.clone();
			obj.description=new String(description);
		}
		catch (CloneNotSupportedException e) {}
		
		return (Object)obj;
	}

}
