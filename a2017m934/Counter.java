package a2017m934;

public class Counter {
	private int next=0;
	private int max=0;
	int all_tailes=0;
	int all_heads=0;
	
	public Counter(int max)
	{
		this.max=max;
	}
	
	public synchronized void waitToPrint(int id)
	{
		while(id!=next)
			try
				{
				 wait();
				}
			catch   (InterruptedException e) {}
		
	}
	
	public synchronized void finished(int heads,int tails)
	{
		next++;
		all_tailes=tails;
		all_heads=heads;
		notifyAll();
	}
	
	public synchronized void waittoall()
	{
		while(next<max)
		{
			try
			{
			 wait();
			}
		catch   (InterruptedException e) {}
		}
	}
	
	public void sum()
	{
		System.out.println("all heads="+all_heads+" all tails="+all_tailes);
	}
	
}
