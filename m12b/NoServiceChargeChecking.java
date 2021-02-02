package m12b;

public class NoServiceChargeChecking extends CheckingAccount
{
	public static final double  DEFAULT_MIN = 10;
	private double min;
	
//=================Builders============================
	
	public NoServiceChargeChecking(String acnum, String aoname, String aoid, double money)
	{
		super(acnum,aoname,aoid,money);
		min = DEFAULT_MIN;
	}
	
	public NoServiceChargeChecking(String acnum, String aoname, String aoid, double money, double themin)
	{
		super(acnum,aoname,aoid,money);
		min = themin;
	}
	
//=================Methods======================
	
	public double getMin() 
	{
		return min;
	}
 
	public void setMin(double themin) 
	{
		this.min = themin;
	}
		
	public void MonthlyManagement()
	{
		
	}
	
//=================toString======================
	
	public String toString() 
	{
		return super.toString() + " The minimum amount of withdrawal is: " + min;
	}
	
//=================equals======================
	
	 public boolean equals (Object other)
	 {
		 if (((BankAccount)this)==(other)&& this.min==((NoServiceChargeChecking)other).getMin())
		 {
			 return true;
		 }
		 
		 return false;
	 }
//============================================
	 
}
