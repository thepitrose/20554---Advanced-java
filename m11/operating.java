package m11;



import java.util.Scanner; 

public class operating
{

    public static void main(String[] args) 
    {
    	
    	Item thelist = new Item();
    	Item theitem = new Item();
    	thelist.setme();
    	
       Cashier work = new Cashier();
        System.out.println("Hello,The cashier is set,Please enter the amount of money found in the cashier at this moment");
        Scanner cash = new Scanner(System.in);
        work.setalamount(cash.nextDouble());
        
        System.out.println("The items list is");
        thelist.showitemlist();
        
        System.out.println("Please enter the item name, and the amount");
        Scanner item = new Scanner(System.in);
        Scanner amount = new Scanner(System.in);

        String itemstr =item.next();
        theitem =thelist.finditem(itemstr);
     
        work.addtoshoppinglist(theitem,amount.nextInt());
        


        showcommands();
        
        Scanner theaction = new Scanner(System.in);
        String action =theaction.next();
        
        
        
        while(!(action).equals("exit"))
        {

            if((action).equals("1")) 
            {
                System.out.println("Please enter the item name, and the amount");
                 item = new Scanner(System.in);
                 amount = new Scanner(System.in);
                  itemstr =item.next();
                 theitem =thelist.finditem(itemstr);
              
                 work.addtoshoppinglist(theitem,amount.nextInt());
                 
            }
            if((action).equals("2")) 
            {
                work.showshoppinglist();
            }

            if((action).equals("3")) 
            {
                System.out.println(work.totalprice());
            }

            if((action).equals("4")) 
            {
            	  System.out.println("The total account is");
            	  System.out.println(work.totalprice());
                System.out.println("Please enter the payment");
                Scanner payment = new Scanner(System.in);
                //System.out.println("the change is:" + paymentandchange);
                System.out.println("the change is:" + work.paymentandchange(payment.nextDouble()));
                
                System.out.println("Please enter 1 - for the now customer");
                
            } 

            if((action).equals("5")) 
            {
                System.out.println(work.cashiermoney());
            }
            
            if((action).equals("6")) 
            {
            	thelist.showitemlist();
            }

            if((action).equals("0")) 
            {
            	showcommands() ;
            }
            
            if((action).equals("exit")) 
            {   
                break;
            }
            	
            
            theaction = new Scanner(System.in);
            System.out.println("Please enter the next command");
             action =theaction.next();

        }
        
        
    }
    
    public static void showcommands () 
    {
        System.out.println("Please select the following action: ");
        System.out.println("1 -to add an item to the shopping list ");
        System.out.println("2 -to show the current shopping list ");
        System.out.println("3 -to show total amount of the purchase of the customer ");
        System.out.println("4 -to payment ");
        System.out.println("5 -to show current amount in the cashier ");
        System.out.println("6 -to show items list ");
        System.out.println("0 -to show the commands list ");
        System.out.println("exit -to exit ");
    }
    
    

}
