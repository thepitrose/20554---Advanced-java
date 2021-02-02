package a2019m851;

public class B extends A{
	public B(int n) {
		super(n);
	}
	public int f(B val) {
		System.out.print("in B ");
		setNum(val.getNum()*2);
		return getNum();
	}
}
