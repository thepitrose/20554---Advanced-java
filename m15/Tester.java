package m15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Tester
{
	
	protected static final int M = 1000;	
	protected static final int N = 10;	
	
	
 public static void main(String[] args)
 {
	 
	 
	List<Integer> order =  new ArrayList<Integer>();
	int to = M/N;
	int from = 0;
	 
    ExecutorService e = Executors.newFixedThreadPool(N);


 	
 	for (int i=0; i<M; i++)
 	{

 		 ifIPrime tamp = new ifIPrime(from,to);

 		from +=M/N;
 		to +=M/N;
	
 		order.addAll(tamp.primeList);
 		e.shutdown();

 	}
 		
 	System.out.println(order);
	
 }
 
}

