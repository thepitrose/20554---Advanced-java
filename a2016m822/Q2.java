package a2016m822;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;



public class Q2  extends JPanel{
	
	private Captcha cap;
	private JButton stop;
	private JLabel image;
	private JTextField input;
	
	public double total,rec;
	
	public Q2() {
		
		total=0;
		rec=0;
		
		
		//*****************************
		ArrayList<Captcha> clist = new  ArrayList<Captcha>() ;
		ImageIcon xx = new ImageIcon("C:\\Users\\ziv\\eclipse-workspace\\test\\src\\a2016m822\\a\\a1.png");
		cap= new Captcha("cat",xx);
		clist.add(cap);
		
		 xx = new ImageIcon("C:\\Users\\ziv\\eclipse-workspace\\test\\src\\a2016m822\\a\\b.png");
		cap= new Captcha("dog",xx);
		clist.add(cap);
		
		 xx = new ImageIcon("C:\\Users\\ziv\\eclipse-workspace\\test\\src\\a2016m822\\a\\c.png");
		cap= new Captcha("snake",xx);
		clist.add(cap);
		
		//*****************************
		
		image = new JLabel("");
		
		image.setIcon(clist.get(0).getImage());
		this.setLayout(new BorderLayout());
		stop=new JButton ("stop");
		
		stop.addActionListener(new ActionListener()
		{
		public void actionPerformed  (ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, ((rec/(total==0 ? 1: total))*100)+ "% of your answers are good ","noop",JOptionPane.INFORMATION_MESSAGE);
		}
		});
		
		
		input = new JTextField();
		input.setPreferredSize(new Dimension  (150,25));
		
		
		input.addKeyListener(new KeyListener()
		{
		public void keyPressed(KeyEvent e)
		{

					
			if (e.getKeyChar()== '\n')
			{
				if(input.getText().equals(clist.get(0).getText()))
				{
					rec++;
					JOptionPane.showMessageDialog(null,"good","good",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"noop","noop",JOptionPane.INFORMATION_MESSAGE);
				}
				
				total++;
				clist.remove(0);
				
				if(clist.isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, ((rec/(total==0 ? 1: total))*100)+ "% of your answers are good ","noop",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
				image.setIcon(clist.get(0).getImage());
				add(image,BorderLayout.CENTER);
				input.setText("");
				validate();
				repaint();
				}
				}
				
				else
				{

				}
			
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			}
			);
		
		JPanel down = new JPanel();
		down.setLayout(new FlowLayout());
		down.add(input);
		down.add(stop);
		
		this.add(image,BorderLayout.CENTER);
		this.add(down,BorderLayout.PAGE_END);
		JFrame fr = new JFrame("q2");
		fr.add(this);
		fr.pack();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
				
		
	}
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}