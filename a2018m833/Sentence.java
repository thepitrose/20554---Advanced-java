package a2018m833;

public class Sentence implements Filpable<Sentence> {
	
	private String[] str;
	
	public Sentence(String[] str)
	{
		this.str=str;
	}
	
	public String toString() {
		String temp="";
		for (int i=0;i<str.length;i++)
		{
			temp=temp.concat(str[i]+"");
		}
		return temp;
	}
	
	public Sentence flip() {
		String[] temp=new String[str.length];
		
		for (int i=0;i<str.length;i++)
		{
			temp[i]=str[str.length-1+i];
		}
		return (new Sentence(temp));
	}

}
