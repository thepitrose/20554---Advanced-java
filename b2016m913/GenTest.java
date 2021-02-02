package b2016m913;

import java.util.*;

public class GenTest<T>
{
	public void foo(List <T> list){System.out.println("1");}

	//public void foo(List <?> list){System.out.println("2");}
	
	//public void foo(List  list){System.out.println("3");}
	
	
	
	public static void main (String[] args)
	{
		GenTest<String> test = new GenTest<String> ();
		List<String> myList = new ArrayList<String> ();
		test.foo(myList);
	}
}

