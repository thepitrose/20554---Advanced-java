package m14;

import java.util.*;



public class ListRun 
{
	
	
	
	protected static final int INPUT_SIZE = 6;
	 
	 
//==============================================================
	
	public static void main (String[] args)
	{
		
		
		List<String> userList = new List<String>();
		List callList = new List();

		System.out.println(" hi ");

		Scanner input = new Scanner(System.in);
		
//==============================================================		  
			
		for ( int i = 0 ; i < INPUT_SIZE ; i++)
		{
			int z = i+1;
			System.out.println("Please enter String No " + z + " :");	
			userList.add(input.next());
		}

		
		
		input.close();
		
		
//==============================================================		
		
		System.out.println(userList);

//==============================================================		

		Call  current = userList.getHead();

			
			while ( current != null )
		{

			try 
			{
				Call xx = userList.remove();
			
				callList.reverse(xx.getContent().toString());
				 current = userList.getHead();
			} 
			catch (EmptyListException e)
			{
				e.printStackTrace();
			}

		}
			
			
//==============================================================	
			
			
		
		System.out.println("callList List:");
		System.out.println(callList);


//==============================================================
		
		
		

		
		List<Person> personList=  new  List<Person>();
		Person user1 = new Person("bob",7654321,1980);
		Person user2 = new Person("dave",9517535,1960);
		Person user3 = new Person("stave",7894563,1988);
		Person user4 = new Person("gorge",6543579,1941);
		personList.add(user1);
		personList.add(user2);
		personList.add(user3);
		personList.add(user4);
		
		
		Person user5 = max(personList);
		System.out.println(user5.getName());
		
		
		
		
//==============================================================	
		
		
		
	}
	
	
//==============================================================
	public static <E extends Comparable<E>> E max(List <?> list)
	{
		
		E max = (E) list.getHead().getContent();
		
		Call  current = list.getHead();
		
		while ( current != null )
		{ 
			
			E tamp = (E) current.getContent();
			
			if (max.compareTo(tamp)<0)
			{
				max=tamp;
			}
			
			current = current.getNext();
		}

		return max;
	}
	
}
