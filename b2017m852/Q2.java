package b2017m852;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.*;
import java.util.Timer;


public class Q2 extends JPanel{
	
	private final int DELAY=1000;
	private final int X=2;
	private final int N=5;
	private final int SIZE=10;
	private int good=0;
	private int bed=0;
	private Derw derw ;
	 private Timer timer;
	  private int time=0;
	
	public Q2() {
		


		derw=new Derw();

		this.setLayout(new BorderLayout());

		this.addMouseListener(derw);

		Timer timer = new Timer();
	
		
		
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {

				  derw.repaint();
				  if (time>=N)
				  {
				  timer.cancel();
				  JOptionPane.showMessageDialog(null,"good " + good +" bed " + bed,"no more trivia for you",JOptionPane.INFORMATION_MESSAGE);
				  }
			  }
			}, 3*1000,3*1000);
		
		this.add(derw);
		
		
		JFrame fr = new JFrame("q2");
		fr.add(this);
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
	


	private class Derw extends JPanel implements  MouseListener 
	 { 
		int z;
		int w;
		
		

		
		   public void paintComponent(Graphics g)
		   {    
			   super.paintComponent(g);

			   
			  	 if (time<=N)
			   {
				   Random ren = new Random();
				    z = ren.nextInt(300);
				    w = ren.nextInt(300);
				   g.drawRect(z, w, SIZE, SIZE);
				   time++;
			   }
			  	 
			  	 
		   }

		

		
		@Override
		public void mousePressed(MouseEvent e) {

			
			if(e.getX()>=z && e.getX()<=z+SIZE && e.getY()>=w && e.getY()<=w+SIZE )
			{
				good++;
				
			}
			
			else
			{
				bed--;
			}
			
			repaint();
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		

	}
	


	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }

}