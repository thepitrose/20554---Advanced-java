package b2017m851;

import java.util.*;

public class B {
	
	public static void func(List<String>list)
	{
		for (String str: list) {
			try {
					System.out.print(str.toLowerCase());
			}
			catch(NullPointerException e) {
			}finally {
				System.out.print("!");
			}
		}
		System.out.print("\n");
	}
	
	public static void main (String [] args)
	{
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add(null);
		l.add("b");
		func(l);
		
	}
	
}