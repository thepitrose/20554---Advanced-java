package b2016m913;

import java.util.*;

public class other {
	
	public static <T extends Reduceable <T>> ArrayList<T> apply(ArrayList<T> arr)
	{
		if (arr==null)
		{
			return null;
		}
		
		ArrayList<T> res = new ArrayList<T>();
		
		for (T current:arr)
		{
			res.add(current.reduce());
		}
		return res;
	}

}
