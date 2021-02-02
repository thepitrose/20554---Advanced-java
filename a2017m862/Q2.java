package a2017m862;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Q2 extends JPanel{
	
	private JButton badd,clear;
	private JTextField inputX,inputY;
	private ArrayList <Point> points;
	private paintLines line;

	public Q2() {
		
		this.setLayout(new BorderLayout());
		
		Listener lis = new Listener();
		
		inputX= new JTextField();
		inputX.setPreferredSize(new Dimension  (150,25));
		

		inputY= new JTextField();
		inputY.setPreferredSize(new Dimension  (150,25));
		
		line = new paintLines();
		points= new  ArrayList <Point>();
		
		badd=new JButton("add");
		clear=new JButton("clear");
		
		badd.addActionListener(lis);
		clear.addActionListener(lis);
		
		
		JPanel down = new JPanel();
		down.setLayout(new FlowLayout());
		down.add(inputX);
		down.add(inputY);
		down.add(badd);
		down.add(clear);
		
		this.add(line,BorderLayout.CENTER);
		this.add(down,BorderLayout.PAGE_END);
		JFrame fr = new JFrame("q2");
		fr.add(this);
		fr.setSize(600, 600);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
	}
	
	 private class Listener implements ActionListener 
	    { public void actionPerformed(ActionEvent z)
	    	{ 
	    	if(z.getSource()==badd)
	    	{
	    		String x=inputX.getText();
	    		inputX.setText("");
	    		
	    		String y=inputY.getText();
	    		inputY.setText("");
	    		  		
	    		try 
	    		{
	
	    		int xd = Integer.parseInt(x);
	    		int yd = Integer.parseInt(y);
	    		
	    		points.add(new Point(xd,yd));
	    		line.repaint();
	    		
	    		
	    		}
	    		  catch (Exception e) 
	    		{
	    			return;
	    		}
	    		
	    	}
	    	
	    	if(z.getSource()==clear)
	    	{
	    		points=new ArrayList<Point>();
	    		line.repaint();
	    	}
	    	}
	    }
	 
	 private class paintLines extends JPanel
	 { 
		   public void paintComponent(Graphics g)
		   {    
			   super.paintComponent(g);
			   
			   if (points.size()<2)
			   {
				   return;
			   }
			   
			   for(int i=1;i<points.size();i++)
			   {
				   g.drawLine(points.get(i-1).getX(), points.get(i-1).getY(), points.get(i).getX(), points.get(i).getY());
			   }
		   }
	 }
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}
