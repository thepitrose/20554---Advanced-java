package b2017m924;

public class Test {
	public static void main (String [] args) {
		Key k1,k2;
		TwoKeys t1,t2;
		k1=new Key();
		k2=new Key();
		t1=new TwoKeys(k1,k2,1);
		t2=new TwoKeys(k2,k1,2);
		//t2=new TwoKeys(k1,k2,2);
		//t2.start();
		t1.start();
		t2.start();
		System.out.println("in main");
	}
}
