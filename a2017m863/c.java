package a2017m863;

import java.util.*;

public class c {

	public <T extends Reduceable<T>> ArrayList<T> reduceAll(ArrayList<T>arr)
	{
		ArrayList<T> x = new ArrayList<>();
		
		for (T current: arr)
		{
			T reduced;
			 try
			 {
				reduced=current.reduce();
			 }
			 catch (NonReduceable e)
			 {
				 x.add(current);
				 continue;
			 }
			
			 x.add(reduced);
		}
		return x;
	}
	
}
