package a2016m824;

import java.util.*;

public class ResourceAllocator {

	private Stack<Integer> freeStock;
	
	public ResourceAllocator(int n)
	{
		freeStock = new Stack<Integer> ();
		
		for (int i=1; i<=n;i++)
		{
			freeStock.push(new Integer (i) );
		}
	}
	
	public synchronized int allocate()
	{
		while(freeStock.isEmpty())
		{
			try 
			{
				wait();
			}
			
			catch (InterruptedException e) {}
		}
		
		Integer resorce = null;
		try
		{
			resorce=freeStock.pop();
		}
		catch (EmptyStackException e) {}
		
		return resorce.intValue();
	}
	
	public synchronized void free(int i)
	{
		freeStock.push(new Integer (i) );
		notifyAll();
	}
	
}
