package a2016m823;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class reduceStack {
	
	public static <T extends Comparable <T>> Stack<T> reduceStack (Stack <T> stack, T var)
	{
		ArrayList<T> temp = new ArrayList<T>();
		
		while (!stack.isEmpty())
		{
			try
			{
				temp.add(stack.pop());
			}
			catch (EmptyStackException e) {}
			
		}
		
		for (int i=temp.size()-1 ;i>=0 ;i++)
		{
			if(temp.get(i).compareTo(var)<=0)
			{
				stack.push(temp.get(i));
			}
		}
		
		return stack;
	}

}
