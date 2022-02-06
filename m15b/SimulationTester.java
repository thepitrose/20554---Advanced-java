package m15b;


public class SimulationTester
{
	public static void main (String[] args){
		

		AP aAirport = new AP("OZ", 3);
		AP bAirport = new AP("Narnia", 3);
		Flight flight;
		
		final int NUMBER_OF_FLIGHTS = 10;	
		
		
		for (int i = 0 ; i < NUMBER_OF_FLIGHTS ; i++)
		{
			
			int range = (2 - 1) + 1;
			int rand = (int)((Math.random()*range+2));
			

			if ( rand%2 == 1 )
			{	
				int flightNum = (int) Math.ceil(Math.random() * 800);
				
				flight = new Flight(flightNum,aAirport,bAirport);
			}
			else 
			{
				int flightNum = (int) Math.ceil(Math.random() * 800);
				
				flight = new Flight(flightNum,bAirport,aAirport);
			}
			flight.start();
		}
		
		
	}
	
}

