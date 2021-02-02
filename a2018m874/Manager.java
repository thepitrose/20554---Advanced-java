package a2018m874;

public class Manager {

	private int[][] mat;
	private int sum,finshedCalc,rows;
	private boolean[] wasAlloced;
	
	 public Manager(int [][]mat)
	 {
		 this.mat=mat;
		 rows=mat.length;
		 wasAlloced = new boolean[rows];
		 
		 for(int i=0; i<wasAlloced.length;i++)
		 {
			 wasAlloced[i]=false;
		 }
		 sum=finshedCalc=0;
	 }
	 
		public synchronized int[] allocateRow() 
		{
			int index = -1;
			
			for (int i=0; i<wasAlloced.length;i++)
			{
				if (!wasAlloced[i]) 
				{
				  index =i;
				  wasAlloced[i]=true;
				  break;
				}
			}
			
			if (index==-1)
			{
				return null;
			}
			
			return mat[index];
		}
		
		public synchronized void addSum(int n)
		{
			this.sum+=n;
			finshedCalc++;
			notifyAll();
		}
		
		public synchronized int getTotal()
		{

			while(!(finshedCalc==rows))
			{
				try
				{
					wait();
				}
				
				catch (InterruptedException e){}

			}
			return sum;
		}
	 
}
