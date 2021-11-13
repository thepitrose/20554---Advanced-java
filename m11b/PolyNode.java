package m11b;



public class PolyNode implements Comparable<PolyNode>
{
	private double num;
	private int expon; 
	
	
	public  PolyNode (double xnum, int xexpon )
	{
		this.num=xnum;
		this.expon=xexpon;
	}

	public double getNum ()
	{
		return num;
	}
	
	public int getExpon ()
	{
		return expon;
	}
	
	public void setNum (double x)
	{
		this.num=x;
	}
	
	public void setExpon (int x)
	{
		this.expon=x;
	}

	@Override
	public int compareTo(PolyNode x)
	{		
		int tamp = Integer.compare(expon,x.expon);
		return tamp;
	}
	
	
}

