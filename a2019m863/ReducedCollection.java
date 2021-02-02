package a2019m863;

import java.util.*;

public class ReducedCollection <T extends Reduceable>{
	
	private ArrayList<T> list;
	
	public ReducedCollection()
	{
		list = new  ArrayList<T>();
	}
	
	public void add(T t)
	{
		list.add(ReducedToMax(t));
	}
	
	public boolean exists(T t)
	{
		return list.contains(ReducedToMax(t));
	}
	
	private T ReducedToMax(T t)
	{
		while (true) {
			try
			{
				t.reduce();
			}
			catch(NonReduceable e) {
				break;
			}
		}
		return t;
	}
}
