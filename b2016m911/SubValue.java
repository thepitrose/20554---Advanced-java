package b2016m911;

public class SubValue extends Value{

	public  SubValue() throws Exception{super();}
	public void transform() {
		super.transform();
		System.out.println("SubValue transform");
	}
	public void SubValue (int n) {
		num=num+n;
		transform();
	}
	public int transford(int n) {
		if (n%3>0) return n/3;
		else return n%3;
	}

}
