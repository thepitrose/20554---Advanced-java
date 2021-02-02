package b2017m853;

import java.util.*;

public class CountImp implements Countable <ArrayList> {

	private ArrayList<CountImp> list;
	

	public CountImp(ArrayList<CountImp> list)
	{
		for(int i=0; i<list.size();i++)
		{
		this.list.add(list.get(i));
		}
	}



	@Override
	public Integer count(ArrayList x) {
		Integer count=0;
		for (int i=0;i<x.size();i++)
		{
			if(x.get(i)!=null)
			{
				count+=1;
			}
		}
		return count;
	}


	
	
	
}
