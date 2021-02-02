package a2016m831;

public class TextCode extends Code{
	private String text;
	public TextCode (int n, String text)
	{
		super(n);
		this.text=text;
		System.out.println("TextCode consteructor1");
	}
	public TextCode(String text) {
		this.text=text;
		System.out.println("TextCode consteructor2");
	}
	public String getText() {
		return text;
	}
	public String toString() {
		return text;
	}

}
