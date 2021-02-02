package m14b;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Dictionary 
{

	HashMap<String, Term> dictionary = new HashMap<String, Term>(); 
	List<String> order;
	
	public Dictionary()
	{
		order = new LinkedList<String>();
	}
	
	
	public Dictionary(File file)  throws IOException  
	{
		
		FileInputStream fi = new FileInputStream(file);
        DataInputStream in = new DataInputStream(fi);
        Term tamp;
			
		     try 
		     {
		            while(true)
		            {

		            	String key = in.readUTF();
		            	String value = in.readUTF();
		            	tamp = new Term(key,value);
		            	dictionary.put(tamp.getKey(), tamp);
		            }
		     }
			
		     catch(EOFException e)
		     {
		    	 
		     }
		     
			order = new LinkedList<String>(dictionary.keySet());
			Collections.sort(order);		
	}
	
	
//******************************************************************************************     	
	
	
	public void add(String term,String description)
	{
		if (!dictionary.containsKey(term))
		{
			Term teamp = new Term(term,description);
			dictionary.put(teamp.getKey(),teamp );
			order.add(teamp.getKey());
		}
		Collections.sort(order);
	}
	
	
//******************************************************************************************     
	
	public void remove(String item)
	{
		dictionary.remove(item);
		order.remove(item);
	}
	
//******************************************************************************************     
	
	public void update(String item,String description)
	{
		remove(item);
		add(item,description);
	}
	
//******************************************************************************************     	
	
	
	public String getk(int i)
	{
		Term tamp = dictionary.get(order.get(i));
		return tamp.getKey();
	}
	
//******************************************************************************************     
	
	public String getv(int i)
	{
		Term tamp = dictionary.get(order.get(i));
		return tamp.getValue();
	}
	
//******************************************************************************************     
	
	
	public String search(String str)
	{
		if (dictionary.get(str) != null)
			return dictionary.get(str).getValue();
		else 
			return null;
	}
	
//******************************************************************************************     	
	


	@Override
	public String toString() 
	{
		String str = "";
		for (int i = 0; i < order.size() ; i++)
			str += dictionary.get(order.get(i));
		return str;
	}	
	
//******************************************************************************************     	
	
}

	

