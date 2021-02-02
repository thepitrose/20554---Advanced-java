package b2016m913;

public class Sentence implements Reduceable <Sentence> {
	private String text="";
	
	public Sentence (String str)
	{
		text=str;
	}
	
	public void set(String str)
	{
		text=str;
	}
	
	public String get()
	{
		return text;
	}
	
	public Sentence reduce()
	{
		String str="";
		String[] subs = this.text.split(" ");
		
		for (String sub:subs)
		{
			str=str.concat(sub);
		}
		return new Sentence(str);
	}
}
