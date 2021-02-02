package a2017m861;

public class Y extends X{
	public Y() { System.out.println("Y.constructor");}
	public void init (int [] nums) {
		System.out.println("Y.init");
		for(int i=0; i<nums.length;i++)
			nums[i]=i;
	}
	public static void main (String [] args) {
		System.out.println(new Y());
	}
}
