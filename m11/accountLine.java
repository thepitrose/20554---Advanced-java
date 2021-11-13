package m11;

// the class  presentation of the shopping list
public class accountLine
{

    private Item id;
    private int amount;
    private double totalprice;
    

    public void setId (Item aitam)
    {   
        id=aitam;
    }

    public String getId ()
    {
        return id.getName();
    }

    public void setamount (int aamount)
    {
        amount = aamount;
    }

    public void settotalprice (Item aitam)
    {
        double x = aitam.getPrice();
        totalprice = x*amount;
    }

    public int getAmount () 
    {
        return amount ;
    }
    
    
    public double geTotalprice()
    {
      return totalprice;
    }
    
}
