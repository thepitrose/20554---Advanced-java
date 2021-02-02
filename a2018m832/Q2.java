package a2018m832;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;




public class Q2 extends JPanel{
	private JButton[][] buttonBord;
	private int [][] numBord;
	private JButton finish,A,B;
	private final int SIZE=5;
	private int good;

	private int a,b,ai,aj,bi,bj;
	
	
	public Q2()
	{
		this.setLayout(new BorderLayout());
		Listener lis = new Listener();
		JPanel up = new JPanel();
		up.setLayout(new GridLayout(SIZE,SIZE));
		
		int n=1;
		good=0;
		
		 buttonBord = new JButton[SIZE][SIZE];
		 numBord = new int [SIZE][SIZE];
		for (int i=0; i<SIZE;i++)
		{
			for (int j=0; j<SIZE;j++)
			{
				String xxName = String.valueOf(n);
				buttonBord[i][j]=new JButton(xxName);
				buttonBord[i][j].addActionListener(lis);
				up.add(buttonBord[i][j]);
				numBord[i][j]=n;
				n++;
			}

		}
		
		

		finish=new JButton("finish");
		finish.addActionListener(lis);
		


		this.add(up,BorderLayout.CENTER);
		this.add(finish, BorderLayout.PAGE_END);
		
		JFrame fr = new JFrame("q2");
		fr.add(this);
		fr.pack();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
	}
	
	  private class Listener implements ActionListener 
	    { public void actionPerformed(ActionEvent e)
	    	{ 
	    	
	    		if(e.getSource()==finish)
	    		{
	    			JOptionPane.showMessageDialog(null,"Good " + good ,"finish",JOptionPane.INFORMATION_MESSAGE);
	    		}
	    		
	    		else
	    		{
	    			for (int i=0; i<SIZE;i++)
	    			{
	    				for (int j=0; j<SIZE;j++)
	    				{
	    					if(e.getSource()==buttonBord[i][j])
	    					{
	    						
	    						if (A==null)
	    						{
	    							A=buttonBord[i][j];
	    							a=numBord[i][j];
	    	   	        			ai=i;
	    	   	        			aj=j;
	    							
	    						}
	    	   	        		else if (B==null && A!=buttonBord[i][j])
	    	   	        		{
	    	   	        			B=buttonBord[i][j];
	    	   	        			b=numBord[i][j];
	    	   	        			bi=i;
	    	   	        			bj=j;
	    	   	        		}
	    						
	    	   	        		else if (A!=buttonBord[i][j] && B!=buttonBord[i][j])
	    	   	        		{
	    	   	        			if (numBord[i][j]==a+b)
	    	   	        			{
	    	   	        				
	    	   	        				JOptionPane.showMessageDialog(null,  a + "+" + b + " = " + numBord[i][j] ,"good",JOptionPane.INFORMATION_MESSAGE);
	    	   	        				
	    	   	        				buttonBord[ai][aj].setText("");
	    	   	        				buttonBord[bi][bj].setText("");
	    	   	        				buttonBord[i][j].setText("");	
	    	   	        				
	    	   	        				numBord[ai][aj]=0;
	    	   	        				numBord[bi][bj]=0;
	    	   	        				numBord[i][j]=0;
	    	   	        				A=null;
	    	   	        				B=null;
	    	   	        				good++;
	    	   	        				
	    	   	        			}
	    	   	        			else
	    	   	        			{
	    	   	        				A=null;
	    	   	        				B=null;
	    	   	        				JOptionPane.showMessageDialog(null,  a + "+" + b + " is not =  " +  numBord[i][j] ,"bad",JOptionPane.INFORMATION_MESSAGE);
	    	   	        				
	    	   	        			}
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
