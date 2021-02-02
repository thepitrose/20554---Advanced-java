package a2017m861;

public abstract class X implements Cloneable{
	private int [] nums = {1,2,3,4};
	public X() { init (nums);}
	public abstract void init (int[] nums);
	public void inc() {
		for (int i=0; i<nums.length;i++)
			nums[i]=nums[i]+1;
	}
	public String toString() {
		return ""+nums[0];
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}

}
