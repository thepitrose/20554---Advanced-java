package m15b;

import java.util.concurrent.ConcurrentLinkedQueue;

public class AP 
{
	private String name;
	private int runway;
	private boolean[] runwaysStatus;
	ConcurrentLinkedQueue <RunwayStatus> queue  = new ConcurrentLinkedQueue<RunwayStatus>();
	
	
//==================================================================	
	
	public AP(String sname, int num)
	{
		name=sname;
		runway=num;
		runwaysStatus = new boolean[num];
		System.out.println("The Airport name is: " + name + " and the number of runways in it is : " + runway );
	}
	
	
//==================================================================		
	
	public int depart (int num)
	{
		
		queue.add(new RunwayStatus(num));
		
		
		synchronized(this)
		{
		while (whatRunway() == -1 )
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				System.out.println("Please hold");
			}
		}
		
		int free = whatRunway();
		runwaysStatus[free] = true; 
		System.out.println("Flight number: " + queue.remove().getFlightNum() + " is departing from runway number " + (free + 1) + " from airport: " + name  + " have a nice flight ");
		return free; 
		}
	}
		
	
//==================================================================		
	
	public int land (int num)
	{
		
		queue.add(new RunwayStatus(num));
		
		synchronized(this)
		{
			
		while (whatRunway() == -1)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				System.out.println("Please hold");
			}
		}
		
		int free = whatRunway();
		runwaysStatus[free] = true; 
		System.out.println("Flight number: " + queue.remove().getFlightNum() + " is landing in runway number " + (free + 1) + " to  airport: " + name + " Welcome ");
		return free; 
		}
	}
	
	
//==================================================================	
	
	
	
	public void freeRunway(int flightNum, int runwayNum )
	{
		
		synchronized (this) 
		{
			runwaysStatus[runwayNum] = false;
			System.out.println("Flight number " + flightNum + " is cleared the runway " + (runwayNum + 1) + " in  Airport: " + name + " thank you");
			notifyAll();
		}
	}
	
	
//==================================================================	
	
	
	
	private int whatRunway()
	{
		synchronized(this)
		{
		
		for (int i = 0 ; i < runway ; i++)
		{
			if ( !runwaysStatus[i])
			{
				return i;
			}
		}
		return -1;
	}
	}
	
//==================================================================		
	
	
}
