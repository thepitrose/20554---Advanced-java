package m12b;

public class InterestChecking extends NoServiceChargeChecking 
{

	public static final double  DEFAULT_INTEREST = 7.7;
	private double interest;
	
	
//=================Builders============================
	
	public InterestChecking(String acnum, String aoname, String aoid, double money, double themin)
	{
		super(acnum,aoname,aoid,money,themin);
		interest = DEFAULT_INTEREST;
	}
	
	
	public InterestChecking(String acnum, String aoname, String aoid, double money, double themin, double theinterest)
	{
		super(acnum,aoname,aoid,money,themin);
		this.interest = theinterest;
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
	
	
	public double calculationInterest()
	{ 
		return this.getBalance()*interest;
	}
	
	public void MonthlyManagement()
	{
		this.addToBalance(this.calculationInterest());
	}

//=================toString======================
	
	public String toString() 
	{
		return super.toString() + " your interest rate is: " + interest;
	}
	
//=================equals======================
	
		 public boolean equals (Object other)
		 {
			 if (((BankAccount)this)==(other)&& this.interest==((InterestChecking)other).getInterest())
			 {
				 return true;
			 }
			 
			 return false;
		 }
//============================================
	
}
