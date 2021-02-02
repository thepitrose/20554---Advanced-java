package a2017m834;

public class Data {

	private double[] cells;
	private double max;
	
	public Data(int size,double max)
	{
		this.max=max;
		cells=new double[size];
		for(int i=0;i<size;i++)
			{
				cells[i] = Math.random()*max;
			}
	}
	public synchronized void doubler(int index)
	{
		while(cells[index]*2>max)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) {}
		}
		cells[index]=cells[index]*2;
	}
	
	public synchronized void half(int index)
	{
		cells[index]=cells[index]/2;
		notifyAll();
	}
}
