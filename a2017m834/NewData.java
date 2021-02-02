package a2017m834;

public class NewData {

	private Double[] cells;
	private double max;
	
	public NewData (int size,double max)
	{
		this.max=max;
		cells=new Double[size];
		for(int i=0;i<size;i++)
			{
				cells[i] = Math.random()*max;
			}
	}
	public  void doubler(int index)
	{
		synchronized(cells[index]) 
		{
		cells[index]=cells[index]*2;
		}
	}
	

}

