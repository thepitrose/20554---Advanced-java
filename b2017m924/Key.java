package b2017m924;

public class Key {
	private boolean taken=false;
	public synchronized void seize() {
		while(taken)
			try {wait();
			}catch(InterruptedException e) {}
		taken=true;
	}
	public synchronized void release() {
		taken=false;
		notifyAll();
	}
}
