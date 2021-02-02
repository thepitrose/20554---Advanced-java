package a2016m821;

public class A {
	private int num;
	public A(int n) {
		num=n;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int n) {
		num=n;
	}
	public int f(A val) {
		num=val.num;
		return num;
	}
}
