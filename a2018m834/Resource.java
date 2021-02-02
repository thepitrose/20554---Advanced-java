package a2018m834;

public class Resource {
	
	private int id;
	
	public Resource(int id)
	{
		this.id=id;
	}
	
	public void use()
	{
		 System.out.println("use "+ id);
	}
	
	public int getId()
	{
		return this.id;
	}

}
