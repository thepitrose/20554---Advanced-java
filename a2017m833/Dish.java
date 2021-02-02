package a2017m833;

public abstract class Dish {
	
	protected String name;
	protected int price;
	
	public Dish(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	

}
