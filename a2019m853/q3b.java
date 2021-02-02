package a2019m853;

import java.util.*;

public class q3b {
	public  <T extends Countable> T  getFind (Stack<T>stack,int num)
	{
		T item = null;
		boolean go = true;
		Stack<T> temp = new Stack<T>();
		while((!stack.isEmpty())&& go)
		{
			item=stack.pop();
				if(item.count()==num)
				{
					go=false;
				}
			temp.push(item);
		}
		
		while(!temp.isEmpty())
		{
			stack.push(temp.pop());
		}
		
		if (go)
		{
			return null;
		}
		else
		{
			return item;
		}
	}
}
