package a2016m821;

public class C extends A{
	public C(int n) {
		super(n);
	}
	public int f(A val) {
		if (val instanceof C) return getNum();
		else return val.getNum();
	}

}
