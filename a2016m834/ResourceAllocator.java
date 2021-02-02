package a2016m834;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceAllocator {
	
	private ReentrantLock [] resourcer;
	private Condition[] conditins ;
	private Boolean[] occupieds;
	
	public ResourceAllocator(int num)
	{
		resourcer = new ReentrantLock [num];
		conditins = new Condition [num];
		occupieds = new Boolean[num];
		
		for(int i=0;i<num;i++)
		{
			resourcer[i]=new ReentrantLock();
			conditins[i]=resourcer[i].newCondition();
			occupieds[i]=false;
		}
	}
	
	
	public void allocate(int num)
	{
		resourcer[num].lock();
		
		while (!occupieds[num])
		{
			try
			{
				conditins[num].await();
			}
			catch (InterruptedException e) {}
		}
		occupieds[num]=true;
		resourcer[num].unlock();
	}
	
	public void release (int num)
	{
		resourcer[num].lock();
		occupieds[num]=false;
		conditins[num].signal();
		resourcer[num].unlock();
		
	}
	
	
}
