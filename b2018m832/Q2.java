package b2018m832;




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.*;



public class Q2 extends JFrame{

	private JButton clear;
	ArrayList<Dots> list = new ArrayList<Dots>();

	
	public Q2()
	{

		


		 JPanel up = new JPanel() {
			  public void paintComponent(Graphics g)
			   {
			   super.paintComponent(g);
			   {	
				   for (int i=0; i<list.size();i++)
				   { 
					   g.drawString(list.get(i).getText(),list.get(i).getX(),list.get(i).getY());
					
				   }
			   }
		 
			   }
		 };
		 
		 
		 up.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent e) { 
	  			int x=e.getX();
				int y=e.getY();


				String text = JOptionPane.showInputDialog("Please enter a message");
				
					if (list.isEmpty())
					{
						list.add(new Dots(x,y,text));
					}
					else
					{
				   for (int i=0; i<list.size();i++)
				   { 
					   int xx=Math.abs(list.get(i).getX()-x);
					   int yy=Math.abs(list.get(i).getY()-y);
					   
					   if ( xx<=10 ||  yy<=10)
					   {	
						   list.remove(i);
					   }

				   }
				   

				   list.add(new Dots(x,y,text));

				}

				up.repaint();

	          }
	          }); 
		
		this.add(up);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	

	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}
