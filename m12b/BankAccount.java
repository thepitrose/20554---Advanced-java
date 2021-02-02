package m12b;

public abstract class BankAccount 
{
	protected String accounNum;
	protected String ownerName;
	protected String ownerId;
    protected double balance;
    
    
 //=================Builders============================

  public BankAccount()
  {
		  accounNum ="";
		  ownerName ="";
		  ownerId ="";
		 balance =0;
  }
	  
  
  
	public BankAccount(String acnum, String aoname, String aoid, double money)
	{
		 accounNum =acnum;
		 ownerName =aoname;
		 ownerId =aoid;
		 balance =money;
	}
  
  
  
  //=================accounNum============================
  
  public void setAccounNum(String name)
  {
	  this.accounNum=name;
  }
  
  public String getAccounNum()
  {
	  return accounNum;
  }
  
  //=====================ownerName=======================
  public void setOwnerName(String name)
  {
	  this.ownerName=name;
  }
   
  public String getOwnerName()
  {
	  return ownerName;
  }
  
  //====================ownerId========================
  public void setOwnerId(String id)
  {
	  this.ownerId=id;
  }
  
  public String getOwnerId()
  {
	  return ownerId;
  }
  
  //=================balance======================
  
  public double getBalance()
  {
	  return balance;
  }
	  
   public void addToBalance(double money)
   {
	balance=balance+money;
   }
	  

   public void withdraw(double money)
   {
	  try 
	  {
		if(this.balance - money <0)
		{
			throw new IllegalBalance();
		}
		else
		{
			balance=balance-money;
		}
	  }
	  
		catch (IllegalBalance e)
	    {
			System.out.println("The withdraw will create a minus in your balance , which is not possible in your account");
		}
	  
	  
   }
   
   
   //=================Monthly management======================
   
 public abstract void  MonthlyManagement ();
 
 //=================toString======================
 
 public String toString ()
 {
	 return ("The bank account number is:  " + this.accounNum  + " The Owner Name is: " +  this.ownerName + " the owner Id is: " + this.ownerId + " the balance in the account is: " + this.balance );
 }
 
 
 //=================equals======================
 
 public boolean equals (Object other)
 {

	 if (this == (other))
	 {
		 return true;
	 }
	 
	 return false;
 }
 
//============================================
 
}


	  

