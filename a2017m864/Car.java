package a2017m864;

import java.util.*;

public class Car extends Thread  {
	
	private Garage garage;
	
	public Car(Garage g)
	{
		garage=g;
	}
	
	public void run()
	{
		Random x = new  Random();
		int t=x.nextInt(10001);
		
		try
		{
			Thread.sleep(t);
		}
		catch (InterruptedException e) {}
		
		int s = garage.park();
		t=x.nextInt(10001);
		
		try
		{
			Thread.sleep(t);
		}
		catch (InterruptedException e) {}
		garage.release(s);
		
	}

}
