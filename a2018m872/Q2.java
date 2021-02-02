package a2018m872;




import java.awt.event.*;
import javax.swing.*;



import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Q2  extends JFrame {
	

	 ArrayList<Sqer> list = new ArrayList<Sqer>();
	 ArrayList<Sqer> list2 = new ArrayList<Sqer>();
	 int count=0;
	
	public Q2()
	{

		
		for (int i=0; i<10; i++)
		{
			Random rand = new Random();
			int wx = rand.nextInt(90)+10;
			int wy = rand.nextInt(90)+10;
			int xx = rand.nextInt(900);
			int yy = rand.nextInt(390);
			
			list.add(new Sqer(wx,wy,xx,yy));
		}
		
		
		
		Collections.sort(list , new Sortbysize());
		

		
		setLayout(new GridLayout (2,0));
		

		 
		 JPanel up = new JPanel() {
			  public void paintComponent(Graphics g)
			   {
			   super.paintComponent(g);
			   {
				   for (int i=0; i<list.size();i++)
				   { 

					 g.drawRect(list.get(i).getXX(),list.get(i).getYY(),list.get(i).getX(), list.get(i).getY());
				   }
			   }
		 
			   }
		 };
		 up.setSize(500,500);
		 
				 JPanel down = new JPanel() {
					  public void paintComponent(Graphics g)
					   {
					   super.paintComponent(g);
					   {
						   for (int i=0; i<list2.size();i++)
						   { 

							 g.drawRect(list2.get(i).getXX(),list2.get(i).getYY(),list2.get(i).getX(), list2.get(i).getY());

						   }
					   }

					   }
					  
				 };
				 
				 down.setSize(500,500);
					 
		 

		 up.setBorder(BorderFactory.createLineBorder(Color.red));
		 down.setBorder(BorderFactory.createLineBorder(Color.blue));
		 
		 up.addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent e) { 
	              int mx=e.getX();
	              int my=e.getY();
	              
	              if (!list.isEmpty())
	              {
	              if (mx-1>list.get(0).getXX() && mx+1<list.get(0).getXX()+list.get(0).getX() && my-1>list.get(0).getYY() && my+1<list.get(0).getYY()+list.get(0).getY()) 
	              { 
	                  if(list.get(0).getX() <list.get(0).getY())
	                  {
	                  list2.add(new Sqer(list.get(0).getX() ,list.get(0).getY() ,0,0));
	                  }
	                  else
	                  {
	                	  list2.add(new Sqer(list.get(0).getY() ,list.get(0).getX() ,0,0));
	                  }
	                  list.remove(0);
	                  
	                 
	                  up.repaint();
	                  down.repaint();
	              }
	              
		          else
		          {
		        	  for (int i=1; i<list.size();i++)
					   { 
		        		  if (mx-1>list.get(i).getXX() && mx+1<list.get(i).getXX()+list.get(i).getX() && my-1>list.get(i).getYY() && my+1<list.get(i).getYY()+list.get(i).getY()) 
			              { 
		        			
		        			  JOptionPane.showMessageDialog(null, " NOT THE SMELLIEST!!!  " ,"    ",JOptionPane.INFORMATION_MESSAGE);
		        			  count++;
			              }
						
					   } 
		          }
	            }
	              else
		              {
		            	  JOptionPane.showMessageDialog(null, count + "  Mistakes  " ," NO MORE SQER ",JOptionPane.INFORMATION_MESSAGE);
		            	  
		              }
	          }
	          }); 

       
		 
		 add(up);
		 add(down);
 


		 
			setSize(1000,1000);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }

}



