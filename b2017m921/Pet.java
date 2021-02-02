package b2017m921;

public class Pet {
	private int age;
	private String kind;
	
	public Pet(int age, String kind) throws IllegalAge
	{
		if (age<0 || age>100) throw new IllegalAge();
			this.age=age;
			this.kind=kind;	
			
	}
	
	public boolean equals(Object obj)
	{
		Pet p = (Pet)obj;
		return p.kind.equals(kind);
	}
	
	public String toString()
	{
		return kind+" "+age;
	}

}
