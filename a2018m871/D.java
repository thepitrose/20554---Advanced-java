package a2018m871;

public class D {
	public static void main (String [] args) {
		B b = new C();
		b.f();
		((B) new C()).f();
	}
}
