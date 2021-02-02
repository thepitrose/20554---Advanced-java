package a2019m862;

import java.util.*;

public class Dictionary {

	private  ArrayList<String>list;
	private  ArrayList<String>letter;
	
	public Dictionary()
	{
		ArrayList<String>list = new ArrayList<String>();
		list.add("bob");
		list.add("dog");
		list.add("snake");
		
		ArrayList<String>letter = new ArrayList<String>();
		letter.add("a");
		letter.add("b");
		letter.add("d");
		letter.add("e");
		letter.add("g");
		letter.add("k");
		letter.add("n");
		letter.add("o");
		letter.add("s");
		
		
	}
	
	public boolean isLegal(String word)
	{
		ArrayList<String>list = new ArrayList<String>();
		list.add("bob");
		list.add("dog");
		list.add("snake");
		list.add("ddd");
		list.add("bbb");
		list.add("aaa");
		list.add("bo");
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(word))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String getRandomLetter()
	{
		ArrayList<String>letter = new ArrayList<String>();
		letter.add("a");
		letter.add("b");
		letter.add("d");
		letter.add("e");
		letter.add("g");
		letter.add("k");
		letter.add("n");
		letter.add("o");
		letter.add("s");
		
		
		Random rand = new Random();
		int n = rand.nextInt(letter.size());
		return letter.get(n);
	}
}
