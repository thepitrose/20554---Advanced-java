package a2018m871;

public class Test {
	public static void func(X a, Y b) {
		System.out.println("first");
	}
	public static void func(Y a, X b) {
		System.out.println("second");
	}
	public static void func(Y a, Y b) {
		System.out.println("third");
	}
	public static void main (String [] args) {
		func(new Z(), new Z());
	}
}
