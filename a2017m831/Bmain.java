package a2017m831;

public class Bmain
{
    public static void main (String [] args) {
     
    	/*
        Computeable a = new Data(2);
        Data b = new Data(3);
        a.comp();
        b.comp();
        System.out.println(""+a + b + a.equals(b));
        System.out.println(""+b + a + b.equals(a));
        
        Computeable a1 = new Data(2);
        Data b1 = new Data(3);
       // System.out.println("a1.num = "+a1.getNum());
        System.out.println("b1.num = "+b1.getNum());
        
        Computeable x = new Data(2);
        Data y = new Data(2);
        System.out.println("x equals y "+x.equals(y));
        System.out.println("y equals x "+y.equals(x));
        */
    	
    	try
    	{
    		Data a = new Data(3);
    		Data b = new Data(6);
    	}
    	catch (Exception  e) {}
    	
    	  System.out.println("ths number of Data objects is " +Data.getDataCount());
}
}