package a2019m851;

public class C extends B{
	public C(int n) {
		super(n);
	}
	public int f(A val) {
		System.out.print("in C ");
		if (val instanceof C) return getNum();
		else return val.getNum()+1;
	}
}
