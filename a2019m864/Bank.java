package a2019m864;

import java.util.*;

public class Bank {
	private ArrayList<Integer>freeTellers = new ArrayList<Integer>();
		public Bank(int size) {
			for (int i=0;i<size;i++)
				freeTellers.add(i);
		}
		
		/*
		public synchronized int service() {
			int teller;
			if (freeTellers.size()==0)return -1;
			else
			{
				teller=freeTellers.get(0);
				freeTellers.remove(0);
				return teller;
			}
		}
		
		public synchronized void release(int teller)
		{
			freeTellers.add(teller);
		}
		*/
		
		
		public synchronized int service() {

			while (freeTellers.size()==0)
			{
				try
				{
					wait();
				}
				catch (InterruptedException e) {}
			}
			
			int teller= freeTellers.get(0);
			freeTellers.remove(0);
			return teller;
		}
		
		public synchronized void release(int teller)
		{
			freeTellers.add(teller);
			notifyAll();
		}
	
}
