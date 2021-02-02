package b2017m864;

public class Test {
	public static void main (String [] args) throws Exception {
		int[]vec = {1,2,3,4};
		WorkThread[] workers = new WorkThread[3];
		for (int i=0;i<3;i++)
			workers[i]=new WorkThread(vec,i);
		for (int i=0;i<3;i++)
			workers[i].start();
		System.out.println("**main**");
	}
}
