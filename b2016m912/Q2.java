package b2016m912;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;


public class Q2 extends JPanel{
	private JButton[][] buttonBord;
	private int [][] numBord;
	private JButton next;
	private JLabel text;
	private final int SIZE=10;
	private int dNum;
	
	
	public Q2()
	{
		this.setLayout(new BorderLayout());
		Listener lis = new Listener();
		Random rand = new Random();
		JPanel up = new JPanel();
		up.setLayout(new GridLayout(SIZE,SIZE));
	

		
		 buttonBord = new JButton[SIZE][SIZE];
		 numBord = new int [SIZE][SIZE];
		for (int i=0; i<SIZE;i++)
		{
			for (int j=0; j<SIZE;j++)
			{
				int xx = rand.nextInt(100)+1;
				String xxName = String.valueOf(xx);
				buttonBord[i][j]=new JButton(xxName);
				buttonBord[i][j].addActionListener(lis);
				up.add(buttonBord[i][j]);
				numBord[i][j]=xx;
				
			}

		}
		
		
		dNum = rand.nextInt(10)+1;
		next=new JButton("Next");
		next.addActionListener(lis);
		text = new JLabel ("click on all numbers which can be devided by  " + dNum);
		JPanel down = new JPanel();
		down.setLayout(new FlowLayout());
		down.add(next);
		down.add(text);

		this.add(up,BorderLayout.CENTER);
		this.add(down, BorderLayout.PAGE_END);
		
		JFrame fr = new JFrame("q2");
		fr.add(this);
		fr.pack();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
		
		
		
	}
	
    private class Listener implements ActionListener 
    { public void actionPerformed(ActionEvent e)
    	{ 

    		if(e.getSource()== next)
    		{

    			Random rand = new Random();
    			dNum = rand.nextInt(10)+1;
    			text.setText("click on all numbers which can be devided by  " + dNum);
    			validate();
    			repaint();
    		}
    		
    		else {
    		for (int i=0; i<SIZE;i++)
    		{
    			for (int j=0; j<SIZE;j++)
    			{
    				if(e.getSource()== buttonBord[i][j]) {
    				if (numBord[i][j]%dNum ==0)
    				{
    					numBord[i][j]=0;
    					buttonBord[i][j].setText("");
    	    			validate();
    	    			repaint();

    				}
    				else
    				{
    					JOptionPane.showMessageDialog(null,"noop","noop",JOptionPane.INFORMATION_MESSAGE);
    				}
    			}
    			}
    		}
    	}
    }
    }
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}
