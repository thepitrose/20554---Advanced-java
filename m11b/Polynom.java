package m11b;

import java.util.ArrayList;
import java.util.Collections;


public class Polynom implements Comparable<Polynom>
{
	
 
	private ArrayList<PolyNode> polynom = new  ArrayList<PolyNode>() ;
	private ArrayList<PolyNode> polynomCopy =  new  ArrayList<PolyNode>() ;

	
	public Polynom()
	{
		 double num;
		 int expon; 	
	}
	
	

	public Polynom (double xnum[], int xexpon[] )
	{
			
		PolyNode xx = new PolyNode(xnum[0], xexpon[0]);
		polynom.add(xx);

		for(int i=1; i<xnum.length;i++)
		{
			PolyNode tamp = new PolyNode(xnum[i], xexpon[i]);
			polynom.add(tamp);
		}	 
		
	 	Collections.sort(this.polynom);
    	Collections.reverse(this.polynom);
		
	}
	 


    public Polynom copy() //Copying the polynom  to  prevent aliasing
    {
    	
    	for (int i=0; i<this.polynom.size(); i++)
    	{
    		double y =this.polynom.get(i).getNum();		            
            int z = this.polynom.get(i).getExpon();
            PolyNode yy = new PolyNode(y, z);
    		polynomCopy.add(yy);
    	}
    	return this;
    }

	  
	    public Polynom plus (Polynom poly)
	    {
	    
	    	int polysize = poly.polynom.size();
	    	int plusesize = this.polynom.size();
	    	int i=0;
	    	int j=0;
	    	
	    	

	    	this.copy();
	    	 Polynom polynomlist = new Polynom();
	    	 polynomlist.polynom=this.polynomCopy;
	    	 	 
	    	 
	    	while (i<polysize && j<plusesize)
	    	{

	    		 if (poly.polynom.get(i).getExpon()==polynomlist.polynom.get(j).getExpon())
	    		{
	    			 
	    			double y =(poly.polynom.get(i).getNum()+polynomlist.polynom.get(j).getNum());		            
		            int z = poly.polynom.get(i).getExpon();
		            
		            polynomlist.polynom.get(j).setNum(y);
		            polynomlist.polynom.get(j).setExpon(z);
		            i++;
		            j++;     
	    		}
	    		 else if (poly.polynom.get(i).getExpon()<polynomlist.polynom.get(j).getExpon())
	    		 {	
	    			 j++;
	    		 }
	    		 
	    		 else if (poly.polynom.get(i).getExpon()>polynomlist.polynom.get(j).getExpon())
	    		 {	
	    			
		    		 double y =poly.polynom.get(i).getNum();		            
			         int z = poly.polynom.get(i).getExpon();
			         PolyNode yy = new PolyNode(y, z);
			         polynomCopy.add(yy);
			    		i++;
	    		 }
	    		
	    	}

	    	while(i<polysize)
	    	{	
	    
    			double y =poly.polynom.get(i).getNum();		            
	            int z = poly.polynom.get(i).getExpon();
	            PolyNode yy = new PolyNode(y, z);
	           polynomCopy.add(yy);
	            i++;	            
	    	}
	    	
	    	    	
	    	Collections.sort(polynomlist.polynom);
	    	Collections.reverse(polynomlist.polynom);
	    	
	    	return polynomlist;
	    }
	          

	        
	    
	    public Polynom minus (Polynom poly)
	    {
	    
	    	int polysize = poly.polynom.size();
	    	int plusesize = this.polynom.size();
	    	int i=0;
	    	int j=0;
	    	
	    	

	    	this.copy();
	    	 Polynom polynomlist = new Polynom();
	    	 polynomlist.polynom=this.polynomCopy;
	    	 	 
	    	 
	    	while (i<polysize && j<plusesize)
	    	{

	    		 if (poly.polynom.get(i).getExpon()==polynomlist.polynom.get(j).getExpon())
	    		{
	    			 
	    			double y =(polynomlist.polynom.get(j).getNum()-poly.polynom.get(i).getNum());		            
		            int z = poly.polynom.get(i).getExpon();
		            
		            polynomlist.polynom.get(j).setNum(y);
		            polynomlist.polynom.get(j).setExpon(z);
		            i++;
		            j++;     
	    		}
	    		 else if (poly.polynom.get(i).getExpon()<polynomlist.polynom.get(j).getExpon())
	    		 {	
	    			 j++;
	    		 }
	    		 
	    		 else if (poly.polynom.get(i).getExpon()>polynomlist.polynom.get(j).getExpon())
	    		 {	
		    		 double y =poly.polynom.get(i).getNum();		            
			         int z = poly.polynom.get(i).getExpon();
			         PolyNode yy = new PolyNode(-y, z);
			         polynomCopy.add(yy);
			    		i++;
	    		 }
	    		
	    	}
	    	
	    	while(i<polysize)
	    	{	
	    
    			double y =poly.polynom.get(i).getNum();		            
	            int z = poly.polynom.get(i).getExpon();
	            PolyNode yy = new PolyNode(-y, z);
	            polynomCopy.add(yy);
	            i++;	            
	    	}
	    	

	    	Collections.sort(polynomlist.polynom);
	    	Collections.reverse(polynomlist.polynom);
	    	
	    	
	    	return polynomlist;
	    }
	    
	    
	   
	    public  Polynom derivative ()
	    {
	    	this.copy();
	    	 Polynom polynomlist = new Polynom();
	    	 polynomlist.polynom=this.polynomCopy;
	    	 

	    	for (int i=0; i<polynomlist.polynom.size();i++)
	    	{	
	    		int numtamp =polynomlist.polynom.get(i).getExpon();
	    		int expontamp=polynomlist.polynom.get(i).getExpon()-1;	    		
	    		if (polynomlist.polynom.get(i).getExpon()!=0)
	    		{
	    			polynomlist.polynom.get(i).setExpon(expontamp);
	    		}
	    		else
	    		{
	    			polynomlist.polynom.get(i).setExpon(0);
	    		}
	    		
	    		polynomlist.polynom.get(i).setNum(polynomlist.polynom.get(i).getNum()*numtamp);
	    		
	    	}
	    	return polynomlist;
	    }
	    
	   
	    
	    public String toString ()
	    {
	    	String results = "";
	    	
	    	
	    	for ( int i=0; i<this.polynom.size();i++)
	    	{
	    		
	    		if(this.polynom.get(i).getNum()>0)
	    		{
	    			if (i==0)
	    			{	
	    	        results+= "  (" + this.polynom.get(i).getNum()+"x^"+this.polynom.get(i).getExpon()+") ";
	    			}
	    			else
	    			{
	    				 results+= " + (" + this.polynom.get(i).getNum()+"x^"+this.polynom.get(i).getExpon()+") ";
	    			}
	    		}
	    		else if(this.polynom.get(i).getNum()<0)
	    		{
	    			results+= " ("+this.polynom.get(i).getNum()+"x^"+this.polynom.get(i).getExpon()+") ";
	    		}
	    		
	    		else if (this.polynom.get(i).getNum()==0)
	    		{
	    			
	    		}
	    		
	    		
	    	}
	    	

    		
			return results;

	    }
	    
	   
	    public int compareTo (Polynom poly )
	    {
	    	int tamp = Integer.compare(this.polynom.get(0).getExpon(),poly.polynom.get(0).getExpon());
	    	

	    	return tamp;
	    	
	    }


}

