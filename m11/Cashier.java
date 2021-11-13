package m11;

import java.util.ArrayList;

public class Cashier
{
    ArrayList<accountLine> cashierList = new ArrayList<accountLine>();
    public double cashier;
    

    public void setcashier() // Build the Cashier
    {
        cashier =0;
    }

    public void setalamount (double money) //set the amount of money in the Cashier
    {
        cashier = money;
    }

    public void addtoshoppinglist (Item details,int amount) //Representing the shopping list as ArrayList
    {
        accountLine xx = new accountLine();
        xx.setId(details);
        xx.setamount(amount);
        xx.settotalprice(details);
        cashierList.add(xx);
    }

    public void showshoppinglist()    
    {
        for (int i=0; i<cashierList.size(); i++)    
        {

            System.out.println(cashierList.get(i).getId() + " " +cashierList.get(i).getAmount() + " "+cashierList.get(i).geTotalprice() );

        }

    }

    public double totalprice ()
    {
        double tamp=0;
        for (int i=0; i<cashierList.size(); i++)    
        {

            tamp=tamp+cashierList.get(i).geTotalprice();

        }

        return tamp;
    }

    public double paymentandchange (double money)  
    {   
        double tamp= totalprice();
        double newmoney = tamp +cashiermoney();
        setalamount(newmoney);
        cashierList.clear();
        return money- tamp;
    }
    
      public double cashiermoney ()
    {
        return cashier;
    }
    
}
