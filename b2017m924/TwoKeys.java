package b2017m924;

public class TwoKeys extends Thread{
	Key k1,k2;
	public TwoKeys(Key k1,Key k2,int id)
	{
		super("TwoKeys"+id);
		this.k1=k1;
		this.k2=k2;
	}
	
	public void run()
	{
		k1.seize();
		System.out.println(getName()+" seuzed first");
		//k1.release();
		//yield();
		k2.seize();
		System.out.println(getName()+" seuzed second");
		k1.release();
		k2.release();
	}

}
