package m15;

import java.util.ArrayList;
import java.util.List;


public class ifIPrime extends Thread
{

	List<Integer> primeList =  new ArrayList<Integer>();

	
	public  ifIPrime(int k,int n)
	{
		
		 for (int i=k; i<=n; i++)
		 { 

			 boolean isPrime = true;

			 for (int j=2; j<Math.sqrt(i); j++)
			 { 
				 if (i%j==0)
				 {
					 isPrime = false;
					 break;
				 } 
				
			 }
			 
			 if (isPrime==true)
			 {
				if (i!=0 && i!=1)
				{
					primeList.add(i);
				}
			
			 }

		 }

	}
	

	
	public  List<Integer> getList()
	{
	
		return primeList;
	}
	

	
}



