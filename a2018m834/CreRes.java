package a2018m834;

public class CreRes {
	 public static void main(String args[])
	    {
		 ResourceThread[] thr = new ResourceThread[10];
		 ResourcePool pool = new ResourcePool(3);
		 
		 for(int i=0; i<thr.length;i++)
		 {
			 thr[i]=new ResourceThread(pool);
			 thr[i].start();
		 }
		 
		 
		   for (int i=0; i<4 ;i++)
		   {
			   System.out.println(pool.getUseCount(i));
		   }
		 
	    }

}
