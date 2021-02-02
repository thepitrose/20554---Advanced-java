package a2018m834;

import java.util.*;

public class ResourcePool {
	Stack<Resource> resource;
	int [] T;
	
	public ResourcePool(int n)
	{
		resource = new Stack<Resource> ();
		T = new int[n+1];
		
		for(int i=1;i<n+1;n++)
		{
			resource.push(new Resource(i));
			T[i]=0;
		}
	}
	
	public synchronized Resource getResource()
    {
		while(resource.isEmpty())
		{
			try
			{
				wait();
			}
			 catch(Exception e) {}
		}
		
    	Resource r = resource.pop();
    	T[r.getId()]++;
    	return r;
    }

    public synchronized void returnResource(Resource r)
    {
    	resource.push(r);
    	notifyAll();
    }
    
    public int getUseCount(int n)
    {
    	return T[n];
    }
}
