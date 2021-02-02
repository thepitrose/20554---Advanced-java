package a2017m934;

public class CoinThread extends Thread{
	private int id;
	Counter c;
	public CoinThread(int id,Counter c) {
		this.id=id;
		this.c=c;
	}
	public void run() {
		int head =0;
		int tail=0;
		for (int i=0;i<100;i++)
		{
			if(Math.random()<.5) head++;
			else tail++;
		}
		c.waitToPrint(id);
		System.out.println("thread"+id+" heads="+head+ " tails"+tail);
		c.finished(head, tail);
	}

}
