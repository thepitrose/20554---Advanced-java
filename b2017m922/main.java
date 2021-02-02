package b2017m922;

import java.util.*;

import javax.swing.*;

public class main {
	public static void main (String [] args)
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println(" enter ip ");
		 String ip = input.nextLine();
		 System.out.println(" enter port ");
		 int port = input.nextInt();
		 
			JFrame fr = new JFrame("q2");
			fr.setSize(600,600);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			MyPanel panel = new MyPanel(ip,port);
			fr.add(panel);
			fr.setVisible(true);
	}
}
