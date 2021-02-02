package b2016m911;

public class Value { /*
	protected int num=0;
	public Value()throws Exception{
		this(1);
		System.out.println("Value constructor 1");
	}
	public Value (int num)throws Exception{
		System.out.println("Value constructor 2");
		if (num<0 || num>100)
			throw new Exception();
		this.num=num;
	}
	public String toString() {return ""+num;}
	public void transform() {
		System.out.println("Value transform");
		if (num % 2 == 0) num = num/2;
		else num=num+1;
	}
	*/
	
	protected int num=0;
	private int id;
	private static int idCounter=0;
	public Value()throws Exception{
		this(1);
		System.out.println("Value constructor 1");
	}
	public Value (int num)throws Exception{
		System.out.println("Value constructor 2");
		if (num<0 || num>100)
			throw new Exception();
		idCounter++;
		this.id=idCounter;
		this.num=num;
	}
	public String toString() {return ""+num;}
	public void transform() {
		System.out.println("Value transform");
		if (num % 2 == 0) num = num/2;
		else num=num+1;
	}
	
}
