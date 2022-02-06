package m15b;



public class Flight extends Thread
{
		private int flightNum; 
		private AP departAPName; 
		private AP landingAPName;
		

//==================================================================	
		
		public Flight(int flightNum, AP depart, AP landing)
		{
			this.flightNum = flightNum;
			this.departAPName = depart;
			this.landingAPName = landing;
		}
		
		public void run ()
		{
			
//==================================================================		
			
			
			try
			{
				int departNum = departAPName.depart(flightNum);
				int range = (5 - 2) + 2;
				int sleepTime = (int)((Math.random()*range+2)*1000);
				sleep(sleepTime);
				departAPName.freeRunway(flightNum, departNum);
				
			}	
			catch (InterruptedException e)
			{
				System.out.println("Wake up!");
			}
			
			
//==================================================================				
		
			try {
				
				int range = (5 - 2) + 2;
				int sleepTime = (int)((Math.random()*range+2)*3000);
				sleep(sleepTime);
			}
			catch (InterruptedException e)
			{
				System.out.println("Wake up!");
			}
			
				
//==================================================================				
			
			try
			{
				int landNum = landingAPName.land(flightNum);
				int range = (5 - 2) + 2;
				int sleepTime = (int)((Math.random()*range+2)*1000);
				sleep(sleepTime);
				landingAPName.freeRunway(flightNum, landNum);
			}	
			catch (InterruptedException e)
			{
				System.out.println("Wake up!");
			}
			
//==================================================================				
			
		}

		
}
