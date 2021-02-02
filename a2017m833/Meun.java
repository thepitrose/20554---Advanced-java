package a2017m833;

import java.util.*;

public class  Meun <T extends Dish > {

	private ArrayList<T>arr;
	
	public Meun()
	{
		arr=new ArrayList<T>();
	}
	
	public void add(T dish)
	{
		arr.add(dish);
	}
	
	public T get(String str)
	{
		for (int i=0;i<arr.size();i++)
		{
			if (arr.get(i).name.equals(str))
			{
				return arr.get(i);
			}
		}
		
		return null;
	}
	
	public Iterator <T> iterator()
	{
		return arr.iterator();
	}
	
}
