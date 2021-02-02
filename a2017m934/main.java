package a2017m934;

public class main {
	public static void main (String [] args) {
		Counter c = new Counter(10);
		for (int i=0;i<10;i++)
		{
			CoinThread item=new CoinThread(i,c);
			item.start();
		}
		c.waittoall();
		c.sum();
	}
}
