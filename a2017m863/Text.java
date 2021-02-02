package a2017m863;

public class Text implements Reduceable<Text>{
	private String st="";
	public Text(String st) {
		this.st=st;
	}
	
	public Text reduce() throws NonReduceable{
		if (!st.contains(" "))
		{
			throw new NonReduceable();
		}
		
		StringBuilder reduced = new StringBuilder();
		for (int i=0; i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
				reduced.append(st.charAt(i));
			else {
					break;
				}
		reduced.append(st.substring(++i));
		
		}
		
		return new Text(reduced.toString());
	}

}
