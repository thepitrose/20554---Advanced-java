package a2017m931;

public class B extends A{
	protected int x;
	public B() {
		x=0;
		System.out.println("BBB");
	}
	
	public int inc() {
		x=x+super.inc();
		x=x+super.x;
		return x;
	}
}
