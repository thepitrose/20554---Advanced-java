package m12b;

import java.util.Random;

public class RunAbank 
{


	
	public static void main (String[] args)
	{
		 System.out.println("Hello and welcome to the submarine bank");
		 System.out.println("Where all your money is stored in the safest place in the world");
		 System.out.println("A Russian nuclear submarine owned by the Open University" +"\n");
		 
		 
		 BankAccount[] accountsArray = 
			 { 
					 new ServiceChargeChecking ("A0001","Bob Mussolini","300530001",50),
					 new ServiceChargeChecking ("A0002","Brigitte Brown","300530002",3.55,3),
				     new NoServiceChargeChecking ("B0001","David Davidson","300530003",150,5),
				     new NoServiceChargeChecking ("B0002","Jenny Orchid","300530404",2150),
				     new InterestChecking ("C0001","Ezra Shmaryahu","330133404",22150,4),
				     new InterestChecking ("C0001","Grace Simon","304433404",250,34,500),
				     new SavingsAccount ("0E001","Barbara Dion","303513404",250,34),
				     new SavingsAccount ("f1041","Celine  Streisand","304443404",1250,0.34),
				     new HighInterestSavings ("3E201","Cher","303678404",250),
				     new HighInterestSavings ("f1041","Cher","300033404",50,1.34), 
		   };
		 
		 
System.out.println("=================The details of bank account holders======================\n");		 

	for ( int i=0; i<accountsArray.length; i++)
	{
		System.out.println(accountsArray[i]);
	}

	
	
		 Random r = new Random();
		 Random z = new Random();
		 int i = z.nextInt(accountsArray.length);


			for ( BankAccount accounts : accountsArray)
			{
				System.out.println("\n================= The account bellow, added to is balance, the current info is:\n" + accounts);
				accounts.addToBalance(r.nextInt(1000000));
				System.out.println("========  and after \n" + accounts +"\n");
				System.out.println("\n=================TThe account bellow, withdra from his accountcurrent \n" + accounts);
				accounts.withdraw(r.nextInt(10));
				System.out.println("========  and after \n" + accounts + "\n");
				System.out.println("\n=================The account do Monthly Management   \n" + accounts);
				accounts.MonthlyManagement();
				System.out.println("=======  after  \n" + accounts + "\n");
				BankAccount accountsone = accountsArray[i];
				System.out.println("\n=================Is the account \n" + accounts);
				System.out.println("=================Is the same account as \n" + accountsone);
				System.out.println(accounts.equals(accountsone));
				
			}

	}
	
	
}
