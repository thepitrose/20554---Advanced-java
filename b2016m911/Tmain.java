package b2016m911;

public class Tmain {
	public static void main (String [] args) throws Exception {
		Value val=new Value();
		val.transform();
		System.out.println(val);
		
		
		SubValue sub= new SubValue();
		sub.transform();
		System.out.println(sub.toString());
		
		System.out.println("-----------------------------");
		val=sub;
		val.transform();
		//sub=(SubValue)val;
		//sub.transform();
	}
}
