package a2017m932;

public class Converter {
	private static String[] currency= {"USD","EUR","NIS"};
	public Converter()
	{

	}
	public String[] getCurrency() {
		return currency;
	}
	public double convert(String from,String to,double amount) throws Exception{
			
		
		if(from.equals("USD"))
				{
					if(to.equals("NIS"))
							{
								return amount*3.8;
							}
					
					if(to.equals("EUR"))
					{
						return amount/0.89;
					}
				}
		
		if(from.equals("EUR"))
		{
			if(to.equals("NIS"))
					{
						return amount*4;
					}
			
			if(to.equals("USD"))
			{
				return amount*1.13;
			}
		}
		
		if(from.equals("NIS"))
		{
			if(to.equals("EUR"))
					{
						return amount*0.25;
					}
			
			if(to.equals("USD"))
			{
				return amount*0.28;
			}
		}
		
		return 0;
	}
}
