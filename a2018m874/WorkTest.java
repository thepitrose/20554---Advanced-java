package a2018m874;

import java.util.ArrayList;

public class WorkTest {
	 public static void main(String args[]) {
		 
		 int [][] mat=new int[100][100];
		 
		 for(int i=0; i<100;i++)
		 {
			 for(int j=0; j<100;j++)
			 {
				 mat[i][j]=(int)(Math.random()*1000);
			 }
		 }
		 
		 
		 Manager manager = new Manager(mat);
		 final int MUM_OF_THREAD=10;
		 ArrayList<Worker> thrds = new ArrayList<Worker>();
		 
		 for(int i=0; i<MUM_OF_THREAD;i++)
		 {
			 thrds.add(new Worker(manager));
		 }
		 
		 for(int i=0; i<MUM_OF_THREAD;i++)
		 {
			 thrds.get(i).start();
		 }
		 
		 System.out.println("matrix sum is " + manager.getTotal());
	 }

}
