package b2017m864;

/*
public class WorkThread extends Thread{
	private int []vec;
	private int id;
	private int result;
	public WorkThread(int [] vec,int id) {
		this.vec=vec;
		this.id=id;
	}
	public static synchronized int process(int[] vec,int id)
	{
		int result =0;
		System.out.println("task " +id);
		for(int i=0;i<vec.length;i++) {
			vec[i]=vec[i]+1;
			result=result+vec[i];
		}
		return result;
	}
	public void run() {
		result=process(vec,id);
		System.out.println("task " +id+ " result= "+result);
	}

}
*/

 public class WorkThread extends Thread{
	private int []vec;
	private int id;
	private int result;
	static Integer printNowId = 0;
	static Object lock = new Object();

 public WorkThread(int [] vec,int id) {
	this.vec=vec;
	this.id=id;
 }
 
 public void checkTurn(int id) {
	 synchronized (lock) {
	 while (id != printNowId) {
		 try { lock.wait(); } 
		 catch (InterruptedException e) { e.printStackTrace(); }
	 }
	}
 }
 
 
 public void done() {
	 synchronized (lock){
	 printNowId = printNowId + 1;
	 lock.notifyAll();
	 }
	}
 
 public static synchronized int p(int[] vec, int id){
	 int res = 0;
	 for(int i=0;i<vec.length;i++){
	 vec[i] = vec[i] + 1; 
	 res = res +vec[i];
	 }
	 return res ;
	 }

 public void run () {
	 result = p(vec,id);
	 checkTurn(id);
	 System.out.println("task " + id + " result= " + result);
	 done();
	 }

}