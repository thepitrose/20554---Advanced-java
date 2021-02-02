package a2017m931;

import java.util.*;

public class Main {
	public static void main (String [] args) {
		ArrayList<One>v = new ArrayList<One>(10);
		v.add(new One(0,0));
		v.add(new Two(0,0));
		v.add(new Three(0,0));
		
		test(v);
	}
	
	public static void test(ArrayList<One>v) {
		int one=0;
		int two=0;
		int three=0;
		for (int i=0;i<v.size();i++) {
			if(v.get(i).getClass().getSimpleName().equals("One"))
			{
				one++;
			}
			if(v.get(i).getClass().getSimpleName().equals("Two"))
			{
				two++;
			}
			if(v.get(i).getClass().getSimpleName().equals("Three"))
			{
				three++;
			}
			v.get(i).move();
			System.out.println(v.get(i));
		}
		System.out.println("One " + one);
		System.out.println("Two" + two);
		System.out.println("Three " + three);
	}
}
