package m14;

public class Person implements Comparable <Person>
{
	private String name;
	private int id;
	private int age;

	
//=====================================	
	
	public Person(String name,int id, int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}

//=====================================	
	
	
	public String getName()
	{
		return name;
	}
	
//=====================================		
	
	@Override
	public int compareTo(Person person) 
	{
		
		if (this.age<person.age)
		{
			return 1;
		}
		
		if (this.age>person.age)
		{
			return -1;
		}
     
		return 0;
	}
	
	
//=====================================		
	
	
	
}
