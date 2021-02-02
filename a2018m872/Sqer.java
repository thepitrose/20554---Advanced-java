package a2018m872;



public class Sqer {
	
	private int x;
	private int y; 
	public int s; 
	private int xx;
	private int yy; 
	
	public Sqer(int setx, int sety,int setxx,int setyy)
	{
	   x=setx;
	   y=sety; 	
	   s=setx*sety;
	   xx=setxx;
	   yy=setyy;
	    
	}
	
	public int getX ()
	{
		return x;
	}
	
	public int getY ()
	{
		return y;
	}
	
	public int getXX ()
	{
		return xx;
	}
	public int getYY ()
	{
		return yy;
	}


	 public String toString() 
	    { 
	        return "x :" + this.x + "  y :" + this.y + "  s :" + this.s + " xx :"+xx+ " yy :" +yy ;
	    } 
	

}

