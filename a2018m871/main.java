package a2018m871;

public class main {
	public static void main (String [] args) {
		Q q=new Q();
		try
		{
			q.f();
		}
		catch(MyException2 e)
		{
			System.out.println("2");
		}
		catch(MyException1 e)
		{
			System.out.println("1");
		}
	}
}
