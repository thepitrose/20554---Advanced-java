package m12b;

public class HighInterestSavings extends SavingsAccount 
{
	public static final double  DEFAULT_INTEREST = 17.7;
	public static final double  DEFAULT_MIN = 10;
	private double min;
	private double interest; 
	

//=================Builders============================
	
	public HighInterestSavings(String acnum, String aoname, String aoid, double money)
	{
		super(acnum,aoname,aoid,money,DEFAULT_INTEREST);
		min = DEFAULT_MIN;
	}
	
	
	public HighInterestSavings(String acnum, String aoname, String aoid, double money, double themin)
	{
		super(acnum,aoname,aoid,money,DEFAULT_INTEREST);
		this.min = themin;
	}

	
//=================Methods======================	
	
	
	public void setInterest (double theinterest)
	{
		this.interest=theinterest;
	}
	
	
	public double getInterest ()
	{
		return this.interest;
	}
	
	
	public void setMin (double themin)
	{
		this.min=themin;
	}
	
	
	public double getMin ()
	{
		return this.min;
	}
	
//=================toString======================
	
	public String toString() 
	{
		return super.toString() + "the account minimum balance is: " + min;
	}
	
	
//=================equals======================
	
		 public boolean equals (Object other)
		 {
			 if (((BankAccount)this)==(other)&& this.interest==((HighInterestSavings)other).getInterest())
			 {
				 return true;
			 }
			 
			 return false;
		 }
	//============================================		
	
	
}
