package a2017m864;

import java.util.*;

public class Garage {
	
	private Stack<Integer> freeStack;
	
	public Garage (int n)
	{
		freeStack = new Stack<Integer>();
		
		for (int i=0;i<n;i++)
		{
			freeStack.push(i);
		}
		
	}
	
	public synchronized int park()
	{
		while(freeStack.isEmpty())
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) {}
		}
		
		return freeStack.pop();
	}
	
	public synchronized void release(int n)
	{
		freeStack.push(n);
		notifyAll();
	}

}
