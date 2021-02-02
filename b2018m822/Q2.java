package b2018m822;


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
					   g.fillRect(list.get(i).getX(),list.get(i).getY(),10,10);
					
				   }
			   }
		 
			   }
		 };
		 
		 
		 up.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent e) { 
	  			int x=e.getX();
				int y=e.getY();

				boolean ex=false;
				

					
					if (list.isEmpty())
					{
						list.add(new Dots(x,y));
					}
					else
					{
				   for (int i=0; i<list.size();i++)
				   { 
					  
					   if (list.get(i).getX()==x && list.get(i).getY()==y)
					   {	 
					   		ex=true;
						   list.remove(i);
					   }

				   }
				   
				   if (!ex) 
				   {
					   list.add(new Dots(x,y));
				   }
				}

				up.repaint();

	          }
	          }); 
		
		 this.add(up);
		 
		 clear=new JButton("clear");
		 clear.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					list.clear();
					up.repaint();
				}
				});
		add(clear,BorderLayout.PAGE_END);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	

	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}
