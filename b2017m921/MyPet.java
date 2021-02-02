package b2017m921;

public class MyPet extends Pet{

	String name;
	
	public MyPet(int age, String kind,String name ) throws IllegalAge {
		super(age, kind);
		this.name=name;
	}

	public boolean equals(Object obj)
	{

		if(obj instanceof MyPet)
		{
			MyPet p = (MyPet)obj;
			return (super.equals(obj)  && p.name.equals(name));
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return super.toString()+" "+name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
}
