package m12b;

public abstract class CheckingAccount  extends BankAccount
{
	public CheckingAccount(String acnum, String aoname, String aoid, double money)
	{
		super(acnum,aoname,aoid,money);
	}
 
	public void writeCheck (double money)
	   {
		  try 
		  {
			if( getBalance() < money)
				
			{
				throw new IllegalBalance();
			}

		  }
		  
			catch (IllegalBalance e)
		    {
				System.out.println("The withdraw will create a minus in your balance , which is not possible in your account");
			}
		  
		  
	   }
	
}
