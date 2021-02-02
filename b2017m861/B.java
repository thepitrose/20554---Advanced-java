package b2017m861;

public class B extends A{
	
	/*
	protected void f(A a) {
		System.out.print("in B ");
	}
	*/
	/*
	public void f(A a) {
		System.out.print("in B ");
		throw new java.io.IOException();
	}
	*/
	/*
	public void f(A a) {
		System.out.print("in B ");
	}
	*/
	/*
	public void f(B b) {
		System.out.print("in B ");
	}
	*/
	/*
	public void f(Object o) {
		System.out.print("in B ");
	}
	*/
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		
		b.f(b);
		b.f(a);
	}

}
