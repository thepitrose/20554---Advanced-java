package a2019m851;

public class A {
	private int num;
	public A(int n)
	{
		num=n;
	}
	public int getNum()
	{
		return num;
	}
	
	public void setNum(int n) {
		num=n;
	}
	public int f(A val) {
		System.out.print("in A ");
		num=val.num;
		return num;
	}
}
