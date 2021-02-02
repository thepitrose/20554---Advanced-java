package a2018m831;

public class A {
	public String st ="A";
	public String getString()
	{
		return st;
	}
	public static void main (String [] args) {
		A aa = new A();
		A ab = new B();
		B bb = new B();
		System.out.print(aa.st);
		System.out.print(ab.st);
		System.out.print(bb.st);
		System.out.print(aa.getString());
		System.out.print(ab.getString());
		System.out.print(bb.getString());
	}
}

