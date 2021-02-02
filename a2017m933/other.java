package a2017m933;

import java.util.*;

public class other {
	public static <T extends Copyable<T>> void arrayCopy(ArrayList<T> arr1,ArrayList<T> arr2)
	{
		for (T item: arr1)
		{
			try
			{
				arr2.add(item.copy());
			}
			catch(CopyException e)
			{
				arr2.add(null);
			}
		}
	}
}
