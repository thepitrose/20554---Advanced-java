package a2019m861;

public class main {
	public static void main (String [] args) {
		/*
		Applyable a = new App1();
		App1 b = new App1();
		a.apply();
		b.apply();
		System.out.println("a equals b "+a.equals(b));
		System.out.println("b equals a "+b.equals(a));
		*/
		/*
		Applyable a1 = new App1();
		a1.step(3);
		a1.apply();
		System.out.println("a1 = "+a1);
		*/
		/*
		App1 a = new App1();
		Applyable b = new App2("hi");
		a.apply();
		b.apply();
		System.out.println("a equals b "+a.equals(b));
		System.out.println("b equals a "+b.equals(a));
		*/
		/*
		App1 a1 = new App2("abc");
		int len = (a1.toString()).length();
		a1.step(len);
		System.out.println("a1 = "+a1);
		*/
		
		App2 a2=null;
		try {
			a2=new App2(3,"test");
		}
		catch (IlleagalValue e) {}
		
		if (a2!=null) {
			a2.apply();
			System.out.println(a2);
			
		}
	}
}
