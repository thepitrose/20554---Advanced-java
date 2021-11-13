package m11b;

import java.util.Scanner; 




public class FunWithPolynom {

	
	 public static void main(String[] args) 
	    { 
		 
		  String results = " ";
		 Polynom work3 = new Polynom(); // Another Polynom structure so we can always return to the original two Polynom
		 System.out.println("Hello");
		 System.out.println("Please enter the size of the array");

		 Scanner input = new Scanner(System.in);
		 int size = input.nextInt();
		
		    double[] double_Array = new double[size];
		    int[] int_Array = new int [size];

		    for (int i = 0; i < double_Array.length; i++)
		    {
		        System.out.println("Please enter number");
		        double_Array[i] = input.nextDouble();
		    }
		 
		    for (int i = 0; i < double_Array.length; i++)
		    {
		        System.out.println("Please enter exponent");
		        int_Array[i] = input.nextInt();
		    }
		    
		     Polynom work = new Polynom(double_Array,int_Array);
		 
		

		 System.out.println("Please enter the size of the second array");
		  size = input.nextInt();
		 
		    double[] double_Array2 = new double[size];
		    int[] int_Array2 = new int [size];
		
		    
		    for (int i = 0; i < double_Array2.length; i++)
		    {
		        System.out.println("Please enter number of the second array");
		        double_Array2[i] = input.nextDouble();
		    }
		 
		    for (int i = 0; i < double_Array2.length; i++)
		    {
		        System.out.println("Please enter exponent of the second array");
		        int_Array2[i] = input.nextInt();
		    }
		    
 
		 Polynom work2 = new Polynom(double_Array2,int_Array2);

	

	 System.out.println("---Please choose which array you want to work on---");
	 System.out.println("First array by pressing 1");
	 System.out.println("Second array by pressing 2");
	 String action = input.next();
	 System.out.println("Type exit to exit");
	 
	  while(!(action).equals("exit"))
      {

			  
		  
          if((action).equals("1")) 
          {
	 
        	  System.out.println("Type plus for plus method");
        	  System.out.println("Type minus for minus method"); 
        	  System.out.println("Type derivative for derivative method");
        	  System.out.println("Type string for string method");
        	  System.out.println("Type compare for compare method");
	 
        	  action = input.next();
        	  
        	  if((action).equals("plus")) 
        	  {
        		  System.out.println("Type the number of the additional array that you what to work on ");
        		  action = input.next();
        		  
        		   if((action).equals("1")) 
        		   {
        			   work3=work.plus(work);
        		   }
        		   
        		   if((action).equals("2")) 
        		   {
        			   work3=work.plus(work2);
        		   }
        	  }
        	  
        	  if((action).equals("minus")) 
        	  {
        		  System.out.println("Type the number of the additional array that you what to work on ");
        		  action = input.next();
        		  
        		   if((action).equals("1")) 
        		   {
        			   work3=work.minus(work);
        		   }
        		   
        		   if((action).equals("2")) 
        		   {
        			   work3=work.minus(work2);
        		   }
        	  }
        	  if((action).equals("derivative")) 
        	  {
        		  work3 = work.derivative();
        	  }
        	  
        	  if((action).equals("string")) 
        	  { 
        		  results = null;  
        		  results = work.toString();
        			 System.out.println(results);   		 
        	  }
        	  
        	  
        	  if((action).equals("compare")) 
        	  {
        		  System.out.println("Type the number of the additional array that you what to work on ");
        		  action = input.next();
        		  
        		   if((action).equals("1")) 
        		   {
        			      System.out.println(" the answer is " + work.compareTo(work));
        		   }
        		   
        		   if((action).equals("2")) 
        		   {
              			  System.out.println(" the answer is " + work.compareTo(work2));
        		   }  
        	  }
        	  action = " ";
          }
          
     
          
          if((action).equals("2")) 
          {
	 
        	  System.out.println("Type plus for plus method");
        	  System.out.println("Type minus for minus method"); 
        	  System.out.println("Type derivative for derivative method");
        	  System.out.println("Type string for string method");
        	  System.out.println("Type compare for compare method");
	 
        	  action = input.next();
        	  
        	  if((action).equals("plus")) 
        	  {
        		  System.out.println("Type the number of the additional array that you what to work on ");
        		  action = input.next();
        		  
        		   if((action).equals("1")) 
        		   {
        			   work3=work2.plus(work);
        		   }
        		   
        		   if((action).equals("2")) 
        		   {
        			   work3=work2.plus(work2);
        		   }
        	  }
        	  
        	  if((action).equals("minus")) 
        	  {
        		  System.out.println("Type the number of the additional array that you what to work on ");
        		  action = input.next();
        		  
        		   if((action).equals("1")) 
        		   {
        			   work3=work2.minus(work);
        		   }
        		   
        		   if((action).equals("2")) 
        		   {
        			   work3=work.minus(work2);
        		   }
        	  }
        	  if((action).equals("derivative")) 
        	  {
        		  work3 = work2.derivative();
        	  }
        	  
        	  if((action).equals("string")) 
        	  {
           	   results = null;
       		    results = work2.toString();
       		    System.out.println(results);  
        	  }
        	  
        	  
        	  if((action).equals("compare")) 
        	  {
        		  System.out.println("Type the number of the additional array that you what to work on ");
        		  action = input.next();
        		  
        		   if((action).equals("1")) 
        		   {
            		  System.out.println(" the answer is " + work2.compareTo(work));		  
        		   }
        		   
        		   if((action).equals("2")) 
        		   {  
              			  System.out.println(" the answer is " + work2.compareTo(work2));
        		   }  
        	  }
        	  
        	  action = " ";
        	  
          }
          
          System.out.println("Please enter the next command");
          action = input.next();
          
          if((action).equals("string")) 
    	  {
        	   results = null;
    		    results = work3.toString();
    		    System.out.println(results);   	
    	  }
          
          
          
          if((action).equals("exit")) 
          {   
              break;
          }
          	
          
          
      }
         
          
	  input.close();
    }
	 
	 
}
