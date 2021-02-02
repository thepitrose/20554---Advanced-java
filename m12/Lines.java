package m12;

public class Lines 
{

	private int xx;
	private int xy; 
	
	private int yx;
	private int yy;  

	
	public Lines(int setxx, int setxy, int setyx,int setyy)
	{
	   xx=setxx;
	   xy=setxy; 	
	   yx=setyx;
	   yy=setyy;
	}
	
	public int getLxx ()
	{
		return xx;
	}
	
	public int getLxy ()
	{
		return xy;
	}

	public int getLyx ()
	{
		return yx;
	}
	
	public int getLyy ()
	{
		return yy;
	}
	
	
}
