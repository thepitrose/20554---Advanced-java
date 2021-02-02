package a2016m831;

/*
public class Code {
	private int n=0;
	public Code () {
		this(0);
		System.out.println("Code consteructor1");
	}
	
	public Code(int n) {
		this.n=n;
		System.out.println("Code consteructor2");
	}
	public String toString() {
		return ""+n;
	}
	
}
*/

public class Code {
	private int n=0;
	private static  int count=0;
	
	public Code () {
		this(0);
		System.out.println("Code consteructor1");
	}
	
	public Code(int n) {
		this.n=n;
		System.out.println("Code consteructor2");
		
		if (this.getClass().getSimpleName().equals("Code"))
		{ 
			count++;
		}
	}
	public String toString() {
		return ""+n;
	}
	
	public  static int getCodeCount()
	{
		return count;
	}
	
	protected void finalize( ) throws Throwable {
		count--;
	    super.finalize();
	}
	
	
}