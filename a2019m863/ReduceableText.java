package a2019m863;

public class ReduceableText implements Reduceable{
	private String st;
	
	public ReduceableText(String st)
	{
		this.st=st;
	}
	
	public void reduce()throws NonReduceable
	{
		if(!st.contains(""))
		{
			throw new NonReduceable();
		}
		else
		{
			st=st.replaceFirst(" ", "");
		}
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof ReduceableText)
		{
			return ((ReduceableText)obj).st.equals(st);
		}
		return false;
	}

}
