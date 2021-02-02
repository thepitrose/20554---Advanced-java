package b2017m863;

import a2017m863.NonReduceable;

public class Text implements Reverseable<Text> {
	private String st="";
	public Text(String st) {
		this.st=st;
	}
	
	public Text reverse() throws NonReduceable{
		if(st.length()<2)
		{
			throw new NonReduceable();
		}
		String rev="";
		
		for (int i=st.length()-1;i>=0;i--)
		{
			rev+=String.valueOf(st.charAt(i));
		}
		return new Text(rev);
	}
}
