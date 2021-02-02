package a2019m864;

public class Banktwo {

	private boolean[] freeTellers;
	public Banktwo(int size)
	{
		freeTellers=new boolean[size];
			for (int i=0;i<size;i++)
			{
				freeTellers[i]=true;
			}
	}
	
	public synchronized void service(int teller) {
		while (!freeTellers[teller])
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) {}
		}
		freeTellers[teller]=false;
	}
	
	public synchronized void release(int teller)
	{
		freeTellers[teller]=true;
		notifyAll();
	}
}
