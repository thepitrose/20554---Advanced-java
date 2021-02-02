package a2017m831;

public class Data implements Computeable
{

    private int num;
    private static int count=0;


    public Data(int n) throws IllegalAction
    {
       if (count >10) throw new IllegalAction();
       else
       {
    	   count++;
    	   num=n;
       }
    }
    
    protected void finalize() throws Throwable {
    	try
    	{
    		super.finalize();
    		count--;
    	}
    	catch (Exception  e) {}
    }

    public void comp(){
        if((num % 2)>0) num--;
    }
    public boolean equals (Data o){
         
        return o.num==num;
    }
    public int getNum(){
        return num;
    }
    public String toString(){
        return " "+num;
    }
    
    public boolean equals (Object o){
        System.out.println("new equals");
       if (! (o instanceof Data)) return false;
       return ((Data)o).num==num;
   }
    
    public static int getDataCount(){
    	return count;
    }
        
}
