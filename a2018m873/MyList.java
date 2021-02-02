package a2018m873;

import java.util.*;

public class MyList <T> extends ArrayList<T> implements Swappable<MyList <T>>{

	public MyList()
	{
		super();
	}
	
	public MyList(Collection coll)
	{
		super(coll);
	}
	


	public void swap(MyList<T> other) {
		MyList <T> temp = new MyList <T>(this);
		int size=this.size();
		
		for (int i=0; i<size;i++)
		{
			this.remove(0);
		}
		
		for (T t: other)
		{
			this.add(t);
		}
		size=other.size();
		
		for (int i=0; i<size;i++)
		{
			other.remove(0);
		}
		
		for (T t: other)
		{
			other.add(t);
		}
		
	}
}
