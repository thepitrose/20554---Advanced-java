package m12b;

public class SavingsAccount extends BankAccount 
{


	public static final double  DEFAULT_INTEREST = 7.7;
	private double interest;
	

//=================Builders============================
	
	public SavingsAccount(String acnum, String aoname, String aoid, double money)
	{
		super(acnum,aoname,aoid,money);
		interest = DEFAULT_INTEREST;
	}
	 
	
	public SavingsAccount(String acnum, String aoname, String aoid, double money, double theinterest)
	{
		super(acnum,aoname,aoid,money);
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
		return super.toString() + " the account interest rate is: " + interest;
	}
	
//=================equals======================
	
	 public boolean equals (Object other)
	 {
		 if (((BankAccount)this)==(other)&& this.interest==((SavingsAccount)other).getInterest())
		 {
			 return true;
		 }
		 
		 return false;
	 }
//============================================	
	
}
