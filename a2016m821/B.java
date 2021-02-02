package a2016m821;

public class B extends A{
	public B(int n) {
		super(n);
	}
	public int f(B val) {
		setNum(val.getNum()*2);
		return getNum();
	}
	
}
