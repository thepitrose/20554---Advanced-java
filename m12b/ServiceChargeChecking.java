package m12b;

public class ServiceChargeChecking extends CheckingAccount
{

	public static final double  DEFAULT_COMMISSION = 5.7;
	private double commission;
	
//=================Builders============================
	public ServiceChargeChecking(String acnum, String aoname, String aoid, double money)
	{
		super(acnum,aoname,aoid,money);
		commission = DEFAULT_COMMISSION;
	}
	
	public ServiceChargeChecking(String acnum, String aoname, String aoid, double money, double thecommission)
	{
		super(acnum,aoname,aoid,money);
		commission = thecommission;
	}

//=================Methods======================	
	
	public double getCommission() 
	{
		return commission;
	}

	public void setCommission(double commision) 
	{
		this.commission = commision;
	}
		 
	public void MonthlyManagement()
	{
		this.withdraw(commission);
	}
	
//=================toString======================

	
	public String toString() 
	{
		return super.toString() + " The account commission is: " + commission;
	}
	
//=================equals======================


	 public boolean equals (Object other)
	 {
		 if (((BankAccount)this)==(other)&& this.commission==((ServiceChargeChecking)other).getCommission())
		 {
			 return true;
		 }
		 
		 return false;
	 }

//============================================	 
	
}
