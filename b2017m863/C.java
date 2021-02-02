package b2017m863;

import java.util.*;

import a2017m863.NonReduceable;

public class C {

	public <T extends Reverseable<T>> ArrayList<T> reverseAll(ArrayList<T> arr)
	{
		ArrayList<T> rev = new ArrayList<T>();
		
		for (T t : arr)
		{
			try {
				rev.add(t.reverse());
			}
			catch (NonReduceable e) {}
		}
		
		return rev;
	}
	
}
