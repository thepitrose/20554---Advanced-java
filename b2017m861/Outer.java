package b2017m861;

public class Outer {
	private int i;
	private class Inner{
		private int j=i++;
		public int g() { return j;}
	}
	public Object f() {
		Inner inner = new Inner();
		return inner;
	
	}

}
