package a2018m874;

public class Worker extends Thread{

	private final Manager manager;
	
	public Worker( Manager manager)
	{
		this.manager=manager;
	}
	
	public void run()
	{
		int [] row;
		
		do
		{
			row=manager.allocateRow();
			if (row != null)
			{
				manager.addSum(calcSum(row));
			}
		} while (row !=null);
	}
	
	private int calcSum(int [] row)
	{
		int sum=0;
		
		for (int i=0; i<row.length;i++)
		{
			sum+=row[i];
		}
		
		return sum;
	}
	
}
