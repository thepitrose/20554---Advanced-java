package b2017m862;

import java.util.*;

public class WorldRepository {
	private ArrayList<String> str = new ArrayList<String>();
	
	public WorldRepository()
	{
		str.add("Table");
		str.add("Boy");
		str.add("University");
		str.add("Student");
		str.add("Java");
		str.add("Programming");
		str.add("Open");
		str.add("Five");
		str.add("School");
		str.add("Hello");
		 Collections.shuffle(str);
	}
	
	public String getRandomWord()
	{
		while(!str.isEmpty())
		{
			String temp=str.get(0);
			str.remove(0);
			return temp;
		}
		return null;
	}
	
}
