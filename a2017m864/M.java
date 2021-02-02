package a2017m864;



public class M {
	public static void main (String [] args) throws Exception {

		Garage g = new Garage(30);

		for (int i=0;i<100;i++)
		{
			new Car(g).start();
		}
		

		
	}
}
